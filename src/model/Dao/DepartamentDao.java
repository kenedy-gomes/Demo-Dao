package model.Dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {

	void insert(Departament obj);
	void update(Departament obj);
	void deleteById(Integer id);
	Departament fingById(Integer id);
	List<Departament> findAll();
}
