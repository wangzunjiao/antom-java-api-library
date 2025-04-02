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
    import com.fasterxml.jackson.annotation.JsonInclude;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonCreator;
    import com.fasterxml.jackson.annotation.JsonTypeName;
    import com.fasterxml.jackson.annotation.JsonValue;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;







                    /**
* Address
*/

 @Data 
 @Builder 
 @NoArgsConstructor 
 @AllArgsConstructor 

public class Address  {





                    private String region;






                    private String state;






                    private String city;






                    private String address1;






                    private String address2;






                    private String zipCode;






                    private String label;













}

