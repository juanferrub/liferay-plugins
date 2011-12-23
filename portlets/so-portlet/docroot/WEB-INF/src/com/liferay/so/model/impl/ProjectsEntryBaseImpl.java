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

package com.liferay.so.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.so.model.ProjectsEntry;
import com.liferay.so.service.ProjectsEntryLocalServiceUtil;

/**
 * The extended model base implementation for the ProjectsEntry service. Represents a row in the &quot;SO_ProjectsEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProjectsEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProjectsEntryImpl
 * @see com.liferay.so.model.ProjectsEntry
 * @generated
 */
public abstract class ProjectsEntryBaseImpl extends ProjectsEntryModelImpl
	implements ProjectsEntry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a projects entry model instance should use the {@link ProjectsEntry} interface instead.
	 */
	public void persist() throws SystemException {
		ProjectsEntryLocalServiceUtil.updateProjectsEntry(this);
	}
}