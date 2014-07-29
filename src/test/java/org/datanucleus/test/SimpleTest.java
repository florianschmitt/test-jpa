package org.datanucleus.test;

import org.junit.*;
import javax.persistence.*;
import java.util.Date;

import static org.junit.Assert.*;
import mydomain.model.*;
import org.datanucleus.util.NucleusLogger;

public class SimpleTest
{
    @Test
    public void testSimple()
    {
        NucleusLogger.GENERAL.info(">> test START");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyTest");

        EntityManager em = emf.createEntityManager();
		em = emf.createEntityManager();

		Date date1 = new Date();
		Date date2 = new Date();
		
		em.createQuery("Select x From Person x Where x.date1 = :date1 And x.date2 = :date2", Person.class) //
			.setParameter("date1", date1) //
			.setParameter("date2", date2) //
			.getResultList();
		
		em.close();
		
        emf.close();
        NucleusLogger.GENERAL.info(">> test END");
    }
}
