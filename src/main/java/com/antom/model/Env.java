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
    import com.fasterxml.jackson.annotation.JsonInclude;
    import com.fasterxml.jackson.annotation.JsonProperty;
    import com.fasterxml.jackson.annotation.JsonCreator;
    import com.fasterxml.jackson.annotation.JsonTypeName;
    import com.fasterxml.jackson.annotation.JsonValue;
    import io.swagger.annotations.ApiModel;
    import io.swagger.annotations.ApiModelProperty;






                    /**
 * Env
 * DEBUG: classname=Env
 * DEBUG: parentSchema=
 * DEBUG: baseType=
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

// DEBUG: classname=Env, isRequestClass=
public class Env  {

                  /**
   * Terminal type used by the merchant. Valid values are:
   */
  public enum TerminalTypeEnum {
    WEB("WEB"),
    
    WAP("WAP"),
    
    APP("APP"),
    
    MINI_APP("MINI_APP");

    private String value;

    TerminalTypeEnum(String value) {
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
    public static TerminalTypeEnum fromValue(String value) {
      for (TerminalTypeEnum b : TerminalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



            private TerminalTypeEnum terminalType;


                  /**
   * Type of the operation system. Valid values are:
   */
  public enum OsTypeEnum {
    IOS("IOS"),
    
    ANDROID("ANDROID");

    private String value;

    OsTypeEnum(String value) {
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
    public static OsTypeEnum fromValue(String value) {
      for (OsTypeEnum b : OsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }



            private OsTypeEnum osType;




            private String userAgent;




            private String deviceTokenId;




            private String clientIp;




            private String cookieId;






    
    public Env() {
        this.setPath("");
    }

}

