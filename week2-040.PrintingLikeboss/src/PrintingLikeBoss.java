public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int num = 0;
        while (num < amount){
            System.out.print(" ");
            num++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int num = size;
        for (int j = 0; j < size; j++) {
            printWhitespaces(num-1);
            printStars(i);
            num--;
            i++;
        }
    }

    public static void xmasTree(int height) {
        int i = 1;
        int num = height;
        for (int j = 1; j <= height; j++) {
            printWhitespaces(num-1);
            printStars(i);
            num--;
            i += 2;
        }
        for (int k = 1; k <= 2; k++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
printTriangle(1);
        printTriangle(5);
        printTriangle(3);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
