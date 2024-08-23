/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import org.openapitools.client.model.StringEnumRef;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
public class PathApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public PathApi() {
    this(new ApiClient());
  }

  public PathApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Test path parameter(s)
   * Test path parameter(s)
   * @param pathString  (required)
   * @param pathInteger  (required)
   * @param enumNonrefStringPath  (required)
   * @param enumRefStringPath  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath(String pathString, Integer pathInteger, String enumNonrefStringPath, StringEnumRef enumRefStringPath) throws ApiException {
    ApiResponse<String> localVarResponse = testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathWithHttpInfo(pathString, pathInteger, enumNonrefStringPath, enumRefStringPath);
    return localVarResponse.getData();
  }

  /**
   * Test path parameter(s)
   * Test path parameter(s)
   * @param pathString  (required)
   * @param pathInteger  (required)
   * @param enumNonrefStringPath  (required)
   * @param enumRefStringPath  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathWithHttpInfo(String pathString, Integer pathInteger, String enumNonrefStringPath, StringEnumRef enumRefStringPath) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathRequestBuilder(pathString, pathInteger, enumNonrefStringPath, enumRefStringPath);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPathRequestBuilder(String pathString, Integer pathInteger, String enumNonrefStringPath, StringEnumRef enumRefStringPath) throws ApiException {
    // verify the required parameter 'pathString' is set
    if (pathString == null) {
      throw new ApiException(400, "Missing the required parameter 'pathString' when calling testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath");
    }
    // verify the required parameter 'pathInteger' is set
    if (pathInteger == null) {
      throw new ApiException(400, "Missing the required parameter 'pathInteger' when calling testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath");
    }
    // verify the required parameter 'enumNonrefStringPath' is set
    if (enumNonrefStringPath == null) {
      throw new ApiException(400, "Missing the required parameter 'enumNonrefStringPath' when calling testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath");
    }
    // verify the required parameter 'enumRefStringPath' is set
    if (enumRefStringPath == null) {
      throw new ApiException(400, "Missing the required parameter 'enumRefStringPath' when calling testsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/path/string/{path_string}/integer/{path_integer}/{enum_nonref_string_path}/{enum_ref_string_path}"
        .replace("{path_string}", ApiClient.urlEncode(pathString.toString()))
        .replace("{path_integer}", ApiClient.urlEncode(pathInteger.toString()))
        .replace("{enum_nonref_string_path}", ApiClient.urlEncode(enumNonrefStringPath.toString()))
        .replace("{enum_ref_string_path}", ApiClient.urlEncode(enumRefStringPath.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
