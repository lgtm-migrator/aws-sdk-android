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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class GetPlaceResult implements Serializable {
    /**
     * <p>
     * Details about the result, such as its address and position.
     * </p>
     */
    private Place place;

    /**
     * <p>
     * Details about the result, such as its address and position.
     * </p>
     *
     * @return <p>
     *         Details about the result, such as its address and position.
     *         </p>
     */
    public Place getPlace() {
        return place;
    }

    /**
     * <p>
     * Details about the result, such as its address and position.
     * </p>
     *
     * @param place <p>
     *            Details about the result, such as its address and position.
     *            </p>
     */
    public void setPlace(Place place) {
        this.place = place;
    }

    /**
     * <p>
     * Details about the result, such as its address and position.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param place <p>
     *            Details about the result, such as its address and position.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPlaceResult withPlace(Place place) {
        this.place = place;
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
        if (getPlace() != null)
            sb.append("Place: " + getPlace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlace() == null) ? 0 : getPlace().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlaceResult == false)
            return false;
        GetPlaceResult other = (GetPlaceResult) obj;

        if (other.getPlace() == null ^ this.getPlace() == null)
            return false;
        if (other.getPlace() != null && other.getPlace().equals(this.getPlace()) == false)
            return false;
        return true;
    }
}
