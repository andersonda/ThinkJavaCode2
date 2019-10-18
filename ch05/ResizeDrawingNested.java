import java.awt.*;
import javax.swing.*;

public class ResizeDrawingNested {
    public static void draw(Graphics g, int width, int height) {
      // a single row
      // for(int x = 0; x + 100 <= width; x += 100){
      //   g.drawOval(x, 0, 100, 100);
      // }

      // a single row of red circles
      // g.setColor(Color.RED);
      // for(int x = 0; x + 100 <= width; x += 100){
      //   g.fillOval(x, 0, 100, 100);
      // }


      // fill window with white circles
      // for(int y = 0; y + 100 <= height; y += 100){
      //   for(int x = 0; x + 100 <= width; x += 100){
      //     g.drawOval(x, y, 100, 100);
      //   }
      // }

      // fill with circles increasing in hue, top to bottom, left to right
      // float hue = 0;
      // for (int x = 0; x + 100 < width; x = x + 100) {
      //   for (int y = 0; y + 100 < height; y = y + 100) {
      //     g.setColor(Color.getHSBColor(hue,1,1));
      //     g.fillOval(x, y, 100, 100);
      //     hue = hue + 1.0f / 64; // increase hue
      //   }
      // }

      // fill with circles increasing in hue, left to right, top to bottom
    //   float hue = 0;
    //   for (int y = 0; y + 100 < height; y = y + 100) {
    //     for (int x = 0; x + 100 < width; x = x + 100) {
    //       g.setColor(Color.getHSBColor(hue,1,1));
    //       g.fillOval(x, y, 100, 100);
    //       hue = hue + 1.0f / 64; // increase hue
    //     }
    //   }
    // }

    // fill with circles increasing in hue, left to right, top to bottom
    // this time, we make a "triangle" shape using the break statement
    float hue = 0;
    int stop = width;
    for (int y = 0; y + 100 < height; y = y + 100) {
      for (int x = 0; x + 100 < width; x = x + 100) {
        if(x + 100 >= stop) break;
        g.setColor(Color.getHSBColor(hue,1,1));
        g.fillOval(x, y, 100, 100);
        hue = hue + 1.0f / 64; // increase hue
      }
      stop -= 100;
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
