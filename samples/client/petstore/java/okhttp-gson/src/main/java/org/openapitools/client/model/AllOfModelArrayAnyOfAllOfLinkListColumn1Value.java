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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.Tag;
import org.openapitools.client.model.User;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-SNAPSHOT")
public class AllOfModelArrayAnyOfAllOfLinkListColumn1Value extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AllOfModelArrayAnyOfAllOfLinkListColumn1Value.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AllOfModelArrayAnyOfAllOfLinkListColumn1Value.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AllOfModelArrayAnyOfAllOfLinkListColumn1Value' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<User> adapterUser = gson.getDelegateAdapter(this, TypeToken.get(User.class));
            final TypeAdapter<Tag> adapterTag = gson.getDelegateAdapter(this, TypeToken.get(Tag.class));

            return (TypeAdapter<T>) new TypeAdapter<AllOfModelArrayAnyOfAllOfLinkListColumn1Value>() {
                @Override
                public void write(JsonWriter out, AllOfModelArrayAnyOfAllOfLinkListColumn1Value value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `User`
                    if (value.getActualInstance() instanceof User) {
                      JsonElement element = adapterUser.toJsonTree((User)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `Tag`
                    if (value.getActualInstance() instanceof Tag) {
                      JsonElement element = adapterTag.toJsonTree((Tag)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemae: Tag, User");
                }

                @Override
                public AllOfModelArrayAnyOfAllOfLinkListColumn1Value read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize User
                    try {
                      // validate the JSON object to see if any exception is thrown
                      User.validateJsonElement(jsonElement);
                      actualAdapter = adapterUser;
                      AllOfModelArrayAnyOfAllOfLinkListColumn1Value ret = new AllOfModelArrayAnyOfAllOfLinkListColumn1Value();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for User failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'User'", e);
                    }
                    // deserialize Tag
                    try {
                      // validate the JSON object to see if any exception is thrown
                      Tag.validateJsonElement(jsonElement);
                      actualAdapter = adapterTag;
                      AllOfModelArrayAnyOfAllOfLinkListColumn1Value ret = new AllOfModelArrayAnyOfAllOfLinkListColumn1Value();
                      ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                      return ret;
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for Tag failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'Tag'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for AllOfModelArrayAnyOfAllOfLinkListColumn1Value: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AllOfModelArrayAnyOfAllOfLinkListColumn1Value() {
        super("anyOf", Boolean.FALSE);
    }

    public AllOfModelArrayAnyOfAllOfLinkListColumn1Value(Tag o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AllOfModelArrayAnyOfAllOfLinkListColumn1Value(User o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("User", User.class);
        schemas.put("Tag", Tag.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AllOfModelArrayAnyOfAllOfLinkListColumn1Value.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Tag, User
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof User) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Tag) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Tag, User");
    }

    /**
     * Get the actual instance, which can be the following:
     * Tag, User
     *
     * @return The actual instance (Tag, User)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `User`. If the actual instance is not `User`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `User`
     * @throws ClassCastException if the instance is not `User`
     */
    public User getUser() throws ClassCastException {
        return (User)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Tag`. If the actual instance is not `Tag`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Tag`
     * @throws ClassCastException if the instance is not `Tag`
     */
    public Tag getTag() throws ClassCastException {
        return (Tag)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AllOfModelArrayAnyOfAllOfLinkListColumn1Value
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate anyOf schemas one by one
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with User
    try {
      User.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for User failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with Tag
    try {
      Tag.validateJsonElement(jsonElement);
      return;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for Tag failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    throw new IOException(String.format("The JSON string is invalid for AllOfModelArrayAnyOfAllOfLinkListColumn1Value with anyOf schemas: Tag, User. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    
  }

 /**
  * Create an instance of AllOfModelArrayAnyOfAllOfLinkListColumn1Value given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AllOfModelArrayAnyOfAllOfLinkListColumn1Value
  * @throws IOException if the JSON string is invalid with respect to AllOfModelArrayAnyOfAllOfLinkListColumn1Value
  */
  public static AllOfModelArrayAnyOfAllOfLinkListColumn1Value fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AllOfModelArrayAnyOfAllOfLinkListColumn1Value.class);
  }

 /**
  * Convert an instance of AllOfModelArrayAnyOfAllOfLinkListColumn1Value to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

