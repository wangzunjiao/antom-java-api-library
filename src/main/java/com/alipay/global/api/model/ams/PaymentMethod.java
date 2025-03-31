package com.alipay.global.api.model.ams;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMethod {
  private String paymentMethodType;
  private String paymentMethodId;
  private Map<String, Object> paymentMethodMetaData;
  private String customerId;
  private String extendInfo;
  private Boolean requireIssuerAuthentication;
}
