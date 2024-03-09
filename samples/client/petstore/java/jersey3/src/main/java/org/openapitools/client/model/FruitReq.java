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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.AppleReq;
import org.openapitools.client.model.BananaReq;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.openapitools.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-SNAPSHOT")
@JsonDeserialize(using = FruitReq.FruitReqDeserializer.class)
@JsonSerialize(using = FruitReq.FruitReqSerializer.class)
public class FruitReq extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FruitReq.class.getName());

    public static class FruitReqSerializer extends StdSerializer<FruitReq> {
        public FruitReqSerializer(Class<FruitReq> t) {
            super(t);
        }

        public FruitReqSerializer() {
            this(null);
        }

        @Override
        public void serialize(FruitReq value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class FruitReqDeserializer extends StdDeserializer<FruitReq> {
        public FruitReqDeserializer() {
            this(FruitReq.class);
        }

        public FruitReqDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public FruitReq deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize AppleReq
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AppleReq.class.equals(Integer.class) || AppleReq.class.equals(Long.class) || AppleReq.class.equals(Float.class) || AppleReq.class.equals(Double.class) || AppleReq.class.equals(Boolean.class) || AppleReq.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AppleReq.class.equals(Integer.class) || AppleReq.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AppleReq.class.equals(Float.class) || AppleReq.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AppleReq.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AppleReq.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                        attemptParsing |= (token == JsonToken.VALUE_NULL);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AppleReq.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AppleReq'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AppleReq'", e);
            }

            // deserialize BananaReq
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (BananaReq.class.equals(Integer.class) || BananaReq.class.equals(Long.class) || BananaReq.class.equals(Float.class) || BananaReq.class.equals(Double.class) || BananaReq.class.equals(Boolean.class) || BananaReq.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((BananaReq.class.equals(Integer.class) || BananaReq.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((BananaReq.class.equals(Float.class) || BananaReq.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (BananaReq.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (BananaReq.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                        attemptParsing |= (token == JsonToken.VALUE_NULL);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(BananaReq.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'BananaReq'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'BananaReq'", e);
            }

            if (match == 1) {
                FruitReq ret = new FruitReq();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for FruitReq: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public FruitReq getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            return null;
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public FruitReq() {
        super("oneOf", Boolean.TRUE);
    }

    public FruitReq(AppleReq o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    public FruitReq(BananaReq o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("AppleReq", new GenericType<AppleReq>() {
        });
        schemas.put("BananaReq", new GenericType<BananaReq>() {
        });
        JSON.registerDescendants(FruitReq.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FruitReq.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AppleReq, BananaReq
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
           super.setActualInstance(instance);
           return;
        }

        if (JSON.isInstanceOf(AppleReq.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BananaReq.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AppleReq, BananaReq");
    }

    /**
     * Get the actual instance, which can be the following:
     * AppleReq, BananaReq
     *
     * @return The actual instance (AppleReq, BananaReq)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AppleReq`. If the actual instance is not `AppleReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AppleReq`
     * @throws ClassCastException if the instance is not `AppleReq`
     */
    public AppleReq getAppleReq() throws ClassCastException {
        return (AppleReq)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BananaReq`. If the actual instance is not `BananaReq`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BananaReq`
     * @throws ClassCastException if the instance is not `BananaReq`
     */
    public BananaReq getBananaReq() throws ClassCastException {
        return (BananaReq)super.getActualInstance();
    }

}

