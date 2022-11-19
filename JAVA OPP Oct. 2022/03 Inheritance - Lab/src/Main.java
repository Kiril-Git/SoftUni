import randomArrayList.RandomArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here


        RandomArrayList randomArrayList = new RandomArrayList();

        randomArrayList.add(22);
        randomArrayList.add(44);
        randomArrayList.add(66);
        randomArrayList.add(88);
        randomArrayList.add(100);


        System.out.println(randomArrayList.getRandomElement());
    }
}
