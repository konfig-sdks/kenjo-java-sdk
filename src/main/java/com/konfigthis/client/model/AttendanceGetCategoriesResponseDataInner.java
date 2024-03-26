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
 * AttendanceGetCategoriesResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AttendanceGetCategoriesResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_CATEGORY_ID = "parentCategoryId";
  @SerializedName(SERIALIZED_NAME_PARENT_CATEGORY_ID)
  private String parentCategoryId;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public AttendanceGetCategoriesResponseDataInner() {
  }

  public AttendanceGetCategoriesResponseDataInner id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The Kenjo _id of the returned attendance category.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Kenjo _id of the returned attendance category.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public AttendanceGetCategoriesResponseDataInner name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the returned attendance category.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the returned attendance category.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AttendanceGetCategoriesResponseDataInner parentCategoryId(String parentCategoryId) {
    
    
    
    
    this.parentCategoryId = parentCategoryId;
    return this;
  }

   /**
   * The id of the parent attendance category.
   * @return parentCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the parent attendance category.")

  public String getParentCategoryId() {
    return parentCategoryId;
  }


  public void setParentCategoryId(String parentCategoryId) {
    
    
    
    this.parentCategoryId = parentCategoryId;
  }


  public AttendanceGetCategoriesResponseDataInner isActive(Boolean isActive) {
    
    
    
    
    this.isActive = isActive;
    return this;
  }

   /**
   * If the attendance category is active then this field is TRUE, otherwise is FALSE.
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the attendance category is active then this field is TRUE, otherwise is FALSE.")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    
    
    
    this.isActive = isActive;
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
   * @return the AttendanceGetCategoriesResponseDataInner instance itself
   */
  public AttendanceGetCategoriesResponseDataInner putAdditionalProperty(String key, Object value) {
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
    AttendanceGetCategoriesResponseDataInner attendanceGetCategoriesResponseDataInner = (AttendanceGetCategoriesResponseDataInner) o;
    return Objects.equals(this.id, attendanceGetCategoriesResponseDataInner.id) &&
        Objects.equals(this.name, attendanceGetCategoriesResponseDataInner.name) &&
        Objects.equals(this.parentCategoryId, attendanceGetCategoriesResponseDataInner.parentCategoryId) &&
        Objects.equals(this.isActive, attendanceGetCategoriesResponseDataInner.isActive)&&
        Objects.equals(this.additionalProperties, attendanceGetCategoriesResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentCategoryId, isActive, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttendanceGetCategoriesResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentCategoryId: ").append(toIndentedString(parentCategoryId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("_id");
    openapiFields.add("name");
    openapiFields.add("parentCategoryId");
    openapiFields.add("isActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttendanceGetCategoriesResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttendanceGetCategoriesResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttendanceGetCategoriesResponseDataInner is not found in the empty JSON string", AttendanceGetCategoriesResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("_id") != null && !jsonObj.get("_id").isJsonNull()) && !jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("parentCategoryId") != null && !jsonObj.get("parentCategoryId").isJsonNull()) && !jsonObj.get("parentCategoryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentCategoryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentCategoryId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttendanceGetCategoriesResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttendanceGetCategoriesResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttendanceGetCategoriesResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttendanceGetCategoriesResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AttendanceGetCategoriesResponseDataInner>() {
           @Override
           public void write(JsonWriter out, AttendanceGetCategoriesResponseDataInner value) throws IOException {
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
           public AttendanceGetCategoriesResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AttendanceGetCategoriesResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AttendanceGetCategoriesResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttendanceGetCategoriesResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to AttendanceGetCategoriesResponseDataInner
  */
  public static AttendanceGetCategoriesResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttendanceGetCategoriesResponseDataInner.class);
  }

 /**
  * Convert an instance of AttendanceGetCategoriesResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

