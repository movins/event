package com.github.movins.evt.excute;

public abstract class ExcuteCallback<T> implements WatchCallback<T> {
    @Override
    public void onBefore(T data) {
    }
}