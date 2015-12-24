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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.slayer.model.LMSBook;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing LMSBook in entity cache.
 *
 * @author Mohammed Ali
 * @see LMSBook
 * @generated
 */
public class LMSBookCacheModel implements CacheModel<LMSBook>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{lMSBookId=");
		sb.append(lMSBookId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", bookTitle=");
		sb.append(bookTitle);
		sb.append(", bookAuthor=");
		sb.append(bookAuthor);
		sb.append("}");

		return sb.toString();
	}

	public LMSBook toEntityModel() {
		LMSBookImpl lmsBookImpl = new LMSBookImpl();

		lmsBookImpl.setLMSBookId(lMSBookId);
		lmsBookImpl.setGroupId(groupId);
		lmsBookImpl.setCompanyId(companyId);
		lmsBookImpl.setUserId(userId);

		if (userName == null) {
			lmsBookImpl.setUserName(StringPool.BLANK);
		}
		else {
			lmsBookImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			lmsBookImpl.setCreateDate(null);
		}
		else {
			lmsBookImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			lmsBookImpl.setModifiedDate(null);
		}
		else {
			lmsBookImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (bookTitle == null) {
			lmsBookImpl.setBookTitle(StringPool.BLANK);
		}
		else {
			lmsBookImpl.setBookTitle(bookTitle);
		}

		if (bookAuthor == null) {
			lmsBookImpl.setBookAuthor(StringPool.BLANK);
		}
		else {
			lmsBookImpl.setBookAuthor(bookAuthor);
		}

		lmsBookImpl.resetOriginalValues();

		return lmsBookImpl;
	}

	public long lMSBookId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String bookTitle;
	public String bookAuthor;
}