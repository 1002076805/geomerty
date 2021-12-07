package by.bsu.geomerty.model;

import bsu.geomerty.model.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testArean(){
        Rectangle circle = new Rectangle(1,8,8,3);
        double arean = circle.calculateArean();
        Assert.assertEquals(35,arean,0.01);
    }

    @Test
    public void testAreanWrong(){
        Rectangle circle = new Rectangle(2,5,7,4);
        double arean = circle.calculateArean();
        Assert.assertEquals(3.14,arean,0.01);
    }

    @Test
    public void testPerimeter(){
        Rectangle circle = new Rectangle(1,4,6,5);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(8,perimeter,0.01);
    }

    @Test
    public void testPerimeterWrong(){
        Rectangle circle = new Rectangle(1,7,9,8);
        double perimeter = circle.calculatePerimeter();
        Assert.assertEquals(4,perimeter,0.01);
    }
}
