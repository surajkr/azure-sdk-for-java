/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description about the errors happen while performing migration validation.
 */
public class ExecutionStatistics {
    /**
     * No. of query executions.
     */
    @JsonProperty(value = "executionCount")
    private Long executionCount;

    /**
     * CPU Time in millisecond(s) for the query execution.
     */
    @JsonProperty(value = "cpuTimeMs")
    private Double cpuTimeMs;

    /**
     * Time taken in millisecond(s) for executing the query.
     */
    @JsonProperty(value = "elapsedTimeMs")
    private Double elapsedTimeMs;

    /**
     * Dictionary of sql query execution wait types and the respective
     * statistics.
     */
    @JsonProperty(value = "waitStats")
    private Map<String, WaitStatistics> waitStats;

    /**
     * Indicates whether the query resulted in an error.
     */
    @JsonProperty(value = "hasErrors")
    private Boolean hasErrors;

    /**
     * List of sql Errors.
     */
    @JsonProperty(value = "sqlErrors")
    private List<String> sqlErrors;

    /**
     * Get no. of query executions.
     *
     * @return the executionCount value
     */
    public Long executionCount() {
        return this.executionCount;
    }

    /**
     * Set no. of query executions.
     *
     * @param executionCount the executionCount value to set
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withExecutionCount(Long executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * Get cPU Time in millisecond(s) for the query execution.
     *
     * @return the cpuTimeMs value
     */
    public Double cpuTimeMs() {
        return this.cpuTimeMs;
    }

    /**
     * Set cPU Time in millisecond(s) for the query execution.
     *
     * @param cpuTimeMs the cpuTimeMs value to set
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withCpuTimeMs(Double cpuTimeMs) {
        this.cpuTimeMs = cpuTimeMs;
        return this;
    }

    /**
     * Get time taken in millisecond(s) for executing the query.
     *
     * @return the elapsedTimeMs value
     */
    public Double elapsedTimeMs() {
        return this.elapsedTimeMs;
    }

    /**
     * Set time taken in millisecond(s) for executing the query.
     *
     * @param elapsedTimeMs the elapsedTimeMs value to set
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withElapsedTimeMs(Double elapsedTimeMs) {
        this.elapsedTimeMs = elapsedTimeMs;
        return this;
    }

    /**
     * Get dictionary of sql query execution wait types and the respective statistics.
     *
     * @return the waitStats value
     */
    public Map<String, WaitStatistics> waitStats() {
        return this.waitStats;
    }

    /**
     * Set dictionary of sql query execution wait types and the respective statistics.
     *
     * @param waitStats the waitStats value to set
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withWaitStats(Map<String, WaitStatistics> waitStats) {
        this.waitStats = waitStats;
        return this;
    }

    /**
     * Get indicates whether the query resulted in an error.
     *
     * @return the hasErrors value
     */
    public Boolean hasErrors() {
        return this.hasErrors;
    }

    /**
     * Set indicates whether the query resulted in an error.
     *
     * @param hasErrors the hasErrors value to set
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withHasErrors(Boolean hasErrors) {
        this.hasErrors = hasErrors;
        return this;
    }

    /**
     * Get list of sql Errors.
     *
     * @return the sqlErrors value
     */
    public List<String> sqlErrors() {
        return this.sqlErrors;
    }

    /**
     * Set list of sql Errors.
     *
     * @param sqlErrors the sqlErrors value to set
     * @return the ExecutionStatistics object itself.
     */
    public ExecutionStatistics withSqlErrors(List<String> sqlErrors) {
        this.sqlErrors = sqlErrors;
        return this;
    }

}