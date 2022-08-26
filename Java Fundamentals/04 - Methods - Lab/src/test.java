public class test {
    public static void main(String[] args) {

        // DRY  -  Do not repeat yourself!!!
        // WET  -  We enjoy typing!!!

        // Всеки код е като книга, където:
        // Методите са глаголите,
        // а променливите - съществителните.


        printHello();

    /*  depositMoney();

        welcome();  */

    }

    public static void printHello() {
        System.out.println("Hello!");
        depositMoney();
        welcome();
    }

    public static void depositMoney(){
        System.out.println("Hey, you now are rich lol");
    }

    public static void welcome(){
        System.out.println("Welcome!");
    }

}
