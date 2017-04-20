

public class Main {

    public static void main(String[] args) {
///////////////////////////////
        Node test = new Node(0);
        test.insert(10);
        test.insert(5);
        test.insert(6);
        test.printInOrder();
        System.out.println(test);
///////////////////////////////
        Heap h = new Heap();
        h.add(1);
        h.add(2);
        h.add(4);
        h.add(8);
        int t = h.peek();
        int a = h.poll();
        int z = h.poll();
        System.out.println(t);
        System.out.println(a);
        System.out.println(z);
        System.out.println(h);
///////////////////////////////




    }
}


