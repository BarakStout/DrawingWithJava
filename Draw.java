/**
 *  Barak Stout
 */
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Draw extends JComponent {

    // Size of frame
    public final int HEIGHT = 500;
    public final int WIDTH = 500; 

    public void paint(Graphics g) 
    {
        /*** <<< complete the code here! >>> 
         * The command g.drawLine(x1,y1,x2,y2)
         * will draw a line from (x1,y1) to (x2,y2)
         */
    }

    /*** DO NOT TOUCH ***/
    public static void main(String[] a) 
    {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(HEIGHT, WIDTH);
        f.getContentPane().add(new Draw());
        f.setVisible(true);
    }
}

