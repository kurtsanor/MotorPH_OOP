
package motorphpayroll.customcomponents;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class CustomPanel extends JPanel{ //Gradient Color for panels
        
        public Color primary;
        public Color secondary;
    
        public CustomPanel (Color primary, Color secondary) {
            this.primary = primary;
            this.secondary = secondary;
        }
        
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            
//            Color Color1 = new Color(202,101,51);
//            Color Color2 = new Color(255,153,102);
            GradientPaint gp = new GradientPaint(0,0,primary,200,height,secondary);
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);
            
        }
    }
