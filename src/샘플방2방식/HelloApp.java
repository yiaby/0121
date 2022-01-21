package »ùÇÃ¹æ2¹æ½Ä;

import java.beans.beancontext.BeanContext;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean bean;
		
		bean= new MessageBeanEn(); 
		bean.sayHello("kim sun dong");
		
		bean = new MessageBeanKr();
	    bean.sayHello("±è¼±µ¿");
	

	}}
