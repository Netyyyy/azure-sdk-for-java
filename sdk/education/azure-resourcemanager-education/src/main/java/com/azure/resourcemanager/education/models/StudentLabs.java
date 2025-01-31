// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of StudentLabs. */
public interface StudentLabs {
    /**
     * Get a list of all labs associated with the caller of the API.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all labs associated with the caller of the API as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<StudentLabDetails> listAll();

    /**
     * Get a list of all labs associated with the caller of the API.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all labs associated with the caller of the API as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<StudentLabDetails> listAll(Context context);

    /**
     * Get the details for a specified lab associated with the student lab.
     *
     * @param studentLabName Student lab name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details for a specified lab associated with the student lab.
     */
    StudentLabDetails get(String studentLabName);

    /**
     * Get the details for a specified lab associated with the student lab.
     *
     * @param studentLabName Student lab name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details for a specified lab associated with the student lab along with {@link Response}.
     */
    Response<StudentLabDetails> getWithResponse(String studentLabName, Context context);
}
