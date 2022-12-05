import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(0,2);
            numberList.add(number);
        }
        System.out.println(numberList);

        LinkedList<Integer>linkedNumbers = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            int number= random.nextInt(0,2);
            linkedNumbers.add(number);
        }
        System.out.println(linkedNumbers);

        int [] massiveNumber = new int[5];
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(0,2);
            massiveNumber[i]=number;
            System.out.println(number);
        }

        sortNumbers(numberList);
        System.out.println("Sorttolgonu "+numberList);

        sortNumbers(linkedNumbers);
        System.out.println("Sorttolgonu: "+linkedNumbers);

        sortNumbers(massiveNumber);
        System.out.println(Arrays.toString(massiveNumber));


    }

    private static void sortNumbers(List<Integer> numbers){
        Collections.sort(numbers);

    }

    private static void sortNumbers(LinkedList<Integer> numbers){
        Collections.sort(numbers);


    }
    private static void sortNumbers(int[] numbers){
        Arrays.sort(numbers);

    }
}