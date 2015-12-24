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

package com.slayer.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.slayer.service.ClpSerializer;
import com.slayer.service.LMSBookLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mohammed Ali
 */
public class LMSBookClp extends BaseModelImpl<LMSBook> implements LMSBook {
	public LMSBookClp() {
	}

	public Class<?> getModelClass() {
		return LMSBook.class;
	}

	public String getModelClassName() {
		return LMSBook.class.getName();
	}

	public long getPrimaryKey() {
		return _lMSBookId;
	}

	public void setPrimaryKey(long primaryKey) {
		setLMSBookId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_lMSBookId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lMSBookId", getLMSBookId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookTitle", getBookTitle());
		attributes.put("bookAuthor", getBookAuthor());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lMSBookId = (Long)attributes.get("lMSBookId");

		if (lMSBookId != null) {
			setLMSBookId(lMSBookId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String bookTitle = (String)attributes.get("bookTitle");

		if (bookTitle != null) {
			setBookTitle(bookTitle);
		}

		String bookAuthor = (String)attributes.get("bookAuthor");

		if (bookAuthor != null) {
			setBookAuthor(bookAuthor);
		}
	}

	public long getLMSBookId() {
		return _lMSBookId;
	}

	public void setLMSBookId(long lMSBookId) {
		_lMSBookId = lMSBookId;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setLMSBookId", long.class);

				method.invoke(_lmsBookRemoteModel, lMSBookId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_lmsBookRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_lmsBookRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_lmsBookRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_lmsBookRemoteModel, userName);
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

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_lmsBookRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_lmsBookRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBookTitle() {
		return _bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		_bookTitle = bookTitle;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setBookTitle", String.class);

				method.invoke(_lmsBookRemoteModel, bookTitle);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getBookAuthor() {
		return _bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		_bookAuthor = bookAuthor;

		if (_lmsBookRemoteModel != null) {
			try {
				Class<?> clazz = _lmsBookRemoteModel.getClass();

				Method method = clazz.getMethod("setBookAuthor", String.class);

				method.invoke(_lmsBookRemoteModel, bookAuthor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLMSBookRemoteModel() {
		return _lmsBookRemoteModel;
	}

	public void setLMSBookRemoteModel(BaseModel<?> lmsBookRemoteModel) {
		_lmsBookRemoteModel = lmsBookRemoteModel;
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

		Class<?> remoteModelClass = _lmsBookRemoteModel.getClass();

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

		Object returnValue = method.invoke(_lmsBookRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			LMSBookLocalServiceUtil.addLMSBook(this);
		}
		else {
			LMSBookLocalServiceUtil.updateLMSBook(this);
		}
	}

	@Override
	public LMSBook toEscapedModel() {
		return (LMSBook)ProxyUtil.newProxyInstance(LMSBook.class.getClassLoader(),
			new Class[] { LMSBook.class }, new AutoEscapeBeanHandler(this));
	}

	public LMSBook toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		LMSBookClp clone = new LMSBookClp();

		clone.setLMSBookId(getLMSBookId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setBookTitle(getBookTitle());
		clone.setBookAuthor(getBookAuthor());

		return clone;
	}

	public int compareTo(LMSBook lmsBook) {
		long primaryKey = lmsBook.getPrimaryKey();

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

		if (!(obj instanceof LMSBookClp)) {
			return false;
		}

		LMSBookClp lmsBook = (LMSBookClp)obj;

		long primaryKey = lmsBook.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{lMSBookId=");
		sb.append(getLMSBookId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", bookTitle=");
		sb.append(getBookTitle());
		sb.append(", bookAuthor=");
		sb.append(getBookAuthor());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.slayer.model.LMSBook");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>lMSBookId</column-name><column-value><![CDATA[");
		sb.append(getLMSBookId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookTitle</column-name><column-value><![CDATA[");
		sb.append(getBookTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookAuthor</column-name><column-value><![CDATA[");
		sb.append(getBookAuthor());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _lMSBookId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _bookTitle;
	private String _bookAuthor;
	private BaseModel<?> _lmsBookRemoteModel;
}