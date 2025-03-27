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

import lombok.*;

/** Env */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Env {

  private TerminalType terminalType;

  private OsType osType;

  private String userAgent;

  private String deviceTokenId;

  private String clientIp;

  private String cookieId;

  private String storeTerminalId;

  private String storeTerminalRequestTime;

  private BrowserInfo browserInfo;

  private String colorDepth;

  private String screenHeight;

  private String screenWidth;

  private String timeZoneOffset;

  private Integer deviceBrand;

  private String deviceModel;

  private String deviceLanguage;

  private String deviceId;
}
