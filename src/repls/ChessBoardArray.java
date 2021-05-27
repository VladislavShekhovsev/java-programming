package repls;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class ChessBoardArray {
    public static void main(String[] args) {
        char bukva;
        int zifra =0;
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i <chessBoard.length ; i++) {
            zifra++; bukva='a';
            for (int j = 0; j <chessBoard[i].length ; j++) {
                chessBoard[i][j]=""+zifra +bukva++;
            }

        }
        System.out.println(Arrays.deepToString(chessBoard));

    }
}
