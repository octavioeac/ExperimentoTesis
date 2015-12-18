package com.servicio;

import com.rmi.ObjetoRequest;
import com.rmi.objetoResponse;
import com.rmi.servicioObjeto;

public class servicioObjetoImpl implements servicioObjeto {

	public objetoResponse getObjeto(ObjetoRequest request) {
	
		objetoResponse obj=new objetoResponse();
		obj.setCadena(request.getId()+"cadena1->"+request.getProceso());
		obj.setCadena2(request.getId()+"cadena2 .i.:  "+request.getProceso());
		obj.setCadena1(request.getId()+"cadena3:: "+request.getProceso());
		
		
		
		return obj;
	}

}
