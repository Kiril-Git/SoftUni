import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DRY  -  Do not repeat yourself!!!
        // WET  -  We enjoy typing!!!

        // Всеки код е като книга, където:
        // Методите са глаголите,
        // а променливите - съществителните.

        printNumbers(2, 10);
        System.out.println();
        System.out.println();

        printStudent("Mitko", 17, 5.9 );

    }
    public static void printNumbers(int start, int end){
        for (int i = start; i <= end ; i++) {
            System.out.printf("%d ", i);

        }
    }

    public  static  void  printStudent(String name, int age, double grade){
        System.out.printf("Student: %s, Age: %d; grade: %.2f\n", name, age, grade);

    }

}
