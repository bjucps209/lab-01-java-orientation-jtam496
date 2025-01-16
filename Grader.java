import java.util.*;

public class Grader {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rounded = 0;
        int total = scan.nextInt();

        for (int i = 0; i < total; i++){
            int grade = scan.nextInt();
            
             if (grade > 37 && (grade % 5) > 2){
                rounded = ((grade / 5) + 1) * 5;
            } else rounded = grade;
        
            System.out.println(rounded);
            
        }
        
    }
}
