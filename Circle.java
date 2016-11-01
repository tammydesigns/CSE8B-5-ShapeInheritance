import java.awt.*;
import objectdraw.*;
import static java.lang.System.*;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle() {
        center=new Point();radius=0;
    }

    public Circle(Point center, int radius) {
        this.center=new Point(center);
        this.radius=radius;
    }

    public Circle(Circle c) {
        this.center=new Point(c.getCenter());
        this.radius=c.getRadius();
    }

    public Point getCenter(){
    	return center;
    }
    
    public int getRadius(){
    	return radius;
    }
    
    public void move(int xDelta, int yDelta) {
        center.move(xDelta, yDelta);
    }

    @Override
    public String toString() {
        return "Circle: Center: "+center.toString()+"; Radius: "+radius;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Circle){
        	if(center.equals(((Circle)o).getCenter())||radius==((Circle)o).getRadius()){
        		return true;
        	}
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public void draw(DrawingCanvas canvas, Color c, boolean fill) {
        if(fill){
        	FilledOval circle=new FilledOval(center.getX()-radius,center.getY()-radius,2*radius,2*radius,canvas);
        	circle.setColor(c);
        }
        else{
        	FramedOval circle=new FramedOval(center.getX()-radius,center.getY()-radius,2*radius,2*radius,canvas);
        }
    }
}
