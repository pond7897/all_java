
//แปลงจาก python เป็น java
/*
lst = [1, 2, 3, 2, 5, 3, 1, 3, 9]
i = 0
while i < len(lst):
    if lst[i] % 3 == 0:
        del lst[i]
    else:
        i += 1
print(lst)
*/
import java.util.*;

public class RemoveThirds {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        // [1, 2, 3, 2, 5, 3, 1, 3, 9]
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(2);
        lst.add(5);
        lst.add(3);
        lst.add(1);
        lst.add(3);
        lst.add(9);

        int i = 0;
        while (i < lst.size()) {
            if (lst.get(i) % 3 == 0) {
                lst.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(lst);
    }
}
