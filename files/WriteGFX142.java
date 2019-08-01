import java.io.PrintStream;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.io.FileNotFoundException;

public class WriteGFX142{
  public static void main(String[] args) throws FileNotFoundException{

    // copied from chapter 5: set the width and height to be half the screen size
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int width = d.width / 2;
    int height = d.height / 2;

    PrintStream f = new PrintStream("sample3.gfx142");
    f.println(width + " " + height);
    for (int x = 0; x + 100 <= width; x = x + 100) {
      if (x % 200 == 0) f.println("color 255 0 0");
      else f.println("color 0 0 255");
      for (int y = 0; y + 100 <= height; y = y + 100) {
        f.println ("oval "+x+" "+y +" 100 100");
      }
    }
    f.close();
  }
}
