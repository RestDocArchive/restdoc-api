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
import java.io.InputStream;

import org.codehaus.jackson.map.ObjectMapper;
import org.restdoc.api.RestDoc;

/**
 * @author hoegertn
 * 
 */
public class RestDocParser {

	/**
	 * @param json
	 * @return the {@link RestDoc}
	 */
	public static RestDoc parseString(String json) {
		try {
			return RestDocParser.createMapper().readValue(json, RestDoc.class);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param json
	 * @return the {@link RestDoc}
	 */
	public static RestDoc parseFile(File json) {
		try {
			return RestDocParser.createMapper().readValue(json, RestDoc.class);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param name
	 * @return the {@link RestDoc}
	 */
	public static RestDoc parseResource(String name) {
		try {
			final InputStream stream = RestDocParser.class.getResourceAsStream(name);
			return RestDocParser.createMapper().readValue(stream, RestDoc.class);
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static ObjectMapper createMapper() {
		final ObjectMapper mapper = new ObjectMapper();
		mapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_COMMENTS, true);

		return mapper;
	}

}
