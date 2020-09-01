public class Main {
    public static void main(String[] args) {

        IntOnlyArrayList intOnlyArrayList = new IntOnlyArrayList();

        intOnlyArrayList.add(5);
        intOnlyArrayList.add(2);
        intOnlyArrayList.add(7);
        intOnlyArrayList.add(17);
        intOnlyArrayList.add(32);
        intOnlyArrayList.add(13);

        System.out.println(intOnlyArrayList.getElement(2));

        intOnlyArrayList.print();

        intOnlyArrayList.remove(2);

        intOnlyArrayList.print();
    }
}
