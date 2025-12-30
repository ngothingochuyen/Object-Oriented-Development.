package lab7.factoryPattern;

public class Application {
	public static void main(String[] args) {
		ShapeFactory factory = new CircleFactory(); //yêu cầu
		Shape shape = factory.getShape(); //thực hiện yêu cầu
		shape.draw(); //kết quả
		ShapeFactory factory1 = new RectangleFactory();
		Shape shape1 = factory1.getShape();
		shape1.draw();
		ShapeFactory factory2 = new SquareFactory();
		Shape shape2 = factory2.getShape();
		shape2.draw();
	}
}
