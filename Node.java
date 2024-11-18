    public class Node {
        private Friend d1;
        private  Node previous;
        private Node next;


        public Node(Friend value )
        {
            setData( value );
        }

        public Friend getData( )
        {
            return d1;
        }

        public Node getNext( )
        {
            return next;
        }
        public Node getPrev( )
        {
            return previous;
        }
        public void setPrev( Node nd ){
            previous = nd;
        }
        public void setData( Friend newData )
        {
            d1 = newData;
        }

        public void setNext( Node nd )
        {
            next = nd;
        }
    }
