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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link book}.
 * </p>
 *
 * @author    Mohammed Ali
 * @see       book
 * @generated
 */
public class bookWrapper implements book, ModelWrapper<book> {
	public bookWrapper(book book) {
		_book = book;
	}

	public Class<?> getModelClass() {
		return book.class;
	}

	public String getModelClassName() {
		return book.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("bookId", getBookId());
		attributes.put("title", getTitle());
		attributes.put("author", getAuthor());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

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

	/**
	* Returns the primary key of this book.
	*
	* @return the primary key of this book
	*/
	public long getPrimaryKey() {
		return _book.getPrimaryKey();
	}

	/**
	* Sets the primary key of this book.
	*
	* @param primaryKey the primary key of this book
	*/
	public void setPrimaryKey(long primaryKey) {
		_book.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the book ID of this book.
	*
	* @return the book ID of this book
	*/
	public long getBookId() {
		return _book.getBookId();
	}

	/**
	* Sets the book ID of this book.
	*
	* @param bookId the book ID of this book
	*/
	public void setBookId(long bookId) {
		_book.setBookId(bookId);
	}

	/**
	* Returns the title of this book.
	*
	* @return the title of this book
	*/
	public java.lang.String getTitle() {
		return _book.getTitle();
	}

	/**
	* Sets the title of this book.
	*
	* @param title the title of this book
	*/
	public void setTitle(java.lang.String title) {
		_book.setTitle(title);
	}

	/**
	* Returns the author of this book.
	*
	* @return the author of this book
	*/
	public java.lang.String getAuthor() {
		return _book.getAuthor();
	}

	/**
	* Sets the author of this book.
	*
	* @param author the author of this book
	*/
	public void setAuthor(java.lang.String author) {
		_book.setAuthor(author);
	}

	/**
	* Returns the create date of this book.
	*
	* @return the create date of this book
	*/
	public java.util.Date getCreateDate() {
		return _book.getCreateDate();
	}

	/**
	* Sets the create date of this book.
	*
	* @param createDate the create date of this book
	*/
	public void setCreateDate(java.util.Date createDate) {
		_book.setCreateDate(createDate);
	}

	public boolean isNew() {
		return _book.isNew();
	}

	public void setNew(boolean n) {
		_book.setNew(n);
	}

	public boolean isCachedModel() {
		return _book.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_book.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _book.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _book.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_book.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _book.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_book.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new bookWrapper((book)_book.clone());
	}

	public int compareTo(com.lms.slayer.model.book book) {
		return _book.compareTo(book);
	}

	@Override
	public int hashCode() {
		return _book.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lms.slayer.model.book> toCacheModel() {
		return _book.toCacheModel();
	}

	public com.lms.slayer.model.book toEscapedModel() {
		return new bookWrapper(_book.toEscapedModel());
	}

	public com.lms.slayer.model.book toUnescapedModel() {
		return new bookWrapper(_book.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _book.toString();
	}

	public java.lang.String toXmlString() {
		return _book.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_book.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookWrapper)) {
			return false;
		}

		bookWrapper bookWrapper = (bookWrapper)obj;

		if (Validator.equals(_book, bookWrapper._book)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public book getWrappedbook() {
		return _book;
	}

	public book getWrappedModel() {
		return _book;
	}

	public void resetOriginalValues() {
		_book.resetOriginalValues();
	}

	private book _book;
}