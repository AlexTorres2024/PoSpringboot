public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("---------------------");
        printSquare(20);
        System.out.println("---------------------");
        printTriangle(6);
        System.out.println("---------------------");
        printTriangle(4);


    }

    public static void printSquare(int length) {
        //for that prints width
        for (int i = 1; i <= length; i++) {
            //for that prints height
            for (int j = 1; j <= length; j++) {
                System.out.print(" * ");

            }
            System.out.print("\n");

        }
    }

    public static void printTriangle(int base) {
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    }