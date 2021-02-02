package com.csy.chain.test;


import lombok.Getter;

@Getter
public enum EnumResultType   {

    pass("p", "通过"),
    fail("r", "通过"),
    tp_person("c", "通过");

    private String code;
    private String msg;

    EnumResultType(String code, String msg) {
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
