import java.awt.*;
import objectdraw.*;

public class CSE8B_Polygon extends Shape {
    private Point points[];

    public CSE8B_Polygon() {
        points=new Point[0];
    }

    public CSE8B_Polygon(Point points[]) {
    	this.points=new Point[points.length];
        for(int i=0;i<points.length;i++){
        	this.points[i]=points[i];
        }
    }

    public CSE8B_Polygon(CSE8B_Polygon p) {
    	this.points=new Point[p.getSides()];
        for(int i=0;i<points.length;i++){
        	this.points[i]=p.getPoints(i);
        }
    }

    public void move(int xDelta, int yDelta) {
        for(int i=0;i<points.length;i++){
        	points[i].move(xDelta, yDelta);
        }
    }

    public Point getPoints(int number){
    	return points[number];
    }
    
    public int getSides(){
    	return points.length;
    }
    
    public void draw(DrawingCanvas canvas, Color c, boolean fill) {
    	Line[] lines=new Line[points.length];
        for(int i=0;i<points.length-1;i++){
        	lines[i]=new Line(points[i].getX(),points[i].getY(),points[i+1].getX(),points[i+1].getY(),canvas);
        }
        lines[points.length-1]=new Line(points[points.length-1].getX(),points[points.length-1].getY(),points[0].getX(),points[0].getY(),canvas);
    }

    public String toString() {
    	return "CSE8B_Polygon: sides: "+this.getSides();
    }

    public boolean equals(Object o) {
        if(o instanceof CSE8B_Polygon){
        	try{
        		for(int i=0;i<points.length;i++){
        			if(((CSE8B_Polygon)o).getPoints(i)!=this.getPoints(i)){
        				return false;
        			}
        		}
        	}
        	catch(ArrayIndexOutOfBoundsException e){
        		return false;
        	}
        	return true;
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }
}

