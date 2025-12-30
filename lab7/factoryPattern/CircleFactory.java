package lab7.factoryPattern;

public class CircleFactory extends ShapeFactory {
	public CircleFactory() {
		
	}
	@Override
	public Shape getShape() {
		return new Circle();
	}

}
