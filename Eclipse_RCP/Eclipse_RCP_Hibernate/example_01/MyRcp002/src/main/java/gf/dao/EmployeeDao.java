package gf.dao;

import java.util.List;

import gf.entities.Employee;

public class EmployeeDao extends Dao<Employee, Integer>{

	@Override
	public void persist(Employee entity) {
		getCurrentSession().save(entity);
	}

	@Override
	public void update(Employee entity) {
		getCurrentSession().update(entity);
	}

	@Override
	public Employee findById(Integer id) {
		Employee entity = (Employee) getCurrentSession().get(Employee.class, id);
        return entity; 
	}

	@Override
	public void delete(Employee entity) {
		getCurrentSession().delete(entity);		
	}

	@Override
	public List<Employee> findAll() {		
		List<Employee> entities = (List<Employee>) getCurrentSession().createQuery("from Employee").list();
        return entities;
	}

	@Override
	public void deleteAll() {		
		List<Employee> entities = findAll();
        for (Employee entity : entities) {
            delete(entity);
        }
	}
}
