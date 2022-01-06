package lab3;
public class binarySearch {
    //Binary search
   public static int BinarySearch(int[] lst, int v) {
        int i = 0;
        int j = lst.length ;
        while (i < j) {
            int mid = (i + j) / 2;
            if (v < lst[mid]) {
                j = mid;
            } else if (v>lst[mid]) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] lst = {1,2,4,5,7,8,11,13};
        int v = 5;
        int index = BinarySearch(lst, v);
        if (index == -1) {
            System.out.println("None");
        } else {
            System.out.println(index);
        }
    }
}
