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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LMSBook}.
 * </p>
 *
 * @author    Mohammed Ali
 * @see       LMSBook
 * @generated
 */
public class LMSBookWrapper implements LMSBook, ModelWrapper<LMSBook> {
	public LMSBookWrapper(LMSBook lmsBook) {
		_lmsBook = lmsBook;
	}

	public Class<?> getModelClass() {
		return LMSBook.class;
	}

	public String getModelClassName() {
		return LMSBook.class.getName();
	}

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

	/**
	* Returns the primary key of this l m s book.
	*
	* @return the primary key of this l m s book
	*/
	public long getPrimaryKey() {
		return _lmsBook.getPrimaryKey();
	}

	/**
	* Sets the primary key of this l m s book.
	*
	* @param primaryKey the primary key of this l m s book
	*/
	public void setPrimaryKey(long primaryKey) {
		_lmsBook.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the l m s book ID of this l m s book.
	*
	* @return the l m s book ID of this l m s book
	*/
	public long getLMSBookId() {
		return _lmsBook.getLMSBookId();
	}

	/**
	* Sets the l m s book ID of this l m s book.
	*
	* @param lMSBookId the l m s book ID of this l m s book
	*/
	public void setLMSBookId(long lMSBookId) {
		_lmsBook.setLMSBookId(lMSBookId);
	}

	/**
	* Returns the group ID of this l m s book.
	*
	* @return the group ID of this l m s book
	*/
	public long getGroupId() {
		return _lmsBook.getGroupId();
	}

	/**
	* Sets the group ID of this l m s book.
	*
	* @param groupId the group ID of this l m s book
	*/
	public void setGroupId(long groupId) {
		_lmsBook.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this l m s book.
	*
	* @return the company ID of this l m s book
	*/
	public long getCompanyId() {
		return _lmsBook.getCompanyId();
	}

	/**
	* Sets the company ID of this l m s book.
	*
	* @param companyId the company ID of this l m s book
	*/
	public void setCompanyId(long companyId) {
		_lmsBook.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this l m s book.
	*
	* @return the user ID of this l m s book
	*/
	public long getUserId() {
		return _lmsBook.getUserId();
	}

	/**
	* Sets the user ID of this l m s book.
	*
	* @param userId the user ID of this l m s book
	*/
	public void setUserId(long userId) {
		_lmsBook.setUserId(userId);
	}

	/**
	* Returns the user uuid of this l m s book.
	*
	* @return the user uuid of this l m s book
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _lmsBook.getUserUuid();
	}

	/**
	* Sets the user uuid of this l m s book.
	*
	* @param userUuid the user uuid of this l m s book
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_lmsBook.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this l m s book.
	*
	* @return the user name of this l m s book
	*/
	public java.lang.String getUserName() {
		return _lmsBook.getUserName();
	}

	/**
	* Sets the user name of this l m s book.
	*
	* @param userName the user name of this l m s book
	*/
	public void setUserName(java.lang.String userName) {
		_lmsBook.setUserName(userName);
	}

	/**
	* Returns the create date of this l m s book.
	*
	* @return the create date of this l m s book
	*/
	public java.util.Date getCreateDate() {
		return _lmsBook.getCreateDate();
	}

	/**
	* Sets the create date of this l m s book.
	*
	* @param createDate the create date of this l m s book
	*/
	public void setCreateDate(java.util.Date createDate) {
		_lmsBook.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this l m s book.
	*
	* @return the modified date of this l m s book
	*/
	public java.util.Date getModifiedDate() {
		return _lmsBook.getModifiedDate();
	}

	/**
	* Sets the modified date of this l m s book.
	*
	* @param modifiedDate the modified date of this l m s book
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_lmsBook.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the book title of this l m s book.
	*
	* @return the book title of this l m s book
	*/
	public java.lang.String getBookTitle() {
		return _lmsBook.getBookTitle();
	}

	/**
	* Sets the book title of this l m s book.
	*
	* @param bookTitle the book title of this l m s book
	*/
	public void setBookTitle(java.lang.String bookTitle) {
		_lmsBook.setBookTitle(bookTitle);
	}

	/**
	* Returns the book author of this l m s book.
	*
	* @return the book author of this l m s book
	*/
	public java.lang.String getBookAuthor() {
		return _lmsBook.getBookAuthor();
	}

	/**
	* Sets the book author of this l m s book.
	*
	* @param bookAuthor the book author of this l m s book
	*/
	public void setBookAuthor(java.lang.String bookAuthor) {
		_lmsBook.setBookAuthor(bookAuthor);
	}

	public boolean isNew() {
		return _lmsBook.isNew();
	}

	public void setNew(boolean n) {
		_lmsBook.setNew(n);
	}

	public boolean isCachedModel() {
		return _lmsBook.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_lmsBook.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _lmsBook.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _lmsBook.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_lmsBook.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _lmsBook.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_lmsBook.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LMSBookWrapper((LMSBook)_lmsBook.clone());
	}

	public int compareTo(LMSBook lmsBook) {
		return _lmsBook.compareTo(lmsBook);
	}

	@Override
	public int hashCode() {
		return _lmsBook.hashCode();
	}

	public com.liferay.portal.model.CacheModel<LMSBook> toCacheModel() {
		return _lmsBook.toCacheModel();
	}

	public LMSBook toEscapedModel() {
		return new LMSBookWrapper(_lmsBook.toEscapedModel());
	}

	public LMSBook toUnescapedModel() {
		return new LMSBookWrapper(_lmsBook.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _lmsBook.toString();
	}

	public java.lang.String toXmlString() {
		return _lmsBook.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_lmsBook.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LMSBookWrapper)) {
			return false;
		}

		LMSBookWrapper lmsBookWrapper = (LMSBookWrapper)obj;

		if (Validator.equals(_lmsBook, lmsBookWrapper._lmsBook)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public LMSBook getWrappedLMSBook() {
		return _lmsBook;
	}

	public LMSBook getWrappedModel() {
		return _lmsBook;
	}

	public void resetOriginalValues() {
		_lmsBook.resetOriginalValues();
	}

	private LMSBook _lmsBook;
}