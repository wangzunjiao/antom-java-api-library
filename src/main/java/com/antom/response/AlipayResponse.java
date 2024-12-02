package com.antom.response;

import lombok.Data;

@Data
public class AlipayResponse {

    private Result result;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
