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
import android.os.Parcelable;
import android.os.Parcel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Capitalization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0-SNAPSHOT")
public class Capitalization implements Parcelable {
  public static final String SERIALIZED_NAME_SMALL_CAMEL = "smallCamel";
  @SerializedName(SERIALIZED_NAME_SMALL_CAMEL)
  private String smallCamel;

  public static final String SERIALIZED_NAME_CAPITAL_CAMEL = "CapitalCamel";
  @SerializedName(SERIALIZED_NAME_CAPITAL_CAMEL)
  private String capitalCamel;

  public static final String SERIALIZED_NAME_SMALL_SNAKE = "small_Snake";
  @SerializedName(SERIALIZED_NAME_SMALL_SNAKE)
  private String smallSnake;

  public static final String SERIALIZED_NAME_CAPITAL_SNAKE = "Capital_Snake";
  @SerializedName(SERIALIZED_NAME_CAPITAL_SNAKE)
  private String capitalSnake;

  public static final String SERIALIZED_NAME_SC_A_E_T_H_FLOW_POINTS = "SCA_ETH_Flow_Points";
  @SerializedName(SERIALIZED_NAME_SC_A_E_T_H_FLOW_POINTS)
  private String scAETHFlowPoints;

  public static final String SERIALIZED_NAME_A_T_T_N_A_M_E = "ATT_NAME";
  @SerializedName(SERIALIZED_NAME_A_T_T_N_A_M_E)
  private String ATT_NAME;

  public Capitalization() {
  }

  public Capitalization smallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
    return this;
  }

   /**
   * Get smallCamel
   * @return smallCamel
  **/
  @javax.annotation.Nullable
  public String getSmallCamel() {
    return smallCamel;
  }

  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }


  public Capitalization capitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
    return this;
  }

   /**
   * Get capitalCamel
   * @return capitalCamel
  **/
  @javax.annotation.Nullable
  public String getCapitalCamel() {
    return capitalCamel;
  }

  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }


  public Capitalization smallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
    return this;
  }

   /**
   * Get smallSnake
   * @return smallSnake
  **/
  @javax.annotation.Nullable
  public String getSmallSnake() {
    return smallSnake;
  }

  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }


  public Capitalization capitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
    return this;
  }

   /**
   * Get capitalSnake
   * @return capitalSnake
  **/
  @javax.annotation.Nullable
  public String getCapitalSnake() {
    return capitalSnake;
  }

  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }


  public Capitalization scAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

   /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
  **/
  @javax.annotation.Nullable
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }

  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }


  public Capitalization ATT_NAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
    return this;
  }

   /**
   * Name of the pet 
   * @return ATT_NAME
  **/
  @javax.annotation.Nullable
  public String getATTNAME() {
    return ATT_NAME;
  }

  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(smallCamel);
    out.writeValue(capitalCamel);
    out.writeValue(smallSnake);
    out.writeValue(capitalSnake);
    out.writeValue(scAETHFlowPoints);
    out.writeValue(ATT_NAME);
  }

  Capitalization(Parcel in) {
    smallCamel = (String)in.readValue(null);
    capitalCamel = (String)in.readValue(null);
    smallSnake = (String)in.readValue(null);
    capitalSnake = (String)in.readValue(null);
    scAETHFlowPoints = (String)in.readValue(null);
    ATT_NAME = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Capitalization> CREATOR = new Parcelable.Creator<Capitalization>() {
    public Capitalization createFromParcel(Parcel in) {
      return new Capitalization(in);
    }
    public Capitalization[] newArray(int size) {
      return new Capitalization[size];
    }
  };

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("smallCamel");
    openapiFields.add("CapitalCamel");
    openapiFields.add("small_Snake");
    openapiFields.add("Capital_Snake");
    openapiFields.add("SCA_ETH_Flow_Points");
    openapiFields.add("ATT_NAME");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Capitalization
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Capitalization.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Capitalization is not found in the empty JSON string", Capitalization.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Capitalization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Capitalization` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("smallCamel") != null && !jsonObj.get("smallCamel").isJsonNull()) && !jsonObj.get("smallCamel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smallCamel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smallCamel").toString()));
      }
      if ((jsonObj.get("CapitalCamel") != null && !jsonObj.get("CapitalCamel").isJsonNull()) && !jsonObj.get("CapitalCamel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CapitalCamel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CapitalCamel").toString()));
      }
      if ((jsonObj.get("small_Snake") != null && !jsonObj.get("small_Snake").isJsonNull()) && !jsonObj.get("small_Snake").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `small_Snake` to be a primitive type in the JSON string but got `%s`", jsonObj.get("small_Snake").toString()));
      }
      if ((jsonObj.get("Capital_Snake") != null && !jsonObj.get("Capital_Snake").isJsonNull()) && !jsonObj.get("Capital_Snake").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Capital_Snake` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Capital_Snake").toString()));
      }
      if ((jsonObj.get("SCA_ETH_Flow_Points") != null && !jsonObj.get("SCA_ETH_Flow_Points").isJsonNull()) && !jsonObj.get("SCA_ETH_Flow_Points").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SCA_ETH_Flow_Points` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SCA_ETH_Flow_Points").toString()));
      }
      if ((jsonObj.get("ATT_NAME") != null && !jsonObj.get("ATT_NAME").isJsonNull()) && !jsonObj.get("ATT_NAME").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ATT_NAME` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ATT_NAME").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Capitalization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Capitalization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Capitalization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Capitalization.class));

       return (TypeAdapter<T>) new TypeAdapter<Capitalization>() {
           @Override
           public void write(JsonWriter out, Capitalization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Capitalization read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Capitalization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Capitalization
  * @throws IOException if the JSON string is invalid with respect to Capitalization
  */
  public static Capitalization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Capitalization.class);
  }

 /**
  * Convert an instance of Capitalization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

