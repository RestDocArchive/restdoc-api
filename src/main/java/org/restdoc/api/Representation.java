/**
 * Copyright 2012 Thorsten Höger, RestDoc.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.restdoc.api;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.restdoc.api.util.RestDocObject;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({"type", "schema"})
public class Representation extends RestDocObject {
	
	private String type;
	
	private String schema;
	
	
	/**
	 * 
	 */
	public Representation() {
		//
	}
	
	/**
	 * @param type
	 * @param schema
	 */
	public Representation(final String type, final String schema) {
		this.type = type;
		this.schema = schema;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}
	
	/**
	 * @return the schema
	 */
	public String getSchema() {
		return this.schema;
	}
	
	/**
	 * @param schema the schema to set
	 */
	public void setSchema(final String schema) {
		this.schema = schema;
	}
	
}
