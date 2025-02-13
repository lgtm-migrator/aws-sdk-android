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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an IoT OTA update on a target group of things or groups.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateOTAUpdate</a> action.
 * </p>
 */
public class CreateOTAUpdateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     */
    private String otaUpdateId;

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * The devices targeted to receive OTA updates.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * The protocol used to transfer the OTA update image. Valid values are
     * [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the
     * target device can choose the protocol.
     * </p>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will
     * be complete after all the things specified as targets have completed the
     * update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on
     * a thing when the thing is added to a target group, even after the update
     * was completed by all things originally in the group. Valid values:
     * CONTINUOUS | SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     */
    private String targetSelection;

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     */
    private AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig;

    /**
     * <p>
     * Configuration information for pre-signed URLs.
     * </p>
     */
    private AwsJobPresignedUrlConfig awsJobPresignedUrlConfig;

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     */
    private AwsJobAbortConfig awsJobAbortConfig;

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     */
    private AwsJobTimeoutConfig awsJobTimeoutConfig;

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     */
    private java.util.List<OTAUpdateFile> files;

    /**
     * <p>
     * The IAM role that grants Amazon Web Services IoT Core access to the
     * Amazon S3, IoT jobs and Amazon Web Services Code Signing resources to
     * create an OTA update job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String roleArn;

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     */
    private java.util.Map<String, String> additionalParameters;

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @return <p>
     *         The ID of the OTA update to be created.
     *         </p>
     */
    public String getOtaUpdateId() {
        return otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The ID of the OTA update to be created.
     *            </p>
     */
    public void setOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
    }

    /**
     * <p>
     * The ID of the OTA update to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_-]+<br/>
     *
     * @param otaUpdateId <p>
     *            The ID of the OTA update to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withOtaUpdateId(String otaUpdateId) {
        this.otaUpdateId = otaUpdateId;
        return this;
    }

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         The description of the OTA update.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The description of the OTA update.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The description of the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The devices targeted to receive OTA updates.
     * </p>
     *
     * @return <p>
     *         The devices targeted to receive OTA updates.
     *         </p>
     */
    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The devices targeted to receive OTA updates.
     * </p>
     *
     * @param targets <p>
     *            The devices targeted to receive OTA updates.
     *            </p>
     */
    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The devices targeted to receive OTA updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The devices targeted to receive OTA updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withTargets(String... targets) {
        if (getTargets() == null) {
            this.targets = new java.util.ArrayList<String>(targets.length);
        }
        for (String value : targets) {
            this.targets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The devices targeted to receive OTA updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targets <p>
     *            The devices targeted to receive OTA updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The protocol used to transfer the OTA update image. Valid values are
     * [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the
     * target device can choose the protocol.
     * </p>
     *
     * @return <p>
     *         The protocol used to transfer the OTA update image. Valid values
     *         are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are
     *         specified, the target device can choose the protocol.
     *         </p>
     */
    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocol used to transfer the OTA update image. Valid values are
     * [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the
     * target device can choose the protocol.
     * </p>
     *
     * @param protocols <p>
     *            The protocol used to transfer the OTA update image. Valid
     *            values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and
     *            MQTT are specified, the target device can choose the protocol.
     *            </p>
     */
    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * The protocol used to transfer the OTA update image. Valid values are
     * [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the
     * target device can choose the protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            The protocol used to transfer the OTA update image. Valid
     *            values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and
     *            MQTT are specified, the target device can choose the protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withProtocols(String... protocols) {
        if (getProtocols() == null) {
            this.protocols = new java.util.ArrayList<String>(protocols.length);
        }
        for (String value : protocols) {
            this.protocols.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The protocol used to transfer the OTA update image. Valid values are
     * [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the
     * target device can choose the protocol.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            The protocol used to transfer the OTA update image. Valid
     *            values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and
     *            MQTT are specified, the target device can choose the protocol.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will
     * be complete after all the things specified as targets have completed the
     * update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on
     * a thing when the thing is added to a target group, even after the update
     * was completed by all things originally in the group. Valid values:
     * CONTINUOUS | SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @return <p>
     *         Specifies whether the update will continue to run (CONTINUOUS),
     *         or will be complete after all the things specified as targets
     *         have completed the update (SNAPSHOT). If continuous, the update
     *         may also be run on a thing when a change is detected in a target.
     *         For example, an update will run on a thing when the thing is
     *         added to a target group, even after the update was completed by
     *         all things originally in the group. Valid values: CONTINUOUS |
     *         SNAPSHOT.
     *         </p>
     * @see TargetSelection
     */
    public String getTargetSelection() {
        return targetSelection;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will
     * be complete after all the things specified as targets have completed the
     * update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on
     * a thing when the thing is added to a target group, even after the update
     * was completed by all things originally in the group. Valid values:
     * CONTINUOUS | SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the update will continue to run
     *            (CONTINUOUS), or will be complete after all the things
     *            specified as targets have completed the update (SNAPSHOT). If
     *            continuous, the update may also be run on a thing when a
     *            change is detected in a target. For example, an update will
     *            run on a thing when the thing is added to a target group, even
     *            after the update was completed by all things originally in the
     *            group. Valid values: CONTINUOUS | SNAPSHOT.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will
     * be complete after all the things specified as targets have completed the
     * update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on
     * a thing when the thing is added to a target group, even after the update
     * was completed by all things originally in the group. Valid values:
     * CONTINUOUS | SNAPSHOT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the update will continue to run
     *            (CONTINUOUS), or will be complete after all the things
     *            specified as targets have completed the update (SNAPSHOT). If
     *            continuous, the update may also be run on a thing when a
     *            change is detected in a target. For example, an update will
     *            run on a thing when the thing is added to a target group, even
     *            after the update was completed by all things originally in the
     *            group. Valid values: CONTINUOUS | SNAPSHOT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public CreateOTAUpdateRequest withTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will
     * be complete after all the things specified as targets have completed the
     * update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on
     * a thing when the thing is added to a target group, even after the update
     * was completed by all things originally in the group. Valid values:
     * CONTINUOUS | SNAPSHOT.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the update will continue to run
     *            (CONTINUOUS), or will be complete after all the things
     *            specified as targets have completed the update (SNAPSHOT). If
     *            continuous, the update may also be run on a thing when a
     *            change is detected in a target. For example, an update will
     *            run on a thing when the thing is added to a target group, even
     *            after the update was completed by all things originally in the
     *            group. Valid values: CONTINUOUS | SNAPSHOT.
     *            </p>
     * @see TargetSelection
     */
    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
    }

    /**
     * <p>
     * Specifies whether the update will continue to run (CONTINUOUS), or will
     * be complete after all the things specified as targets have completed the
     * update (SNAPSHOT). If continuous, the update may also be run on a thing
     * when a change is detected in a target. For example, an update will run on
     * a thing when the thing is added to a target group, even after the update
     * was completed by all things originally in the group. Valid values:
     * CONTINUOUS | SNAPSHOT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONTINUOUS, SNAPSHOT
     *
     * @param targetSelection <p>
     *            Specifies whether the update will continue to run
     *            (CONTINUOUS), or will be complete after all the things
     *            specified as targets have completed the update (SNAPSHOT). If
     *            continuous, the update may also be run on a thing when a
     *            change is detected in a target. For example, an update will
     *            run on a thing when the thing is added to a target group, even
     *            after the update was completed by all things originally in the
     *            group. Valid values: CONTINUOUS | SNAPSHOT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TargetSelection
     */
    public CreateOTAUpdateRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     *
     * @return <p>
     *         Configuration for the rollout of OTA updates.
     *         </p>
     */
    public AwsJobExecutionsRolloutConfig getAwsJobExecutionsRolloutConfig() {
        return awsJobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     *
     * @param awsJobExecutionsRolloutConfig <p>
     *            Configuration for the rollout of OTA updates.
     *            </p>
     */
    public void setAwsJobExecutionsRolloutConfig(
            AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
    }

    /**
     * <p>
     * Configuration for the rollout of OTA updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsJobExecutionsRolloutConfig <p>
     *            Configuration for the rollout of OTA updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withAwsJobExecutionsRolloutConfig(
            AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
        return this;
    }

    /**
     * <p>
     * Configuration information for pre-signed URLs.
     * </p>
     *
     * @return <p>
     *         Configuration information for pre-signed URLs.
     *         </p>
     */
    public AwsJobPresignedUrlConfig getAwsJobPresignedUrlConfig() {
        return awsJobPresignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed URLs.
     * </p>
     *
     * @param awsJobPresignedUrlConfig <p>
     *            Configuration information for pre-signed URLs.
     *            </p>
     */
    public void setAwsJobPresignedUrlConfig(AwsJobPresignedUrlConfig awsJobPresignedUrlConfig) {
        this.awsJobPresignedUrlConfig = awsJobPresignedUrlConfig;
    }

    /**
     * <p>
     * Configuration information for pre-signed URLs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsJobPresignedUrlConfig <p>
     *            Configuration information for pre-signed URLs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withAwsJobPresignedUrlConfig(
            AwsJobPresignedUrlConfig awsJobPresignedUrlConfig) {
        this.awsJobPresignedUrlConfig = awsJobPresignedUrlConfig;
        return this;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     *
     * @return <p>
     *         The criteria that determine when and how a job abort takes place.
     *         </p>
     */
    public AwsJobAbortConfig getAwsJobAbortConfig() {
        return awsJobAbortConfig;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     *
     * @param awsJobAbortConfig <p>
     *            The criteria that determine when and how a job abort takes
     *            place.
     *            </p>
     */
    public void setAwsJobAbortConfig(AwsJobAbortConfig awsJobAbortConfig) {
        this.awsJobAbortConfig = awsJobAbortConfig;
    }

    /**
     * <p>
     * The criteria that determine when and how a job abort takes place.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsJobAbortConfig <p>
     *            The criteria that determine when and how a job abort takes
     *            place.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withAwsJobAbortConfig(AwsJobAbortConfig awsJobAbortConfig) {
        this.awsJobAbortConfig = awsJobAbortConfig;
        return this;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the amount of time each device has to finish its
     *         execution of the job. A timer is started when the job execution
     *         status is set to <code>IN_PROGRESS</code>. If the job execution
     *         status is not set to another terminal state before the timer
     *         expires, it will be automatically set to <code>TIMED_OUT</code>.
     *         </p>
     */
    public AwsJobTimeoutConfig getAwsJobTimeoutConfig() {
        return awsJobTimeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     *
     * @param awsJobTimeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. A timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the timer expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     */
    public void setAwsJobTimeoutConfig(AwsJobTimeoutConfig awsJobTimeoutConfig) {
        this.awsJobTimeoutConfig = awsJobTimeoutConfig;
    }

    /**
     * <p>
     * Specifies the amount of time each device has to finish its execution of
     * the job. A timer is started when the job execution status is set to
     * <code>IN_PROGRESS</code>. If the job execution status is not set to
     * another terminal state before the timer expires, it will be automatically
     * set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param awsJobTimeoutConfig <p>
     *            Specifies the amount of time each device has to finish its
     *            execution of the job. A timer is started when the job
     *            execution status is set to <code>IN_PROGRESS</code>. If the
     *            job execution status is not set to another terminal state
     *            before the timer expires, it will be automatically set to
     *            <code>TIMED_OUT</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withAwsJobTimeoutConfig(AwsJobTimeoutConfig awsJobTimeoutConfig) {
        this.awsJobTimeoutConfig = awsJobTimeoutConfig;
        return this;
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     *
     * @return <p>
     *         The files to be streamed by the OTA update.
     *         </p>
     */
    public java.util.List<OTAUpdateFile> getFiles() {
        return files;
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     *
     * @param files <p>
     *            The files to be streamed by the OTA update.
     *            </p>
     */
    public void setFiles(java.util.Collection<OTAUpdateFile> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<OTAUpdateFile>(files);
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param files <p>
     *            The files to be streamed by the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withFiles(OTAUpdateFile... files) {
        if (getFiles() == null) {
            this.files = new java.util.ArrayList<OTAUpdateFile>(files.length);
        }
        for (OTAUpdateFile value : files) {
            this.files.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The files to be streamed by the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param files <p>
     *            The files to be streamed by the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withFiles(java.util.Collection<OTAUpdateFile> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The IAM role that grants Amazon Web Services IoT Core access to the
     * Amazon S3, IoT jobs and Amazon Web Services Code Signing resources to
     * create an OTA update job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The IAM role that grants Amazon Web Services IoT Core access to
     *         the Amazon S3, IoT jobs and Amazon Web Services Code Signing
     *         resources to create an OTA update job.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The IAM role that grants Amazon Web Services IoT Core access to the
     * Amazon S3, IoT jobs and Amazon Web Services Code Signing resources to
     * create an OTA update job.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The IAM role that grants Amazon Web Services IoT Core access
     *            to the Amazon S3, IoT jobs and Amazon Web Services Code
     *            Signing resources to create an OTA update job.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that grants Amazon Web Services IoT Core access to the
     * Amazon S3, IoT jobs and Amazon Web Services Code Signing resources to
     * create an OTA update job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param roleArn <p>
     *            The IAM role that grants Amazon Web Services IoT Core access
     *            to the Amazon S3, IoT jobs and Amazon Web Services Code
     *            Signing resources to create an OTA update job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     *
     * @return <p>
     *         A list of additional OTA update parameters which are name-value
     *         pairs.
     *         </p>
     */
    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     *
     * @param additionalParameters <p>
     *            A list of additional OTA update parameters which are
     *            name-value pairs.
     *            </p>
     */
    public void setAdditionalParameters(java.util.Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param additionalParameters <p>
     *            A list of additional OTA update parameters which are
     *            name-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withAdditionalParameters(
            java.util.Map<String, String> additionalParameters) {
        this.additionalParameters = additionalParameters;
        return this;
    }

    /**
     * <p>
     * A list of additional OTA update parameters which are name-value pairs.
     * </p>
     * <p>
     * The method adds a new key-value pair into additionalParameters parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into additionalParameters.
     * @param value The corresponding value of the entry to be added into
     *            additionalParameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest addadditionalParametersEntry(String key, String value) {
        if (null == this.additionalParameters) {
            this.additionalParameters = new java.util.HashMap<String, String>();
        }
        if (this.additionalParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.additionalParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into additionalParameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateOTAUpdateRequest clearadditionalParametersEntries() {
        this.additionalParameters = null;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     *
     * @return <p>
     *         Metadata which can be used to manage updates.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     *
     * @param tags <p>
     *            Metadata which can be used to manage updates.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOTAUpdateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getOtaUpdateId() != null)
            sb.append("otaUpdateId: " + getOtaUpdateId() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTargets() != null)
            sb.append("targets: " + getTargets() + ",");
        if (getProtocols() != null)
            sb.append("protocols: " + getProtocols() + ",");
        if (getTargetSelection() != null)
            sb.append("targetSelection: " + getTargetSelection() + ",");
        if (getAwsJobExecutionsRolloutConfig() != null)
            sb.append("awsJobExecutionsRolloutConfig: " + getAwsJobExecutionsRolloutConfig() + ",");
        if (getAwsJobPresignedUrlConfig() != null)
            sb.append("awsJobPresignedUrlConfig: " + getAwsJobPresignedUrlConfig() + ",");
        if (getAwsJobAbortConfig() != null)
            sb.append("awsJobAbortConfig: " + getAwsJobAbortConfig() + ",");
        if (getAwsJobTimeoutConfig() != null)
            sb.append("awsJobTimeoutConfig: " + getAwsJobTimeoutConfig() + ",");
        if (getFiles() != null)
            sb.append("files: " + getFiles() + ",");
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getAdditionalParameters() != null)
            sb.append("additionalParameters: " + getAdditionalParameters() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOtaUpdateId() == null) ? 0 : getOtaUpdateId().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsJobExecutionsRolloutConfig() == null) ? 0
                        : getAwsJobExecutionsRolloutConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getAwsJobPresignedUrlConfig() == null) ? 0 : getAwsJobPresignedUrlConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAwsJobAbortConfig() == null) ? 0 : getAwsJobAbortConfig().hashCode());
        hashCode = prime * hashCode
                + ((getAwsJobTimeoutConfig() == null) ? 0 : getAwsJobTimeoutConfig().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getAdditionalParameters() == null) ? 0 : getAdditionalParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOTAUpdateRequest == false)
            return false;
        CreateOTAUpdateRequest other = (CreateOTAUpdateRequest) obj;

        if (other.getOtaUpdateId() == null ^ this.getOtaUpdateId() == null)
            return false;
        if (other.getOtaUpdateId() != null
                && other.getOtaUpdateId().equals(this.getOtaUpdateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null
                && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null
                && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() == null
                ^ this.getAwsJobExecutionsRolloutConfig() == null)
            return false;
        if (other.getAwsJobExecutionsRolloutConfig() != null
                && other.getAwsJobExecutionsRolloutConfig().equals(
                        this.getAwsJobExecutionsRolloutConfig()) == false)
            return false;
        if (other.getAwsJobPresignedUrlConfig() == null
                ^ this.getAwsJobPresignedUrlConfig() == null)
            return false;
        if (other.getAwsJobPresignedUrlConfig() != null
                && other.getAwsJobPresignedUrlConfig().equals(this.getAwsJobPresignedUrlConfig()) == false)
            return false;
        if (other.getAwsJobAbortConfig() == null ^ this.getAwsJobAbortConfig() == null)
            return false;
        if (other.getAwsJobAbortConfig() != null
                && other.getAwsJobAbortConfig().equals(this.getAwsJobAbortConfig()) == false)
            return false;
        if (other.getAwsJobTimeoutConfig() == null ^ this.getAwsJobTimeoutConfig() == null)
            return false;
        if (other.getAwsJobTimeoutConfig() != null
                && other.getAwsJobTimeoutConfig().equals(this.getAwsJobTimeoutConfig()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getAdditionalParameters() == null ^ this.getAdditionalParameters() == null)
            return false;
        if (other.getAdditionalParameters() != null
                && other.getAdditionalParameters().equals(this.getAdditionalParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
