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

/**
 * @author Arpan Mukhopadhyay
 *
 */
public interface DependencyResolver {

	/**
	 * Exclude the entry from the dependency in the form
	 * {@code group:artifact}
	 * 
	 * @param entry the entry
	 */
	void exclude(String entry);
	
	/**
	 * Exclude the entries from the dependency.
	 * 
	 * @param entries the entries
	 */
	void exclude(Map<String, String> entries);
}
