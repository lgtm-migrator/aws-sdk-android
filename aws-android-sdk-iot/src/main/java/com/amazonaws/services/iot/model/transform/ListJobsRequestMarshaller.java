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

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListJobsRequest
 */
public class ListJobsRequestMarshaller implements
        Marshaller<Request<ListJobsRequest>, ListJobsRequest> {

    public Request<ListJobsRequest> marshall(ListJobsRequest listJobsRequest) {
        if (listJobsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListJobsRequest)");
        }

        Request<ListJobsRequest> request = new DefaultRequest<ListJobsRequest>(listJobsRequest,
                "AWSIot");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/jobs";
        if (listJobsRequest.getStatus() != null) {
            request.addParameter("status", StringUtils.fromString(listJobsRequest.getStatus()));
        }
        if (listJobsRequest.getTargetSelection() != null) {
            request.addParameter("targetSelection",
                    StringUtils.fromString(listJobsRequest.getTargetSelection()));
        }
        if (listJobsRequest.getMaxResults() != null) {
            request.addParameter("maxResults",
                    StringUtils.fromInteger(listJobsRequest.getMaxResults()));
        }
        if (listJobsRequest.getNextToken() != null) {
            request.addParameter("nextToken",
                    StringUtils.fromString(listJobsRequest.getNextToken()));
        }
        if (listJobsRequest.getThingGroupName() != null) {
            request.addParameter("thingGroupName",
                    StringUtils.fromString(listJobsRequest.getThingGroupName()));
        }
        if (listJobsRequest.getThingGroupId() != null) {
            request.addParameter("thingGroupId",
                    StringUtils.fromString(listJobsRequest.getThingGroupId()));
        }
        if (listJobsRequest.getNamespaceId() != null) {
            request.addParameter("namespaceId",
                    StringUtils.fromString(listJobsRequest.getNamespaceId()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
