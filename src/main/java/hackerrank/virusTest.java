package hackerrank;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class virusTest {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            String virus = scanner.next();
            int count = scanner.nextInt();
            List<String> samples = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                samples.add(scanner.next());
            }
            scanner.close();

            for (String smpl :samples){
                if(checkSubSequence(virus,smpl)) System.out.println("POSITIVE");
                else System.out.println("NEGATIVE");
            }


    }
    public static boolean checkSubSequence(String source, String target){
        if(source==null || target==null)
            return false;

        String longer = source.length()>target.length() ? source : target;
        String shorter = source.length()<=target.length() ? source : target;

        int j = 0;
        for (int i = 0; i < longer.length() && j < shorter.length(); i++) {
            if (longer.charAt(i) == shorter.charAt(j))
                j++;
        }
        if(j==shorter.length())
            return true;

        return false;
    }
}
