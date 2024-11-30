//แปลงจาก python เป็น java
/* 
def binary_search(lst, v):
    i,j = 0, len(lst)
    while i < j:
        mid = (i+j)//2
        if v < lst[mid]:
            j = mid
        elif v > lst[mid]:
            i = mid+1
        else:
            return mid
    return None

def main():
    lst = [1,2,4,5,7,8,11,13]
    print(binary_search(lst, 5))
    print(binary_search(lst, 13))
    print(binary_search(lst, 10))

if __name__ == '__main__':
    main()
*/

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
