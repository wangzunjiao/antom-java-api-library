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

import lombok.*;

/** Store2333 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Store2333 {

  private String referenceStoreId;

  private String storeName;

  private String storeMCC;

  private String storeDisplayName;

  private String storeTerminalId;

  private String storeOperatorId;

  private Address storeAddress;

  private String storePhoneNo;
}
