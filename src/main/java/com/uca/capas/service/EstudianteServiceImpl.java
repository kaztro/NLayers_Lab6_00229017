package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uca.capas.dao.EstudianteDAO;
import com.uca.capas.domain.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	EstudianteDAO estudianteDAO;
	
	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		return estudianteDAO.findAll();
	}
	
	@Override
	public void insert(Estudiante estudiante) throws DataAccessException {
		estudianteDAO.insert(estudiante);
	}

	@Override
	@Transactional
	public void delete(Integer code) throws DataAccessException {
		estudianteDAO.delete(code);
	}
	
	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		return estudianteDAO.findOne(code);
	}
	
}
