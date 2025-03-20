/*
 * Payment API
 * Payment API is used for xxx. Refer [doc](https://global.alipay.com/docs/ac/ams/consult) # Auth
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
import lombok.*;
import io.swagger.annotations.ApiModel;
import com.antom.request.AlipayRequest;
import com.antom.response.AlipayResponse;
    import com.antom.model.Amount;
    import com.antom.model.Buyer;
    import com.antom.model.Env;
    import com.antom.model.Merchant;
    import com.antom.model.PaymentFactor;
    import com.antom.model.SettlementStrategy;
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
* AlipayPayConsultRequest
*/

 @EqualsAndHashCode(callSuper = true)
 @Data 

public class AlipayPayConsultRequest   extends AlipayRequest<AlipayPayConsultResponse>   {



                          /**
   * Represents the payment product that is being used. The payment product that can be used is stipulated in the contract. The fixed value is:
   */
  public enum ProductCodeEnum {
    CASHIER_PAYMENT("CASHIER_PAYMENT");

    private String value;

    ProductCodeEnum(String value) {
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
    public static ProductCodeEnum fromValue(String value) {
      for (ProductCodeEnum b : ProductCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



                    private ProductCodeEnum productCode;






                    private Amount paymentAmount;






                    private String userRegion;






                    private String merchantRegion;






                    private SettlementStrategy settlementStrategy;






                    private List<String> allowedPaymentMethodRegions = null;






                    private Env env;






                    private Buyer buyer;






                    private String merchantAccountId;






                    private PaymentFactor paymentFactor;






                    private List<String> allowedPaymentMethods = new ArrayList<>();






                    private List<String> blockedPaymentMethods = new ArrayList<>();






                    private String region;






                    private String customerId;






                    private String referenceUserId;






                    private String extendInfo;






                    private Merchant merchant;






                    private List<String> allowedPspRegions = new ArrayList<>();







 public AlipayPayConsultRequest() { 
 this.setPath("//ams/api/v1/payments/consult");} 


   @Override 
    public Class<AlipayPayConsultResponse> getResponseClass() { 
     return AlipayPayConsultResponse.class;  
    } 




}

