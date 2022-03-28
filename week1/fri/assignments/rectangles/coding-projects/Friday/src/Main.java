import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Rectangle rectangle = new Rectangle();
        Main main = new Main();
        Rectangle[] arr = new Rectangle[10];
        Scanner scan = new Scanner(System.in);
        Comparator comparator = new Comparator();

        //main.findRectangles(10, 20);

        for (int i = 0; i < 3; i++){
            System.out.println("Enter in name, width, and length:");
            rectangle = new Rectangle(scan.next(), scan.nextInt(), scan.nextInt());
            arr[i] = rectangle;
        }

        System.out.println(rectangle.findArea(arr,comparator));
        System.out.println(rectangle.findPerimeter(arr, arr ,comparator, comparator));






    }


    public static void findMax(){

    }

    /*public void findRectangles(int length, int width){
        for (int i = 0; i < length; i++){
            for (int k = 0; k < width; k++){
                System.out.println(length * width);

            }


        }


    }

*/

}
