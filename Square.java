import java.awt.*;
import objectdraw.*;

public class Square extends ARectangle {
    private int side;

    public Square() {
        side=0;
    }

    public Square(int x, int y, int side) {
        super("",x,y);
        this.side=side;
    }

    public Square(Point upperLeft, int side) {
        super("",upperLeft);
        this.side=side;
    }

    public Square(Square square) {
        super(square);
        this.side=square.getSide();
    }
    
    private int getSide() {
		return side;
	}

	@Override
    public String toString() {
        return "Square: Upper Left Corner: "+super.toString()+"Sides: "+side;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Square){
        	if(super.equals(o)||side==((Square)o).getSide()){
        		return true;
        	}
        }
        return false;
    }

    public void draw(DrawingCanvas canvas, Color c, boolean fill) {
    	if(fill){
        	FilledRect sqaure=new FilledRect(super.getUL().getX(),super.getUL().getY(),side,side,canvas);
        	sqaure.setColor(c);
        }
    	else{
    		FramedRect sqaure=new FramedRect(super.getUL().getX(),super.getUL().getY(),side,side,canvas);
    	}
    }
}
