package kr.ac.kookmin.shape; 
 
 
public class Ellipse extends Shape{ 
 	 
 	protected int w; 
 	protected int h; 
 	 
 	public Ellipse(Point center, int w, int h){ 
 		    this.center = center; 
 			this.w = w; 
 			this.h = h; 
 	} 
 	 
         public Rectangle getBounds(){ 
 		return new Rectangle(center, w*2, h*2); 
    } 
         
         public int getSemiMajorAxis(){ 
         		return h > w ? h/2 : w/2; 
     } 
         public int getSemiMinorAxis(){ 
         		return h > w ? w/2 : h/2; 
     } 
 
 	@Override 
 	 	public void draw(Graphics g) { 
 		g.draw(this); 
 	} 
 	
 	@Override 
 	public String toString() { 
 		return "Ellipse"; 
 	} 
} 
