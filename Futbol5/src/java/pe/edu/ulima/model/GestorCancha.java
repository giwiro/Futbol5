

package pe.edu.ulima.model;

import java.util.Date;
import java.util.List;
import pe.edu.ulima.model.beans.Cancha;
import pe.edu.ulima.model.dao.FactoryDAO;

public class GestorCancha {
    private static GestorCancha gestor = null;
    
    private FactoryDAO mFactory;
    
    private GestorCancha(){}
    
    public static GestorCancha getInstance(){
        if(gestor == null){
            gestor = new GestorCancha();
        }
        return gestor;
    }
    
    public void setFactoryDAO(FactoryDAO factoryDAO){
        mFactory = factoryDAO;
    }
    
    public List<Cancha> getnoDispCanchas(Date fecha, int hora){
        List<Cancha> dispCanchas = mFactory.nodisponiblesCancha(hora, fecha);     
        return dispCanchas;
    }
    
    public List<Cancha> getCanchas(){
        List<Cancha> allcanchas = mFactory.getCanchas();
        return allcanchas;
    }
    
}
