/*
 * Copyright (C) 2012 Clarion Media, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clarionmedia.infinitum.orm.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * This annotation indicates that the annotated {@link java.lang.reflect.Field} represents a
 * many-to-one relationship with another persistent class.
 * </p>
 * 
 * @author Tyler Treat
 * @version 1.0 02/19/12
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ManyToOne {

	/**
	 * Returns the name of the column representing the foreign key in this
	 * relationship.
	 * 
	 * @return name of foreign key column
	 */
	String column();
	
	/**
	 * Returns the name of this relationship.
	 * 
	 * @return name of many-to-one relationship.
	 */
	String name();

}
