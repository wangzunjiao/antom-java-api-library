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
    import com.antom.model.PaymentOption;
    import com.antom.model.Result;
    import com.fasterxml.jackson.annotation.JsonInclude;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonCreator;
    import com.fasterxml.jackson.annotation.JsonTypeName;
    import com.fasterxml.jackson.annotation.JsonValue;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;
    import java.util.ArrayList;
    import java.util.List;






                    const data = {
classname: "PayConsultResponse", // 安全转义
isRequestClass: "PayConsultResponse".endsWith("Request")
};


/**
 * PayConsultResponse
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class PayConsultResponse  {



            private Result result;



            private List<PaymentOption> paymentOptions = null;






}

