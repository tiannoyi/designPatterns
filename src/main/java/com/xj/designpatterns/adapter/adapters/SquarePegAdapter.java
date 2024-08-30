package com.xj.designpatterns.adapter.adapters;

import com.xj.designpatterns.adapter.round.RoundPeg;
import com.xj.designpatterns.adapter.square.SquarePeg;

/**
 * 方钉到圆孔的适配器
 * @author : xiongjun
 * @date : 2024/8/30 15:57
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        //计算适合该钉子的最小圆半径。
        return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2);
    }
}
