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

package com.liferay.ams.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Asset service. Represents a row in the &quot;AMS_Asset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.ams.model.impl.AssetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.ams.model.impl.AssetImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Asset
 * @see com.liferay.ams.model.impl.AssetImpl
 * @see com.liferay.ams.model.impl.AssetModelImpl
 * @generated
 */
public interface AssetModel extends AuditedModel, BaseModel<Asset> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a asset model instance should use the {@link Asset} interface instead.
	 */

	/**
	 * Returns the primary key of this asset.
	 *
	 * @return the primary key of this asset
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this asset.
	 *
	 * @param primaryKey the primary key of this asset
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the asset ID of this asset.
	 *
	 * @return the asset ID of this asset
	 */
	public long getAssetId();

	/**
	 * Sets the asset ID of this asset.
	 *
	 * @param assetId the asset ID of this asset
	 */
	public void setAssetId(long assetId);

	/**
	 * Returns the company ID of this asset.
	 *
	 * @return the company ID of this asset
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this asset.
	 *
	 * @param companyId the company ID of this asset
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this asset.
	 *
	 * @return the user ID of this asset
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this asset.
	 *
	 * @param userId the user ID of this asset
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this asset.
	 *
	 * @return the user uuid of this asset
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this asset.
	 *
	 * @param userUuid the user uuid of this asset
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this asset.
	 *
	 * @return the user name of this asset
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this asset.
	 *
	 * @param userName the user name of this asset
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this asset.
	 *
	 * @return the create date of this asset
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this asset.
	 *
	 * @param createDate the create date of this asset
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this asset.
	 *
	 * @return the modified date of this asset
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this asset.
	 *
	 * @param modifiedDate the modified date of this asset
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the definition ID of this asset.
	 *
	 * @return the definition ID of this asset
	 */
	public long getDefinitionId();

	/**
	 * Sets the definition ID of this asset.
	 *
	 * @param definitionId the definition ID of this asset
	 */
	public void setDefinitionId(long definitionId);

	/**
	 * Returns the serial number of this asset.
	 *
	 * @return the serial number of this asset
	 */
	@AutoEscape
	public String getSerialNumber();

	/**
	 * Sets the serial number of this asset.
	 *
	 * @param serialNumber the serial number of this asset
	 */
	public void setSerialNumber(String serialNumber);

	/**
	 * Returns the inactive date of this asset.
	 *
	 * @return the inactive date of this asset
	 */
	public Date getInactiveDate();

	/**
	 * Sets the inactive date of this asset.
	 *
	 * @param inactiveDate the inactive date of this asset
	 */
	public void setInactiveDate(Date inactiveDate);

	/**
	 * Returns the active of this asset.
	 *
	 * @return the active of this asset
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this asset is active.
	 *
	 * @return <code>true</code> if this asset is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this asset is active.
	 *
	 * @param active the active of this asset
	 */
	public void setActive(boolean active);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Asset asset);

	public int hashCode();

	public CacheModel<Asset> toCacheModel();

	public Asset toEscapedModel();

	public String toString();

	public String toXmlString();
}