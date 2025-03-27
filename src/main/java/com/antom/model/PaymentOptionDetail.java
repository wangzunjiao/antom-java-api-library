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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import lombok.*;

/** PaymentOptionDetail */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentOptionDetail {

  private List<SupportCardBrand> supportCardBrands = null;

  /** The funding type of the card. Valid values are: */
  public enum FundingEnum {
    CREDIT("CREDIT"),

    DEBIT("DEBIT"),

    PREPAID("PREPAID"),

    CHARGE("CHARGE"),

    DEFERRED_DEBIT("DEFERRED_DEBIT");

    private String value;

    FundingEnum(String value) {
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
    public static FundingEnum fromValue(String value) {
      for (FundingEnum b : FundingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private List<FundingEnum> funding = null;

  private SupportBank supportBanks;
}
