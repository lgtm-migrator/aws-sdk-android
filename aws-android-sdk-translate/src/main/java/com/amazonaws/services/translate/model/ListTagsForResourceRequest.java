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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the resourceArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String resourceArn;

    /**
     * Returns the value of the resourceArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return The value of the resourceArn property for this object.
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * Sets the value of resourceArn
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param resourceArn The new value for the resourceArn property for this
     *            object.
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * Sets the value of the resourceArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param resourceArn The new value for the resourceArn property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }
}
