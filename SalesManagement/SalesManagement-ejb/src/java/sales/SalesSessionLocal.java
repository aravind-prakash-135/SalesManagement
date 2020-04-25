/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sales;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fajfr
 */
@Local
public interface SalesSessionLocal {

    List<Company> getAllCompanies();

    void saveCompany(Company company);
    
}
