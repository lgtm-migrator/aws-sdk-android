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

import java.io.Serializable;

/**
 * <p>
 * The output of the DescribeCertificate operation.
 * </p>
 */
public class DescribeCertificateResult implements Serializable {
    /**
     * <p>
     * The description of the certificate.
     * </p>
     */
    private CertificateDescription certificateDescription;

    /**
     * <p>
     * The description of the certificate.
     * </p>
     *
     * @return <p>
     *         The description of the certificate.
     *         </p>
     */
    public CertificateDescription getCertificateDescription() {
        return certificateDescription;
    }

    /**
     * <p>
     * The description of the certificate.
     * </p>
     *
     * @param certificateDescription <p>
     *            The description of the certificate.
     *            </p>
     */
    public void setCertificateDescription(CertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
    }

    /**
     * <p>
     * The description of the certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certificateDescription <p>
     *            The description of the certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCertificateResult withCertificateDescription(
            CertificateDescription certificateDescription) {
        this.certificateDescription = certificateDescription;
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
        if (getCertificateDescription() != null)
            sb.append("certificateDescription: " + getCertificateDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateDescription() == null) ? 0 : getCertificateDescription()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateResult == false)
            return false;
        DescribeCertificateResult other = (DescribeCertificateResult) obj;

        if (other.getCertificateDescription() == null ^ this.getCertificateDescription() == null)
            return false;
        if (other.getCertificateDescription() != null
                && other.getCertificateDescription().equals(this.getCertificateDescription()) == false)
            return false;
        return true;
    }
}
