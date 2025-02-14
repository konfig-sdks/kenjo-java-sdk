/*
 * Kenjo API
 * Before starting to use the Kenjo API, you have to request the API activation for a sandbox or production environment to the Kenjo Customer Success team. After that, an admin user has to go to *Settings > Integrations > API keys*, to generate the **API Key**. Follow the steps described in the **Autentication section** of this document. <br>The API key is needed to request the bearer token. Each endpoint callout requires a valid bearer token in the Authorization header. Once the token is retrieved, it will be useful during the time limit indicated by the 'expiration date'.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * EmployeesUpdateEmployeeAccountsRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeesUpdateEmployeeAccountsRequest {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public EmployeesUpdateEmployeeAccountsRequest() {
  }

  public EmployeesUpdateEmployeeAccountsRequest email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * The employee email in Kenjo. This is an unique identifier and required.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@acme.io", value = "The employee email in Kenjo. This is an unique identifier and required.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public EmployeesUpdateEmployeeAccountsRequest externalId(String externalId) {
    
    
    
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The employee external id for integration proposals. This value must be unique.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "E-000001", value = "The employee external id for integration proposals. This value must be unique.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    
    
    
    this.externalId = externalId;
  }


  public EmployeesUpdateEmployeeAccountsRequest language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * The employee language. Only is valid one of the following values &#39;en&#39; (english), &#39;es&#39; (spanish) or &#39;de&#39; (german).
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "The employee language. Only is valid one of the following values 'en' (english), 'es' (spanish) or 'de' (german).")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the EmployeesUpdateEmployeeAccountsRequest instance itself
   */
  public EmployeesUpdateEmployeeAccountsRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeesUpdateEmployeeAccountsRequest employeesUpdateEmployeeAccountsRequest = (EmployeesUpdateEmployeeAccountsRequest) o;
    return Objects.equals(this.email, employeesUpdateEmployeeAccountsRequest.email) &&
        Objects.equals(this.externalId, employeesUpdateEmployeeAccountsRequest.externalId) &&
        Objects.equals(this.language, employeesUpdateEmployeeAccountsRequest.language)&&
        Objects.equals(this.additionalProperties, employeesUpdateEmployeeAccountsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, externalId, language, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeesUpdateEmployeeAccountsRequest {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("email");
    openapiFields.add("externalId");
    openapiFields.add("language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeesUpdateEmployeeAccountsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeesUpdateEmployeeAccountsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeesUpdateEmployeeAccountsRequest is not found in the empty JSON string", EmployeesUpdateEmployeeAccountsRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeesUpdateEmployeeAccountsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeesUpdateEmployeeAccountsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeesUpdateEmployeeAccountsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeesUpdateEmployeeAccountsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeesUpdateEmployeeAccountsRequest>() {
           @Override
           public void write(JsonWriter out, EmployeesUpdateEmployeeAccountsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public EmployeesUpdateEmployeeAccountsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeesUpdateEmployeeAccountsRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmployeesUpdateEmployeeAccountsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeesUpdateEmployeeAccountsRequest
  * @throws IOException if the JSON string is invalid with respect to EmployeesUpdateEmployeeAccountsRequest
  */
  public static EmployeesUpdateEmployeeAccountsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeesUpdateEmployeeAccountsRequest.class);
  }

 /**
  * Convert an instance of EmployeesUpdateEmployeeAccountsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

