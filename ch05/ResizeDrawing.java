import java.awt.*;
import javax.swing.*;

public class ResizeDrawing {
    public static void draw(Graphics g, int width, int height) {
      // g.drawOval(0, 0, 100, 100); // circle in upper left corner of window
      // g.drawOval(width / 2, height / 2, 100, 100); // circle with upper left "corner" in center of window
      // g.drawOval(width / 2 - 50, height / 2 - 50, 100, 100); // circle with center in center of window

      // draw a line of circles (using while loop)
      // int x = 0;
      // while (x + 100 <= width) {
      //    g.drawOval(x, 0, 100, 100);
      //   x += 10;
      // }

      // draw a line of circles (using for loop)
      for(int i = 0; i + 100 <= width; i += 10){
        g.drawOval(i, 0, 100, 100);
      }

      // draw a line of circles at bottom
      for(int i = 0; i + 100 <= width; i += 10){
        g.drawOval(i, height - 100, 100, 100);
      }

      // draw a line of circles on the left side
      for(int i = 0; i + 100 <= height; i += 10){
        g.drawOval(0, i, 100, 100);
      }

      // draw a line of circles on the right side
      for(int i = 0; i + 100 <= height; i += 10){
        // to skip every third circle: if(i % 3 == 0) continue;
        g.drawOval(width - 100, i, 100, 100);
      }
    }

    // Leave the main method alone! It just sets up the drawing window for you.
    public static void main(String[] args) {
        JFrame window = new JFrame("Graphics window");
        window.setLocationByPlatform(true);
        @SuppressWarnings("serial")
        final JPanel panel = new JPanel() {
            protected void paintComponent(Graphics gx) {
                Graphics2D g = (Graphics2D) gx;
                int width = getWidth(), height = getHeight();
                g.clearRect(0, 0, width, height);
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g.setBackground(Color.WHITE);
                g.setColor(Color.BLACK);
                draw(g, width, height);
            }
        };
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        window.setSize(d.width / 2, d.height / 2);
        window.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        window.setContentPane(panel);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
