package Practice;

//new class created for Photo
public class Photo {
    //new private variables created for type and size
    private String type;
    private int width;
    private int height;
    //right click below this line - generate - constructor - ctrl + click all choices - ok
    public Photo(String type, int width, int height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public void displayPhotoInfo(){
        System.out.print("The photo type is " + type);
    }
    public int totalArea(){
        //returns the value of the math to totalArea
        return width * height;

    }
}
