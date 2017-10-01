import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        int[] array1 = new int[]{5, 6, 7};
        System.out.println(Arrays.toString(newArray(array1,array2)));
    }

    private static int[] newArray(int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0, k = 0; i < array3.length; k++){
            if (k < array1.length){
            array3[i] = array1[k];
            i++;
            }
            if (k < array2.length){
                array3[i] = array2[k];
                i++;
            }
        }
        return array3;
    }
}
