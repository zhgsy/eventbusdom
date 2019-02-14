package com.bw.com.eventbusdom;

public class Observable implements IObservable{
    @Override
    public void register(IObserver IObserver) {

    }

    @Override
    public void cacelRegister(IObserver iObserver) {

    }

    @Override
    public void notifyMsg() {
        System.out.print("傻der");
    }
}
