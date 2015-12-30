package com.library;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.lms.slayer.service.bookLocalServiceUtil;

/**
 * Portlet implementation class LibraryPortlet
 */
public class LibraryPortlet extends MVCPortlet {
	public void updateBook(ActionRequest request, ActionResponse response)
	throws IOException, PortletException{
		String bookTitle = ParamUtil.getString(request, "bookTitle");
		String bookAuthor = ParamUtil.getString(request, "bookAuthor");
		bookLocalServiceUtil.insetBook(bookTitle, bookAuthor);	
		
		ThemeDisplay themeDisplay = 
				(ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		PortletConfig portletConfig = 
				(PortletConfig) request.getAttribute("javax.portlet.config");
		String portletName = portletConfig.getPortletName();
		PortletURL successPageURL = PortletURLFactoryUtil.create(
				request, portletName+"_WAR_" + portletName+"portlet",
				themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		successPageURL.setParameter("jspPage", LibraryConstants.SUCCESS_PAGE);
		response.sendRedirect(successPageURL.toString());
	}

	
}
