package com.javatpoint;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba1.stringHola;
import com.prueba2.stringMundo;  
  
public class Client {  
public static void main(String[] args)  {  
ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");  
stringHola cadena1 = (stringHola)context.getBean("holaBean");  
stringMundo cadena2 = (stringMundo)context.getBean("MundoBean");
System.out.println(cadena1.getCadena1("CLIENTE REMOTO")+""+cadena2.getMundo("HOLA REMOTO 2 "));  


}  
}  