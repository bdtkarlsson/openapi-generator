/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.client.model.User;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.helidon.common.reactive.Single;
import io.helidon.webclient.WebClientResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * 
 * OpenAPI Petstore Test
 *
 * 
 * API tests for UserApi
 */
public class UserApiTest {

    private static ApiClient apiClient;
    private static UserApi api;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() {
        apiClient = ApiClient.builder().build();
        api = UserApiImpl.create(apiClient);
    }

   /**
    * Create user
    * This can only be done by the logged in user.
    */
    @Test
    public void createUserTest() {
        // TODO - assign values to the input arguments.
        User user = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.createUser(user);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Creates list of users with given input array
    * 
    */
    @Test
    public void createUsersWithArrayInputTest() {
        // TODO - assign values to the input arguments.
        List<User> user = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.createUsersWithArrayInput(user);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Creates list of users with given input array
    * 
    */
    @Test
    public void createUsersWithListInputTest() {
        // TODO - assign values to the input arguments.
        List<User> user = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.createUsersWithListInput(user);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Delete user
    * This can only be done by the logged in user.
    */
    @Test
    public void deleteUserTest() {
        // TODO - assign values to the input arguments.
        String username = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.deleteUser(username);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Get user by user name
    * 
    */
    @Test
    public void getUserByNameTest() {
        // TODO - assign values to the input arguments.
        String username = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<User> response = api.getUserByName(username);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Logs user into the system
    * 
    */
    @Test
    public void loginUserTest() {
        // TODO - assign values to the input arguments.
        String username = null;
        // TODO - assign values to the input arguments.
        String password = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<String> response = api.loginUser(username, password);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Logs out current logged in user session
    * 
    */
    @Test
    public void logoutUserTest() {

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.logoutUser();
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

   /**
    * Updated user
    * This can only be done by the logged in user.
    */
    @Test
    public void updateUserTest() {
        // TODO - assign values to the input arguments.
        String username = null;
        // TODO - assign values to the input arguments.
        User user = null;

        // TODO - uncomment the following two lines to invoke the service with valid parameters.
        //ApiResponse<Void> response = api.updateUser(username, user);
        //response.webClientResponse().await();
        // TODO - check for appropriate return status
        // assertThat("Return status", response.get().status().code(), is(expectedStatus));

        // TODO: test validations
    }

}