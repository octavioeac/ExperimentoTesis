package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba1.stringHola;
import com.prueba2.stringMundo;

public class Hilos implements Runnable{

	@Override
	public void run() {
			  try
	      {
	        for (int i=0 ;i<10;i++)
	        {
	      	  System.out.println("My thread is in running state.");  
	  		ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");  
	  		stringHola cadena1 = (stringHola)context.getBean("holaBean");  
	  		stringMundo cadena2 = (stringMundo)context.getBean("MundoBean");
	  		System.out.println(cadena1.getCadena1("CLIENTE REMOTO")+""+cadena2.getMundo("HOLA REMOTO 2 "));		
	  	
	          System.out.println("Printing the count " + i);
	          Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("mythread run is over" );
	   }
	
	
	public static void main(String args[]){  
		Hilos obj=new Hilos();  
	     Thread tobj =new Thread(obj);
	     //tobj.getState();
	     System.out.println( tobj.getState());
	     tobj.start();  
	 } 
	

}
