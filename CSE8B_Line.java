import java.awt.*;
import objectdraw.*;
import static java.lang.System.*;

public class CSE8B_Line extends Shape {
    private Point start;
    private Point end;

    public CSE8B_Line() {
    	start=new Point();
    	end=new Point();
    }

    public CSE8B_Line(Point start, Point end) {
        this.start=new Point(start);
        this.end=new Point(end);
    }

    public CSE8B_Line(CSE8B_Line line) {
        this.start=line.getStart();this.end=line.getEnd();
    }

    public Point getStart(){
    	return start;
    }
    
    public Point getEnd(){
    	return end;
    }
    
    public void move(int xDelta, int yDelta) {
        start.move(xDelta, yDelta);end.move(xDelta, yDelta);
    }

    @Override
    public String toString() {
        return "CSE8B_Line: "+start.toString()+"to "+end.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof CSE8B_Line){
        	if(start.equals(((CSE8B_Line)o).getStart())||
        			end.equals(((CSE8B_Line)o).getEnd())){
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
        Line line= new Line(this.getStart().getX(),this.getStart().getY(),
        		this.getEnd().getX(),this.getEnd().getY(), canvas);
        line.setColor(c);
    }
}
