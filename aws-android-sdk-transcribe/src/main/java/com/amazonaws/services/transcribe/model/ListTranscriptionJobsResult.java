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

package com.amazonaws.services.transcribe.model;

import java.io.Serializable;

public class ListTranscriptionJobsResult implements Serializable {
    /**
     * <p>
     * Lists all transcription jobs that have the status specified in your
     * request. Jobs are ordered by creation date, with the newest job first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     */
    private String status;

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that
     * not all results are displayed. To view the next set of results, copy the
     * string associated with the <code>NextToken</code> parameter in your
     * results output, then run your request again including
     * <code>NextToken</code> with the value of the copied string. Repeat as
     * needed to view all your results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     */
    private java.util.List<TranscriptionJobSummary> transcriptionJobSummaries;

    /**
     * <p>
     * Lists all transcription jobs that have the status specified in your
     * request. Jobs are ordered by creation date, with the newest job first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @return <p>
     *         Lists all transcription jobs that have the status specified in
     *         your request. Jobs are ordered by creation date, with the newest
     *         job first.
     *         </p>
     * @see TranscriptionJobStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Lists all transcription jobs that have the status specified in your
     * request. Jobs are ordered by creation date, with the newest job first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Lists all transcription jobs that have the status specified in
     *            your request. Jobs are ordered by creation date, with the
     *            newest job first.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Lists all transcription jobs that have the status specified in your
     * request. Jobs are ordered by creation date, with the newest job first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Lists all transcription jobs that have the status specified in
     *            your request. Jobs are ordered by creation date, with the
     *            newest job first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public ListTranscriptionJobsResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Lists all transcription jobs that have the status specified in your
     * request. Jobs are ordered by creation date, with the newest job first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Lists all transcription jobs that have the status specified in
     *            your request. Jobs are ordered by creation date, with the
     *            newest job first.
     *            </p>
     * @see TranscriptionJobStatus
     */
    public void setStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Lists all transcription jobs that have the status specified in your
     * request. Jobs are ordered by creation date, with the newest job first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QUEUED, IN_PROGRESS, FAILED, COMPLETED
     *
     * @param status <p>
     *            Lists all transcription jobs that have the status specified in
     *            your request. Jobs are ordered by creation date, with the
     *            newest job first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TranscriptionJobStatus
     */
    public ListTranscriptionJobsResult withStatus(TranscriptionJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that
     * not all results are displayed. To view the next set of results, copy the
     * string associated with the <code>NextToken</code> parameter in your
     * results output, then run your request again including
     * <code>NextToken</code> with the value of the copied string. Repeat as
     * needed to view all your results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @return <p>
     *         If <code>NextToken</code> is present in your response, it
     *         indicates that not all results are displayed. To view the next
     *         set of results, copy the string associated with the
     *         <code>NextToken</code> parameter in your results output, then run
     *         your request again including <code>NextToken</code> with the
     *         value of the copied string. Repeat as needed to view all your
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that
     * not all results are displayed. To view the next set of results, copy the
     * string associated with the <code>NextToken</code> parameter in your
     * results output, then run your request again including
     * <code>NextToken</code> with the value of the copied string. Repeat as
     * needed to view all your results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If <code>NextToken</code> is present in your response, it
     *            indicates that not all results are displayed. To view the next
     *            set of results, copy the string associated with the
     *            <code>NextToken</code> parameter in your results output, then
     *            run your request again including <code>NextToken</code> with
     *            the value of the copied string. Repeat as needed to view all
     *            your results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>NextToken</code> is present in your response, it indicates that
     * not all results are displayed. To view the next set of results, copy the
     * string associated with the <code>NextToken</code> parameter in your
     * results output, then run your request again including
     * <code>NextToken</code> with the value of the copied string. Repeat as
     * needed to view all your results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.+<br/>
     *
     * @param nextToken <p>
     *            If <code>NextToken</code> is present in your response, it
     *            indicates that not all results are displayed. To view the next
     *            set of results, copy the string associated with the
     *            <code>NextToken</code> parameter in your results output, then
     *            run your request again including <code>NextToken</code> with
     *            the value of the copied string. Repeat as needed to view all
     *            your results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTranscriptionJobsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     *
     * @return <p>
     *         Provides a summary of information about each result.
     *         </p>
     */
    public java.util.List<TranscriptionJobSummary> getTranscriptionJobSummaries() {
        return transcriptionJobSummaries;
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     *
     * @param transcriptionJobSummaries <p>
     *            Provides a summary of information about each result.
     *            </p>
     */
    public void setTranscriptionJobSummaries(
            java.util.Collection<TranscriptionJobSummary> transcriptionJobSummaries) {
        if (transcriptionJobSummaries == null) {
            this.transcriptionJobSummaries = null;
            return;
        }

        this.transcriptionJobSummaries = new java.util.ArrayList<TranscriptionJobSummary>(
                transcriptionJobSummaries);
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptionJobSummaries <p>
     *            Provides a summary of information about each result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTranscriptionJobsResult withTranscriptionJobSummaries(
            TranscriptionJobSummary... transcriptionJobSummaries) {
        if (getTranscriptionJobSummaries() == null) {
            this.transcriptionJobSummaries = new java.util.ArrayList<TranscriptionJobSummary>(
                    transcriptionJobSummaries.length);
        }
        for (TranscriptionJobSummary value : transcriptionJobSummaries) {
            this.transcriptionJobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides a summary of information about each result.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transcriptionJobSummaries <p>
     *            Provides a summary of information about each result.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTranscriptionJobsResult withTranscriptionJobSummaries(
            java.util.Collection<TranscriptionJobSummary> transcriptionJobSummaries) {
        setTranscriptionJobSummaries(transcriptionJobSummaries);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTranscriptionJobSummaries() != null)
            sb.append("TranscriptionJobSummaries: " + getTranscriptionJobSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getTranscriptionJobSummaries() == null) ? 0 : getTranscriptionJobSummaries()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTranscriptionJobsResult == false)
            return false;
        ListTranscriptionJobsResult other = (ListTranscriptionJobsResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTranscriptionJobSummaries() == null
                ^ this.getTranscriptionJobSummaries() == null)
            return false;
        if (other.getTranscriptionJobSummaries() != null
                && other.getTranscriptionJobSummaries().equals(this.getTranscriptionJobSummaries()) == false)
            return false;
        return true;
    }
}
