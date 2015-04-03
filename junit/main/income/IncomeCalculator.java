package income;

import income.exceptions.CalcMethodException;
import income.exceptions.PositionException;
import income.method.ICalcMethod;

/**
 * Created by hilcg on 2015/4/3.
 */
public class IncomeCalculator {

    private ICalcMethod calcMethod;
    private Position position;

    public void setCalcMethod(ICalcMethod calcMethod) {
        this.calcMethod = calcMethod;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double calc() {

        if ( calcMethod == null ) {
            throw new CalcMethodException("CalcMethod not yet defined...");
        }

        if ( position == null ) {
            throw new PositionException("Position not yet defined");
        }

        return calcMethod.calc(position);
    }
}
