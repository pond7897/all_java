package final_exam;

public class K2_key {
    static char[] id = new char[10];
    
    public static void main(String[] args) {
        for (int i = 0; i < id.length; i++) {
            id[i] = i % 2 == 0 ? '*' : '+';
        }

        int medium = (id.length / 2) - 1;
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i]);
            if (i == medium) {
                System.out.println();
            }
        }
    }
}