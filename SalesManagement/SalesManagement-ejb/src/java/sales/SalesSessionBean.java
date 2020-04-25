/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sales;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fajfr
 */
@Stateless
public class SalesSessionBean implements SalesSessionLocal {

    @PersistenceContext
    private EntityManager em;

    
    public List<Company> getAllCompanies() {
        List<Company> companies = em.createNamedQuery("Company.getAllCompanies").getResultList();
        return companies;
    }

    public void saveCompany(Company company) {
        company = em.merge(company);
        em.persist(company);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method" or "Web Service > Add Operation")
 
}
