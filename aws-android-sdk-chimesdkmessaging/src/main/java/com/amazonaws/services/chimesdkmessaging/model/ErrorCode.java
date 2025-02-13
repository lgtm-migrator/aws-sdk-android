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

package com.amazonaws.services.chimesdkmessaging.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Error Code
 */
public enum ErrorCode {

    BadRequest("BadRequest"),
    Conflict("Conflict"),
    Forbidden("Forbidden"),
    NotFound("NotFound"),
    PreconditionFailed("PreconditionFailed"),
    ResourceLimitExceeded("ResourceLimitExceeded"),
    ServiceFailure("ServiceFailure"),
    AccessDenied("AccessDenied"),
    ServiceUnavailable("ServiceUnavailable"),
    Throttled("Throttled"),
    Throttling("Throttling"),
    Unauthorized("Unauthorized"),
    Unprocessable("Unprocessable"),
    VoiceConnectorGroupAssociationsExist("VoiceConnectorGroupAssociationsExist"),
    PhoneNumberAssociationsExist("PhoneNumberAssociationsExist");

    private String value;

    private ErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ErrorCode> enumMap;
    static {
        enumMap = new HashMap<String, ErrorCode>();
        enumMap.put("BadRequest", BadRequest);
        enumMap.put("Conflict", Conflict);
        enumMap.put("Forbidden", Forbidden);
        enumMap.put("NotFound", NotFound);
        enumMap.put("PreconditionFailed", PreconditionFailed);
        enumMap.put("ResourceLimitExceeded", ResourceLimitExceeded);
        enumMap.put("ServiceFailure", ServiceFailure);
        enumMap.put("AccessDenied", AccessDenied);
        enumMap.put("ServiceUnavailable", ServiceUnavailable);
        enumMap.put("Throttled", Throttled);
        enumMap.put("Throttling", Throttling);
        enumMap.put("Unauthorized", Unauthorized);
        enumMap.put("Unprocessable", Unprocessable);
        enumMap.put("VoiceConnectorGroupAssociationsExist", VoiceConnectorGroupAssociationsExist);
        enumMap.put("PhoneNumberAssociationsExist", PhoneNumberAssociationsExist);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ErrorCode corresponding to the value
     */
    public static ErrorCode fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
