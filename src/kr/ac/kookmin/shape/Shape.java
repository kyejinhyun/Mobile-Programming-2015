package kr.ac.kookmin.shape; 
 
 
public abstract class Shape { 
         protected Point center; 
 
         public Point getCenter() { 
         	return center; 
         } 
 
 		public abstract Rectangle getBounds(); 
 		public abstract void draw(Graphics g); 
} 
