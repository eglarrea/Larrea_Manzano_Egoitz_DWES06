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
		int ant=0;
		CinesDTO dto=null;
		List<SalaDTO> salas=null;
		for (Object result : peliculas) {
			Object[] objectArray = (Object []) result;
			int id = ((Integer) objectArray[0]).intValue();
			
			 if (ant != id) {
				   if (dto != null) {
			            dto.setSalas(salas);
			            cines.add(dto);
			        }
				 dto= new CinesDTO();
				 dto.setId((Integer) objectArray[0]);
				 dto.setNombre((String)objectArray[1]);
				 dto.setMail((String)objectArray[2]);
				 dto.setDireccion((String)objectArray[3]);
				 dto.setTelefono((String)objectArray[4]);
				 salas= new ArrayList<SalaDTO>();
				 ant = id;
			}
			 SalaDTO  salaDto= new SalaDTO();
			 salaDto.setIdSala(((Long)objectArray[5]));
			 salaDto.setPelicula(((String)objectArray[6]));
			 salas.add(salaDto);
	      
		}
		if (dto != null) {
		    dto.setSalas(salas);
		    cines.add(dto);
		}
		return cines;
	}

}
