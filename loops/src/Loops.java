/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 31/10/2013
 * Time: 12:38
 * To change this template use File | Settings | File Templates.
 */
public class Loops {

    public static void main(String[] args) {

        int totalSum = 0;
        int count = 0;

        while(count <=10){
            totalSum = totalSum + count;
            count++;

            if (totalSum > 21){
                break;
            }

            System.out.println("Total is now " + totalSum);
        }


        totalSum = 0;

        for(int i = 0; i <= 10; i++){

            if (i%2 > 0) {
                continue;
            }

            totalSum += i;
            System.out.println("Total is now " + totalSum);
        }

    }

}
