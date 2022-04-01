/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Client;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.FileSchemaTestClass;
import java.time.LocalDate;
import java.util.Map;
import org.openapitools.model.ModelApiResponse;
import java.time.OffsetDateTime;
import org.openapitools.model.OuterComposite;
import org.openapitools.model.User;
import org.openapitools.model.XmlItem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "fake", description = "the fake API")
public interface FakeApi {

    default FakeApiDelegate getDelegate() {
        return new FakeApiDelegate() {};
    }

    /**
     * POST /fake/create_xml_item : creates an XmlItem
     * this route creates an XmlItem
     *
     * @param xmlItem XmlItem Body (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createXmlItem",
        summary = "creates an XmlItem",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/create_xml_item",
        consumes = { "application/xml", "application/xml; charset=utf-8", "application/xml; charset=utf-16", "text/xml", "text/xml; charset=utf-8", "text/xml; charset=utf-16" }
    )
    default ResponseEntity<Void> createXmlItem(
        @Parameter(name = "XmlItem", description = "XmlItem Body", required = true) @Valid @RequestBody XmlItem xmlItem
    ) {
        return getDelegate().createXmlItem(xmlItem);
    }


    /**
     * POST /fake/outer/boolean
     * Test serialization of outer boolean types
     *
     * @param body Input boolean as post body (optional)
     * @return Output boolean (status code 200)
     */
    @Operation(
        operationId = "fakeOuterBooleanSerialize",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Output boolean", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = Boolean.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/boolean",
        produces = { "*/*" }
    )
    default ResponseEntity<Boolean> fakeOuterBooleanSerialize(
        @Parameter(name = "body", description = "Input boolean as post body") @Valid @RequestBody(required = false) Boolean body
    ) {
        return getDelegate().fakeOuterBooleanSerialize(body);
    }


    /**
     * POST /fake/outer/composite
     * Test serialization of object with outer number type
     *
     * @param body Input composite as post body (optional)
     * @return Output composite (status code 200)
     */
    @Operation(
        operationId = "fakeOuterCompositeSerialize",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Output composite", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = OuterComposite.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/composite",
        produces = { "*/*" }
    )
    default ResponseEntity<OuterComposite> fakeOuterCompositeSerialize(
        @Parameter(name = "body", description = "Input composite as post body") @Valid @RequestBody(required = false) OuterComposite body
    ) {
        return getDelegate().fakeOuterCompositeSerialize(body);
    }


    /**
     * POST /fake/outer/number
     * Test serialization of outer number types
     *
     * @param body Input number as post body (optional)
     * @return Output number (status code 200)
     */
    @Operation(
        operationId = "fakeOuterNumberSerialize",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Output number", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = BigDecimal.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/number",
        produces = { "*/*" }
    )
    default ResponseEntity<BigDecimal> fakeOuterNumberSerialize(
        @Parameter(name = "body", description = "Input number as post body") @Valid @RequestBody(required = false) BigDecimal body
    ) {
        return getDelegate().fakeOuterNumberSerialize(body);
    }


    /**
     * POST /fake/outer/string
     * Test serialization of outer string types
     *
     * @param body Input string as post body (optional)
     * @return Output string (status code 200)
     */
    @Operation(
        operationId = "fakeOuterStringSerialize",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Output string", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/outer/string",
        produces = { "*/*" }
    )
    default ResponseEntity<String> fakeOuterStringSerialize(
        @Parameter(name = "body", description = "Input string as post body") @Valid @RequestBody(required = false) String body
    ) {
        return getDelegate().fakeOuterStringSerialize(body);
    }


    /**
     * PUT /fake/body-with-file-schema
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     *
     * @param body  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "testBodyWithFileSchema",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/fake/body-with-file-schema",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> testBodyWithFileSchema(
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody FileSchemaTestClass body
    ) {
        return getDelegate().testBodyWithFileSchema(body);
    }


    /**
     * PUT /fake/body-with-query-params
     *
     * @param query  (required)
     * @param body  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "testBodyWithQueryParams",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/fake/body-with-query-params",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> testBodyWithQueryParams(
        @NotNull @Parameter(name = "query", description = "", required = true) @Valid @RequestParam(value = "query", required = true) String query,
        @Parameter(name = "body", description = "", required = true) @Valid @RequestBody User body
    ) {
        return getDelegate().testBodyWithQueryParams(query, body);
    }


    /**
     * PATCH /fake : To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     *
     * @param body client model (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "testClientModel",
        summary = "To test \"client\" model",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Client.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/fake",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Client> testClientModel(
        @Parameter(name = "body", description = "client model", required = true) @Valid @RequestBody Client body
    ) {
        return getDelegate().testClientModel(body);
    }


    /**
     * POST /fake : Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     * Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
     *
     * @param number None (required)
     * @param _double None (required)
     * @param patternWithoutDelimiter None (required)
     * @param _byte None (required)
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param _float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "testEndpointParameters",
        summary = "Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        },
        security = {
            @SecurityRequirement(name = "http_basic_test")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake",
        consumes = { "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> testEndpointParameters(
        @Parameter(name = "number", description = "None", required = true) @Valid @RequestParam(value = "number", required = true) BigDecimal number,
        @Parameter(name = "double", description = "None", required = true) @Valid @RequestParam(value = "double", required = true) Double _double,
        @Parameter(name = "pattern_without_delimiter", description = "None", required = true) @Valid @RequestParam(value = "pattern_without_delimiter", required = true) String patternWithoutDelimiter,
        @Parameter(name = "byte", description = "None", required = true) @Valid @RequestParam(value = "byte", required = true) byte[] _byte,
        @Parameter(name = "integer", description = "None") @Valid @RequestParam(value = "integer", required = false) Integer integer,
        @Parameter(name = "int32", description = "None") @Valid @RequestParam(value = "int32", required = false) Integer int32,
        @Parameter(name = "int64", description = "None") @Valid @RequestParam(value = "int64", required = false) Long int64,
        @Parameter(name = "float", description = "None") @Valid @RequestParam(value = "float", required = false) Float _float,
        @Parameter(name = "string", description = "None") @Valid @RequestParam(value = "string", required = false) String string,
        @Parameter(name = "binary", description = "None") @RequestPart(value = "binary", required = false) MultipartFile binary,
        @Parameter(name = "date", description = "None") @Valid @RequestParam(value = "date", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
        @Parameter(name = "dateTime", description = "None") @Valid @RequestParam(value = "dateTime", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime dateTime,
        @Parameter(name = "password", description = "None") @Valid @RequestParam(value = "password", required = false) String password,
        @Parameter(name = "callback", description = "None") @Valid @RequestParam(value = "callback", required = false) String paramCallback
    ) {
        return getDelegate().testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);
    }


    /**
     * GET /fake : To test enum parameters
     * To test enum parameters
     *
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return Invalid request (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "testEnumParameters",
        summary = "To test enum parameters",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid request"),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fake",
        consumes = { "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> testEnumParameters(
        @Parameter(name = "enum_header_string_array", description = "Header parameter enum test (string array)") @RequestHeader(value = "enum_header_string_array", required = false) List<String> enumHeaderStringArray,
        @Parameter(name = "enum_header_string", description = "Header parameter enum test (string)") @RequestHeader(value = "enum_header_string", required = false, defaultValue = "-efg") String enumHeaderString,
        @Parameter(name = "enum_query_string_array", description = "Query parameter enum test (string array)") @Valid @RequestParam(value = "enum_query_string_array", required = false) List<String> enumQueryStringArray,
        @Parameter(name = "enum_query_string", description = "Query parameter enum test (string)") @Valid @RequestParam(value = "enum_query_string", required = false, defaultValue = "-efg") String enumQueryString,
        @Parameter(name = "enum_query_integer", description = "Query parameter enum test (double)") @Valid @RequestParam(value = "enum_query_integer", required = false) Integer enumQueryInteger,
        @Parameter(name = "enum_query_double", description = "Query parameter enum test (double)") @Valid @RequestParam(value = "enum_query_double", required = false) Double enumQueryDouble,
        @Parameter(name = "enum_form_string_array", description = "Form parameter enum test (string array)") @Valid @RequestParam(value = "enum_form_string_array", required = false) List<String> enumFormStringArray,
        @Parameter(name = "enum_form_string", description = "Form parameter enum test (string)") @Valid @RequestParam(value = "enum_form_string", required = false) String enumFormString
    ) {
        return getDelegate().testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumFormStringArray, enumFormString);
    }


    /**
     * DELETE /fake : Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     *
     * @param requiredStringGroup Required String in group parameters (required)
     * @param requiredBooleanGroup Required Boolean in group parameters (required)
     * @param requiredInt64Group Required Integer in group parameters (required)
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return Someting wrong (status code 400)
     */
    @Operation(
        operationId = "testGroupParameters",
        summary = "Fake endpoint to test group parameters (optional)",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Someting wrong")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/fake"
    )
    default ResponseEntity<Void> testGroupParameters(
        @NotNull @Parameter(name = "required_string_group", description = "Required String in group parameters", required = true) @Valid @RequestParam(value = "required_string_group", required = true) Integer requiredStringGroup,
        @Parameter(name = "required_boolean_group", description = "Required Boolean in group parameters", required = true) @RequestHeader(value = "required_boolean_group", required = true) Boolean requiredBooleanGroup,
        @NotNull @Parameter(name = "required_int64_group", description = "Required Integer in group parameters", required = true) @Valid @RequestParam(value = "required_int64_group", required = true) Long requiredInt64Group,
        @Parameter(name = "string_group", description = "String in group parameters") @Valid @RequestParam(value = "string_group", required = false) Integer stringGroup,
        @Parameter(name = "boolean_group", description = "Boolean in group parameters") @RequestHeader(value = "boolean_group", required = false) Boolean booleanGroup,
        @Parameter(name = "int64_group", description = "Integer in group parameters") @Valid @RequestParam(value = "int64_group", required = false) Long int64Group
    ) {
        return getDelegate().testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);
    }


    /**
     * POST /fake/inline-additionalProperties : test inline additionalProperties
     *
     * @param param request body (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "testInlineAdditionalProperties",
        summary = "test inline additionalProperties",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/inline-additionalProperties",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> testInlineAdditionalProperties(
        @Parameter(name = "param", description = "request body", required = true) @Valid @RequestBody Map<String, String> param
    ) {
        return getDelegate().testInlineAdditionalProperties(param);
    }


    /**
     * GET /fake/jsonFormData : test json serialization of form data
     *
     * @param param field1 (required)
     * @param param2 field2 (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "testJsonFormData",
        summary = "test json serialization of form data",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/fake/jsonFormData",
        consumes = { "application/x-www-form-urlencoded" }
    )
    default ResponseEntity<Void> testJsonFormData(
        @Parameter(name = "param", description = "field1", required = true) @Valid @RequestParam(value = "param", required = true) String param,
        @Parameter(name = "param2", description = "field2", required = true) @Valid @RequestParam(value = "param2", required = true) String param2
    ) {
        return getDelegate().testJsonFormData(param, param2);
    }


    /**
     * PUT /fake/test-query-parameters
     * To test the collection format in query parameters
     *
     * @param pipe  (required)
     * @param ioutil  (required)
     * @param http  (required)
     * @param url  (required)
     * @param context  (required)
     * @return Success (status code 200)
     */
    @Operation(
        operationId = "testQueryParameterCollectionFormat",
        tags = { "fake" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/fake/test-query-parameters"
    )
    default ResponseEntity<Void> testQueryParameterCollectionFormat(
        @NotNull @Parameter(name = "pipe", description = "", required = true) @Valid @RequestParam(value = "pipe", required = true) List<String> pipe,
        @NotNull @Parameter(name = "ioutil", description = "", required = true) @Valid @RequestParam(value = "ioutil", required = true) List<String> ioutil,
        @NotNull @Parameter(name = "http", description = "", required = true) @Valid @RequestParam(value = "http", required = true) List<String> http,
        @NotNull @Parameter(name = "url", description = "", required = true) @Valid @RequestParam(value = "url", required = true) List<String> url,
        @NotNull @Parameter(name = "context", description = "", required = true) @Valid @RequestParam(value = "context", required = true) List<String> context
    ) {
        return getDelegate().testQueryParameterCollectionFormat(pipe, ioutil, http, url, context);
    }


    /**
     * POST /fake/{petId}/uploadImageWithRequiredFile : uploads an image (required)
     *
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "uploadFileWithRequiredFile",
        summary = "uploads an image (required)",
        tags = { "pet" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "petstore_auth", scopes={ "write:pets", "read:pets" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/fake/{petId}/uploadImageWithRequiredFile",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<ModelApiResponse> uploadFileWithRequiredFile(
        @Parameter(name = "petId", description = "ID of pet to update", required = true) @PathVariable("petId") Long petId,
        @Parameter(name = "requiredFile", description = "file to upload", required = true) @RequestPart(value = "requiredFile", required = true) MultipartFile requiredFile,
        @Parameter(name = "additionalMetadata", description = "Additional data to pass to server") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata
    ) {
        return getDelegate().uploadFileWithRequiredFile(petId, requiredFile, additionalMetadata);
    }

}