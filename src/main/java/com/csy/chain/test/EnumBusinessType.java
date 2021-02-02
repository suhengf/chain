package com.csy.chain.test;


import lombok.Getter;

@Getter
public enum EnumBusinessType {

    anti("anti", "反欺诈"),
    risk("risk", "风控");

    private String code;
    private String msg;

    EnumBusinessType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
