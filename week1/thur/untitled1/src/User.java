package models;

    public class User {
        private String name;
        private String breed;
        private String color;
        private String size;
        private String hair;


        public User(name, breed, color, size, hair) {
            this.name = name;
            this.breed = breed;
            this.color = color;
            this.size = size;
            this.hair = hair;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", breed='" + breed + '\'' +
                    ", color='" + color + '\'' +
                    ", size='" + size + '\'' +
                    ", hair='" + hair + '\'' +
                    "}';
        }

        public String getname() {
            return name;
        }

        public String setname(String name) {
            this.name = name;
        }

        public String getbreed() {
            return breed;
        }

        public String setbreed(String breed) {
            this.breed = breed;
        }

        public String getcolor() {
            return color;
        }

        public String setcolor(String color) {
            this.color = color;
        }

        public String getsize() {
            return size;
        }

        public String setsize(String size) {
            this.size = size;
        }

        public String gethair() {
            return hair;
        }

        public String sethair(String hair) {
            this.hair = hair;
        }
    }
}
