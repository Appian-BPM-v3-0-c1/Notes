public class Rectangle {
    private String name;
    private int width;
    private int length;

    public Rectangle(){

    }


    public Rectangle(String name, int length, int width) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String toString(){
        return "Rectangle{" +
                "name = '" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';

    }

    //methods for finding area and perimeter

    public int findArea(){
        return(length*width);

    }
    public int findPerimeter(){
        return(length + length + width + width);
    }

    public boolean findArea(Rectangle[] arr, Comparator comparator) {
        if(findArea()< findArea()){
            return true;
        } else {
            return false;
        }
    }

    public boolean findPerimeter(Rectangle[] arr, Rectangle[] arr1, Comparator comparator, Comparator comparator1) {
        if(findPerimeter()< findPerimeter()){
            return true;
        } else {
            return false;
        }
    }
}

