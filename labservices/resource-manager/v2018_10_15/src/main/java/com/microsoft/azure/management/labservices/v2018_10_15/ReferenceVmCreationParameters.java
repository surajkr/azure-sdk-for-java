/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Creation parameters for Reference Vm.
 */
public class ReferenceVmCreationParameters {
    /**
     * The username of the virtual machine.
     */
    @JsonProperty(value = "userName", required = true)
    private String userName;

    /**
     * The password of the virtual machine.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get the username of the virtual machine.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the username of the virtual machine.
     *
     * @param userName the userName value to set
     * @return the ReferenceVmCreationParameters object itself.
     */
    public ReferenceVmCreationParameters withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password of the virtual machine.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password of the virtual machine.
     *
     * @param password the password value to set
     * @return the ReferenceVmCreationParameters object itself.
     */
    public ReferenceVmCreationParameters withPassword(String password) {
        this.password = password;
        return this;
    }

}