package Model.test20;
//标签类通常冗长且低性能，更多的是使用类层次结构去表示。当我们遇到一个标签域的现有类时，应该将他重构为一个类层次。
public abstract class Figure {
	abstract double area();
}
class Circle extends Figure{
	final double radius;
	Circle(double radius) {this.radius=radius;}
	@Override
	double area() {
		return (Math.PI*(radius*radius));
	}
}
class Rectangle extends Figure{
    final double length;
    final double width;
    Rectangle(double length,double width) {
    	this.length=length;
    	this.width=width;
	}
	@Override
	double area() {
		return length*width;
	}
}