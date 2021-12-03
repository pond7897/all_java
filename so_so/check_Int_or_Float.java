import java.util.*;

public class check_Int_of_Float {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);  int number = kbd.nextInt();
        float sqrt = (float) Math.sqrt(number);
        kbd.close();
        System.out.println("sqrt of " + number + " is " + sqrt);
        if (sqrt == Math.round(sqrt)) {
            System.out.println("Integer");
        } else {
            System.out.println("Float");
        }
    }
}
/* Tips: Run for check input format */
/*
input : 2
output : Float

input : 12
output : Integer

etc.
*/
