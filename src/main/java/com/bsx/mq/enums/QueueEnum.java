package com.bsx.mq.enums;

/**
 * 队列
 */
public enum QueueEnum {
    SJ_TEST("queue.superloan.test", "TEST"),
    SJ_DEV("queue.superloan.dev", "DEV");

    private String code;
    private String name;

    QueueEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}