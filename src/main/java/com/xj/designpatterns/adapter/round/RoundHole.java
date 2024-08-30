package com.xj.designpatterns.adapter.round;

import lombok.Getter;

/**
 * 圆孔
 * @author : xiongjun
 * @date : 2024/8/30 15:47
 */
@Getter
public class RoundHole {

    /**
     * 半径
     */
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }


    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
