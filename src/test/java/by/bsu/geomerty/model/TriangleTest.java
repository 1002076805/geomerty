package by.bsu.geomerty.model;

import bsu.geomerty.model.Circle;
import bsu.geomerty.model.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testArean(){
        Triangle triangle = new Triangle(6,7,4,5,6,7);
        double arean = triangle.calculateArean();
        System.out.println(arean);
        Assert.assertEquals(2,arean,0.01);
    }

    @Test
    public void testAreanWrong(){
        Triangle triangle = new Triangle(9,4,3,5,6,7);
        double arean = triangle.calculateArean();
        Assert.assertEquals(2,arean,0.1);
    }

}
