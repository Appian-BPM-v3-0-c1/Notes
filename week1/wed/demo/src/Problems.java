public class Problems {
<<<<<<< HEAD
    public int easy (int a, int b) {
        return a + b;
    }
    public String moderate(int a) {
        if (a % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
    // public String finalBoss() {
    //
    // }
=======

    public int easy(int a, int b) {
        return a + b;
    }

    public String moderate(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public String hard(String s) {
        if (s.length() > 10) {
            return s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
        } else {
            return s;
        }
    }
>>>>>>> a80a60832bbe4576427b6dde33e9cacc40857ef5
}
