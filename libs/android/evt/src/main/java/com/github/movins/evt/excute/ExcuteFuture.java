package com.github.movins.evt.excute;

public interface ExcuteFuture<T> {
    boolean excute(ExcuteCallback<T> callback);
}