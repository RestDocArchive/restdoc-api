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
@JsonPropertyOrder({ "types", "headers" })
public class ResponseDefinition {

	private final Collection<Representation> types = new ArrayList<Representation>();

	private final Map<String, HeaderDefinition> headers = new HashMap<String, HeaderDefinition>();

	/**
	 * @return the types
	 */
	public Collection<Representation> getTypes() {
		return this.types;
	}

	/**
	 * @return the headers
	 */
	public Map<String, HeaderDefinition> getHeaders() {
		return this.headers;
	}

	// #############################################################
	// nice builder methods
	// #############################################################

	/**
	 * @param type
	 * @param schema
	 * @return this
	 */
	public ResponseDefinition type(String type, String schema) {
		final Representation def = new Representation();
		def.setSchema(schema);
		def.setType(type);
		this.getTypes().add(def);
		return this;
	}

	/**
	 * @param name
	 * @param description
	 * @param required
	 * @return this
	 */
	public ResponseDefinition header(String name, String description, boolean required) {
		final HeaderDefinition def = new HeaderDefinition(description, required);
		this.getHeaders().put(name, def);
		return this;
	}
}
