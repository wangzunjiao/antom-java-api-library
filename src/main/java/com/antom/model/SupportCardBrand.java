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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.annotations.ApiModel;
    import com.antom.model.Logo;
    import com.fasterxml.jackson.annotation.JsonInclude;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonCreator;
    import com.fasterxml.jackson.annotation.JsonTypeName;
    import com.fasterxml.jackson.annotation.JsonValue;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;






                    /**
 * SupportCardBrand
 * DEBUG: classname=SupportCardBrand
 * DEBUG: parentSchema=
 * DEBUG: baseType=
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

// DEBUG: classname=SupportCardBrand, isRequestClass=
public class SupportCardBrand  {

                  /**
   * The name of the card brand. Valid values are:
   */
  public enum CardBrandEnum {
    VISA("VISA"),
    
    MASTERCARD("MASTERCARD"),
    
    AMEX("AMEX"),
    
    HIPERCARD("HIPERCARD"),
    
    ELO("ELO");

    private String value;

    CardBrandEnum(String value) {
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
    public static CardBrandEnum fromValue(String value) {
      for (CardBrandEnum b : CardBrandEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



            private CardBrandEnum cardBrand;




            private Logo logo;





}

