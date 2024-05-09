package com.birt.dwes06.dto;

public class SalaDTO {
    private Long idSala;
    private Boolean es3d;
    private String pelicula;
    private Integer aforo;
  //  private CinesDTO cines;

    // Getters y setters...

  /*  public CinesDTO getCine() {
        return cines;
    }

    public void setCine(CinesDTO cines) {
        this.cines = cines;
    }*/

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