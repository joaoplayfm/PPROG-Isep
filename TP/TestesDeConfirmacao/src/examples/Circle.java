package examples;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape{

    private int p;

    public Circle(int p){
        this.p = p;
    }
    public Circle(){
        super();
        this(1);
    }

}
