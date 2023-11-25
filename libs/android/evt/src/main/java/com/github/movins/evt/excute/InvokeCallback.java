package com.github.movins.evt.excute;

public interface InvokeCallback<T> {
    void before(T data);
    void progress(int value);
    void success(T data);
    void error(int code, String desc);
}