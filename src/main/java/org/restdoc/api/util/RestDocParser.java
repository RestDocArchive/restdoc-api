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
package org.restdoc.api.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.restdoc.api.RestDoc;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author hoegertn
 * 
 */
public final class RestDocParser {
	
	private RestDocParser() {
		//
	}
	
	/**
	 * @param json
	 * @return the {@link RestDoc}
	 * @throws IOException
	 */
	public static RestDoc parseString(final String json) throws IOException {
		return RestDocParser.createMapper().readValue(json, RestDoc.class);
	}
	
	/**
	 * @param json
	 * @return the {@link RestDoc}
	 * @throws IOException
	 */
	public static RestDoc parseFile(final File json) throws IOException {
		return RestDocParser.createMapper().readValue(json, RestDoc.class);
	}
	
	/**
	 * @param name
	 * @return the {@link RestDoc}
	 * @throws IOException
	 */
	public static RestDoc parseResource(final String name) throws IOException {
		final InputStream stream = RestDocParser.class.getResourceAsStream(name);
		return RestDocParser.createMapper().readValue(stream, RestDoc.class);
	}
	
	/**
	 * @param doc the {@link RestDoc} object
	 * @return the JSON String
	 * @throws IOException
	 */
	public static String writeRestDoc(final RestDoc doc) throws IOException {
		return RestDocParser.createMapper().writeValueAsString(doc);
	}
	
	/**
	 * @return the Jackson mapper for RestDoc
	 */
	public static ObjectMapper createMapper() {
		final ObjectMapper mapper = new ObjectMapper();
		// Allow comments in JSON
		mapper.configure(Feature.ALLOW_COMMENTS, true);
		// Allow unknown properties for extensibility
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		// Include only non-null values
		mapper.setSerializationInclusion(Include.NON_NULL);
		return mapper;
	}
	
}
