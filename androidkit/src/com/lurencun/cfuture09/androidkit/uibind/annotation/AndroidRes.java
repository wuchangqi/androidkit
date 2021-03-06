/*
 * @(#)AndroidRes.java		       Project:com.sinaapp.msdxblog.androidkit
 * Date:2012-11-18
 *
 * Copyright (c) 2011 CFuture09, Institute of Software, 
 * Guangdong Ocean University, Zhanjiang, GuangDong, China.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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
package com.lurencun.cfuture09.androidkit.uibind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Android资源。
 * 
 * @author Geek_Soledad (66704238@51uc.com)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AndroidRes {
	/**
	 * @return 资源ID
	 */
	public int id();

	/**
	 * @return 资源类型
	 */
	public ResType type();

	/**
	 * 资源类型。
	 * 
	 * @author msdx
	 */
	public enum ResType {
		BOOLEAN, COLOR, DRAWABLE, INT, INT_ARRAY, STRING, STRING_ARRAY, TEXT, TEXT_ARRAY
	}
}
