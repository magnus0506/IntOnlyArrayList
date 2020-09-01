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
        int[] ia_new = Arrays.copyOf(ia, ia.length - 1);
        for (int i = index; i < ia_new.length; i++) {
            ia_new[i] = ia[i+1];
        }
        ia = ia_new;
    }

    public void print(){
        System.out.println(Arrays.toString(ia));
    }
    public int getElement(int index){
        return ia[index];
    }
}
