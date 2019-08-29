/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blueprints.api;

import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.persistence.impl.InMemoryBlueprintPersistence;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 2112076
 */
public class main {
    public static void main(String a[]) throws BlueprintNotFoundException, BlueprintPersistenceException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BlueprintsServices bpS = ac.getBean(BlueprintsServices.class);
        InMemoryBlueprintPersistence ibpp=new InMemoryBlueprintPersistence();
        System.out.println(bpS.getBlueprint("john", "thepaint"));
        System.out.println(bpS.getBlueprintsByAuthor("john"));
    }
}
