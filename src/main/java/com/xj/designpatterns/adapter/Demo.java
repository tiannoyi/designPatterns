package com.xj.designpatterns.adapter;

import com.xj.designpatterns.adapter.adapters.SquarePegAdapter;
import com.xj.designpatterns.adapter.round.RoundHole;
import com.xj.designpatterns.adapter.round.RoundPeg;
import com.xj.designpatterns.adapter.square.SquarePeg;

/**
 * @author : xiongjun
 * @date : 2024/8/30 15:45
 */
public class Demo {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        if (hole.fits(rPeg)){
            System.out.println("圆钉 r5 适合圆孔 r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)){
            System.out.println("方钉 w2 适合圆孔 r5");
        }

        if (!hole.fits(largeSqPegAdapter)){
            System.out.println("方钉 w20 不适合圆孔 r5");
        }


    }

}
