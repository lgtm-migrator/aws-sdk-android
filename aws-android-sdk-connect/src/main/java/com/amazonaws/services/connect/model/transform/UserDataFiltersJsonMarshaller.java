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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserDataFilters
 */
class UserDataFiltersJsonMarshaller {

    public void marshall(UserDataFilters userDataFilters, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (userDataFilters.getQueues() != null) {
            java.util.List<String> queues = userDataFilters.getQueues();
            jsonWriter.name("Queues");
            jsonWriter.beginArray();
            for (String queuesItem : queues) {
                if (queuesItem != null) {
                    jsonWriter.value(queuesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (userDataFilters.getContactFilter() != null) {
            ContactFilter contactFilter = userDataFilters.getContactFilter();
            jsonWriter.name("ContactFilter");
            ContactFilterJsonMarshaller.getInstance().marshall(contactFilter, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UserDataFiltersJsonMarshaller instance;

    public static UserDataFiltersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserDataFiltersJsonMarshaller();
        return instance;
    }
}
