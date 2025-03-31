package com.alipay.global.api.model.ams;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Certificate {

  private CertificateType certificateType;
  private String certificateNo;
  private UserName holderName;
  private List<String> fileKeys;
  private String certificateAuthority;
}
