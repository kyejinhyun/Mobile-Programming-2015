package kr.ac.kookmin.shape; 
 
 
public class Rectangle extends Shape{ 
 	protected int w; 
 	protected int h; 
 	 
 	public Rectangle(Point center, int w, int h) { 
		this.center=center; 
 		this.h=h; 
 		this.w=w; 
 	} 
 	 
 	public Rectangle getBounds() { 
 		return this; 
 	} 
 	public int getHeight() { 
 		return h; 
 	} 
 	public int getWidth() { 
 		return w; 
 	} 
 	@Override 
 	public void draw(Graphics g) { 
 		g.draw(this); 
 	} 
 	@Override 
 	public String toString() { 
 		return "Rectangle"; 
 	} 
} 
