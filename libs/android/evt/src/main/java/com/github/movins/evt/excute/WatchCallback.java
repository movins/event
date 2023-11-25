package com.github.movins.evt.excute;

public interface WatchCallback<T> {
    void onBefore(T data);
    void onProgress(int progress);
    void onSuccess(T data);
    void onError(int code, String desc);
}