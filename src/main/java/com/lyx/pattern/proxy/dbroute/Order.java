package com.lyx.pattern.proxy.dbroute;

public class Order {
    private Object rederInfo;

    private long createTime;

    private String id;

    public Object getRederInfo() {
        return rederInfo;
    }

    public void setRederInfo(Object rederInfo) {
        this.rederInfo = rederInfo;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
