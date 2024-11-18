public class Friend {

        private String cellphone;
        private String name;

    public Friend(String cellphone, String name) {
            this.cellphone = cellphone;
            this.name = name;
        }

        public int compareTo (Friend friend){
            return this.name.compareTo(friend.name);
        }

        public String convert () {
            return name;
        }
    }

