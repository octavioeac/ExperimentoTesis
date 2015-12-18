package com.javatpoint;  
import javax.xml.ws.Response;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.objetPrueba.ObjetoRequest;
import com.objetPrueba.objetoResponse;
import com.objetPrueba.servicioObjeto;
import com.prueba1.stringHola;
import com.prueba2.stringMundo;  
  
public class Client {  
public static void main(String[] args)  {  
ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");  
stringHola cadena1 = (stringHola)context.getBean("holaBean");  
stringMundo cadena2 = (stringMundo)context.getBean("MundoBean");
System.out.println(cadena1.getCadena1("CLIENTE REMOTO")+""+cadena2.getMundo("HOLA REMOTO 2 "));  

servicioObjeto obj=(servicioObjeto)context.getBean("objBean");

ObjetoRequest k=new ObjetoRequest();
k.setId("12121212");
k.setProceso("PROCESO 12");
objetoResponse reponse=obj.getObjeto(k);
System.out.println(reponse.getCadena());
System.out.println(reponse.getCadena1());
System.out.println(reponse.getCadena());



}  
}  