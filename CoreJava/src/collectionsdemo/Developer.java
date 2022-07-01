package collectionsdemo;

import java.util.Comparator;

public class Developer {


	int id;
	String name,domain;
	
	public Developer(int id, String name, String d) {
		this.id = id;
		this.name = name;
		this.domain = d;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}
	


//comparator interface is used to sort objects user defined class
//based on multiple fields
class IdComparator implements Comparator
{

	@Override
public int compare(Object o1, Object o2) {
 Developer d1=(Developer) o1;
 Developer d2=(Developer) o2;
 
 if(d1.id==d2.id)
 return 0;
 else if (d1.id>d2.id)
    return 1;
 else
	 return -1;
}
}

	class Domaincomparator implements Comparator
	{
	    @Override
	    public int compare(Object o1, Object o2) {
	        Developer d1=(Developer) o1;
	        Developer d2=(Developer) o2;
	        
	        return d1.domain.compareTo(d2.domain);
	    }
	                         
}
}