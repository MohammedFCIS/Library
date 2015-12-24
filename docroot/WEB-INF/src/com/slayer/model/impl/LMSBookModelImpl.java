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

package com.slayer.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.slayer.model.LMSBook;
import com.slayer.model.LMSBookModel;
import com.slayer.model.LMSBookSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the LMSBook service. Represents a row in the &quot;LSM_LMSBook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.slayer.model.LMSBookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LMSBookImpl}.
 * </p>
 *
 * @author Mohammed Ali
 * @see LMSBookImpl
 * @see com.slayer.model.LMSBook
 * @see com.slayer.model.LMSBookModel
 * @generated
 */
@JSON(strict = true)
public class LMSBookModelImpl extends BaseModelImpl<LMSBook>
	implements LMSBookModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a l m s book model instance should use the {@link com.slayer.model.LMSBook} interface instead.
	 */
	public static final String TABLE_NAME = "LSM_LMSBook";
	public static final Object[][] TABLE_COLUMNS = {
			{ "lMSBookId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "bookTitle", Types.VARCHAR },
			{ "bookAuthor", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table LSM_LMSBook (lMSBookId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,bookTitle VARCHAR(75) null,bookAuthor VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table LSM_LMSBook";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.slayer.model.LMSBook"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.slayer.model.LMSBook"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static LMSBook toModel(LMSBookSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		LMSBook model = new LMSBookImpl();

		model.setLMSBookId(soapModel.getLMSBookId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setBookTitle(soapModel.getBookTitle());
		model.setBookAuthor(soapModel.getBookAuthor());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<LMSBook> toModels(LMSBookSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<LMSBook> models = new ArrayList<LMSBook>(soapModels.length);

		for (LMSBookSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.slayer.model.LMSBook"));

	public LMSBookModelImpl() {
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

	public Class<?> getModelClass() {
		return LMSBook.class;
	}

	public String getModelClassName() {
		return LMSBook.class.getName();
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

	@JSON
	public long getLMSBookId() {
		return _lMSBookId;
	}

	public void setLMSBookId(long lMSBookId) {
		_lMSBookId = lMSBookId;
	}

	@JSON
	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public String getBookTitle() {
		if (_bookTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _bookTitle;
		}
	}

	public void setBookTitle(String bookTitle) {
		_bookTitle = bookTitle;
	}

	@JSON
	public String getBookAuthor() {
		if (_bookAuthor == null) {
			return StringPool.BLANK;
		}
		else {
			return _bookAuthor;
		}
	}

	public void setBookAuthor(String bookAuthor) {
		_bookAuthor = bookAuthor;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LMSBook.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LMSBook toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LMSBook)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	public LMSBook toUnescapedModel() {
		return (LMSBook)this;
	}

	@Override
	public Object clone() {
		LMSBookImpl lmsBookImpl = new LMSBookImpl();

		lmsBookImpl.setLMSBookId(getLMSBookId());
		lmsBookImpl.setGroupId(getGroupId());
		lmsBookImpl.setCompanyId(getCompanyId());
		lmsBookImpl.setUserId(getUserId());
		lmsBookImpl.setUserName(getUserName());
		lmsBookImpl.setCreateDate(getCreateDate());
		lmsBookImpl.setModifiedDate(getModifiedDate());
		lmsBookImpl.setBookTitle(getBookTitle());
		lmsBookImpl.setBookAuthor(getBookAuthor());

		lmsBookImpl.resetOriginalValues();

		return lmsBookImpl;
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

		if (!(obj instanceof LMSBook)) {
			return false;
		}

		LMSBook lmsBook = (LMSBook)obj;

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<LMSBook> toCacheModel() {
		LMSBookCacheModel lmsBookCacheModel = new LMSBookCacheModel();

		lmsBookCacheModel.lMSBookId = getLMSBookId();

		lmsBookCacheModel.groupId = getGroupId();

		lmsBookCacheModel.companyId = getCompanyId();

		lmsBookCacheModel.userId = getUserId();

		lmsBookCacheModel.userName = getUserName();

		String userName = lmsBookCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			lmsBookCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			lmsBookCacheModel.createDate = createDate.getTime();
		}
		else {
			lmsBookCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			lmsBookCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			lmsBookCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		lmsBookCacheModel.bookTitle = getBookTitle();

		String bookTitle = lmsBookCacheModel.bookTitle;

		if ((bookTitle != null) && (bookTitle.length() == 0)) {
			lmsBookCacheModel.bookTitle = null;
		}

		lmsBookCacheModel.bookAuthor = getBookAuthor();

		String bookAuthor = lmsBookCacheModel.bookAuthor;

		if ((bookAuthor != null) && (bookAuthor.length() == 0)) {
			lmsBookCacheModel.bookAuthor = null;
		}

		return lmsBookCacheModel;
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

	private static ClassLoader _classLoader = LMSBook.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LMSBook.class
		};
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
	private LMSBook _escapedModel;
}