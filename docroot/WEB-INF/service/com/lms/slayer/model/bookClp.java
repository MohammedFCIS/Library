/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lms.slayer.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.lms.slayer.service.ClpSerializer;
import com.lms.slayer.service.bookLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mohammed Ali
 */
public class bookClp extends BaseModelImpl<book> implements book {
	public bookClp() {
	}

	public Class<?> getModelClass() {
		return book.class;
	}

	public String getModelClassName() {
		return book.class.getName();
	}

	public long getPrimaryKey() {
		return _bookId;
	}

	public void setPrimaryKey(long primaryKey) {
		setBookId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_bookId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("title", getTitle());
		attributes.put("author", getAuthor());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;

		if (_bookRemoteModel != null) {
			try {
				Class<?> clazz = _bookRemoteModel.getClass();

				Method method = clazz.getMethod("setBookId", long.class);

				method.invoke(_bookRemoteModel, bookId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;

		if (_bookRemoteModel != null) {
			try {
				Class<?> clazz = _bookRemoteModel.getClass();

				Method method = clazz.getMethod("setTitle", String.class);

				method.invoke(_bookRemoteModel, title);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;

		if (_bookRemoteModel != null) {
			try {
				Class<?> clazz = _bookRemoteModel.getClass();

				Method method = clazz.getMethod("setAuthor", String.class);

				method.invoke(_bookRemoteModel, author);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_bookRemoteModel != null) {
			try {
				Class<?> clazz = _bookRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_bookRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbookRemoteModel() {
		return _bookRemoteModel;
	}

	public void setbookRemoteModel(BaseModel<?> bookRemoteModel) {
		_bookRemoteModel = bookRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _bookRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_bookRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			bookLocalServiceUtil.addbook(this);
		}
		else {
			bookLocalServiceUtil.updatebook(this);
		}
	}

	@Override
	public book toEscapedModel() {
		return (book)ProxyUtil.newProxyInstance(book.class.getClassLoader(),
			new Class[] { book.class }, new AutoEscapeBeanHandler(this));
	}

	public book toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		bookClp clone = new bookClp();

		clone.setBookId(getBookId());
		clone.setTitle(getTitle());
		clone.setAuthor(getAuthor());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	public int compareTo(book book) {
		long primaryKey = book.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookClp)) {
			return false;
		}

		bookClp book = (bookClp)obj;

		long primaryKey = book.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{bookId=");
		sb.append(getBookId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", author=");
		sb.append(getAuthor());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.lms.slayer.model.book");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>bookId</column-name><column-value><![CDATA[");
		sb.append(getBookId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>author</column-name><column-value><![CDATA[");
		sb.append(getAuthor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _bookId;
	private String _title;
	private String _author;
	private Date _createDate;
	private BaseModel<?> _bookRemoteModel;
}