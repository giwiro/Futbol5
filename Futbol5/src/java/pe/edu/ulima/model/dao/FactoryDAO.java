/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.ulima.model.dao;

import pe.edu.ulima.model.beans.Usuario;

/**
 *
 * @author iEnzo
 */
public interface FactoryDAO {
    public Usuario getUser(String name); 
}
