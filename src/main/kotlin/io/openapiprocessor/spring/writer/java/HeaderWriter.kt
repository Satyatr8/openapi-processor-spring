/*
 * Copyright 2019-2020 the original authors
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

package io.openapiprocessor.spring.writer.java

import io.openapiprocessor.core.writer.java.SimpleWriter
import io.openapiprocessor.spring.Version
import java.io.Writer

import java.time.Instant


var HEADER = """
    |/*
    | * DO NOT MODIFY - this class was auto generated by openapi-processor-spring
    | *
    | * ${Version.version}
    | * ${Instant.now()} 
    | * https://docs.openapiprocessor.io/spring 
    | */
    |
""".trimMargin()

/**
 * Writer for a simple header of the generated interfaces & classes.
 *
 * @author Martin Hauner
 */
class HeaderWriter: SimpleWriter {

    override fun write(target: Writer) {
        target.write (HEADER)
    }

}
