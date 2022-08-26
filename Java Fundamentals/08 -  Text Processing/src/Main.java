public class Main {

    public static void main(String[] args) {
	// write your code here
        // Strings are immutable (непроменяеми)


        String text = "Java";

        char s = text.charAt(0);

//        text.charAt(0) = 'F';     не можем да променяме стринг

        System.out.println(s);


        String str = new String(new char[]{'s', 't', 'r'});
        char[] charArr = str.toCharArray();

        for (char el : charArr){
            System.out.print(el + " ");
        }
    }
}
