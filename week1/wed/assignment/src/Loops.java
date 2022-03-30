import sun.java2d.windows.GDIBlitLoops;

public class Loops {

    int[] numArr = new int[]{1, 2, 3, 4};
    String[] stringArr = {"ant", "dog", "cat", "fish"};

    public Loops() {
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }
    }
}