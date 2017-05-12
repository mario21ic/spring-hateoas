/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.hateoas.hal.forms.support;

import java.util.HashMap;

public class BooleanMap extends HashMap<ItemParams, java.lang.Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1910229391107494412L;

	@Override
	public Boolean get(final Object key) {
		if (containsKey(key)) {
			return super.get(key);
		}
		return Boolean.FALSE;
	}
}
