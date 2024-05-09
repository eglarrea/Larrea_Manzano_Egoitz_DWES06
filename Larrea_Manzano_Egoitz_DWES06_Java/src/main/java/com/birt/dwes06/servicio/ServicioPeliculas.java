package com.birt.dwes06.servicio;

import java.util.List;

import com.birt.dwes06.dto.CinesDTO;
import com.birt.dwes06.entity.Cines;

public interface ServicioPeliculas {

	public List<CinesDTO> findByPelicula(String titulo);
}
