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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class GetUICustomizationResult implements Serializable {
    /**
     * <p>
     * The UI customization information.
     * </p>
     */
    private UICustomizationType uICustomization;

    /**
     * <p>
     * The UI customization information.
     * </p>
     *
     * @return <p>
     *         The UI customization information.
     *         </p>
     */
    public UICustomizationType getUICustomization() {
        return uICustomization;
    }

    /**
     * <p>
     * The UI customization information.
     * </p>
     *
     * @param uICustomization <p>
     *            The UI customization information.
     *            </p>
     */
    public void setUICustomization(UICustomizationType uICustomization) {
        this.uICustomization = uICustomization;
    }

    /**
     * <p>
     * The UI customization information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uICustomization <p>
     *            The UI customization information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUICustomizationResult withUICustomization(UICustomizationType uICustomization) {
        this.uICustomization = uICustomization;
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
        if (getUICustomization() != null)
            sb.append("UICustomization: " + getUICustomization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUICustomization() == null) ? 0 : getUICustomization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUICustomizationResult == false)
            return false;
        GetUICustomizationResult other = (GetUICustomizationResult) obj;

        if (other.getUICustomization() == null ^ this.getUICustomization() == null)
            return false;
        if (other.getUICustomization() != null
                && other.getUICustomization().equals(this.getUICustomization()) == false)
            return false;
        return true;
    }
}
