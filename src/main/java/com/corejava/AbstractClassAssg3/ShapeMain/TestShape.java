package com.corejava.AbstractClassAssg3.ShapeMain;

public class TestShape {
	public static void main(String[] args)
	{
		//Create object of line and call abstract method of Shape 
		Line l = new Line() ;
		l.draw();
		
		//Create object of Rectangle and call abstract method of Shape 
		Rectangle r = new Rectangle() ;
		r.draw();
		
		//Create object of Cube and call abstract method of Shape 
		Cube c = new Cube() ;
		c.draw();
	}
}
