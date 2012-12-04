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

<%@ include file="/html/portlet/init.jsp" %>

<%@ page import="com.liferay.polls.DuplicateVoteException" %><%@
page import="com.liferay.polls.NoSuchChoiceException" %><%@
page import="com.liferay.polls.NoSuchQuestionException" %><%@
page import="com.liferay.polls.QuestionChoiceException" %><%@
page import="com.liferay.polls.QuestionDescriptionException" %><%@
page import="com.liferay.polls.QuestionExpirationDateException" %><%@
page import="com.liferay.polls.QuestionTitleException" %><%@
page import="com.liferay.polls.action.EditQuestionAction" %><%@
page import="com.liferay.polls.model.PollsChoice" %><%@
page import="com.liferay.polls.model.PollsQuestion" %><%@
page import="com.liferay.polls.model.PollsVote" %><%@
page import="com.liferay.polls.service.PollsChoiceLocalServiceUtil" %><%@
page import="com.liferay.polls.service.PollsQuestionLocalServiceUtil" %><%@
page import="com.liferay.polls.service.PollsVoteLocalServiceUtil" %><%@
page import="com.liferay.polls.service.permission.PollsPermission" %><%@
page import="com.liferay.polls.service.permission.PollsQuestionPermission" %><%@
page import="com.liferay.polls.util.PollsUtil" %>

<%
Format dateFormatDateTime = FastDateFormatFactoryUtil.getDateTime(locale, timeZone);
%>

<%@ include file="/html/portlet/polls/init-ext.jsp" %>