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

import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.restdoc.api.util.RestDocObject;

/**
 * @author hoegertn
 * 
 */
@JsonPropertyOrder({"description", "validations"})
public class ParamDefinition extends RestDocObject {
	
	private String description = "";
	
	private final Collection<ParamValidation> validations = new ArrayList<ParamValidation>();
	
	
	/**
	 * 
	 */
	public ParamDefinition() {
		//
	}
	
	/**
	 * @param description
	 */
	public ParamDefinition(final String description) {
		this.description = description;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * @param description the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}
	
	/**
	 * @return the validations
	 */
	public Collection<ParamValidation> getValidations() {
		return this.validations;
	}
	
}
