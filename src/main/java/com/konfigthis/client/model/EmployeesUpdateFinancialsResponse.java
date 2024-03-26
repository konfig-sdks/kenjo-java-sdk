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
 * EmployeesUpdateFinancialsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeesUpdateFinancialsResponse {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_NAME = "accountHolderName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_NAME)
  private String accountHolderName;

  public static final String SERIALIZED_NAME_BANK_NAME = "bankName";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_IBAN = "iban";
  @SerializedName(SERIALIZED_NAME_IBAN)
  private String iban;

  public static final String SERIALIZED_NAME_SWIFT_CODE = "swiftCode";
  @SerializedName(SERIALIZED_NAME_SWIFT_CODE)
  private String swiftCode;

  public static final String SERIALIZED_NAME_NATIONAL_ID = "nationalId";
  @SerializedName(SERIALIZED_NAME_NATIONAL_ID)
  private String nationalId;

  public static final String SERIALIZED_NAME_PASSPORT = "passport";
  @SerializedName(SERIALIZED_NAME_PASSPORT)
  private String passport;

  public static final String SERIALIZED_NAME_NATIONAL_INSURANCE_NUMBER = "nationalInsuranceNumber";
  @SerializedName(SERIALIZED_NAME_NATIONAL_INSURANCE_NUMBER)
  private String nationalInsuranceNumber;

  public static final String SERIALIZED_NAME_TAX_CODE = "taxCode";
  @SerializedName(SERIALIZED_NAME_TAX_CODE)
  private String taxCode;

  public static final String SERIALIZED_NAME_TAX_IDENTIFICATION_NUMBER = "taxIdentificationNumber";
  @SerializedName(SERIALIZED_NAME_TAX_IDENTIFICATION_NUMBER)
  private String taxIdentificationNumber;

  public EmployeesUpdateFinancialsResponse() {
  }

  public EmployeesUpdateFinancialsResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The employee Kenjo *_id*.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "60a2db290da29e126a18789a", value = "The employee Kenjo *_id*.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public EmployeesUpdateFinancialsResponse accountHolderName(String accountHolderName) {
    
    
    
    
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * The accounts holder&#39;s name.
   * @return accountHolderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Michael Corleone", value = "The accounts holder's name.")

  public String getAccountHolderName() {
    return accountHolderName;
  }


  public void setAccountHolderName(String accountHolderName) {
    
    
    
    this.accountHolderName = accountHolderName;
  }


  public EmployeesUpdateFinancialsResponse bankName(String bankName) {
    
    
    
    
    this.bankName = bankName;
    return this;
  }

   /**
   * The bank name.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bank of Sicily", value = "The bank name.")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    
    
    
    this.bankName = bankName;
  }


  public EmployeesUpdateFinancialsResponse accountNumber(String accountNumber) {
    
    
    
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0093 344 2132221 3304 00", value = "The account number.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    
    
    
    this.accountNumber = accountNumber;
  }


  public EmployeesUpdateFinancialsResponse iban(String iban) {
    
    
    
    
    this.iban = iban;
    return this;
  }

   /**
   * The IBAN.
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DE32120222391919191911", value = "The IBAN.")

  public String getIban() {
    return iban;
  }


  public void setIban(String iban) {
    
    
    
    this.iban = iban;
  }


  public EmployeesUpdateFinancialsResponse swiftCode(String swiftCode) {
    
    
    
    
    this.swiftCode = swiftCode;
    return this;
  }

   /**
   * The SWIFT code.
   * @return swiftCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12321234", value = "The SWIFT code.")

  public String getSwiftCode() {
    return swiftCode;
  }


  public void setSwiftCode(String swiftCode) {
    
    
    
    this.swiftCode = swiftCode;
  }


  public EmployeesUpdateFinancialsResponse nationalId(String nationalId) {
    
    
    
    
    this.nationalId = nationalId;
    return this;
  }

   /**
   * The national id document.
   * @return nationalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "04123547X", value = "The national id document.")

  public String getNationalId() {
    return nationalId;
  }


  public void setNationalId(String nationalId) {
    
    
    
    this.nationalId = nationalId;
  }


  public EmployeesUpdateFinancialsResponse passport(String passport) {
    
    
    
    
    this.passport = passport;
    return this;
  }

   /**
   * The passport number.
   * @return passport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FA1234098", value = "The passport number.")

  public String getPassport() {
    return passport;
  }


  public void setPassport(String passport) {
    
    
    
    this.passport = passport;
  }


  public EmployeesUpdateFinancialsResponse nationalInsuranceNumber(String nationalInsuranceNumber) {
    
    
    
    
    this.nationalInsuranceNumber = nationalInsuranceNumber;
    return this;
  }

   /**
   * The national insurance number
   * @return nationalInsuranceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "23123312321", value = "The national insurance number")

  public String getNationalInsuranceNumber() {
    return nationalInsuranceNumber;
  }


  public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
    
    
    
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }


  public EmployeesUpdateFinancialsResponse taxCode(String taxCode) {
    
    
    
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * The tax number.
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "323451R", value = "The tax number.")

  public String getTaxCode() {
    return taxCode;
  }


  public void setTaxCode(String taxCode) {
    
    
    
    this.taxCode = taxCode;
  }


  public EmployeesUpdateFinancialsResponse taxIdentificationNumber(String taxIdentificationNumber) {
    
    
    
    
    this.taxIdentificationNumber = taxIdentificationNumber;
    return this;
  }

   /**
   * The tax identification number.
   * @return taxIdentificationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T4312345", value = "The tax identification number.")

  public String getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }


  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    
    
    
    this.taxIdentificationNumber = taxIdentificationNumber;
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
   * @return the EmployeesUpdateFinancialsResponse instance itself
   */
  public EmployeesUpdateFinancialsResponse putAdditionalProperty(String key, Object value) {
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
    EmployeesUpdateFinancialsResponse employeesUpdateFinancialsResponse = (EmployeesUpdateFinancialsResponse) o;
    return Objects.equals(this.id, employeesUpdateFinancialsResponse.id) &&
        Objects.equals(this.accountHolderName, employeesUpdateFinancialsResponse.accountHolderName) &&
        Objects.equals(this.bankName, employeesUpdateFinancialsResponse.bankName) &&
        Objects.equals(this.accountNumber, employeesUpdateFinancialsResponse.accountNumber) &&
        Objects.equals(this.iban, employeesUpdateFinancialsResponse.iban) &&
        Objects.equals(this.swiftCode, employeesUpdateFinancialsResponse.swiftCode) &&
        Objects.equals(this.nationalId, employeesUpdateFinancialsResponse.nationalId) &&
        Objects.equals(this.passport, employeesUpdateFinancialsResponse.passport) &&
        Objects.equals(this.nationalInsuranceNumber, employeesUpdateFinancialsResponse.nationalInsuranceNumber) &&
        Objects.equals(this.taxCode, employeesUpdateFinancialsResponse.taxCode) &&
        Objects.equals(this.taxIdentificationNumber, employeesUpdateFinancialsResponse.taxIdentificationNumber)&&
        Objects.equals(this.additionalProperties, employeesUpdateFinancialsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountHolderName, bankName, accountNumber, iban, swiftCode, nationalId, passport, nationalInsuranceNumber, taxCode, taxIdentificationNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeesUpdateFinancialsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swiftCode: ").append(toIndentedString(swiftCode)).append("\n");
    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationalInsuranceNumber: ").append(toIndentedString(nationalInsuranceNumber)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
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
    openapiFields.add("accountHolderName");
    openapiFields.add("bankName");
    openapiFields.add("accountNumber");
    openapiFields.add("iban");
    openapiFields.add("swiftCode");
    openapiFields.add("nationalId");
    openapiFields.add("passport");
    openapiFields.add("nationalInsuranceNumber");
    openapiFields.add("taxCode");
    openapiFields.add("taxIdentificationNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeesUpdateFinancialsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeesUpdateFinancialsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeesUpdateFinancialsResponse is not found in the empty JSON string", EmployeesUpdateFinancialsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("_id") != null && !jsonObj.get("_id").isJsonNull()) && !jsonObj.get("_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_id").toString()));
      }
      if ((jsonObj.get("accountHolderName") != null && !jsonObj.get("accountHolderName").isJsonNull()) && !jsonObj.get("accountHolderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountHolderName").toString()));
      }
      if ((jsonObj.get("bankName") != null && !jsonObj.get("bankName").isJsonNull()) && !jsonObj.get("bankName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankName").toString()));
      }
      if ((jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonNull()) && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if ((jsonObj.get("iban") != null && !jsonObj.get("iban").isJsonNull()) && !jsonObj.get("iban").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban").toString()));
      }
      if ((jsonObj.get("swiftCode") != null && !jsonObj.get("swiftCode").isJsonNull()) && !jsonObj.get("swiftCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `swiftCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("swiftCode").toString()));
      }
      if ((jsonObj.get("nationalId") != null && !jsonObj.get("nationalId").isJsonNull()) && !jsonObj.get("nationalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationalId").toString()));
      }
      if ((jsonObj.get("passport") != null && !jsonObj.get("passport").isJsonNull()) && !jsonObj.get("passport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passport").toString()));
      }
      if ((jsonObj.get("nationalInsuranceNumber") != null && !jsonObj.get("nationalInsuranceNumber").isJsonNull()) && !jsonObj.get("nationalInsuranceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationalInsuranceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationalInsuranceNumber").toString()));
      }
      if ((jsonObj.get("taxCode") != null && !jsonObj.get("taxCode").isJsonNull()) && !jsonObj.get("taxCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxCode").toString()));
      }
      if ((jsonObj.get("taxIdentificationNumber") != null && !jsonObj.get("taxIdentificationNumber").isJsonNull()) && !jsonObj.get("taxIdentificationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxIdentificationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxIdentificationNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeesUpdateFinancialsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeesUpdateFinancialsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeesUpdateFinancialsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeesUpdateFinancialsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeesUpdateFinancialsResponse>() {
           @Override
           public void write(JsonWriter out, EmployeesUpdateFinancialsResponse value) throws IOException {
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
           public EmployeesUpdateFinancialsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeesUpdateFinancialsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeesUpdateFinancialsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeesUpdateFinancialsResponse
  * @throws IOException if the JSON string is invalid with respect to EmployeesUpdateFinancialsResponse
  */
  public static EmployeesUpdateFinancialsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeesUpdateFinancialsResponse.class);
  }

 /**
  * Convert an instance of EmployeesUpdateFinancialsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

