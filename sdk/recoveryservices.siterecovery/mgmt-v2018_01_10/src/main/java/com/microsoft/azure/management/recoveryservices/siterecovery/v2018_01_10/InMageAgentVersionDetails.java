/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InMage agent version details.
 */
public class InMageAgentVersionDetails {
    /**
     * A value indicating whether reboot is required after update is applied.
     */
    @JsonProperty(value = "postUpdateRebootStatus")
    private String postUpdateRebootStatus;

    /**
     * The agent version.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Version expiry date.
     */
    @JsonProperty(value = "expiryDate")
    private DateTime expiryDate;

    /**
     * A value indicating whether security update required. Possible values
     * include: 'Supported', 'NotSupported', 'Deprecated', 'UpdateRequired',
     * 'SecurityUpdateRequired'.
     */
    @JsonProperty(value = "status")
    private AgentVersionStatus status;

    /**
     * Get a value indicating whether reboot is required after update is applied.
     *
     * @return the postUpdateRebootStatus value
     */
    public String postUpdateRebootStatus() {
        return this.postUpdateRebootStatus;
    }

    /**
     * Set a value indicating whether reboot is required after update is applied.
     *
     * @param postUpdateRebootStatus the postUpdateRebootStatus value to set
     * @return the InMageAgentVersionDetails object itself.
     */
    public InMageAgentVersionDetails withPostUpdateRebootStatus(String postUpdateRebootStatus) {
        this.postUpdateRebootStatus = postUpdateRebootStatus;
        return this;
    }

    /**
     * Get the agent version.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the agent version.
     *
     * @param version the version value to set
     * @return the InMageAgentVersionDetails object itself.
     */
    public InMageAgentVersionDetails withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version expiry date.
     *
     * @return the expiryDate value
     */
    public DateTime expiryDate() {
        return this.expiryDate;
    }

    /**
     * Set version expiry date.
     *
     * @param expiryDate the expiryDate value to set
     * @return the InMageAgentVersionDetails object itself.
     */
    public InMageAgentVersionDetails withExpiryDate(DateTime expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get a value indicating whether security update required. Possible values include: 'Supported', 'NotSupported', 'Deprecated', 'UpdateRequired', 'SecurityUpdateRequired'.
     *
     * @return the status value
     */
    public AgentVersionStatus status() {
        return this.status;
    }

    /**
     * Set a value indicating whether security update required. Possible values include: 'Supported', 'NotSupported', 'Deprecated', 'UpdateRequired', 'SecurityUpdateRequired'.
     *
     * @param status the status value to set
     * @return the InMageAgentVersionDetails object itself.
     */
    public InMageAgentVersionDetails withStatus(AgentVersionStatus status) {
        this.status = status;
        return this;
    }

}