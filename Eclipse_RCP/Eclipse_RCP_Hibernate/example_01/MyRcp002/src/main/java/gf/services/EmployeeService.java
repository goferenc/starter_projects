package gf.services;

import java.util.List;

import gf.dao.EmployeeDao;
import gf.entities.Employee;

public class EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
		employeeDao = new EmployeeDao();
	}
	
	public void persist(Employee entity) {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.persist(entity);
		employeeDao.closeCurrentSessionwithTransaction();
    }
 
    public void update(Employee entity) {
    	employeeDao.openCurrentSessionwithTransaction();
    	employeeDao.update(entity);
    	employeeDao.closeCurrentSessionwithTransaction();
    }
 
    public Employee findById(Integer id) {
    	employeeDao.openCurrentSession();
    	Employee entity = employeeDao.findById(id);
        employeeDao.closeCurrentSession();
        return entity;
    }
 
    public void delete(Integer id) {
    	employeeDao.openCurrentSessionwithTransaction();
        Employee entity = employeeDao.findById(id);
        employeeDao.delete(entity);
        employeeDao.closeCurrentSessionwithTransaction();
    }
 
    public List<Employee> findAll() {
    	employeeDao.openCurrentSession();
        List<Employee> books = employeeDao.findAll();
        employeeDao.closeCurrentSession();
        return books;
    }
 
    public void deleteAll() {
    	employeeDao.openCurrentSessionwithTransaction();
    	employeeDao.deleteAll();
    	employeeDao.closeCurrentSessionwithTransaction();
    }
}
