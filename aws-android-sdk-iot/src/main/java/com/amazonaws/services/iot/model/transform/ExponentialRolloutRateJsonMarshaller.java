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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ExponentialRolloutRate
 */
class ExponentialRolloutRateJsonMarshaller {

    public void marshall(ExponentialRolloutRate exponentialRolloutRate, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (exponentialRolloutRate.getBaseRatePerMinute() != null) {
            Integer baseRatePerMinute = exponentialRolloutRate.getBaseRatePerMinute();
            jsonWriter.name("baseRatePerMinute");
            jsonWriter.value(baseRatePerMinute);
        }
        if (exponentialRolloutRate.getIncrementFactor() != null) {
            Double incrementFactor = exponentialRolloutRate.getIncrementFactor();
            jsonWriter.name("incrementFactor");
            jsonWriter.value(incrementFactor);
        }
        if (exponentialRolloutRate.getRateIncreaseCriteria() != null) {
            RateIncreaseCriteria rateIncreaseCriteria = exponentialRolloutRate
                    .getRateIncreaseCriteria();
            jsonWriter.name("rateIncreaseCriteria");
            RateIncreaseCriteriaJsonMarshaller.getInstance().marshall(rateIncreaseCriteria,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ExponentialRolloutRateJsonMarshaller instance;

    public static ExponentialRolloutRateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExponentialRolloutRateJsonMarshaller();
        return instance;
    }
}
