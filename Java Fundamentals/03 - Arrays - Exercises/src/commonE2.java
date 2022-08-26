import java.util.Scanner;

public class commonE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String[] array1 = line1.split(" ");
        String[] array2 = line2.split(" ");

        //  shortcut -> elements2.iter

        for (String el2 : array2) {
            for (String el1 : array1) {

                if (el1.equals(el2)){

                    System.out.print(el1 + " ");
                }

            }

        }
                }
            
            }
            





