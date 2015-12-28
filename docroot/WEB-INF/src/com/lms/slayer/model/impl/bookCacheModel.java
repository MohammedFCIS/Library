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

package com.lms.slayer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lms.slayer.model.book;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing book in entity cache.
 *
 * @author Mohammed Ali
 * @see book
 * @generated
 */
public class bookCacheModel implements CacheModel<book>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{bookId=");
		sb.append(bookId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", author=");
		sb.append(author);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	public book toEntityModel() {
		bookImpl bookImpl = new bookImpl();

		bookImpl.setBookId(bookId);

		if (title == null) {
			bookImpl.setTitle(StringPool.BLANK);
		}
		else {
			bookImpl.setTitle(title);
		}

		if (author == null) {
			bookImpl.setAuthor(StringPool.BLANK);
		}
		else {
			bookImpl.setAuthor(author);
		}

		if (createDate == Long.MIN_VALUE) {
			bookImpl.setCreateDate(null);
		}
		else {
			bookImpl.setCreateDate(new Date(createDate));
		}

		bookImpl.resetOriginalValues();

		return bookImpl;
	}

	public long bookId;
	public String title;
	public String author;
	public long createDate;
}