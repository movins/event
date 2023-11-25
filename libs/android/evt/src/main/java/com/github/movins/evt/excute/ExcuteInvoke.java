package com.github.movins.evt.excute;

public interface ExcuteInvoke<T> {
    boolean onExcute(InvokeCallback<T> result);
}