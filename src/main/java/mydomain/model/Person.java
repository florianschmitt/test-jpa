package mydomain.model;

import javax.persistence.*;
import org.datanucleus.api.jpa.annotations.Index;
import java.util.Date;

@Entity
public class Person
{
    @Id
    Long id;

    String name;
	
	@Basic(optional = false) 
	@Column(name = "date1", nullable = false) 
	@Temporal(TemporalType.DATE) 
	private Date date1;
	
	@Basic(optional = false) 
	@Column(name = "date2", nullable = false) 
	@Temporal(TemporalType.DATE) 
	private Date date2;

    public Person(long id, String name, Date date1, Date date2)
    {
        this.id = id;
        this.name = name;
		this.date1 = date1;
		this.date2 = date2;
    }

    public String getName()
    {
        return name;
    }

    public Long getId()
    {
        return id;
    }
}
