package com.library;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.lms.slayer.model.book;
import com.lms.slayer.model.impl.bookImpl;
import com.lms.slayer.service.bookLocalServiceUtil;

/**
 * Portlet implementation class LibraryPortlet
 */
public class LibraryPortlet extends MVCPortlet {
	public void updateBook(ActionRequest request, ActionResponse response)
	throws IOException, PortletException{
		String bookTitle = ParamUtil.getString(request, "bookTitle");
		String bookAuthor = ParamUtil.getString(request, "bookAuthor");
		insetBook(bookTitle, bookAuthor);
	}

	private void insetBook(String bookTitle, String bookAuthor) {
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
			bookLocalServiceUtil.addbook(book);
		}catch(SystemException e){
			e.printStackTrace();
		}
	}
}
