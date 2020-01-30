import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class NotCheckers {
	public static void draw(Graphics g, int width, int height) {
		int rows = 10;
		int columns = 10;

		int size = drawBoard(g, width, height, rows, columns);
		drawPiece(g, Color.BLUE, size, rows, columns, 0, 0);
		drawPiece(g, Color.PINK, size, rows, columns, 3, 4);
		drawPiece(g, Color.CYAN, size, rows, columns, 8, 8);
		drawPiece(g, Color.YELLOW, size, rows, columns, 2, 9);
		drawPiece(g, Color.RED, size, rows, columns, 9, 3);
		drawPiece(g, Color.MAGENTA, size, rows, columns, 5, 5);
		drawPiece(g, Color.MAGENTA, size, rows, columns, 5, 5);
	}

	/**
	 *	Draws a rows x columns checkerboard and returns the size of each cell
	 *
	 * @param g 		The graphics context we are drawing on
	 * @param width		the width of the window
	 * @param height	the height of the window
	 * @param rows			the number of rows of the checkerboard
	 * @param columns			the number of columns of the checkerboard
	 * @return the computed size of each cell
	 */
	public static int drawBoard(Graphics g, int width, int height, int rows, int columns){
		// first, calculate how tall each checkerboard square would need to be to fill the window vertically
		int cellHeight = height / rows; // window height divided by # rows

		// next, calculate how wide each checkerboard square would need to be to fill the window horizontally
		int cellWidth = width / columns; // window width divided by # columns

		// to make sure the checkerboard fits both vertically and horizontally, pick the smaller of these values
		int size = Math.min(cellHeight, cellWidth);

		// draw each row of the checkerboard
		for(int y = 0; y < size * rows; y += size){

			// even rows (0, 2, 4, etc) start with a black square, odd rows start with a white square
			if(y % (2 * size) == 0){
				g.setColor(Color.BLACK);
			}
			else{
				g.setColor(Color.WHITE);
			}

			// draw all the cells in the current row
			for(int x = 0; x < size * columns; x += size){
				g.fillRect(x, y, size, size);
				// switch to the other color for the next cell
				if(g.getColor() == Color.BLACK){
					g.setColor(Color.WHITE);
				}
				else{
					g.setColor(Color.BLACK);
				}
			}
		}

		return size;
	}

	/**
	 * Draws a checkers piece (if x and y are within the boundaries of the checkerboard)
	 * @param g			The graphics context we are drawing on
	 * @param c 		The color of the piece
	 * @param size		The size of each checkers cell
	 * @param rows         The number of columns in the checkerboard
	 * @param columns         The number of rows in the checkerboard
	 * @param x			The desired x coordinate in the checkerboard
	 * @param y			The desired y coordinate in the checkerboard
	 * @return true if a piece was drawn, otherwise false
	 */
	public static boolean drawPiece(Graphics g, Color c, int size, int rows, int columns, int x, int y){
		// first, make sure (x, y) is a valid coordinate on the checkerboard
		if(x < 0 || x > columns || y < 0 || y > rows){
			return false;
		}
		else{
			// draw the piece!
			g.setColor(c);
			g.fillOval(x * size, y * size, size, size);

			return true;
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
				int width = getWidth();
				int height = getHeight();
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
