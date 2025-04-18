package com.alipay.global.api.model.ams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantRegistrationInfo {
    private String referenceMerchantId;
    private String merchantDisplayName;
    private String merchantMCC;
    private Logo logo;
    private List<WebSite> websites;
    private Address merchantAddress;
    private RegistrationDetail registrationDetail;

}
