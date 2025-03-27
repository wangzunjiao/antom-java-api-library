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

/** BrowserInfo */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BrowserInfo {

  private String acceptHeader;

  private Boolean javaEnabled;

  private String javaScriptEnabled;

  private String language;

  private String userAgent;
}
