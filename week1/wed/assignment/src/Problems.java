public class Problems {
    public int easy(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public String moderate(int c) {
        if (c % 2 == 0) {
            return "Even";
    } else {
        return "Odd";
        }
    }

    public String hard(String s) {
        if (s.length() > 10) {
            return s.charAt(0) + String.valueOf(s.length() -2) + s.charAt(s.length() -1);
        }else {
            return s;
        }
    }
}
