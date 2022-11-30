package telephon;

import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
                                        //      No digits
        StringBuilder sb = new StringBuilder();

        for (String el : urls){

            if (digitsCatcher(el)){
                sb.append("Invalid URL!\n");
            }
            else {
                sb.append(String.format("Browsing: %s!\n", el));
            }
        }
        return sb.toString();
    }

    @Override
    public String call() {
                               //       Digits only
        StringBuilder sb = new StringBuilder();

        for (String el : numbers){

            if (!digitsChecker(el)){
                sb.append("Invalid number!\n");
            }
            else {
                sb.append(String.format("Calling... %s!\n", el));
            }
        }
        return sb.toString();
    }

    private  boolean digitsCatcher(String url){

        for (char el : url.toCharArray()){
            if (Character.isDigit(el)){
                return true;
            }
        }
        return false;
    }
    private  boolean digitsChecker(String num){

        for (char el : num.toCharArray()){
            if (!Character.isDigit(el)){
                return false;
            }
        }
        return true;
    }
}
