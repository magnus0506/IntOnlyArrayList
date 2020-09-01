import java.util.Arrays;

public class IntOnlyArrayList {

    private int[] ia = new int[0];

    public IntOnlyArrayList(){
        int[] ia = new int[0];
    }

    public void add(int value){
        ia = Arrays.copyOf(ia, ia.length + 1);
        ia[ia.length - 1] = value;
    }
    public void remove(int index) {
        ia = Arrays.copyOf(ia, ia.length - 1);
        for (int i = index; i < ia.length; i++) {
            if (i != index) {
                Arrays.copyOf(ia,ia.length);
            } else {
                Arrays.copyOf(ia,ia.length + 1);
            }
        }
    }

    public void print(){
        System.out.println(Arrays.toString(ia));
    }
    public int getElement(int index){
        return ia[index];
    }
}
