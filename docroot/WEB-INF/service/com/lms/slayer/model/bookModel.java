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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the book service. Represents a row in the &quot;lms_book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lms.slayer.model.impl.bookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lms.slayer.model.impl.bookImpl}.
 * </p>
 *
 * @author Mohammed Ali
 * @see book
 * @see com.lms.slayer.model.impl.bookImpl
 * @see com.lms.slayer.model.impl.bookModelImpl
 * @generated
 */
public interface bookModel extends BaseModel<book> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a book model instance should use the {@link book} interface instead.
	 */

	/**
	 * Returns the primary key of this book.
	 *
	 * @return the primary key of this book
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this book.
	 *
	 * @param primaryKey the primary key of this book
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the book ID of this book.
	 *
	 * @return the book ID of this book
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this book.
	 *
	 * @param bookId the book ID of this book
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the title of this book.
	 *
	 * @return the title of this book
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this book.
	 *
	 * @param title the title of this book
	 */
	public void setTitle(String title);

	/**
	 * Returns the author of this book.
	 *
	 * @return the author of this book
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this book.
	 *
	 * @param author the author of this book
	 */
	public void setAuthor(String author);

	/**
	 * Returns the create date of this book.
	 *
	 * @return the create date of this book
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this book.
	 *
	 * @param createDate the create date of this book
	 */
	public void setCreateDate(Date createDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(book book);

	public int hashCode();

	public CacheModel<book> toCacheModel();

	public book toEscapedModel();

	public book toUnescapedModel();

	public String toString();

	public String toXmlString();
}