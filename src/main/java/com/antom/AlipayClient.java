package com.antom;

import com.antom.exception.AlipayApiException;
import com.antom.request.AlipayRequest;
import com.antom.response.AlipayResponse;

public interface AlipayClient {

  <T extends AlipayResponse> T execute(AlipayRequest<T> alipayRequest) throws AlipayApiException;
}
