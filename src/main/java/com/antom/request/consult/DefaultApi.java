package com.antom.request.consult;

import com.antom.request.ApiException;
import com.antom.request.ApiClient;
import com.antom.request.ApiResponse;
import com.antom.request.Configuration;
import com.antom.request.Pair;

import jakarta.ws.rs.core.GenericType;

import com.antom.model.PayConsultRequest;
import com.antom.model.PayConsultResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-05T07:42:21.802Z[Etc/UTC]")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * consult payment methods
   * Use the **consult** API to initiate a payment consultation request to Alipay. This request is returned to the merchant with information on the different payment methods and its corresponding amount, country, currency, rules, and configuration.  The **consult** API enables merchants to:  - Provide consumers with multiple payment methods without bearing any additional costs caused by a change in these payment methods, or managing the logic of selecting and sorting these payment methods.  - Automate the selection and sorting of multiple payment methods.
   * @param payConsultRequest  (optional)
   * @return PayConsultResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
     </table>
   */
  public PayConsultResponse consultPayment(PayConsultRequest payConsultRequest) throws ApiException {
    return consultPaymentWithHttpInfo(payConsultRequest).getData();
  }

  /**
   * consult payment methods
   * Use the **consult** API to initiate a payment consultation request to Alipay. This request is returned to the merchant with information on the different payment methods and its corresponding amount, country, currency, rules, and configuration.  The **consult** API enables merchants to:  - Provide consumers with multiple payment methods without bearing any additional costs caused by a change in these payment methods, or managing the logic of selecting and sorting these payment methods.  - Automate the selection and sorting of multiple payment methods.
   * @param payConsultRequest  (optional)
   * @return ApiResponse&lt;PayConsultResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK - the request has succeeded. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PayConsultResponse> consultPaymentWithHttpInfo(PayConsultRequest payConsultRequest) throws ApiException {
    Object localVarPostBody = payConsultRequest;
    
    // create path and map variables
    String localVarPath = "/consult";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "Client-Id", "Request-Time", "Signature" };

    GenericType<PayConsultResponse> localVarReturnType = new GenericType<PayConsultResponse>() {};

    return apiClient.invokeAPI("DefaultApi.consultPayment", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
