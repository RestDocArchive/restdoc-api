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

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.restdoc.api.util.RestDocObject;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({ "id", "description", "path", "params", "methods" })
public class RestResource extends RestDocObject {

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
	public void setId(final String id) {
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
	public void setDescription(final String description) {
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
	public void setPath(final String path) {
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

	// #############################################################
	// nice builder methods
	// #############################################################

	/**
	 * @param _id
	 * @return this
	 */
	public RestResource id(final String _id) {
		this.setId(_id);
		return this;
	}

	/**
	 * @param _description
	 * @return this
	 */
	public RestResource description(final String _description) {
		this.setDescription(_description);
		return this;
	}

	/**
	 * @param _path
	 * @return this
	 */
	public RestResource path(final String _path) {
		this.setPath(_path);
		return this;
	}

	/**
	 * @param _name
	 * @param _description
	 * @param _validations
	 * @return this
	 */
	public RestResource param(final String _name, final String _description, final ParamValidation... _validations) {
		final ParamDefinition def = new ParamDefinition();
		def.setDescription(_description);
		def.getValidations().addAll(Arrays.asList(_validations));
		this.getParams().put(_name, def);
		return this;
	}

	/**
	 * @param verb
	 * @param method
	 * @return this
	 */
	public RestResource method(final String verb, final MethodDefinition method) {
		this.getMethods().put(verb, method);
		return this;
	}
}
