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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class StartStreamProcessorResult implements Serializable {
    /**
     * <p>
     * A unique identifier for the stream processing session.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * A unique identifier for the stream processing session.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the stream processing session.
     *         </p>
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * <p>
     * A unique identifier for the stream processing session.
     * </p>
     *
     * @param sessionId <p>
     *            A unique identifier for the stream processing session.
     *            </p>
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * A unique identifier for the stream processing session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessionId <p>
     *            A unique identifier for the stream processing session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StartStreamProcessorResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSessionId() != null)
            sb.append("SessionId: " + getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamProcessorResult == false)
            return false;
        StartStreamProcessorResult other = (StartStreamProcessorResult) obj;

        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null
                && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }
}
