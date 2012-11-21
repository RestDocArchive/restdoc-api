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

import org.codehaus.jackson.annotate.JsonPropertyOrder;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({ "type", "pattern" })
public class ParamValidation {

	private String type;

	private String pattern;

	/**
	 * 
	 */
	public ParamValidation() {
		//
	}

	/**
	 * @param type
	 * @param pattern
	 */
	public ParamValidation(final String type, final String pattern) {
		this.type = type;
		this.pattern = pattern;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(final String type) {
		this.type = type;
	}

	/**
	 * @return the pattern
	 */
	public String getPattern() {
		return this.pattern;
	}

	/**
	 * @param pattern
	 *            the pattern to set
	 */
	public void setPattern(final String pattern) {
		this.pattern = pattern;
	}

}
