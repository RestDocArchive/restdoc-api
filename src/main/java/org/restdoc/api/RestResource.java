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

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({ "id", "description", "path", "params", "methods" })
public class RestResource {

	private String id;

	private String description;

	private String path;

	private final Map<String, ParamDefinition> params = new HashMap<String, ParamDefinition>();

	private final Map<String, MethodDefinition> methods = new HashMap<String, MethodDefinition>();

	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return this.path;
	}

	/**
	 * @param path
	 *            the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the params
	 */
	public Map<String, ParamDefinition> getParams() {
		return this.params;
	}

	/**
	 * @return the methods
	 */
	public Map<String, MethodDefinition> getMethods() {
		return this.methods;
	}

	// ######################################################################
	// convenience methods
	// ######################################################################

}
