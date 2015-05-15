/*
 * This file is part of ZenCode, licensed under the MIT License (MIT).
 * 
 * Copyright (c) 2014 openzen.org <http://zencode.openzen.org>
 */
package org.openzen.zencode.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Exposes this class to ZenScript. The class can then be imported and accessed
 * into any script.
 * 
 * @author Stan Hebben
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ZenStruct {
	/**
	 * Contains the class' package and name. If omitted, the java package and
	 * name will be used.
	 * 
	 * @return 
	 */
	String value() default "";
}