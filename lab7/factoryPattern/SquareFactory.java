package lab7.factoryPattern;

public class SquareFactory extends ShapeFactory {
	public SquareFactory() {
		
	}
	@Override
	public Shape getShape() {
		return new Square();
	}

}
