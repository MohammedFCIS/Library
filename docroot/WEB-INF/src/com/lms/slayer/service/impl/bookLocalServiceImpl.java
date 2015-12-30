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

package com.lms.slayer.service.impl;

import java.util.Date;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.lms.slayer.model.book;
import com.lms.slayer.model.impl.bookImpl;
import com.lms.slayer.service.base.bookLocalServiceBaseImpl;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lms.slayer.service.bookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Mohammed Ali
 * @see com.lms.slayer.service.base.bookLocalServiceBaseImpl
 * @see com.lms.slayer.service.bookLocalServiceUtil
 */
public class bookLocalServiceImpl extends bookLocalServiceBaseImpl {
	
	public book insetBook(String bookTitle, String bookAuthor) {
		book book = new bookImpl();
		long lMSBookId = 0;
		try{
			lMSBookId = CounterLocalServiceUtil.increment();
		}catch(SystemException e){
			e.printStackTrace();
		}
		book.setBookId(lMSBookId);
		book.setTitle(bookTitle);
		book.setAuthor(bookAuthor);
		book.setCreateDate(new Date());
		try{
			addbook(book);
		}catch(SystemException e){
			e.printStackTrace();
		}
		return book;
	}
}