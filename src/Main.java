public class Main {
    public static void main(String[] args) {

        IntOnlyArrayList intOnlyArrayList = new IntOnlyArrayList();

        // Kopierer arrayen 6 gange og tilføjer en værdi for hver kopi
        intOnlyArrayList.add(5);
        intOnlyArrayList.add(2);
        intOnlyArrayList.add(7);
        intOnlyArrayList.add(17);
        intOnlyArrayList.add(32);
        intOnlyArrayList.add(13);

        // Henter værdien på index 2
        System.out.println(intOnlyArrayList.getElement(2));

        // Printer array til konsol
        intOnlyArrayList.print();

        // Fjerner værdi på index 2
        intOnlyArrayList.remove(2);

        intOnlyArrayList.print();

        // Kopierer array og indsætter værdien 53131 på index 4 i den nye array
        intOnlyArrayList.addSpecific(53131,4);
        intOnlyArrayList.print();

        // Kopierer array og indsætter værdien 312321 på index 1 i den nye array
        intOnlyArrayList.addSpecific(312321,1);
        intOnlyArrayList.print();
    }
}
