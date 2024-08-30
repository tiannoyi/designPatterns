package com.xj.designpatterns.adapter.square;

import lombok.Getter;

/**
 * 方钉
 * @author : xiongjun
 * @date : 2024/8/30 15:54
 */
@Getter
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }

}
