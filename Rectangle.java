import java.awt.*;
import objectdraw.*;

public class Rectangle extends ARectangle {
    private int width;
    private int height;

    public Rectangle() {
        width=0;height=0;
    }

    public Rectangle(int x, int y, int width, int height) {
        super("",x,y);
        this.width=width;this.height=height;
    }

    public Rectangle(Point upperLeft, int width, int height) {
        super("",upperLeft);
        this.width=width;this.height=height;
    }

    public Rectangle(Rectangle r) {
        super(r);
        this.width=r.getWidth();this.height=r.getHeight();
    }
    
    public int getWidth(){
    	return width;
    }
    
    public int getHeight(){
    	return height;
    }
    
    @Override
    public String toString() {
        return "Rectangle: Upper Left Corner: "+super.toString()+"Width: "+width+" Height: "+height;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Rectangle){
        	if(super.equals(o)||height==((Rectangle)o).getHeight()||width==((Rectangle)o).getWidth()){
        		return true;
        	}
        }
        return false;
    }

    public void draw(DrawingCanvas canvas, Color c, boolean fill) {
        if(fill){
        	FilledRect rectangle=new FilledRect(super.getUL().getX(),super.getUL().getY(),width,height,canvas);
        	rectangle.setColor(c);
        }
        else{
        	FramedRect rectangle=new FramedRect(super.getUL().getX(),super.getUL().getY(),width,height,canvas);
        }
    }
}
