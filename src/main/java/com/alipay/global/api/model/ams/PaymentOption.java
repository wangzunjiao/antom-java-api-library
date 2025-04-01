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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import lombok.*;
import io.swagger.annotations.ApiModel;
import com.alipay.global.api.request.AlipayRequest;
import com.alipay.global.api.response.AlipayResponse;
import com.alipay.global.api.response.ams.pay.AlipayPayConsultResponse;
    import com.alipay.global.api.model.ams.AmountLimit;
    import com.alipay.global.api.model.ams.Installment;
    import com.alipay.global.api.model.ams.Logo;
    import com.alipay.global.api.model.ams.PaymentMethodCategoryType;
    import com.alipay.global.api.model.ams.PaymentOptionDetail;
    import com.alipay.global.api.model.ams.PromotionInfo;
    import com.fasterxml.jackson.annotation.JsonInclude;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonCreator;
    import com.fasterxml.jackson.annotation.JsonTypeName;
    import com.fasterxml.jackson.annotation.JsonValue;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;







                    /**
* PaymentOption
*/

 @Data 
 @Builder 
 @NoArgsConstructor 
 @AllArgsConstructor 

public class PaymentOption  {





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

