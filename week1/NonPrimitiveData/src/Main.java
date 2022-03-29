public class Main {
    public static void main(String[] args) {
        //NonPrimitive datatypes
        String str = "test";
        System.out.println("String is: "+ str);
        String str1 =new String("test");
        System.out.println("Another String: "+str1);

        int arr[];
        arr = new int[2];
        arr[0] =3;
        arr[1] = 4;
        //arr[2] = 2;
        System.out.println(arr);
        System.out.println(arr[0]);
    }

}
