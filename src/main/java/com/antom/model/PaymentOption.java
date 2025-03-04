/*
 * Payment API   
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.antom.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
    import com.antom.model.Installment;
    import com.antom.model.Logo;
    import com.antom.model.PaymentOptionDetail;
    import com.antom.model.PromotionInfo;
    import com.fasterxml.jackson.annotation.JsonInclude;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonCreator;
    import com.fasterxml.jackson.annotation.JsonTypeName;
    import com.fasterxml.jackson.annotation.JsonValue;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import java.util.ArrayList;
    import java.util.List;






                    

/**
 * PaymentOption
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PaymentOption  {



            private String paymentMethodType;

                  /**
   * The category of the payment method. Valid values are:
   */
  public enum PaymentMethodCategoryEnum {
    ALIPAY_PLUS("ALIPAY_PLUS"),
    
    WALLET("WALLET"),
    
    MOBILE_BANKING_APP("MOBILE_BANKING_APP"),
    
    BANK_TRANSFER("BANK_TRANSFER"),
    
    ONLINE_BANKING("ONLINE_BANKING"),
    
    CARD("CARD"),
    
    OTC("OTC");

    private String value;

    PaymentMethodCategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodCategoryEnum fromValue(String value) {
      for (PaymentMethodCategoryEnum b : PaymentMethodCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



            private PaymentMethodCategoryEnum paymentMethodCategory;



            private String paymentMethodRegion;



            private PaymentOptionDetail paymentOptionDetail;



            private Boolean enabled;

                  /**
   * The payment method type. See Payment methods to check the valid values.
   */
  public enum DisableReasonEnum {
    PAYMENT_ACCOUNT_NOT_AVAILABLE("PAYMENT_ACCOUNT_NOT_AVAILABLE"),
    
    EXCEED_CHANNEL_LIMIT_RULE("EXCEED_CHANNEL_LIMIT_RULE"),
    
    SERVICE_DEGRADE("SERVICE_DEGRADE"),
    
    CHANNEL_NOT_SUPPORT_CURRENCY("CHANNEL_NOT_SUPPORT_CURRENCY"),
    
    CHANNEL_DISABLE("CHANNEL_DISABLE"),
    
    CHANNEL_NOT_IN_SERVICE_TIME("CHANNEL_NOT_IN_SERVICE_TIME"),
    
    QUERY_IPP_INFO_FAILED("QUERY_IPP_INFO_FAILED"),
    
    LIMIT_CENTER_ACCESS_FAIL("LIMIT_CENTER_ACCESS_FAIL"),
    
    CURRENT_CHANNEL_NOT_EXIST("CURRENT_CHANNEL_NOT_EXIST");

    private String value;

    DisableReasonEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DisableReasonEnum fromValue(String value) {
      for (DisableReasonEnum b : DisableReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



            private DisableReasonEnum disableReason;



            private Logo logo;



            private List<String> promoNames = null;



            private Installment installment;



            private List<PromotionInfo> promotionInfos = null;






}

