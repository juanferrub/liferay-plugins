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

package com.liferay.contacts.service.permission;

import com.liferay.contacts.model.Entry;
import com.liferay.contacts.service.EntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;

/**
 * @author Ivica Cardic
 */
public class EntryPermission {
	public static void check(
		PermissionChecker permissionChecker, long userId, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, userId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
		PermissionChecker permissionChecker, Entry entry, String actionId)
		throws PortalException, SystemException {

		if (!contains(permissionChecker, entry, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(
		PermissionChecker permissionChecker, long userId, String actionId)
		throws PortalException, SystemException {

		boolean isAdmin = (permissionChecker.isCompanyAdmin() ||
			permissionChecker.isOmniadmin());

		if (ActionKeys.ADD_ENTRY.equals(actionId) &&
			((permissionChecker.getUserId() == userId || isAdmin))) {

			return true;
		}

		return false;
	}

	public static boolean contains(
		PermissionChecker permissionChecker, Entry entry, String actionId)
		throws PortalException, SystemException {

		long userId = permissionChecker.getUserId();

		boolean isAdmin = (permissionChecker.isCompanyAdmin() ||
			permissionChecker.isOmniadmin());

		if (((ActionKeys.DELETE.equals(actionId)) ||
			(ActionKeys.UPDATE.equals(actionId))) &&
			((entry.getUserId() == userId) || isAdmin)) {

			return true;
		}

		return false;
	}

}