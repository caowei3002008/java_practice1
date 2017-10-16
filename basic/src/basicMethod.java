import java.lang.reflect.Array;
import java.util.Arrays;

public class basicMethod {
    public void printOneTo(){
        for(int i = 1; i<256; i++){
            System.out.println((i));
        }
    }
    public void printOneOdd(){
        for(int i = 1; i<256; i = i + 2){
            System.out.println((i));
        }
    }
    public void sum(){
        int sum = 0;
        for(int i = 0; i<256; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
    public void arrayDisply(int a[]){
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public void findMax(int a[]){
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
    public void addOddNumber(){
        int[] arr = new int[128];
        int j = 0;
        for(int i = 1; i<256; i = i + 2){
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public double getAverage(int a[]){
        int sum = 0;
        for(int i = 0; i<a.length;i++){
            sum += a[i];
        }
        int average = sum/a.length;
        return average;
    }
    public int getGreaterThanY(int y, int a[]){
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>y){
                count++;
            }
        }
        return count;
    }
    public int[] square(int a[]){
        for(int i = 0; i<a.length; i++){
            a[i] = a[i] * a[i];
        }
        return a;
    }
    public int[] eliminateNegativeNumber(int a[]){
        for(int i = 0; i<a.length; i++){
            if(a[i] < 0){
                a[i] = 0;
            }
        }
        return a;
    }
    public int[] maxMinAver(int a[]){
        int min = a[0];
        int max = a[0];
        int ave;
        int sum = a[0];
        for(int i = 1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];}
            else if (a[i]<min){
                min = a[i];
            }
            sum +=a[i];
            }

        ave = sum/a.length;
        int[] arr = new int[3];
        arr[0] = max;
        arr[1] = min;
        arr[2] = ave;
        return arr;

    }
    public int[] shiftArray(int a[]){
        for(int i = 0; i<a.length; i++){
            if(i+1-a.length == 0){
                a[i] = 0;
            }else{
                a[i] = a[i+1];
            }
        }
        return a;
    }


}
