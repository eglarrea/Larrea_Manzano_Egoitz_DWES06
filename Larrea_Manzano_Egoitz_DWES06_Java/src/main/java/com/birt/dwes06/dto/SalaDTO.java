package com.birt.dwes06.dto;

import java.io.Serializable;

public class SalaDTO implements Serializable{
    private Long idSala;
    private String pelicula;
    private Integer aforo;
    private Boolean es3d;
  

    public SalaDTO(Long idSala,  String pelicula, Integer aforo, Boolean es3d) {
		super();
		this.idSala = idSala;
		this.pelicula = pelicula;
		this.aforo = aforo;
		this.es3d = es3d;
	}

	public Long getIdSala() {
        return idSala;
    }
  
    public Boolean getEs3d() {
        return es3d;
    }

    public String getPelicula() {
        return pelicula;
    }

    public Integer getAforo() {
        return aforo;
    }

}