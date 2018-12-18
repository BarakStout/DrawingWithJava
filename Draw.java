/**
 *  Barak Stout
 */
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Draw extends JComponent {

    // Size of frame
    public static final int HEIGHT = 1000;
    public static final int WIDTH = 1000; 

    public void paint(Graphics g) 
    {
        /*** <<< complete the code here! >>> 
         * For refrence:  
         *     g.drawLine(x1,y1,x2,y2) 
         *     g.drawRect(x,y,width,height)
         *     g.fillRect(x,y,width,height)
         *     g.drawOval(x,y,width,height)
         *     g.fillOval(x,y,width,height)
         *     g.drawArc(x,y,width,height,startAngle, arcAngle)
         *     g.fillArc(x,y,width,height,startAngle, arcAngle)
         *     g.drawString(str,x,y)
         *     g.setColor(new Color(R,G,B))
         */
         
         g.drawLine(30,30,250,250);
         g.fillOval(300,300,50,50);
         g.fillArc(50,50,300,100,0,150);

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

