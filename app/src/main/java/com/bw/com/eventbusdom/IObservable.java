package com.bw.com.eventbusdom;

/**
 * 抽象观察者
 */
public interface IObservable {

    void register(IObserver IObserver);//注册观察者
    void  cacelRegister(IObserver iObserver);//取消注册
    void notifyMsg();
}
