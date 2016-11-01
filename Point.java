import static java.lang.System.*;
public class Point {
    private int x;
    private int y;

    public Point() {
        x=0;y=0;
    }

    public Point(int x, int y) {
        this.x=x;this.y=y;
    }

    public Point(Point point) {
        this.x=point.getX();this.y=point.getY();
    }

    public int getX(){
    	return x;
    }
    
    public int getY(){
    	return y;
    }
    
    void setX(int x){
    	this.x=x;
    }
    
    void setY(int y){
    	this.y=y;
    }
    
    public void move(int xDelta, int yDelta) {
        x+=xDelta;y+=yDelta;
    }

    @Override
    public String toString() {
        return "Point:("+x+","+y+") ";
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Point){
        	if(this.x==((Point) o).getX()||this.y==((Point)o).getY()){
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
