/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.util;

import com.mongodb.Mongo;
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import org.slf4j.LoggerFactory;

/**
 *
 * @author iEnzo
 */
public class MongoUtil {

    
    private static final int port = 27017;
    private static final String host = "localhost";
    private static Mongo mongo = null;
    
    public static Mongo getMongo(){
        if(mongo == mongo){
            try {
                mongo = new Mongo(host,port);
            } catch (UnknownHostException | MongoException e) {
             
            }
        }
        return mongo;
    }
    
    
    
}

