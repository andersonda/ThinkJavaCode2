import java.awt.*;
import javax.swing.*;

public class ResizeDrawing {
    public static void draw(Graphics g, int width, int height) {
      g.drawOval(x, 0, 100, 100);
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
