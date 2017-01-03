package drawing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Shape {

	int width;
	int height;
	Color color;
	
	public Rectangle(Point origin, int width, int height, Color color){
		this.origin = origin;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public boolean isOn(Point p) {
		return(p.x > origin.x && p.x < origin.x+width && p.y > origin.y && p.y < origin.y+height);
	}

	@Override
	public void setLabel(String label) {

	}

	@Override
	public String getLabel() {
		return null;
	}

	@Override
	public Shape clone() {
		Rectangle rectangle = new Rectangle(this.origin,this.width,this.height,this.color);
		return rectangle;
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(origin.x, origin.y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(origin.x, origin.y, width, height);
	}
}