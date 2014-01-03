/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 24/10/2013
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class ChessBoard {

    public static void main(String[] args) {

//        int lowerBound = 1;
//        int upperBound = 110;
//        int runningTotal = 0;
//
//
//        for(int count=lowerBound; count<=upperBound; count = count+1){
//
//           runningTotal = runningTotal + count;
//
//            System.out.println(runningTotal);
//        }
//
//
//
//
//        runningTotal = 0;
//
//        while (lowerBound<=upperBound)
//        {
//            runningTotal = runningTotal + lowerBound;
//            System.out.println(runningTotal);
//            lowerBound = lowerBound+1;
//
//
//        }

        int [][] chessBoard = new int [8][8];
        for (int i=0; i< chessBoard.length; i++) {
            for   (int j=0; j< chessBoard[i].length; j++){
               chessBoard[i][j] = i+j;
            }
        }


        for (int i=0; i< chessBoard.length; i++) {
            for   (int j=0; j< chessBoard[i].length; j++){
                int number = chessBoard[i][j];

                if (number < 10) {
                    System.out.print(number + "  ");
                } else
                    System.out.print(number + " ");
                }
            System.out.println();
        }









    }

}
