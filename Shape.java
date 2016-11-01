import java.awt.*;
import objectdraw.*;
import static java.lang.System.*;

public abstract class Shape {
    private String name;

    public Shape() {
    	name="Shape";
    }

    public Shape(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        String s = "\n**********************************************************\n"
                + "This should never print. If it does print, then\n"
                + "you did not override equals() properly in class "
                + this.getClass().getName() + "\n"
                + "**********************************************************\n";

        System.out.println(s);

        return this == o;
    }

    public abstract void move(int xDelta, int yDelta);

    public abstract void draw(DrawingCanvas canvas, Color c, boolean fill);
}
