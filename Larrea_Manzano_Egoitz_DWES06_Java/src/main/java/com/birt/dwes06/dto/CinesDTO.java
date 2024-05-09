package com.birt.dwes06.dto;

import java.util.List;

import com.birt.dwes06.entity.Cines;

public class CinesDTO {
    @Override
	public String toString() {
		return "CinesDTO [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", mail=" + mail
				+ ", telefono=" + telefono + ", salas=" + salas + "]";
	}

	private int id;
    private String nombre;
    private String direccion;
    private String mail;
    private String telefono;
    private List<SalaDTO> salas;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public static CinesDTO fromEntity(Cines cine) {
    	CinesDTO dto = new CinesDTO();
        dto.setId(cine.getId());
        dto.setNombre(cine.getNombre());
        dto.setMail(cine.getMail());
        dto.setDireccion(cine.getDireccion());
        dto.setTelefono(cine.getTelefono());
        
        return dto;
    }
}