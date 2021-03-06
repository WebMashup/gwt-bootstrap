/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui.config;

import com.github.gwtbootstrap.client.ui.resources.Resources;

/**
 * This class is the default {@link Configurator} implementation.
 * 
 * @since 2.0.2.0
 * 
 * @author soundTricker
 */
public class DefaultConfigurator implements Configurator {

	/**
	 * {@inheritDoc}
	 */
	public Resources getResources() {
		return Resources.RESOURCES;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean hasResponsiveDesign() {
		return false;
	}

}
