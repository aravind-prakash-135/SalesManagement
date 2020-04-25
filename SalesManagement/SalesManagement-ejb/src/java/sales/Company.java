package sales;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7E7D222A-0D78-E380-5100-80D999C77F3D]
// </editor-fold>
@Entity
@NamedQuery(
    name="Company.getAllCompanies",
    query="SELECT c FROM Company c"
)
public class Company implements Serializable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A0AF7EEF-3C5E-2D21-7293-3577BBB0BC99]
    // </editor-fold>
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="companyID",nullable=false)
    private int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.AE7B9D19-3075-8C03-ECD7-9CB2E92BE681]
    // </editor-fold>
    @Column(name="companyDescription")
    private String description;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0924B245-78BC-6D5B-637F-C938A9F6EA2B]
    // </editor-fold>
    @Column(name="companyName")
    private String name;

    @ManyToMany
    private List<Product> products;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.97F61544-879C-8F77-AB9C-8003EDDFC966]
    // </editor-fold> 
    public Company () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A2613825-925E-CC3D-095C-174321B51039]
    // </editor-fold> 
    public int getId () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.256FD76A-ADF0-CF20-9FE5-967B43F7C732]
    // </editor-fold> 
    public void setId (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8BB9BB13-4A9F-42D0-A66A-ED18D7977DD8]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.45E6131A-3F7F-B8D4-8BFF-276CA0C6CF05]
    // </editor-fold> 
    public void setName (String val) {
        name = val;
    }

    /**
     * @return the products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2B5F9DA4-CBE8-21F7-27FC-8202F812C59D]
    // </editor-fold> 
    public String getDescription () {
        return description;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.357C2BBA-F143-A2EA-53A2-B61C5AFDA5AF]
    // </editor-fold> 
    public void setDescription (String val) {
        this.description = val;
    }

}

