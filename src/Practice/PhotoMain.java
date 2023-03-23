package Practice;

public class PhotoMain
{
    public static void main(String[] args) {
        //create new object with set parameters called from the Photo class
        Photo photo1 = new Photo("Landscape",5,12);
        Photo photo2 = new Photo("Sea",2,6);
        Photo photo3 = new Photo("Mountains",18,2);
        Photo photo4 = new Photo("Animals",8,3);
        photo1.displayPhotoInfo();
        System.out.println(" the size is " + photo1.totalArea());
        photo2.displayPhotoInfo();
        System.out.println(" the size is " + photo2.totalArea());
        photo3.displayPhotoInfo();
        System.out.println(" the size is " + photo3.totalArea());
        photo4.displayPhotoInfo();
        System.out.println(" the size is " + photo4.totalArea());
    }
}
