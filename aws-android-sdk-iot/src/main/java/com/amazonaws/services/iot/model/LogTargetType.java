/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Log Target Type
 */
public enum LogTargetType {

    DEFAULT("DEFAULT"),
    THING_GROUP("THING_GROUP"),
    CLIENT_ID("CLIENT_ID"),
    SOURCE_IP("SOURCE_IP"),
    PRINCIPAL_ID("PRINCIPAL_ID");

    private String value;

    private LogTargetType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, LogTargetType> enumMap;
    static {
        enumMap = new HashMap<String, LogTargetType>();
        enumMap.put("DEFAULT", DEFAULT);
        enumMap.put("THING_GROUP", THING_GROUP);
        enumMap.put("CLIENT_ID", CLIENT_ID);
        enumMap.put("SOURCE_IP", SOURCE_IP);
        enumMap.put("PRINCIPAL_ID", PRINCIPAL_ID);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return LogTargetType corresponding to the value
     */
    public static LogTargetType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
