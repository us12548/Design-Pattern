package Decorator;
//���������Ŀ����Ϊ���ýӿڵ�draw���Ե���
public abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }
	  //���õ�ǰ�����draw���ǵ��ô������Ķ����draw
	   public void draw(){
	      decoratedShape.draw();
	   }    
	}