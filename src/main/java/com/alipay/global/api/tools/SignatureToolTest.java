package com.alipay.global.api.tools;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import org.apache.commons.lang3.StringUtils;

public class SignatureToolTest {
  private static final String CLIENT_ID = "SANDBOX_5YEV2N2ZV8LC00920";
  private static final String ANTOM_PUBLIC_KEY =
      "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqfIYa7YBXqNYO5IrMVs1duENMJ7aU/4uHjGAgnE99TB1/6+X99iFW7FFo8DzGPfM6xRgeEKLcnaUNJNqAT1C0zZJw1KntNltGvw0KxTdaLRjLWdoZpk4xrQpqdHUKOxvCzQAVB2bSVLUnIgHcd86aQjx2BTdkr5uPv/G1rkX4WXyNYW7+KCbKmPYvTk+dslZ16RzojEwUvfo1FRGK1feKj/UldU1xbjSYlzk2YgRsdAyD+eCFEJOaRaRgGGMlZMcldzIu43RmhIuXnIG86LNwYT9jl66f6JQ4d4/Iy8PNvv6Z1egQtiG/g27oldb4YuRyZqtf50PWd56IigPXJhm6wIDAQAB";

  public static void testing() throws Exception {
    // This is Antom official document
    boolean result =
        verify(
            "/ams/sandbox/api/v1/payments/pay",
            CLIENT_ID,
            "2025-05-19T01:52:32Z\n",
            ANTOM_PUBLIC_KEY,
            "{\n"
                + "    \"normalUrl\": \"https://open-sea-global.alipayplus.com/api/open/v1/ac/cashier/self/codevalue/checkout.htm?codeValue=https%3A%2F%2Fglobal.alipay.com%2F2810020400949jph9gDWC1kpeZ1jBICv4qqu&loadMode=2\",\n"
                + "    \"orderCodeForm\": {\n"
                + "        \"codeDetails\": [\n"
                + "            {\n"
                + "                \"codeValue\": \"https://global.alipay.com/2810020400949jph9gDWC1kpeZ1jBICv4qqu\",\n"
                + "                \"displayType\": \"TEXT\"\n"
                + "            },\n"
                + "            {\n"
                + "                \"codeValue\": \"https://global.alipay.com/merchant/order/showQrImage.htm?code=https%3A%2F%2Fglobal.alipay.com%2F2810020400949jph9gDWC1kpeZ1jBICv4qqu&picSize=L\",\n"
                + "                \"displayType\": \"BIGIMAGE\"\n"
                + "            },\n"
                + "            {\n"
                + "                \"codeValue\": \"https://global.alipay.com/merchant/order/showQrImage.htm?code=https%3A%2F%2Fglobal.alipay.com%2F2810020400949jph9gDWC1kpeZ1jBICv4qqu&picSize=M\",\n"
                + "                \"displayType\": \"MIDDLEIMAGE\"\n"
                + "            },\n"
                + "            {\n"
                + "                \"codeValue\": \"https://global.alipay.com/merchant/order/showQrImage.htm?code=https%3A%2F%2Fglobal.alipay.com%2F2810020400949jph9gDWC1kpeZ1jBICv4qqu&picSize=S\",\n"
                + "                \"displayType\": \"SMALLIMAGE\"\n"
                + "            }\n"
                + "        ],\n"
                + "        \"expireTime\": \"2025-05-18T19:06:30-07:00\"\n"
                + "    },\n"
                + "    \"paymentActionForm\": \"{\\\"method\\\":\\\"GET\\\",\\\"paymentActionFormType\\\":\\\"RedirectActionForm\\\",\\\"redirectUrl\\\":\\\"https://open-sea-global.alipayplus.com/api/open/v1/ac/cashier/self/codevalue/checkout.htm?codeValue=https%3A%2F%2Fglobal.alipay.com%2F2810020400949jph9gDWC1kpeZ1jBICv4qqu&loadMode=2\\\"}\",\n"
                + "    \"paymentAmount\": {\n"
                + "        \"currency\": \"SGD\",\n"
                + "        \"value\": \"1000\"\n"
                + "    },\n"
                + "    \"paymentCreateTime\": \"2025-05-18T18:52:32-07:00\",\n"
                + "    \"paymentId\": \"202505191940108001001889C0238417260\",\n"
                + "    \"paymentRequestId\": \"PAY_20250519095221009\",\n"
                + "    \"redirectActionForm\": {\n"
                + "        \"method\": \"GET\",\n"
                + "        \"redirectUrl\": \"https://open-sea-global.alipayplus.com/api/open/v1/ac/cashier/self/codevalue/checkout.htm?codeValue=https%3A%2F%2Fglobal.alipay.com%2F2810020400949jph9gDWC1kpeZ1jBICv4qqu&loadMode=2\"\n"
                + "    },\n"
                + "    \"result\": {\n"
                + "        \"resultCode\": \"PAYMENT_IN_PROCESS\",\n"
                + "        \"resultMessage\": \"payment in process\",\n"
                + "        \"resultStatus\": \"U\"\n"
                + "    }\n"
                + "}",
            "f%2FdWS%2B9CG8IZe%2Fc%2BnTJ7UwSKJ4Uo2trTKQZqNqfxNKEj%2Bgz%2B5GT6Ytyu3xrlVn8a9fugOdZZl8Ti%2Bm2tJSo3UntzZq%2FNqKICB1OMM5Xv3AD%2FAlvDKIvMBuda%2FXfB2EKNDrISAB7f5sbvmRo4%2FmPaUV%2BA5KGAXpS3Mha5tCWv8xXFXLc0eaw%2BnLiAveEzjijofGDT9BCmRG5SG%2Fk7aI2vst0jNhf8JC7RqlgKP1FJ3Qhsb6vohyEhsyzaY6tljdVfnACsiLdfLVqCNK%2BGyV%2FYCdudfYPbLJdO17lY5Zp4sa%2Bty4sobqT51B07XOa4YfbmkS%2BpPYMBalzeAxnEVNT2ig%3D%3D");

    System.out.println("Result [" + result + "]");
  }

  public static boolean verify(
      String requestURI,
      String clientId,
      String responseTime,
      String alipayPublicKey,
      String responseBody,
      String targetSignature) {
    // targetSignature would not be present in the response when AMS returns a SIGNATURE_INVALID
    if (StringUtils.isBlank(targetSignature)) {
      return false;
    }

    // content_to_be_validated
    String contentToBeValidated =
        String.format("POST %s\n%s.%s.%s", requestURI, clientId, responseTime, responseBody);

    try {
      // sha256withRSA
      java.security.Signature signature = java.security.Signature.getInstance("SHA256withRSA");

      // alipay public key
      PublicKey pubKey =
          KeyFactory.getInstance("RSA")
              .generatePublic(
                  new X509EncodedKeySpec(
                      Base64.getDecoder()
                          .decode(alipayPublicKey.getBytes(StandardCharsets.UTF_8))));

      signature.initVerify(pubKey);
      signature.update(contentToBeValidated.getBytes(StandardCharsets.UTF_8));

      // urlDecode
      String urlDecodedSignature =
          URLDecoder.decode(targetSignature, StandardCharsets.UTF_8.displayName());

      // base64Decode
      byte[] signatureToBeVerified = Base64.getDecoder().decode(urlDecodedSignature);

      // verify
      return signature.verify(signatureToBeVerified);

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) throws Exception {
    testing();
  }
}
