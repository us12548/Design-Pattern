package Decorator;
//创建此类的目的是为了让接口的draw可以调用
public abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }
	  //调用当前对象的draw就是调用传进来的对象的draw
	   public void draw(){
	      decoratedShape.draw();
	   }    
	}