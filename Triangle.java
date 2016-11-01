import java.awt.*;
import objectdraw.*;

public class Triangle extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle() {
        p1=new Point();
        p2=new Point();
        p3=new Point();
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1=new Point(p1);
        this.p2=new Point(p2);
        this.p3=new Point(p3);
    }

    public Triangle(Triangle tri) {
        this.p1=new Point(tri.getOne());
        this.p2=new Point(tri.getTwo());
        this.p3=new Point(tri.getThree());
    }

    public Point getOne(){
    	return p1;
    }
    
    public Point getTwo(){
    	return p2;
    }
    
    public Point getThree(){
    	return p3;
    }
    
    public void move(int xDelta, int yDelta) {
        p1.move(xDelta, yDelta);p2.move(xDelta, yDelta);p3.move(xDelta, yDelta);
    }

    @Override
    public String toString() {
        return "Triangle: "+p1.toString()+", "+p2.toString()+", "+p3.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Triangle){
        	if(p1.equals(((Triangle)o).getOne())||p2.equals(((Triangle)o).getTwo())
        			||p3.equals(((Triangle)o).getThree())){
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
        Line lineOne= new Line(this.getOne().getX(),this.getOne().getY(),
        		this.getTwo().getX(),this.getTwo().getY(), canvas);
        Line lineTwo= new Line(this.getOne().getX(),this.getOne().getY(),
        		this.getThree().getX(),this.getThree().getY(), canvas);
        Line lineThree= new Line(this.getTwo().getX(),this.getTwo().getY(),
        		this.getThree().getX(),this.getThree().getY(), canvas);
        lineOne.setColor(c);
        lineTwo.setColor(c);
        lineThree.setColor(c);
    }

}
