/***************************************************************************
 * Copyright 2013 by
 *  + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *      + Software Engineering Group 
 *  and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package de.cau.cs.se.kieker.service.eclipse.launch;

/**
 * The enumeration represents the different kinds of services supported by the Eclipse plugin.
 * 
 * @author rju -- initial contribution
 */
public enum ServiceTypes {
	
	TCP_CLIENT("TCP Client"), TCP_SERVER("TCP Server (single)"), TCP_MULTI_SERVER(
	        "TCP Server (multiple)"), JMS_CLIENT("JMS Connector"), JMS_EMBEDDED("JMS Embedded");

	private String label;

	/**
	 * Constructor for ServiceTypes enumeration.
	 * 
	 * @param label
	 *            associated with a enumeration value
	 */
	private ServiceTypes(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return this.label;
	}
}
