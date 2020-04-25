package sales;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C752139E-C3EA-D424-840A-3B98B79247AE]
// </editor-fold>
@Entity
public class Product implements Serializable {

   
    @Id
    private int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.18979EA6-BA3D-8D24-3777-9D1E326705A7]
    // </editor-fold> 
    private String description;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.44D2AAF2-31FA-19E3-699E-3A00AFD5A142]
    // </editor-fold> 
    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BCFB361B-125D-0E6A-E13A-9484CB7A38CD]
    // </editor-fold> 
    public Product () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C93037D7-C772-F262-1877-3E50CEE4F6AE]
    // </editor-fold> 
    public String getDescription () {
        return description;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A787AF9C-AEBE-559D-1993-A0AFC3BCF297]
    // </editor-fold> 
    public void setDescription (String val) {
        description = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.87C7592A-FBCA-86A7-FD91-4A9A5E0A2F12]
    // </editor-fold> 
    public int getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D4C44F1C-E01E-115F-3219-C58A24684FA5]
    // </editor-fold> 
    public void setId (int val) {
        id=val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F84FD504-ACE7-2999-19F1-A17649457A7F]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DB5920CA-2EC5-9BEE-34A4-281C15E698E9]
    // </editor-fold> 
    public void setName (String val) {
        name = val;
    }

}

