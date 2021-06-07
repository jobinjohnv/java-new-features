package hackerrank;

import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        List<List<Integer>> range = new ArrayList<List<Integer>>();

        for (int i = 0; i < count; i++) {

            String rangeString = scanner.nextLine();
            String[] rangeArr = rangeString.split(" ");

            List<Integer> rangeList = new ArrayList<>();
            rangeList.add(Integer.parseInt(rangeArr[0]));
            rangeList.add(Integer.parseInt(rangeArr[1]));
            range.add(rangeList);
        }
        scanner.close();
        getDifference(range);

    }

    private static void getDifference(List<List<Integer>> range) {
        for (List<Integer> rangeEntry : range) {
            List<Integer> primeNums = getPrimeNums(rangeEntry);

            if (primeNums.size()==1){
                System.out.println("0");
            }else if (primeNums.size() == 0){
                System.out.println("-1");
            }else{
                System.out.println(primeNums.get(primeNums.size()-1) - primeNums.get(0));
            }
        }

    }

    private static List<Integer> getPrimeNums(List<Integer> rangeEntry) {
            int start = rangeEntry.get(0);
            int stop = rangeEntry.get(rangeEntry.size() - 1);
            List<Integer> primeNums= new ArrayList<>();

            for (int i = start; i <= stop; i++) {
                if(checkIfPrime(i)){
                    primeNums.add(i);
                }
            }
            return primeNums;
    }


    private static Boolean checkIfPrime(int num) {
        Boolean flag = true;
        if (num == 0 || num == 1) {
            flag = false;
        } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
