import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyMain {
	
	public static void main(String[] args) {	
		insert();
	}
	
	private static void insert() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyMSSQLPersistence");
		EntityManager em = emf.createEntityManager();
 
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
 
		Employee employee = new Employee();
		employee.setName("Will");
		employee.setAge(53);
		em.persist(employee);
 
		transaction.commit();
        
	}
	
}
