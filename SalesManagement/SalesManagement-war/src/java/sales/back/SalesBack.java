/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sales.back;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import sales.Company;
import sales.SalesSessionLocal;

/**
 *
 * @author fajfr
 */
public class SalesBack {

    @EJB
    SalesSessionLocal ssl;
    
    public List<Company> getAllCompanies(){
        return ssl.getAllCompanies();
    }

    
    public DataModel companiesModel;
    private Company company;

    public DataModel getCompaniesModel(){
        companiesModel = new ListDataModel(getAllCompanies());
        return companiesModel;
    }

    public String editCompany(){
        company = (Company)companiesModel.getRowData();
        return "edit-company";
    }

    public String saveCompany(){
        ssl.saveCompany(company);
        return "show-companies";
    }

    public String newCompany(){
        company = new Company();
        return "edit-company";
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }
}
