
public class PersonExample {


	
	public static void main(String[] args) {
		
		Pizza person = new Pizza();
		
		person.setFirstName("Akram");
		person.setLastName("Nadri");
		person.setAge(38);
		
		
		System.out.println(person.getFullName());
		System.out.println(person.isTeen());
	}


	    private String firstName;
	    private String lastName;
	    private int age;
	    
	    public String getFirstName(){
	        return firstName;
	    }
	    
	    public String getLastName(){
	        return lastName;
	    }
	    
	    public int getAge(){
	        return age;
	    }
	    
	    public void setFirstName(String firstName){
	        this.firstName = firstName;
	    }
	    
	    public void setLastName(String lastName){
	        this.lastName = lastName;
	    }
	    
	    public void setAge(int age) {
	        this.age = age;
	        if(age < 0 || age > 100) {
	            age = 0;
	        }
	    }
	    
	    public boolean isTeen(){
	        if(age > 12 || age < 20) {
	        	return true;
	        } else {
	        	return false;
	        }
	    }
	    
	    public String getFullName() {
	    	if(firstName.isEmpty() && lastName.isEmpty()) {
	    		return (firstName + lastName);
		} else if (lastName.isEmpty()) {
	    		return (firstName);
	    	} else if(firstName.isEmpty()) {
	    		return (lastName );
	    	}
	    	return (firstName + " " + lastName);
	
	    }
	    
	   
	    
	    
	    
	}
