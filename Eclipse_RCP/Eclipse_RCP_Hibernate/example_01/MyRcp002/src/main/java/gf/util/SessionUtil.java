package gf.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionUtil {

	private static final SessionUtil instance = new SessionUtil();
	private final SessionFactory factory;

	private SessionUtil() {
		StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build();

		factory = new MetadataSources(standardServiceRegistry).buildMetadata().buildSessionFactory();
	}

	public static Session getSession() {
		return getInstance().factory.openSession();
	}

	private static SessionUtil getInstance() {
		return instance;
	}
}
