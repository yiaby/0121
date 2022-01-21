package 샘플방2방식;

public class MessageBeanKr implements MessageBean {

	   @Override   //"약속"의 의미 => ~해야 한다.
	   public void sayHello(String name) {
	      System.out.println("안녕하세요, " + name + "님");
	      
	      
	   }

	}