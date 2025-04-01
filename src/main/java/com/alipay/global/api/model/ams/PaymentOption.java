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

package com.alipay.global.api.model.ams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lombok.*;

/** PaymentOption */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentOption {

  private List<String> paymentMethodRegion = new ArrayList<>();

  private PaymentMethodCategoryType paymentMethodCategory;

  private Logo logo;

  private String paymentMethodType;

  private Boolean enabled;

  private PaymentOptionDetail paymentOptionDetail;

  private String disableReason;

  private Boolean preferred;

  private Map<String, AmountLimit> amountLimitInfoMap = null;

  private List<String> supportedCurrencies = new ArrayList<>();

  private String extendInfo;

  private List<String> promoNames = new ArrayList<>();

  private Installment installment;

  private PromotionInfo promotionInfos;
}
