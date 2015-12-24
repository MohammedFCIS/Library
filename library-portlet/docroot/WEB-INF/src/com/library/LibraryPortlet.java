package com.library;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class LibraryPortlet
 */
public class LibraryPortlet extends MVCPortlet {
	public void updateBook(ActionRequest request, ActionResponse response)
	throws IOException, PortletException{
		String bookTitle = ParamUtil.getString(request, "bookTitle");
		String bookAuthor = ParamUtil.getString(request, "bookAuthor");
		System.out.println("bookTitle:" + bookTitle);
		System.out.println("bookAuthor:" + bookAuthor);
	}
}
