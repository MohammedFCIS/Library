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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.slayer.service.http.LMSBookServiceSoap}.
 *
 * @author    Mohammed Ali
 * @see       com.slayer.service.http.LMSBookServiceSoap
 * @generated
 */
public class LMSBookSoap implements Serializable {
	public static LMSBookSoap toSoapModel(LMSBook model) {
		LMSBookSoap soapModel = new LMSBookSoap();

		soapModel.setLMSBookId(model.getLMSBookId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBookTitle(model.getBookTitle());
		soapModel.setBookAuthor(model.getBookAuthor());

		return soapModel;
	}

	public static LMSBookSoap[] toSoapModels(LMSBook[] models) {
		LMSBookSoap[] soapModels = new LMSBookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LMSBookSoap[][] toSoapModels(LMSBook[][] models) {
		LMSBookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LMSBookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LMSBookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LMSBookSoap[] toSoapModels(List<LMSBook> models) {
		List<LMSBookSoap> soapModels = new ArrayList<LMSBookSoap>(models.size());

		for (LMSBook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LMSBookSoap[soapModels.size()]);
	}

	public LMSBookSoap() {
	}

	public long getPrimaryKey() {
		return _lMSBookId;
	}

	public void setPrimaryKey(long pk) {
		setLMSBookId(pk);
	}

	public long getLMSBookId() {
		return _lMSBookId;
	}

	public void setLMSBookId(long lMSBookId) {
		_lMSBookId = lMSBookId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getBookTitle() {
		return _bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		_bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return _bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		_bookAuthor = bookAuthor;
	}

	private long _lMSBookId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _bookTitle;
	private String _bookAuthor;
}