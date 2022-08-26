public class test4 {

    public static void main(String[] args) {
	// write your code here

        int a = 10;
        int b = 5;

        int result = sum(a, b);
        int multiplySum = multiply(a, b);

        System.out.println(sum("Ivo ", "Buzema"));

    }
    private static int sum(int a, int b){
        return a+b;
    }
    private static int multiply(int a, int b){
        return a*b;
    }
    private static int sum(int a, int b, int c){
        return a+b+c;
    }
    private static String sum(String foreName, String surName) {
        return foreName + surName;
    }
}
