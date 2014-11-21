

package pe.edu.ulima.model;

import java.util.Date;
import pe.edu.ulima.model.beans.Partido;
import pe.edu.ulima.model.dao.FactoryDAO;

public class GestorPartido {
    private static GestorPartido gestor = null;
    
    private FactoryDAO mFactory;
    
    private GestorPartido(){}
    
    public static GestorPartido getInstance(){
        if(gestor == null){
            gestor = new GestorPartido();
        }
        return gestor;
    }
    
    public void setFactoryDAO(FactoryDAO factoryDAO){
        mFactory = factoryDAO;
    }
    
    public Partido register(String nombre, int hora, Date fecha){
        Partido partido = mFactory.insertPartido(nombre, hora, fecha);
        return partido;
    }
    
    public void pushInPartido(String idNickname, String idPartido){
        mFactory.pushInPartido(idNickname, idPartido);
    }
    
    
    
}
