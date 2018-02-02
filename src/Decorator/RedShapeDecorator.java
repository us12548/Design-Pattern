package Decorator;

//extents�ؼ���ʵ�ּ̳�
public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);        
	   }

	   @Override
	   public void draw() {
		  //���ñ�������е�draw����
	      decoratedShape.draw();  
	      //��������չ�Ĺ���
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
	}