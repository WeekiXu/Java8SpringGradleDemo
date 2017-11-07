package com.weeki.serviceimpl;

import com.weeki.service.Defaulable;

public class DefaultableImpl implements Defaulable {
    private int count;

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }
}
