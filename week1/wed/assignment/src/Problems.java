public class Problems {
    public int Easy(int a,int b) {
        return a + b;
    }
    public String Moderate(int a) {
        if (a % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
    public String FinalBoss(String s) {
        if (s.length() > 10) {
            return s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
        } else {
            return s;
        }
    }
}