package com.alipay.global.api.model.ams;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvailablePaymentMethod {
  private List<PaymentMethodTypeItem> paymentMethodTypeList;
}
