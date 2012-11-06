<%--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>

<portlet:defineObjects />

<liferay-theme:defineObjects />

<%@ page import="com.liferay.polls.NoSuchChoiceException" %><%@
page import="com.liferay.polls.NoSuchQuestionException" %><%@
page import="com.liferay.polls.QuestionChoiceException" %><%@
page import="com.liferay.polls.QuestionDescriptionException" %><%@
page import="com.liferay.polls.QuestionExpirationDateException" %><%@
page import="com.liferay.polls.QuestionTitleException" %><%@
page import="com.liferay.polls.model.PollsChoice" %><%@
page import="com.liferay.polls.model.PollsQuestion" %><%@
page import="com.liferay.polls.model.PollsVote" %><%@
page import="com.liferay.polls.service.PollsChoiceLocalServiceUtil" %><%@
page import="com.liferay.polls.service.PollsQuestionLocalServiceUtil" %><%@
page import="com.liferay.polls.service.PollsVoteLocalServiceUtil" %><%@
page import="com.liferay.polls.service.permission.PollsPermission" %><%@
page import="com.liferay.polls.service.permission.PollsQuestionPermission" %><%@
page import="com.liferay.polls.util.PollsConstants" %><%@
page import="com.liferay.polls.util.PollsUtil" %><%@
page import="com.liferay.portal.kernel.dao.search.ResultRow" %><%@
page import="com.liferay.portal.kernel.dao.search.SearchContainer" %><%@
page import="com.liferay.portal.kernel.language.LanguageUtil" %><%@
page import="com.liferay.portal.kernel.util.Constants" %><%@
page import="com.liferay.portal.kernel.util.FastDateFormatFactoryUtil" %><%@
page import="com.liferay.portal.kernel.util.HtmlUtil" %><%@
page import="com.liferay.portal.kernel.util.ParamUtil" %><%@
page import="com.liferay.portal.kernel.util.StringPool" %><%@
page import="com.liferay.portal.kernel.util.StringUtil" %><%@
page import="com.liferay.portal.kernel.util.WebKeys" %><%@
page import="com.liferay.portal.security.permission.ActionKeys" %><%@
page import="com.liferay.portal.util.PortalUtil" %><%@

<%@ page import="java.text.Format" %>

<%@ page import="java.util.ArrayList" %><%@
page import="java.util.List" %>

<%@ page import="javax.portlet.PortletURL" %><%@
page import="javax.portlet.WindowState" %>

<%
String currentURL = PortalUtil.getCurrentURL(request);

WindowState windowState = renderRequest.getWindowState();

Format dateFormatDateTime = FastDateFormatFactoryUtil.getDateTime(locale, timeZone);
%>

<%@ include file="/polls/init-ext.jsp" %>