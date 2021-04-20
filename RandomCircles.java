package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;


public class RandomCircles extends GraphicsProgram {
       	
       	private static final int MinRadius = 6;
       	private static final int MaxRadius = 80;
       	
public void run() {
	for(int i=0; i<10; i++ ) {
		drawCircle();
	}
}

private RandomGenerator rgen = RandomGenerator.getInstance();

private void drawCircle() {
	double radius = rgen.nextDouble(MinRadius, MaxRadius);
	double x = rgen.nextDouble(0, getWidth() - radius*2);
	double y = rgen.nextDouble(0, getHeight() - radius*2);
	GOval circle = new GOval(x, y, radius*2, radius*2);
	circle.setFilled(true);
	circle.setColor(rgen.nextColor());
	add(circle);
}
}


