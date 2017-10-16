import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class puzzling {
    public ArrayList<Integer> arr1(int[] arr){
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=10){
            a.add(arr[i]);}
            sum +=arr[i];

        }
        System.out.println("The sum is "+sum);
        return a;
    }
    public ArrayList<String> arr2(String[] arr){
        ArrayList<String> a = new ArrayList<String>();
        for(int i = 0; i<arr.length;i++){
            if(arr[i].length()>5){
                a.add(arr[i]);
            }
        }
        return a;
    }
    public void arr3(String[] arr){

        for(int i = 0; i<arr.length; i++){
            int random = ThreadLocalRandom.current().nextInt(0, 25+1);
//            System.out.println(random);

            String a = arr[random];
            arr[random] = arr[i];
            arr[i] = a;

        }
        System.out.println(arr[25]);
        System.out.println(arr[0]);
        if(arr[0].equals("a") || arr[0].equals("e")||arr[0].equals("i") || arr[0].equals("o") || arr[0].equals("u")){
            System.out.println("First letter is vowel, which is "+arr[0]);
        }

    }
    public int[] arr4(){
        int[] a = new int[10];
        for(int i = 0; i<10; i++){
            int random = ThreadLocalRandom.current().nextInt(55, 100+1);
            a[i] = random;

        }
        return a;
    }
    public String arr5(String[] arr) {
        String a = "";
        for (int i = 0; i < 5; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, 25 + 1);
            a += arr[random];

        }
        return a;
    }
    public String[] arr6(String[] arr){
        String a = "";
        String[] b = new String[10];
        for(int j = 0; j<10;j++) {
            for (int i = 0; i < 5; i++) {
                int random = ThreadLocalRandom.current().nextInt(0, 25 + 1);
                a += arr[random];

            }
            b[j] = a;
            a = "";
        }

        return b;
    }


}
