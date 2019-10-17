import algorithm.Matrix;
import algorithm.Sudoku;

import java.util.Map;

public class Test {



    public static void main(String[] args) {


        Sudoku sudoku = new Sudoku();
        Matrix puzzle;
        Matrix ans;
        Map<String, String> ansMap;

        puzzle = sudoku.init(3).get(0);
        ans = sudoku.getAns();

        System.out.println(1);
    }

}
