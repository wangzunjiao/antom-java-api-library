[package com.alipay.global.api.example.model;, package com.alipay.global.api.example.model;]
import com.alipay.global.api.response.ams..HttpResponse;

import java.io.InputStream;

public interface HttpRequest {

    String getHeader(String name);

    InputStream getInputStream();

}
