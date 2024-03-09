/*
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

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.ChildWithNullable;
import org.openapitools.client.model.Client;
import org.openapitools.client.model.EnumClass;
import org.openapitools.client.model.FakeBigDecimalMap200Response;
import java.io.File;
import org.openapitools.client.model.FileSchemaTestClass;
import org.openapitools.client.model.HealthCheckResult;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapitools.client.model.OuterComposite;
import org.openapitools.client.model.OuterObjectWithEnumProperty;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestInlineFreeformAdditionalPropertiesRequest;
import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FakeApi
 */
@Ignore
public class FakeApiTest {

    private final FakeApi api = new FakeApi();

    /**
     * for Java apache and Java native, test toUrlQueryString for maps with BegDecimal keys
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeBigDecimalMapTest() throws ApiException {
        FakeBigDecimalMap200Response response = api.fakeBigDecimalMap();

        // TODO: test validations
    }
    /**
     * Health check endpoint
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeHealthGetTest() throws ApiException {
        HealthCheckResult response = api.fakeHealthGet();

        // TODO: test validations
    }
    /**
     * test http signature authentication
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeHttpSignatureTestTest() throws ApiException {
        Pet pet = null;
        String query1 = null;
        String header1 = null;
        api.fakeHttpSignatureTest(pet, query1, header1);

        // TODO: test validations
    }
    /**
     * Test serialization of outer boolean types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterBooleanSerializeTest() throws ApiException {
        Boolean body = null;
        Boolean response = api.fakeOuterBooleanSerialize(body);

        // TODO: test validations
    }
    /**
     * Test serialization of object with outer number type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterCompositeSerializeTest() throws ApiException {
        OuterComposite outerComposite = null;
        OuterComposite response = api.fakeOuterCompositeSerialize(outerComposite);

        // TODO: test validations
    }
    /**
     * Test serialization of outer number types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterNumberSerializeTest() throws ApiException {
        BigDecimal body = null;
        BigDecimal response = api.fakeOuterNumberSerialize(body);

        // TODO: test validations
    }
    /**
     * Test serialization of outer string types
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakeOuterStringSerializeTest() throws ApiException {
        String body = null;
        String response = api.fakeOuterStringSerialize(body);

        // TODO: test validations
    }
    /**
     * Test serialization of enum (int) properties with examples
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fakePropertyEnumIntegerSerializeTest() throws ApiException {
        OuterObjectWithEnumProperty outerObjectWithEnumProperty = null;
        OuterObjectWithEnumProperty response = api.fakePropertyEnumIntegerSerialize(outerObjectWithEnumProperty);

        // TODO: test validations
    }
    /**
     * test referenced additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testAdditionalPropertiesReferenceTest() throws ApiException {
        Map<String, Object> requestBody = null;
        api.testAdditionalPropertiesReference(requestBody);

        // TODO: test validations
    }
    /**
     * For this test, the body has to be a binary file.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testBodyWithBinaryTest() throws ApiException {
        File body = null;
        api.testBodyWithBinary(body);

        // TODO: test validations
    }
    /**
     * For this test, the body for this request must reference a schema named &#x60;File&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testBodyWithFileSchemaTest() throws ApiException {
        FileSchemaTestClass fileSchemaTestClass = null;
        api.testBodyWithFileSchema(fileSchemaTestClass);

        // TODO: test validations
    }
    /**
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testBodyWithQueryParamsTest() throws ApiException {
        String query = null;
        User user = null;
        api.testBodyWithQueryParams(query, user);

        // TODO: test validations
    }
    /**
     * To test \&quot;client\&quot; model
     *
     * To test \&quot;client\&quot; model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testClientModelTest() throws ApiException {
        Client client = null;
        Client response = api.testClientModel(client);

        // TODO: test validations
    }
    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() throws ApiException {
        BigDecimal number = null;
        Double _double = null;
        String patternWithoutDelimiter = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        String string = null;
        File binary = null;
        LocalDate date = null;
        OffsetDateTime dateTime = null;
        String password = null;
        String paramCallback = null;
        api.testEndpointParameters(number, _double, patternWithoutDelimiter, _byte, integer, int32, int64, _float, string, binary, date, dateTime, password, paramCallback);

        // TODO: test validations
    }
    /**
     * To test enum parameters
     *
     * To test enum parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testEnumParametersTest() throws ApiException {
        List<String> enumHeaderStringArray = null;
        String enumHeaderString = null;
        List<String> enumQueryStringArray = null;
        String enumQueryString = null;
        Integer enumQueryInteger = null;
        Double enumQueryDouble = null;
        List<EnumClass> enumQueryModelArray = null;
        List<String> enumFormStringArray = null;
        String enumFormString = null;
        api.testEnumParameters(enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble, enumQueryModelArray, enumFormStringArray, enumFormString);

        // TODO: test validations
    }
    /**
     * Fake endpoint to test group parameters (optional)
     *
     * Fake endpoint to test group parameters (optional)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testGroupParametersTest() throws ApiException {
        Integer requiredStringGroup = null;
        Boolean requiredBooleanGroup = null;
        Long requiredInt64Group = null;
        Integer stringGroup = null;
        Boolean booleanGroup = null;
        Long int64Group = null;
        api.testGroupParameters(requiredStringGroup, requiredBooleanGroup, requiredInt64Group, stringGroup, booleanGroup, int64Group);

        // TODO: test validations
    }
    /**
     * test inline additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInlineAdditionalPropertiesTest() throws ApiException {
        Map<String, String> requestBody = null;
        api.testInlineAdditionalProperties(requestBody);

        // TODO: test validations
    }
    /**
     * test inline free-form additionalProperties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testInlineFreeformAdditionalPropertiesTest() throws ApiException {
        TestInlineFreeformAdditionalPropertiesRequest testInlineFreeformAdditionalPropertiesRequest = null;
        api.testInlineFreeformAdditionalProperties(testInlineFreeformAdditionalPropertiesRequest);

        // TODO: test validations
    }
    /**
     * test json serialization of form data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testJsonFormDataTest() throws ApiException {
        String param = null;
        String param2 = null;
        api.testJsonFormData(param, param2);

        // TODO: test validations
    }
    /**
     * test nullable parent property
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testNullableTest() throws ApiException {
        ChildWithNullable childWithNullable = null;
        api.testNullable(childWithNullable);

        // TODO: test validations
    }
    /**
     * To test the collection format in query parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryParameterCollectionFormatTest() throws ApiException {
        List<String> pipe = null;
        List<String> ioutil = null;
        List<String> http = null;
        List<String> url = null;
        List<String> context = null;
        String allowEmpty = null;
        Map<String, String> language = null;
        api.testQueryParameterCollectionFormat(pipe, ioutil, http, url, context, allowEmpty, language);

        // TODO: test validations
    }
    /**
     * test referenced string map
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testStringMapReferenceTest() throws ApiException {
        Map<String, String> requestBody = null;
        api.testStringMapReference(requestBody);

        // TODO: test validations
    }
}
