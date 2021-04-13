import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MyMain {

	public static void main(String[] args) {
		insert();
	}

	private static void insert() {

		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		SessionFactory factory = new MetadataSources(standardServiceRegistry) 
				 .buildMetadata() 
				 .buildSessionFactory(); 
		
		Employee employee = new Employee();
		employee.setName("Emma");
		employee.setAge(53);
		
		try (Session session = factory.openSession()) { 
			 Transaction tx = session.beginTransaction(); 
			 session.persist(employee); 
			 tx.commit(); 
		} 
	}

}
