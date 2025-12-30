package lab7.factoryPattern;

public class RectangleFactory extends ShapeFactory {
	public RectangleFactory() {
		
	}
	@Override
	public Shape getShape() {
		return new Rectangle();
	}

}
