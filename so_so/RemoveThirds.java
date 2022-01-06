package lab3;

import java.util.*;

public class RemoveThirds {
    

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Scanner kbd = new Scanner(System.in);
        System.out.print("input array : "); int number_array = kbd.nextInt();
        for (int i = 0; i<number_array;i++){
            System.out.print("input number "+(i+1)+" : ");
            int number_of_array = kbd.nextInt();
            lst.add(number_of_array);
        }
        int i = 0;
        while (i < lst.size()) {
            if( lst.get(i) % 3 == 0){
                lst.remove(i);
            }else { 
                i++;
            }
        }
            
        System.out.println(lst);
        kbd.close();
    }
}
