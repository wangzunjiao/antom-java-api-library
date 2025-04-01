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

package com.alipay.global.api.request.ams.pay;

import com.alipay.global.api.model.ams.Amount;
import com.alipay.global.api.model.ams.Buyer;
import com.alipay.global.api.model.ams.Env;
import com.alipay.global.api.model.ams.Merchant;
import com.alipay.global.api.model.ams.PaymentFactor;
import com.alipay.global.api.model.ams.ProductCodeType;
import com.alipay.global.api.model.ams.SettlementStrategy;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.ams.pay.AlipayPayConsultResponse;
import java.util.List;
import lombok.*;

/** AlipayPayConsultRequest */
@EqualsAndHashCode(callSuper = true)
@Data
public class AlipayPayConsultRequest extends AlipayRequest<AlipayPayConsultResponse> {

  private ProductCodeType productCode;

  private Amount paymentAmount;

  private String userRegion;

  private String merchantRegion;

  private SettlementStrategy settlementStrategy;

  private List<String> allowedPaymentMethodRegions;

  private Env env;

  private Buyer buyer;

  private String merchantAccountId;

  private PaymentFactor paymentFactor;

  private List<String> allowedPaymentMethods;

  private List<String> blockedPaymentMethods;

  private String region;

  private String customerId;

  private String referenceUserId;

  private String extendInfo;

  private Merchant merchant;

  private List<String> allowedPspRegions;

  public AlipayPayConsultRequest() {
    this.setPath("/ams/api/v1/payments/consult");
  }

  @Override
  public Class<AlipayPayConsultResponse> getResponseClass() {
    return AlipayPayConsultResponse.class;
  }
}
