import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:/Users/jntuhit/Desktop/java programs/lab programs");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}