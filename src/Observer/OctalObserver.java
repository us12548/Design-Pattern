package Observer;
//八进制
public class OctalObserver extends Observer{

	   public OctalObserver(Subject subject){
		   //本身对象存储被观察者对象是为了获取被观察者本身的属性值
	      this.subject = subject;
	      //传入当前对象是为了调用update方法
	     //为当前对象添加被观察者对象时，也把自身加入观察者集合中
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " 
	     + Integer.toOctalString( subject.getState() ) ); 
	   }
	}