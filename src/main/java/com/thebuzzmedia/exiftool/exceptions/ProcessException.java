/**
 * Copyright 2015 Mickael Jeanroy <mickael.jeanroy@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.thebuzzmedia.exiftool.exceptions;

import java.io.IOException;

/**
 * Exception thrown when a process has failed because of
 * IO Exception.
 */
public class ProcessException extends AbstractExifException {

	/**
	 * Create exception.
	 *
	 * @param ex Original Exception.
	 */
	public ProcessException(IOException ex) {
		super(ex);
	}

	/**
	 * Create exception.
	 *
	 * @param message Error message.
	 */
	public ProcessException(String message) {
		super(message);
	}
}
