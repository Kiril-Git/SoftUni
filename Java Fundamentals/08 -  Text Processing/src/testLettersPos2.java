import java.util.Scanner;

public class testLettersPos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int temp1 = 0;
        int temp2 = 0;

//        char letter;
//
//        for(int i=0; i<text.length(); i++)
//        {
//            letter = text.charAt(i);
//            if(letter>='A' && letter<='Z')
//                System.out.println((int)letter - 'A'+1);
//            if(letter>='a' && letter<= 'z')
//                System.out.println((int)letter - 'a'+1);
//        }


//        String word = "blah blah";

        for(int i =0;i<word.length();++i) {

            if(Character.isLowerCase(word.charAt(i))){

                temp1 = (int)word.charAt(i) - (int)'a'+1;
                System.out.println(temp1);
        }
            else{
                temp1 = (int)word.charAt(i)-(int)'A' +1;
                System.out.println(temp1);
        }
        }
    }
}
