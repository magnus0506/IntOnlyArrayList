import java.util.Arrays;

public class IntOnlyArrayList {

    private int[] intArray = new int[0];

    public IntOnlyArrayList(){
        int[] intArray = new int[0];
    }

    // Tager brug af copyOf metoden fra java util library til at kopierer den gamle array og indsætter værdi for enden
    public void add(int value){
        intArray = Arrays.copyOf(intArray, intArray.length + 1);
        intArray[intArray.length - 1] = value;
    }

    // Fjerner værdien fra det valgte index
    public void remove(int index) {
        int[] intArray_new = Arrays.copyOf(intArray, intArray.length - 1);
        for (int i = index; i < intArray_new.length; i++) {
            intArray_new[i] = intArray[i+1];
        }
        intArray = intArray_new;
    }
    // Kopierer array indtil den når valgte index, bytter den ud med valgte værdi og kopierer resten af array
    public void addSpecific(int value, int index) {

        int[] intArray_new = Arrays.copyOf(intArray, intArray.length);

        for (int i = 0; i < index + 1; i++) {
            if (i < index - 1)
                intArray_new[i] = intArray[i];
            else if (i == index - 1)
                intArray_new[i] = value;
            else
                intArray_new[i] = intArray[i - 1];
        }
        intArray = intArray_new;
    }
    // Bruger toString metoden fra java util library til at printe array som en string
    public void print(){
        System.out.println(Arrays.toString(intArray));
    }

    // Getter til at hente valgte index og printe i konsol
    public int getElement(int index){
        return intArray[index];
    }

    public int setElement(int index) {return intArray[index];}
}
