package com.birt.dwes06.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birt.dwes06.dao.PeliculaDao;
import com.birt.dwes06.dto.CinesDTO;
import com.birt.dwes06.dto.SalaDTO;
import com.birt.dwes06.entity.Cines;
import com.birt.dwes06.servicio.ServicioPeliculas;

@Service
public class ServicioPeliculasImp implements ServicioPeliculas {
	@Autowired
	private PeliculaDao peliculaDao;
	
	@Override
	public List<CinesDTO> findByPelicula(String titulo) {
		List<Cines> peliculas = peliculaDao.findByTitulo(titulo);
		List<CinesDTO> cines= new ArrayList<CinesDTO>();
		CinesDTO dto=null;
		List<SalaDTO> salas=null;

		int ant=0;
		for (Object result : peliculas) {
			Object[] objectArray = (Object []) result;
			int id = ((Integer) objectArray[0]).intValue();
			
			 if (ant != id) {
				   if (dto != null) {
			            dto.setSalas(salas);
			            cines.add(dto);
			        }
				 dto= new CinesDTO((Integer) objectArray[0],(String)objectArray[1],(String)objectArray[2],(String)objectArray[3],(String)objectArray[4]);
				 salas= new ArrayList<SalaDTO>();
				 ant = id;
			}
			
			 SalaDTO  salaDto= new SalaDTO((Long)objectArray[5],(String)objectArray[6],(Integer)objectArray[7],(Boolean)objectArray[8]);
			 salas.add(salaDto);
	    }
		if (dto != null) {
		    dto.setSalas(salas);
		    cines.add(dto);
		}
		return cines;
	}

}
