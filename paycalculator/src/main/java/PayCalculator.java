/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 22/10/2013
 * Time: 12:59
 * To change this template use File | Settings | File Templates.
 */
public class PayCalculator {

    public double getPay(double hoursWorked, double payRate) {

        if(hoursWorked < 40){
            return hoursWorked * payRate;

        } else {
            double overtimePay = (hoursWorked - 40) * 1.5 * payRate;
            double standardPay = 40 * payRate;
            return standardPay + overtimePay;
        }
    }
}
