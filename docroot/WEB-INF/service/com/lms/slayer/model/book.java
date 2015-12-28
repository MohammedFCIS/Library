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

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the book service. Represents a row in the &quot;lms_book&quot; database table, with each column mapped to a property of this class.
 *
 * @author Mohammed Ali
 * @see bookModel
 * @see com.lms.slayer.model.impl.bookImpl
 * @see com.lms.slayer.model.impl.bookModelImpl
 * @generated
 */
public interface book extends bookModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.lms.slayer.model.impl.bookImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
}