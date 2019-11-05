/*
 * Copyright 2019 Red Hat
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

package io.apicurio.registry.utils.serde.util;

/**
 * @author Ales Justin
 */
public class Utils {

    public static boolean isTrue(Object parameter) {
        if (parameter == null) {
            return false;
        }
        if (parameter instanceof Boolean) {
            return (Boolean) parameter;
        }
        if (parameter instanceof String) {
            return Boolean.parseBoolean((String) parameter);
        }
        return false;
    }

}