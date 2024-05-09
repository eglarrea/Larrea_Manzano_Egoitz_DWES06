package com.birt.dwes06.bean;

import java.io.Serializable;

public class Respuesta implements Serializable{
	
	private String statusCode;
    protected boolean error;
    protected String mesanjeError;
    protected String respuesta;
    
    public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMesanjeError() {
		return mesanjeError;
	}
	public void setMesanjeError(String mesanjeError) {
		this.mesanjeError = mesanjeError;
	}
	
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
}
