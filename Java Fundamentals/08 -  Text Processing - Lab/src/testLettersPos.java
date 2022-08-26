import java.util.Scanner;

public class testLettersPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char letter;

        for(int i=0; i<text.length(); i++)
        {
            letter = text.charAt(i);
            if(letter>='A' && letter<='Z')
                System.out.println((int)letter - 'A'+1);
            if(letter>='a' && letter<= 'z')
                System.out.println((int)letter - 'a'+1);
        }


        String word = "blah blah";

        for(int i =0;i<word.length();++i) {

            if(Character.isLowerCase(word.charAt(i))){
            System.out.println((int)word.charAt(i) - (int)'a'+1);
        }
else{
            System.out.println((int)word.charAt(i)-(int)'A' +1);
        }
        }
    }
}
