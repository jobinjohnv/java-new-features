package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73,67,38,33);
        List<Integer> rounded = gradingStudents(grades);

        for (Integer round : rounded){
            System.out.println(round);
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> rounded = new ArrayList<>();
        int nearest5;
        for (Integer grade: grades) {

            if(grade<38) rounded.add(grade);
            else{
                nearest5 = grade;
                while(nearest5 % 5 !=0){

                    nearest5++;
                }
                if(nearest5-grade < 3){
                    rounded.add(nearest5);
                }else rounded.add(grade);

            }
        }
        return rounded;
    }

}
