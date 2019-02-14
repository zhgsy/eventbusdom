package com.bw.com.eventbusdom;

/**
 * 观察者
 */
public class Observer implements IObserver{
    @Override
    public void receive(String msg) {
        System.out.print(msg);
    }
}
