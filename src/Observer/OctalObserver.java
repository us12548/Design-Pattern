package Observer;
//�˽���
public class OctalObserver extends Observer{

	   public OctalObserver(Subject subject){
		   //�������洢���۲��߶�����Ϊ�˻�ȡ���۲��߱��������ֵ
	      this.subject = subject;
	      //���뵱ǰ������Ϊ�˵���update����
	     //Ϊ��ǰ������ӱ��۲��߶���ʱ��Ҳ���������۲��߼�����
	      this.subject.attach(this);
	   }

	   @Override
	   public void update() {
	     System.out.println( "Octal String: " 
	     + Integer.toOctalString( subject.getState() ) ); 
	   }
	}