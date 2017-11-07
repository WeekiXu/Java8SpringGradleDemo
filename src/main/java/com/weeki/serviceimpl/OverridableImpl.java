package com.weeki.serviceimpl;

import com.weeki.service.Defaulable;
import com.weeki.service.DefaulableFactory;

public class OverridableImpl implements Defaulable {
    int count;

    @Override
    public String notRequired() {
        return "Overridden implementation";
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Defaulable defaultable = DefaulableFactory.create(DefaultableImpl::new);
        defaultable.setCount(3);
        System.out.println(defaultable.notRequired());
        System.out.println(defaultable.getCount());
        Defaulable defaultable2 = DefaulableFactory.create(DefaultableImpl::new);
        defaultable.setCount(5);
        System.out.println(defaultable2.getCount());
        defaultable = DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaultable.notRequired());
    }
}
