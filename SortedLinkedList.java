import java.util.ArrayList;

public class SortedLinkedList {
    private Node head;
    private Node tail;

    public SortedLinkedList () {
        head = null;
        tail = null;
    }

        public void insert(Friend value) {
            Node current = head;
            Node previous = null;
            // new Node that contains value
            Node nd = new Node(value);

            // attaching nd to the beginning
            nd.setNext(head);
            if (head == null) {
                head = nd;
                tail = nd;

                head.setPrev(null);
                tail.setNext(null);

            }
            else {
                while (current != null && (nd.getData().compareTo(current.getData()) > 0)) {

                    // make previous current and current the node after current
                    previous = current;
                    current = current.getNext();
                }
                if (previous == null) {
                    nd.setNext(head);
                    head = nd;
                    head.setPrev(nd);
                } else if (current == null) {
                    previous.setNext(nd);
                    nd.setPrev(previous);
                } else {
                    previous.setNext(nd);
                    nd.setPrev(previous);
                    current.setPrev(nd);
                    nd.setNext(current);
                }

            }

        }


        public boolean delete(Friend value) {
            // traverse list and look for value
            Node current = head;
            Node previous = null;

            // have not reached the end of the list and have not found value
            while (current != null && current.getData() != value) {
                previous = current;
                current = current.getNext();
            }

            if (current == null) // did not find value
                return false;
            else if (previous == null) // found value at the beginning
            {
                // delete the first value in the list
                head = head.getNext();
                return true;
            } else // found value in the middle or at the end of the list
            {
                // delete value
                previous.setNext(current.getNext());
                return true;
            }

        }

        public void updateCellPhone() {

            Node current = head;
            String name;
            while (current != null) {


                current = current.getNext();
            }
        }

        public ArrayList<Friend> selectAll(char chars) {

            ArrayList<Friend> charNum = new ArrayList<>();
            Node current = head;
            while (current != null) {

                if (current.getData().convert().charAt(0) == chars) ;
                {
                    charNum.add(current.getData());
                }
                current = current.getNext();
            }
            return charNum;
        }

        public String toString() {
            String result = "";
            Node current = head;
            while (current != null) {
                result += current.getData() + " ";
                current = current.getNext();
            }
            return result;
        }

        public String toStringInReverse() {

            String result = "";
            Node current = head;

            // empty list
            if (head == null)
                return result;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            while (current != null) {
                result += current.getData() + " ";
                current = current.getPrev();
            }
            return result;
        }
    }

