/*
 * Fingoti API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fingoti.sdk.api;

import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.models.DefaultWithToken;
import com.fingoti.sdk.models.GetProfileResponse;
import com.fingoti.sdk.models.ModelDefault;
import com.fingoti.sdk.models.NewUserTokenDto;
import com.fingoti.sdk.models.PatchUserRequest;
import com.fingoti.sdk.models.PatchUserTokenRequest;
import com.fingoti.sdk.models.PortalUserOrganisationsDto;
import com.fingoti.sdk.models.RegisterUserDto;
import com.fingoti.sdk.models.TokenSuccessResponse;
import java.util.UUID;
import com.fingoti.sdk.models.UserSessionsResponse;
import com.fingoti.sdk.models.UserTokenResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Delete a Token. Token will no longer authenticate API requests. This is not recoverable.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTokensIdTest() throws ApiException {
        UUID id = null;
        ModelDefault response = api.deleteUserTokensId(id);
        // TODO: test validations
    }

    /**
     * Get your Fingoti user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        GetProfileResponse response = api.getUser();
        // TODO: test validations
    }

    /**
     * Get all organisations you are a member of.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserOrganisationsTest() throws ApiException {
        Integer pageNumber = null;
        Integer itemsPerPage = null;
        String organisationName = null;
        PortalUserOrganisationsDto response = api.getUserOrganisations(pageNumber, itemsPerPage, organisationName);
        // TODO: test validations
    }

    /**
     * Get all user sessions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserSessionsTest() throws ApiException {
        Integer pageNumber = null;
        Integer itemsPerPage = null;
        UserSessionsResponse response = api.getUserSessions(pageNumber, itemsPerPage);
        // TODO: test validations
    }

    /**
     * Get all API tokens.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTokensTest() throws ApiException {
        Integer pageNumber = null;
        Integer itemsPerPage = null;
        String tokenName = null;
        UserTokenResponse response = api.getUserTokens(pageNumber, itemsPerPage, tokenName);
        // TODO: test validations
    }

    /**
     * Get specified token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTokensIdTest() throws ApiException {
        UUID id = null;
        UserTokenResponse response = api.getUserTokensId(id);
        // TODO: test validations
    }

    /**
     * Update Fingoti user.
     *
     * Fields that do not require updating can be omitted
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchUserTest() throws ApiException {
        PatchUserRequest patchUserRequest = null;
        ModelDefault response = api.patchUser(patchUserRequest);
        // TODO: test validations
    }

    /**
     * Update API token.
     *
     * Fields that do not require updating can be omitted
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchUserTokensIdTest() throws ApiException {
        UUID id = null;
        PatchUserTokenRequest patchUserTokenRequest = null;
        ModelDefault response = api.patchUserTokensId(id, patchUserTokenRequest);
        // TODO: test validations
    }

    /**
     * Register a new Fingoti user.
     *
     * The returned token is a Register token and is used to register a new Organisation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postUserTest() throws ApiException {
        RegisterUserDto registerUserDto = null;
        DefaultWithToken response = api.postUser(registerUserDto);
        // TODO: test validations
    }

    /**
     * Generate new API token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postUserTokensTest() throws ApiException {
        NewUserTokenDto newUserTokenDto = null;
        TokenSuccessResponse response = api.postUserTokens(newUserTokenDto);
        // TODO: test validations
    }

}
