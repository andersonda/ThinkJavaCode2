public class HiClass{
  public static void main(String[] args) throws FileNotFoundException {
    // Create a File object for C:\Users\Default\Documents\hiclass.txt
    File notepad = new File("C:\\Users\\Default\\Documents\\hiclass.txt"); // replace this with a path
    System.out.println(notepad.exists()); // True if file exists
    System.out.println(notepad.length()); // Length of file in bytes
    // Read all the lines of the file
    Scanner s = new Scanner(notepad);
    while (s.hasNextLine()) { // As long as there are more lines to read
      String line = s.nextLine(); // Read the next line
      System.out.println(line); // Print it out
    }
  }
}
