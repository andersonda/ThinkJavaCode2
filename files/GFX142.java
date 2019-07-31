import java.util.Scanner;
import javax.swing.JFileChooser;
import java.awt.Graphics;
import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GFX142 {
  public static void main(String[] args) throws FileNotFoundException{
    // instead of specifying a path, we can use a built in file picker to pick a file!
    JFileChooser chooser = new JFileChooser();
    chooser.setFileFilter(new FileNameExtensionFilter("GFX142 files", "gfx142"));
    chooser.showOpenDialog(null);
    Scanner s = new Scanner(chooser.getSelectedFile());

    // first 2 integers of our .gfx142 file type are the width and height of the window
    int width = s.nextInt();
    int height = s.nextInt();


    // the DrawingPanel class simplifies drawing on a window
    DrawingPanel panel = new DrawingPanel(width, height);
    Graphics g = panel.getGraphics();

    // read in the drawing "commands" from the file while there are still more to read
    while(s.hasNext()){
      String command = s.next();
      if(command.equals("oval")){
        g.drawOval(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
      }
      else if (command.equals("rectangle")) {
        g.drawRect(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
      }
      else if (command.equals("color")) {
        g.setColor(new Color(s.nextInt(), s.nextInt(), s.nextInt()));
      }
    }
  }
}
