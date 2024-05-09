package com.birt.dwes06.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas")
public class Sala {
	 	@Id
	    @Column(name="idSala")
	    private Long idSala;

	    @Column(name="es3d")
	    private Boolean es3d;
	    @Column(name="pelicula")
	    private String pelicula;
	    @Column(name="aforo")
	    private Integer aforo;

	    @ManyToOne
	    @JoinColumn(name = "idCine")
	    private Cines cines;

	    // Getters y setters...

	    public Cines getCine() {
	        return cines;
	    }

	    public void setCine(Cines cines) {
	        this.cines = cines;
	    }

	    public Long getIdSala() {
	        return idSala;
	    }

	    public void setIdSala(Long idSala) {
	        this.idSala = idSala;
	    }

	    public Boolean getEs3d() {
	        return es3d;
	    }

	    public void setEs3d(Boolean es3d) {
	        this.es3d = es3d;
	    }

	    public String getPelicula() {
	        return pelicula;
	    }

	    public void setPelicula(String pelicula) {
	        this.pelicula = pelicula;
	    }

	    public Integer getAforo() {
	        return aforo;
	    }

	    public void setAforo(Integer aforo) {
	        this.aforo = aforo;
	    }
}