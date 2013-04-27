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

import java.io.IOException;

import org.junit.Test;
import org.restdoc.api.util.RestDocParser;

/**
 * @author hoegertn
 * 
 */
public class TestExampleFile {
	
	/**
	 * @throws IOException on parse errors
	 */
	@Test
	public void parse() throws IOException {
		final RestDoc doc = RestDocParser.parseResource("/DemoAPI.json");
		System.out.println(RestDocParser.writeRestDoc(doc));
		System.out.println(doc.getHeaders().getAdditionalBoolean("extension"));
	}
	
}
