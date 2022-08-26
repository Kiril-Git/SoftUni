import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = scanner.nextDouble();

        printEstimate(grade);
        }
    private static void printEstimate(double grade) {

        if (grade >= 2 & grade < 3){
            System.out.println("Fail");
        }
        else if (grade >= 3 & grade < 3.50){
            System.out.println("Poor");
        }
        else if (grade >= 3.50 & grade < 4.50){
            System.out.println("Good");
        }
        else if (grade >= 4.50 & grade < 5.50){
            System.out.println("Very good");
        }
        else if (grade >= 5.50 & grade <= 6.0){
            System.out.println("Excellent");
        }
        else {
            System.out.println();
        }
    }
}
// DRY  -  Do not repeat yourself!!!
// WET  -  We enjoy typing!!!

// Всеки код е като книга, където:
// Методите са глаголите,
// а променливите - съществителните.