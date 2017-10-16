import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        puzzling arr1 = new puzzling();
        int[] a = {11,3,51,7,91,13,-9,-8,-7,-6};
        System.out.println(arr1.arr1(a));
        String[] b = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikaw"};
        System.out.println(arr1.arr2(b));
        String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        arr1.arr3(letter);
        for(int i =0; i<20;i++){
        System.out.println(Arrays.toString(arr1.arr4()));}
        System.out.println(arr1.arr5(letter));
        System.out.println(Arrays.toString(arr1.arr6(letter)));


    }
}
