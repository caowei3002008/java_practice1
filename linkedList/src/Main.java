public class Main {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        for(int i = 0; i<15; i++){
            l1.add(i);
        }
        l1.printValues();
        l1.remove();
        l1.printValues();
        l1.removeAt(10);
        l1.printValues();
        l1.find(10);

    }
}
