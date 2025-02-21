public class TestVar {
    public static void main(String[] args) {
        // getNumber(1, 2, 3, 4, 5);
        getNumber(1);
        // getNumberWithOutArgs(0);
    }

    public static void getNumber(int... number) {
        System.out.print(number.length);
    }

    public static void getNumberWithOutArgs(int number) {
        System.out.print(number);
    }
}
