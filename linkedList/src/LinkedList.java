class LinkedList{
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    public void add(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }else{
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        Node runner = this.head;
        if(head == null){
            System.out.println("Empty linked list.");
        }else if(head.next == null){
            head = null;
        }else{

            while(runner.next.next != null){
                runner = runner.next;
            }
            runner.next = null;
        }
    }

    public void printValues(){
        Node runner = this.head;
        if(head == null){
            System.out.println("Empty linked list.");
        }else{
            while(runner.next != null){
                System.out.println(runner.value);
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }

    public int find(int value){
        Node runner = this.head;
        if(head == null){
            System.out.println("Empty linked list.");
        }else{
            while(runner.next != null){
                if(runner.value == value){
                    System.out.println("Found it.");
                    return runner.value;
                }
                runner = runner.next;
            }
        }
        System.out.println("Not found.");
        return 0;
    }

    public void removeAt(int index){
        Node pre = head;
        int count = 0;
        if(head == null){
            System.out.println("Empty linked list.");
        }else if(index == 0){
            head = head.next;
        }
        else{
            while(count < index-2){
                if(pre.next == null){
                    return;
                }
                pre = pre.next;
                count++;
            }
            Node current = pre.next;
            pre.next = current.next;
            current.next = null;
        }
    }
}