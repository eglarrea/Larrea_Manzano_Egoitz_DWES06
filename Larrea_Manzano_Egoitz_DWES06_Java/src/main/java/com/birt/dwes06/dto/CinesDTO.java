package com.birt.dwes06.dto;

import java.io.Serializable;
import java.util.List;

public class CinesDTO implements Serializable{
    
	private int id;
    private String nombre;
    private String direccion;
    private String mail;
    private String telefono;
    private List<SalaDTO> salas;
    
    public CinesDTO(int id, String nombre, String direccion, String mail, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.mail = mail;
		this.telefono = telefono;
	}
    // Getters y Setters

    public List<SalaDTO> getSalas() {
        return salas;
    }

    public void setSalas(List<SalaDTO> salas) {
        this.salas = salas;
    }

    public int getId() {
        return id;
    }

     public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
   
    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }
}