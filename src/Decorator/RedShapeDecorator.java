package Decorator;

//extents关键字实现继承
public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);        
	   }

	   @Override
	   public void draw() {
		  //调用被本身就有的draw功能
	      decoratedShape.draw();  
	      //被额外扩展的功能
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
	}