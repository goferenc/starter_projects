import org.hibernate.Session;
import org.hibernate.Transaction;

public class MyMain {

	public static void main(String[] args) {
		insert();
	}

	private static void insert() {
		
		Employee employee = new Employee();
		employee.setName("Emma");
		employee.setAge(53);
		
		try (Session session = SessionUtil.getSession()) { 
			 Transaction tx = session.beginTransaction(); 
			 session.persist(employee); 
			 tx.commit(); 
		} 
	}

}
