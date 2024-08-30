package com.xj.designpatterns.adapter.round;

import lombok.Getter;

/**
 * 圆钉
 * @author : xiongjun
 * @date : 2024/8/30 15:49
 */
@Getter
public class RoundPeg {

    private double radius;

    public RoundPeg() {
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }


}
