/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response containing operationId for a specific purge action.
 */
public class WorkspacePurgeResponseInner {
    /**
     * Id to use when querying for status for a particular purge operation.
     */
    @JsonProperty(value = "operationId", required = true)
    private String operationId;

    /**
     * Get id to use when querying for status for a particular purge operation.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set id to use when querying for status for a particular purge operation.
     *
     * @param operationId the operationId value to set
     * @return the WorkspacePurgeResponseInner object itself.
     */
    public WorkspacePurgeResponseInner withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

}
