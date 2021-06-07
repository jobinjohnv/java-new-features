package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ArrayDiagonalDifference {


    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            row.clear();
            row.add(1);
            row.add(2);
            row.add(3);
            arr.add(row);
        }
        int result = diagonalDifference(arr);
        System.out.println(result);

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightSum = 0;
        int leftSum = 0;
        int j = arr.size()-1;
        for (int i = 0; i < arr.size(); i++) {
            int a = arr.get(i).get(i);
            int b = arr.get(i).get(j);
            System.out.println("Number read is "+b);
            rightSum += a;
            leftSum +=b;
            j--;
        }
        return Math.abs(rightSum-leftSum);

    }
}
