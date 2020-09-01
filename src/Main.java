import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntOnlyArrayList intOnlyArrayList = new IntOnlyArrayList();

        intOnlyArrayList.add(5);
        intOnlyArrayList.add(2);
        intOnlyArrayList.add(3);

        System.out.println(intOnlyArrayList.getElement(2));
        intOnlyArrayList.print();

        intOnlyArrayList.remove(1);
        intOnlyArrayList.print();

    }

}
