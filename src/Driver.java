public class Driver {
    public static void main(String[] args) {
        DoubleLL lst = new DoubleLL();
        DoubleLL.Node nine  = lst.new Node(9);
        lst.insert(lst.new Node (7));
        lst.insert(lst.new Node (3));
        lst.insert(lst.new Node (5000));
        lst.insert(lst.new Node (10));
        lst.insert(lst.new Node (30));

        lst.insert(nine);
        lst.print();
        //lst.insert(lst.new Node (4));
        lst.deleteSecondToLast();
        lst.print();


    }
}

