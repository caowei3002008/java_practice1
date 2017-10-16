public class Main {

    public static void main(String[] args) {
//        manipulator manipulator = new manipulator();
//        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
//        System.out.println(str);    }

        manipulator manipulator = new manipulator();
//        char letter = 'o';
//        Integer a = manipulator.getIndexOrNull("Coding", letter);
//        Integer b = manipulator.getIndexOrNull("Hello World", letter);
//        Integer c = manipulator.getIndexOrNull("Hi", letter);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        String word = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println((word));

    }
}
