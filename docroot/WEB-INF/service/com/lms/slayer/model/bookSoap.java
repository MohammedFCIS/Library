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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lms.slayer.service.http.bookServiceSoap}.
 *
 * @author    Mohammed Ali
 * @see       com.lms.slayer.service.http.bookServiceSoap
 * @generated
 */
public class bookSoap implements Serializable {
	public static bookSoap toSoapModel(book model) {
		bookSoap soapModel = new bookSoap();

		soapModel.setBookId(model.getBookId());
		soapModel.setTitle(model.getTitle());
		soapModel.setAuthor(model.getAuthor());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static bookSoap[] toSoapModels(book[] models) {
		bookSoap[] soapModels = new bookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static bookSoap[][] toSoapModels(book[][] models) {
		bookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new bookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new bookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static bookSoap[] toSoapModels(List<book> models) {
		List<bookSoap> soapModels = new ArrayList<bookSoap>(models.size());

		for (book model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new bookSoap[soapModels.size()]);
	}

	public bookSoap() {
	}

	public long getPrimaryKey() {
		return _bookId;
	}

	public void setPrimaryKey(long pk) {
		setBookId(pk);
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getAuthor() {
		return _author;
	}

	public void setAuthor(String author) {
		_author = author;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _bookId;
	private String _title;
	private String _author;
	private Date _createDate;
}