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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ThingDocument
 */
class ThingDocumentJsonUnmarshaller implements Unmarshaller<ThingDocument, JsonUnmarshallerContext> {

    public ThingDocument unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ThingDocument thingDocument = new ThingDocument();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("thingName")) {
                thingDocument.setThingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingId")) {
                thingDocument.setThingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingTypeName")) {
                thingDocument.setThingTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingGroupNames")) {
                thingDocument.setThingGroupNames(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("attributes")) {
                thingDocument.setAttributes(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("shadow")) {
                thingDocument.setShadow(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("deviceDefender")) {
                thingDocument.setDeviceDefender(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("connectivity")) {
                thingDocument.setConnectivity(ThingConnectivityJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return thingDocument;
    }

    private static ThingDocumentJsonUnmarshaller instance;

    public static ThingDocumentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThingDocumentJsonUnmarshaller();
        return instance;
    }
}
