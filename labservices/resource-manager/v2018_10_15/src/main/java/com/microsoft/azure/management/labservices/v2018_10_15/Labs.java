/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.LabsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Labs.
 */
public interface Labs extends SupportsCreating<Lab.DefinitionStages.Blank>, HasInner<LabsInner> {
    /**
     * Add users to a lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @param emailAddresses List of user emails addresses to add to the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable addUsersAsync(String resourceGroupName, String labAccountName, String labName, List<String> emailAddresses);

    /**
     * Register to managed lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable registerAsync(String resourceGroupName, String labAccountName, String labName);

    /**
     * Get lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Lab> getAsync(String resourceGroupName, String labAccountName, String labName);

    /**
     * List labs in a given lab account.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Lab> listAsync(final String resourceGroupName, final String labAccountName);

    /**
     * Delete lab. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labAccountName The name of the lab Account.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labAccountName, String labName);

}