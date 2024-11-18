public class Main {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        System.out.println("Current List: " + list);
        // INSERT METHOD

        Friend f1 = new Friend( "555-555-5555" , "Jessica");
        list.insert(f1);
        System.out.println("Current List: " + list);
        Friend f2 = new Friend( "301-232-6060" , "Kendall");
       list.insert(f2);
        System.out.println("Current List: " + list);
        Friend f3 = new Friend( "402-952-7809" , "Rachel");
        list.insert(f3);
        System.out.println("Current List: " + list);
        Friend f4 = new Friend ("259-425-6921" , "Martin");
        list.insert(f3);
        System.out.println("Current List: " + list);
        System.out.println("Current List in Reverse: " + list.toStringInReverse());

        // deleting from list
        list.delete(f3);
        list.delete(f1);
        System.out.println("Current List: " + list);


    }
}
