/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 31/10/2013
 * Time: 13:22
 * To change this template use File | Settings | File Templates.
 */
public class EmbeddedLoops {

    public static void main(String[] args) {


        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {

                if (i%2 == 0) {
                    if (j%2 != 0) {
                        System.out.print("  ");
                        continue;
                    }
                } else {
                    if (j%2 == 0) {
                        System.out.print("  ");
                        continue;
                    }
                }

                System.out.print("# ");
            }
            System.out.println();
        }


    }
}
