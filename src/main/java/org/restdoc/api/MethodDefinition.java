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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({ "description", "statusCodes", "accepts", "headers", "response", "examples" })
public class MethodDefinition {

	private String description;

	private final Map<String, String> statusCodes = new HashMap<String, String>();

	private final Collection<Representation> accepts = new ArrayList<Representation>();

	private final Map<String, HeaderDefinition> headers = new HashMap<String, HeaderDefinition>();

	private ResponseDefinition response;

	private final Collection<ExampleRequest> examples = new ArrayList<ExampleRequest>();

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
	 * @return the statusCodes
	 */
	public Map<String, String> getStatusCodes() {
		return this.statusCodes;
	}

	/**
	 * @return the response
	 */
	public ResponseDefinition getResponse() {
		return this.response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(final ResponseDefinition response) {
		this.response = response;
	}

	/**
	 * @return the accepts
	 */
	public Collection<Representation> getAccepts() {
		return this.accepts;
	}

	/**
	 * @return the headers
	 */
	public Map<String, HeaderDefinition> getHeaders() {
		return this.headers;
	}

	/**
	 * @return the examples
	 */
	public Collection<ExampleRequest> getExamples() {
		return this.examples;
	}

	// #############################################################
	// nice builder methods
	// #############################################################

	/**
	 * @param description
	 * @return this
	 */
	public MethodDefinition description(final String description) {
		this.setDescription(description);
		return this;
	}

	/**
	 * @param code
	 * @param description
	 * @return this
	 */
	public MethodDefinition statusCode(final String code, final String description) {
		this.getStatusCodes().put(code, description);
		return this;
	}

	/**
	 * @param type
	 * @param schema
	 * @return this
	 */
	public MethodDefinition accept(final String type, final String schema) {
		this.getAccepts().add(new Representation(type, schema));
		return this;
	}

	/**
	 * @param name
	 * @param description
	 * @param required
	 * @return this
	 */
	public MethodDefinition header(final String name, final String description, final boolean required) {
		final HeaderDefinition def = new HeaderDefinition(description, required);
		this.getHeaders().put(name, def);
		return this;
	}

	/**
	 * @param response
	 * @return this
	 */
	public MethodDefinition response(final ResponseDefinition response) {
		this.setResponse(response);
		return this;
	}

	/**
	 * @param exampleRequest
	 * @return this
	 */
	public MethodDefinition example(final ExampleRequest exampleRequest) {
		this.getExamples().add(exampleRequest);
		return this;
	}

}
