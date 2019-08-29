/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.persistence;

/**
 *
 * @author Andres
 */
import java.util.Set;

import edu.eci.arsw.blueprints.model.Blueprint;

public interface Filter {
	
	public Set<Blueprint> filter(Set<Blueprint> blueprints);
}

