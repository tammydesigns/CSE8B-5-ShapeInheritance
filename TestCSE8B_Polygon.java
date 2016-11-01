import java.awt.*;
import java.util.Random;

import objectdraw.*;

public class TestCSE8B_Polygon extends ActiveObject
	{
	private static final int DELAY = 600;

	private DrawingCanvas canvas;

	public TestCSE8B_Polygon( DrawingCanvas canvas ){
		this.canvas = canvas;
		    start();			
	}

	public void run(){
		int xCenter = canvas.getWidth() / 2;
		int yCenter = canvas.getHeight() / 2;

		//Simple Triangle Test (Copied from House Test)
		Point p1=new Point( xCenter - 100, yCenter );
		Point p2=new Point( xCenter + 100, yCenter );
		Point p3=new Point( xCenter, yCenter - 100 );
		Point[] ps={p1,p2,p3};
		CSE8B_Polygon polygon=new CSE8B_Polygon(ps);
		polygon.draw( canvas, null, true );
		pause( DELAY );
		
		//Completely Random Test
		Point[] ps2 = new Point[20];
		Random random=new Random();
		for(int i=0;i<20;i++){
			ps2[i]=new Point(xCenter-random.nextInt(10)*10,yCenter-random.nextInt(10)*10);
		}
		CSE8B_Polygon polygon2=new CSE8B_Polygon(ps2);
		polygon2.draw(canvas, null, true);
		pause(DELAY);
		
		//Multiple Points on Sqaure Test
		int xLoc=xCenter;
		int yLoc=yCenter;
		int Angle=2;
		Point[] ps3=new Point[100];
		for(int i=0;i<100;i++){
			ps3[i]=new Point(xLoc,yLoc);
			xLoc+=(i<50?8:-8);
			yLoc+=((i<25||(i>=75&&i<100))?8:-8);
		}
		CSE8B_Polygon polygon3=new CSE8B_Polygon(ps3);
		polygon3.draw(canvas, null, true);
		pause(DELAY);
	}
	
}

//TestPolygonController.java
/*
import objectdraw.*;

public class TestPolygonController extends WindowController{
	public void begin(){
		new TestCSE8B_Polygon( canvas );
	}
}*/
