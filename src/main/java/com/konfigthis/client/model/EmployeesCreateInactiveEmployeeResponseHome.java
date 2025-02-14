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
 * EmployeesCreateInactiveEmployeeResponseHome
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeesCreateInactiveEmployeeResponseHome {
  public static final String SERIALIZED_NAME_MARITAL_STATUS = "maritalStatus";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private String maritalStatus;

  public static final String SERIALIZED_NAME_SPOUSE_FIRST_NAME = "spouseFirstName";
  @SerializedName(SERIALIZED_NAME_SPOUSE_FIRST_NAME)
  private String spouseFirstName;

  public static final String SERIALIZED_NAME_SPOUSE_LAST_NAME = "spouseLastName";
  @SerializedName(SERIALIZED_NAME_SPOUSE_LAST_NAME)
  private String spouseLastName;

  public static final String SERIALIZED_NAME_SPOUSE_BIRTHDATE = "spouseBirthdate";
  @SerializedName(SERIALIZED_NAME_SPOUSE_BIRTHDATE)
  private String spouseBirthdate;

  public static final String SERIALIZED_NAME_SPOUSE_GENDER = "spouseGender";
  @SerializedName(SERIALIZED_NAME_SPOUSE_GENDER)
  private String spouseGender;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personalEmail";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  private String personalEmail;

  public static final String SERIALIZED_NAME_PERSONAL_PHONE = "personalPhone";
  @SerializedName(SERIALIZED_NAME_PERSONAL_PHONE)
  private String personalPhone;

  public static final String SERIALIZED_NAME_PERSONAL_MOBILE = "personalMobile";
  @SerializedName(SERIALIZED_NAME_PERSONAL_MOBILE)
  private String personalMobile;

  public EmployeesCreateInactiveEmployeeResponseHome() {
  }

  public EmployeesCreateInactiveEmployeeResponseHome maritalStatus(String maritalStatus) {
    
    
    
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * The marital status. Only is valid one of the following values \&quot;Divorced\&quot;, \&quot;Domestic Partnership\&quot;, \&quot;Married\&quot;, \&quot;Separated\&quot;, \&quot;Single\&quot;, \&quot;Widowed\&quot;.
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Widowed", value = "The marital status. Only is valid one of the following values \"Divorced\", \"Domestic Partnership\", \"Married\", \"Separated\", \"Single\", \"Widowed\".")

  public String getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(String maritalStatus) {
    
    
    
    this.maritalStatus = maritalStatus;
  }


  public EmployeesCreateInactiveEmployeeResponseHome spouseFirstName(String spouseFirstName) {
    
    
    
    
    this.spouseFirstName = spouseFirstName;
    return this;
  }

   /**
   * The first name of the employee&#39;s spouse.
   * @return spouseFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Catherine", value = "The first name of the employee's spouse.")

  public String getSpouseFirstName() {
    return spouseFirstName;
  }


  public void setSpouseFirstName(String spouseFirstName) {
    
    
    
    this.spouseFirstName = spouseFirstName;
  }


  public EmployeesCreateInactiveEmployeeResponseHome spouseLastName(String spouseLastName) {
    
    
    
    
    this.spouseLastName = spouseLastName;
    return this;
  }

   /**
   * The last name of the employee&#39;s spouse.
   * @return spouseLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tramell", value = "The last name of the employee's spouse.")

  public String getSpouseLastName() {
    return spouseLastName;
  }


  public void setSpouseLastName(String spouseLastName) {
    
    
    
    this.spouseLastName = spouseLastName;
  }


  public EmployeesCreateInactiveEmployeeResponseHome spouseBirthdate(String spouseBirthdate) {
    
    
    
    
    this.spouseBirthdate = spouseBirthdate;
    return this;
  }

   /**
   * The birth date of the employee&#39;s spouse. Format YYYY-MM-DDThh:mm:ss.000Z.
   * @return spouseBirthdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2060-01-26T00:00:00.000Z", value = "The birth date of the employee's spouse. Format YYYY-MM-DDThh:mm:ss.000Z.")

  public String getSpouseBirthdate() {
    return spouseBirthdate;
  }


  public void setSpouseBirthdate(String spouseBirthdate) {
    
    
    
    this.spouseBirthdate = spouseBirthdate;
  }


  public EmployeesCreateInactiveEmployeeResponseHome spouseGender(String spouseGender) {
    
    
    
    
    this.spouseGender = spouseGender;
    return this;
  }

   /**
   * The employee&#39;s spouse gender. Only is valid one of the following values &#39;Male&#39; (male), &#39;Female&#39; (female) or &#39;Other&#39; (other).
   * @return spouseGender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Female", value = "The employee's spouse gender. Only is valid one of the following values 'Male' (male), 'Female' (female) or 'Other' (other).")

  public String getSpouseGender() {
    return spouseGender;
  }


  public void setSpouseGender(String spouseGender) {
    
    
    
    this.spouseGender = spouseGender;
  }


  public EmployeesCreateInactiveEmployeeResponseHome personalEmail(String personalEmail) {
    
    
    
    
    this.personalEmail = personalEmail;
    return this;
  }

   /**
   * The employee personal email.
   * @return personalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "john@acme.io", value = "The employee personal email.")

  public String getPersonalEmail() {
    return personalEmail;
  }


  public void setPersonalEmail(String personalEmail) {
    
    
    
    this.personalEmail = personalEmail;
  }


  public EmployeesCreateInactiveEmployeeResponseHome personalPhone(String personalPhone) {
    
    
    
    
    this.personalPhone = personalPhone;
    return this;
  }

   /**
   * The employee personal phone.
   * @return personalPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4567092323", value = "The employee personal phone.")

  public String getPersonalPhone() {
    return personalPhone;
  }


  public void setPersonalPhone(String personalPhone) {
    
    
    
    this.personalPhone = personalPhone;
  }


  public EmployeesCreateInactiveEmployeeResponseHome personalMobile(String personalMobile) {
    
    
    
    
    this.personalMobile = personalMobile;
    return this;
  }

   /**
   * The employee personal phone
   * @return personalMobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3567092310", value = "The employee personal phone")

  public String getPersonalMobile() {
    return personalMobile;
  }


  public void setPersonalMobile(String personalMobile) {
    
    
    
    this.personalMobile = personalMobile;
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
   * @return the EmployeesCreateInactiveEmployeeResponseHome instance itself
   */
  public EmployeesCreateInactiveEmployeeResponseHome putAdditionalProperty(String key, Object value) {
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
    EmployeesCreateInactiveEmployeeResponseHome employeesCreateInactiveEmployeeResponseHome = (EmployeesCreateInactiveEmployeeResponseHome) o;
    return Objects.equals(this.maritalStatus, employeesCreateInactiveEmployeeResponseHome.maritalStatus) &&
        Objects.equals(this.spouseFirstName, employeesCreateInactiveEmployeeResponseHome.spouseFirstName) &&
        Objects.equals(this.spouseLastName, employeesCreateInactiveEmployeeResponseHome.spouseLastName) &&
        Objects.equals(this.spouseBirthdate, employeesCreateInactiveEmployeeResponseHome.spouseBirthdate) &&
        Objects.equals(this.spouseGender, employeesCreateInactiveEmployeeResponseHome.spouseGender) &&
        Objects.equals(this.personalEmail, employeesCreateInactiveEmployeeResponseHome.personalEmail) &&
        Objects.equals(this.personalPhone, employeesCreateInactiveEmployeeResponseHome.personalPhone) &&
        Objects.equals(this.personalMobile, employeesCreateInactiveEmployeeResponseHome.personalMobile)&&
        Objects.equals(this.additionalProperties, employeesCreateInactiveEmployeeResponseHome.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maritalStatus, spouseFirstName, spouseLastName, spouseBirthdate, spouseGender, personalEmail, personalPhone, personalMobile, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeesCreateInactiveEmployeeResponseHome {\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    spouseFirstName: ").append(toIndentedString(spouseFirstName)).append("\n");
    sb.append("    spouseLastName: ").append(toIndentedString(spouseLastName)).append("\n");
    sb.append("    spouseBirthdate: ").append(toIndentedString(spouseBirthdate)).append("\n");
    sb.append("    spouseGender: ").append(toIndentedString(spouseGender)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    personalPhone: ").append(toIndentedString(personalPhone)).append("\n");
    sb.append("    personalMobile: ").append(toIndentedString(personalMobile)).append("\n");
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
    openapiFields.add("maritalStatus");
    openapiFields.add("spouseFirstName");
    openapiFields.add("spouseLastName");
    openapiFields.add("spouseBirthdate");
    openapiFields.add("spouseGender");
    openapiFields.add("personalEmail");
    openapiFields.add("personalPhone");
    openapiFields.add("personalMobile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeesCreateInactiveEmployeeResponseHome
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeesCreateInactiveEmployeeResponseHome.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeesCreateInactiveEmployeeResponseHome is not found in the empty JSON string", EmployeesCreateInactiveEmployeeResponseHome.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("maritalStatus") != null && !jsonObj.get("maritalStatus").isJsonNull()) && !jsonObj.get("maritalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maritalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maritalStatus").toString()));
      }
      if ((jsonObj.get("spouseFirstName") != null && !jsonObj.get("spouseFirstName").isJsonNull()) && !jsonObj.get("spouseFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spouseFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spouseFirstName").toString()));
      }
      if ((jsonObj.get("spouseLastName") != null && !jsonObj.get("spouseLastName").isJsonNull()) && !jsonObj.get("spouseLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spouseLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spouseLastName").toString()));
      }
      if ((jsonObj.get("spouseBirthdate") != null && !jsonObj.get("spouseBirthdate").isJsonNull()) && !jsonObj.get("spouseBirthdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spouseBirthdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spouseBirthdate").toString()));
      }
      if ((jsonObj.get("spouseGender") != null && !jsonObj.get("spouseGender").isJsonNull()) && !jsonObj.get("spouseGender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spouseGender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spouseGender").toString()));
      }
      if ((jsonObj.get("personalEmail") != null && !jsonObj.get("personalEmail").isJsonNull()) && !jsonObj.get("personalEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalEmail").toString()));
      }
      if ((jsonObj.get("personalPhone") != null && !jsonObj.get("personalPhone").isJsonNull()) && !jsonObj.get("personalPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalPhone").toString()));
      }
      if ((jsonObj.get("personalMobile") != null && !jsonObj.get("personalMobile").isJsonNull()) && !jsonObj.get("personalMobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personalMobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personalMobile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeesCreateInactiveEmployeeResponseHome.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeesCreateInactiveEmployeeResponseHome' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeesCreateInactiveEmployeeResponseHome> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeesCreateInactiveEmployeeResponseHome.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeesCreateInactiveEmployeeResponseHome>() {
           @Override
           public void write(JsonWriter out, EmployeesCreateInactiveEmployeeResponseHome value) throws IOException {
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
           public EmployeesCreateInactiveEmployeeResponseHome read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeesCreateInactiveEmployeeResponseHome instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeesCreateInactiveEmployeeResponseHome given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeesCreateInactiveEmployeeResponseHome
  * @throws IOException if the JSON string is invalid with respect to EmployeesCreateInactiveEmployeeResponseHome
  */
  public static EmployeesCreateInactiveEmployeeResponseHome fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeesCreateInactiveEmployeeResponseHome.class);
  }

 /**
  * Convert an instance of EmployeesCreateInactiveEmployeeResponseHome to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

