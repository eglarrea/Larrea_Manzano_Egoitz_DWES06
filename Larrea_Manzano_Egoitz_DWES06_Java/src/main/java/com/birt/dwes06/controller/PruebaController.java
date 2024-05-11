package com.birt.dwes06.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.birt.dwes06.bean.Respuesta;
import com.birt.dwes06.dto.CinesDTO;
import com.birt.dwes06.servicio.ServicioPeliculas;
import com.birt.dwes06.utils.Utilidades;
import org.slf4j.Logger;

@RestController
@RequestMapping("/api")
public class PruebaController {
	@Autowired
	private ServicioPeliculas servicioPeliculas;
	
	 Logger logger = LoggerFactory.getLogger(PruebaController.class);
	
	@GetMapping("/datos")
	@ResponseBody
	public ResponseEntity<Respuesta> getDatos(@RequestParam String pelicula) {
		logger.info("Entra en la llamada externa");
		Respuesta respuesta= new Respuesta();
		respuesta.setStatusCode(HttpStatus.OK.toString());
		if(null!=pelicula && !pelicula.trim().isEmpty()) {
			List<CinesDTO> lista=servicioPeliculas.findByPelicula(pelicula);
			if (lista != null && !lista.isEmpty()) {
				respuesta.setRespuesta(Utilidades.converToJson(lista.toArray()));
			}else {
				respuesta.setMesanjeError("No sé ha encontrado ningún cine con ese titulo de pelicula");
			}
		}else {
			respuesta.setError(true);
			respuesta.setMesanjeError("La búsqueda no se puede realizar porque no viene la pelicula a buscar");
		}
		ResponseEntity<Respuesta> reponse =new ResponseEntity<Respuesta>(respuesta, HttpStatus.OK);
		return reponse;
	}
}
