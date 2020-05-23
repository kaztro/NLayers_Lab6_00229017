package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Estudiante;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO {
	
	@PersistenceContext(unitName="capas")
	private EntityManager entityManager;

	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.estudiante");
		List<Estudiante> resultset = entityManager.createNativeQuery(sb.toString(), Estudiante.class).getResultList();
		
		return resultset;
	}

	@Override
	@Transactional
	public void insert(Estudiante estudiante) throws DataAccessException {
		entityManager.persist(estudiante);
		
	}

}