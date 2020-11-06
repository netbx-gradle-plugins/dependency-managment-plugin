/**
 * Copyright (c) 2020-present Arpan Mukhopadhyay. All rights reserved
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.netbx.gradle.dependencymanagement.dsl;

import java.util.Map;

import org.gradle.api.Action;

import groovy.lang.Closure;

/**
 * 
 * @author Arpan Mukhopadhyay
 *
 */
public interface DependenciesResolver {

	/**
	 * Configure a dependency with the given entry. The entry must be of the form
	 * {@code group:artifact:version}
	 * 
	 * @param entry the dependency entry.
	 */
	void dependency(String entry);
	
	/**
	 * Configure a dependency with the given entry. The entry must be a map with 
	 * {@code group}, {@code artifact} and {@code version} entries.
	 * 
	 * @param entries the dependency entries.
	 */
	void dependency(Map<String, String> entries);
	
	/**
	 * Configure a dependency with the given entry and closure. The entry must be of the form
	 * {@code group:artifact:version}. The closure can be used to configure the dependency further 
	 *  
	 * @param entry the dependency entry
	 * @param closure the closure to configure the dependency further
	 */
	void dependency(String entry, Closure<?> closure);
	
	/**
	 * 
	 * @param entry
	 * @param action
	 */
	void dependency(String entry, Action<DependencyResolver> action);
	
	/**
	 * 
	 * @param entries
	 * @param closure
	 */
	void dependency(Map<String, String> entries, Closure<?> closure);
	
	/**
	 * 
	 * @param entries
	 * @param action
	 */
	void dependency(Map<String, String> entries, Action<DependencyResolver> action);
	
	/**
	 * 
	 * @param entry
	 * @param closure
	 */
	void dependencySet(String entry, Closure<?> closure);
	
	/**
	 * 
	 * @param entry
	 * @param action
	 */
	void dependencySet(String entry, Action<DependencyResolver> action);
	
	/**
	 * 
	 * @param entries
	 * @param closure
	 */
	void dependencySet(Map<String, String> entries, Closure<?> closure);
	
	/**
	 * 
	 * @param entries
	 * @param action
	 */
	void dependencySet(Map<String, String> entries, Action<DependencyResolver> action);
}
