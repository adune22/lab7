package ca.sait.lab7.dataaccess;

import ca.sait.lab7.models.User;
import java.util.List;
import javax.management.Query;

public class RoleDB {

  public List<User> getAll() throws Exception {
            EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            Query query = em.createNamedQuery("Role.findAll");
            return query.getResultList();
        } finally {
            em.close();
        }
  }
}
