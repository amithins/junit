package income.method.impl;

import income.Position;
import income.method.ICalcMethod;

/**
 * Created by hilcg on 2015/4/3.
 */
public class CalcMethodImpl implements ICalcMethod{

    @Override
    public double calc(Position position) {

        double d = 0;

        switch (position) {

            case BOSS:
                d = 7000.00;
                break;
            case MANAGER:
                d = 5000.00;
                break;
            case PROGRAMMER:
                d = 3000.00;
                break;
        }

        return d;

    }
}
