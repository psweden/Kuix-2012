/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author mobisma
 */
class PointerCanvas extends Canvas {
	String action = "Press Pointer!";
	int x;
	int y;

	public void pressPointer (int x, int y) {
		action = "Pointer Pressed";
		this.x = x;
		this.y = y;
		repaint ();
	}

	public void releasePointer (int x, int y) {
		action = "Pointer Released";
		this.x = x;
		this.y = y;
		repaint ();
	}
	
	public void dragPointer (int x, int y) {
		action = "Pointer Repeated";
		this.x = x;
		this.y = y;
		repaint ();
	}

	public void paint (Graphics g) {
		g.setGrayScale (255);
		g.fillRect (0, 0, getWidth(), getHeight());
		g.setGrayScale (0);
		g.drawString (action + " " + x + "/" + y, 0, 0, Graphics.TOP|Graphics.LEFT);
		g.drawLine (x-4, y, x+4, y);
		g.drawLine (x, y-4, x, y+4);
	}
        public PointerCanvas(){
            
        }
}