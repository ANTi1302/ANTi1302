package until;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class HibernateUtil {
	private static HibernateUtil instance = null;
	private EntityManager entityManager;
	
	private HibernateUtil() {
		entityManager = Persistence
				.createEntityManagerFactory("19516531_TranThiAnhThu")
				.createEntityManager();
	}
	
	public synchronized static HibernateUtil getInstance() {
		if(instance == null)
			instance = new HibernateUtil();
		return instance;
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
