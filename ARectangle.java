import objectdraw.*;
import static java.lang.System.*;

public abstract class ARectangle extends Shape {
    private Point upperLeft;

    public ARectangle() {
        upperLeft=new Point();
    }

    public ARectangle(String name, int x, int y) {
        upperLeft=new Point(x,y);
    }

    public ARectangle(String name, Point upperLeft) {
        this.upperLeft=new Point(upperLeft);
    }

    public ARectangle(ARectangle r) {
        this.upperLeft=new Point(r.getUL());
    }

    public Point getUL(){
    	return upperLeft;
    }
    
    public void move(int xDelta, int yDelta) {
        upperLeft.move(xDelta, yDelta);
    }

    @Override
    public String toString() {
        return upperLeft.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof ARectangle){
        	if(upperLeft.equals(((ARectangle)o).getUL())){
        		return true;
        	}
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
