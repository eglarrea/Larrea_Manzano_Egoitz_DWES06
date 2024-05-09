package com.birt.dwes06.dao;

import java.util.List;

import com.birt.dwes06.entity.Cines;

public interface PeliculaDao {

	public List<Cines> findByTitulo(String titulo);
}
