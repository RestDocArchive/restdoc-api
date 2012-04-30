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

import java.net.URL;

import org.junit.Test;
import org.restdoc.api.util.RestDocParser;

/**
 * @author hoegertn
 * 
 */
public class TestExampleFile {

	/**
	 * 
	 */
	// @Test
	public void readIS() {
		final URL resource = this.getClass().getResource("/DemoAPI.json");
		System.out.println(resource);
		System.out.println(resource.getFile());
	}

	/**
	 * 
	 */
	@Test
	public void parse() {
		final RestDoc doc = RestDocParser.parseResource("/DemoAPI.json");
		System.out.println(doc);
	}

}
