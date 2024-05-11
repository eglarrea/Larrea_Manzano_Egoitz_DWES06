package com.birt.dwes06.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.birt.dwes06.dao.PeliculaDao;
import com.birt.dwes06.entity.Cines;

import jakarta.persistence.EntityManager;

@Repository
public class PeliculaDaoImpl implements PeliculaDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Cines> findByTitulo(String titulo) {
        String hql="select c.id , nombre , direccion, mail, telefono, b.idSala, b.pelicula,b.aforo,b.es3d from Cines c  left join Sala b on c.id= b.cines.id where pelicula Like :titulo";

        Session currentSession=entityManager.unwrap(Session.class);
        Query query= currentSession.createQuery(hql).setParameter("titulo", "%" + titulo + "%");
       
        
        List<Cines> results = query.getResultList(); 
        return results;
    }
}
