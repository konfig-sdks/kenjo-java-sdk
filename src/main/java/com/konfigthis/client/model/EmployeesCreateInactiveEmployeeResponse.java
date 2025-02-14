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
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponseAccount;
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponseAddress;
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponseFinancial;
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponseHome;
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponsePersonal;
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponseWork;
import com.konfigthis.client.model.EmployeesCreateInactiveEmployeeResponseWorkSchedule;
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
 * EmployeesCreateInactiveEmployeeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeesCreateInactiveEmployeeResponse {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private EmployeesCreateInactiveEmployeeResponseAccount account;

  public static final String SERIALIZED_NAME_PERSONAL = "personal";
  @SerializedName(SERIALIZED_NAME_PERSONAL)
  private EmployeesCreateInactiveEmployeeResponsePersonal personal;

  public static final String SERIALIZED_NAME_WORK = "work";
  @SerializedName(SERIALIZED_NAME_WORK)
  private EmployeesCreateInactiveEmployeeResponseWork work;

  public static final String SERIALIZED_NAME_WORK_SCHEDULE = "workSchedule";
  @SerializedName(SERIALIZED_NAME_WORK_SCHEDULE)
  private EmployeesCreateInactiveEmployeeResponseWorkSchedule workSchedule;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private EmployeesCreateInactiveEmployeeResponseAddress address;

  public static final String SERIALIZED_NAME_FINANCIAL = "financial";
  @SerializedName(SERIALIZED_NAME_FINANCIAL)
  private EmployeesCreateInactiveEmployeeResponseFinancial financial;

  public static final String SERIALIZED_NAME_HOME = "home";
  @SerializedName(SERIALIZED_NAME_HOME)
  private EmployeesCreateInactiveEmployeeResponseHome home;

  public EmployeesCreateInactiveEmployeeResponse() {
  }

  public EmployeesCreateInactiveEmployeeResponse account(EmployeesCreateInactiveEmployeeResponseAccount account) {
    
    
    
    
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponseAccount getAccount() {
    return account;
  }


  public void setAccount(EmployeesCreateInactiveEmployeeResponseAccount account) {
    
    
    
    this.account = account;
  }


  public EmployeesCreateInactiveEmployeeResponse personal(EmployeesCreateInactiveEmployeeResponsePersonal personal) {
    
    
    
    
    this.personal = personal;
    return this;
  }

   /**
   * Get personal
   * @return personal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponsePersonal getPersonal() {
    return personal;
  }


  public void setPersonal(EmployeesCreateInactiveEmployeeResponsePersonal personal) {
    
    
    
    this.personal = personal;
  }


  public EmployeesCreateInactiveEmployeeResponse work(EmployeesCreateInactiveEmployeeResponseWork work) {
    
    
    
    
    this.work = work;
    return this;
  }

   /**
   * Get work
   * @return work
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponseWork getWork() {
    return work;
  }


  public void setWork(EmployeesCreateInactiveEmployeeResponseWork work) {
    
    
    
    this.work = work;
  }


  public EmployeesCreateInactiveEmployeeResponse workSchedule(EmployeesCreateInactiveEmployeeResponseWorkSchedule workSchedule) {
    
    
    
    
    this.workSchedule = workSchedule;
    return this;
  }

   /**
   * Get workSchedule
   * @return workSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponseWorkSchedule getWorkSchedule() {
    return workSchedule;
  }


  public void setWorkSchedule(EmployeesCreateInactiveEmployeeResponseWorkSchedule workSchedule) {
    
    
    
    this.workSchedule = workSchedule;
  }


  public EmployeesCreateInactiveEmployeeResponse address(EmployeesCreateInactiveEmployeeResponseAddress address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponseAddress getAddress() {
    return address;
  }


  public void setAddress(EmployeesCreateInactiveEmployeeResponseAddress address) {
    
    
    
    this.address = address;
  }


  public EmployeesCreateInactiveEmployeeResponse financial(EmployeesCreateInactiveEmployeeResponseFinancial financial) {
    
    
    
    
    this.financial = financial;
    return this;
  }

   /**
   * Get financial
   * @return financial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponseFinancial getFinancial() {
    return financial;
  }


  public void setFinancial(EmployeesCreateInactiveEmployeeResponseFinancial financial) {
    
    
    
    this.financial = financial;
  }


  public EmployeesCreateInactiveEmployeeResponse home(EmployeesCreateInactiveEmployeeResponseHome home) {
    
    
    
    
    this.home = home;
    return this;
  }

   /**
   * Get home
   * @return home
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeesCreateInactiveEmployeeResponseHome getHome() {
    return home;
  }


  public void setHome(EmployeesCreateInactiveEmployeeResponseHome home) {
    
    
    
    this.home = home;
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
   * @return the EmployeesCreateInactiveEmployeeResponse instance itself
   */
  public EmployeesCreateInactiveEmployeeResponse putAdditionalProperty(String key, Object value) {
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
    EmployeesCreateInactiveEmployeeResponse employeesCreateInactiveEmployeeResponse = (EmployeesCreateInactiveEmployeeResponse) o;
    return Objects.equals(this.account, employeesCreateInactiveEmployeeResponse.account) &&
        Objects.equals(this.personal, employeesCreateInactiveEmployeeResponse.personal) &&
        Objects.equals(this.work, employeesCreateInactiveEmployeeResponse.work) &&
        Objects.equals(this.workSchedule, employeesCreateInactiveEmployeeResponse.workSchedule) &&
        Objects.equals(this.address, employeesCreateInactiveEmployeeResponse.address) &&
        Objects.equals(this.financial, employeesCreateInactiveEmployeeResponse.financial) &&
        Objects.equals(this.home, employeesCreateInactiveEmployeeResponse.home)&&
        Objects.equals(this.additionalProperties, employeesCreateInactiveEmployeeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, personal, work, workSchedule, address, financial, home, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeesCreateInactiveEmployeeResponse {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    work: ").append(toIndentedString(work)).append("\n");
    sb.append("    workSchedule: ").append(toIndentedString(workSchedule)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    financial: ").append(toIndentedString(financial)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("personal");
    openapiFields.add("work");
    openapiFields.add("workSchedule");
    openapiFields.add("address");
    openapiFields.add("financial");
    openapiFields.add("home");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeesCreateInactiveEmployeeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeesCreateInactiveEmployeeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeesCreateInactiveEmployeeResponse is not found in the empty JSON string", EmployeesCreateInactiveEmployeeResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `account`
      if (jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponseAccount.validateJsonObject(jsonObj.getAsJsonObject("account"));
      }
      // validate the optional field `personal`
      if (jsonObj.get("personal") != null && !jsonObj.get("personal").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponsePersonal.validateJsonObject(jsonObj.getAsJsonObject("personal"));
      }
      // validate the optional field `work`
      if (jsonObj.get("work") != null && !jsonObj.get("work").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponseWork.validateJsonObject(jsonObj.getAsJsonObject("work"));
      }
      // validate the optional field `workSchedule`
      if (jsonObj.get("workSchedule") != null && !jsonObj.get("workSchedule").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponseWorkSchedule.validateJsonObject(jsonObj.getAsJsonObject("workSchedule"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponseAddress.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field `financial`
      if (jsonObj.get("financial") != null && !jsonObj.get("financial").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponseFinancial.validateJsonObject(jsonObj.getAsJsonObject("financial"));
      }
      // validate the optional field `home`
      if (jsonObj.get("home") != null && !jsonObj.get("home").isJsonNull()) {
        EmployeesCreateInactiveEmployeeResponseHome.validateJsonObject(jsonObj.getAsJsonObject("home"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeesCreateInactiveEmployeeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeesCreateInactiveEmployeeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeesCreateInactiveEmployeeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeesCreateInactiveEmployeeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeesCreateInactiveEmployeeResponse>() {
           @Override
           public void write(JsonWriter out, EmployeesCreateInactiveEmployeeResponse value) throws IOException {
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
           public EmployeesCreateInactiveEmployeeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeesCreateInactiveEmployeeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeesCreateInactiveEmployeeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeesCreateInactiveEmployeeResponse
  * @throws IOException if the JSON string is invalid with respect to EmployeesCreateInactiveEmployeeResponse
  */
  public static EmployeesCreateInactiveEmployeeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeesCreateInactiveEmployeeResponse.class);
  }

 /**
  * Convert an instance of EmployeesCreateInactiveEmployeeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

