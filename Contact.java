public class Contact {
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private String zip;
private String phone;
private String email;

// Default Constructor
public Contact() {
}

// Parameterized Constructor
public Contact(String firstName,String lastName,String address,String city,String state,String zip,String phone,String email){
this.firstName=firstName;
this.lastName=lastName;
this.address=address;
this.city=city;
this.state=state;
this.zip=zip;
this.phone=phone;
this.email=email;
}

// Getters
public String getFirstName(){ return firstName; }
public String getLastName(){ return lastName; }
public String getAddress(){ return address; }
public String getCity(){ return city; }
public String getState(){ return state; }
public String getZip(){ return zip; }
public String getPhone(){ return phone; }
public String getEmail(){ return email; }

// Setters
public void setFirstName(String firstName){ this.firstName=firstName; }
public void setLastName(String lastName){ this.lastName=lastName; }
public void setAddress(String address){ this.address=address; }
public void setCity(String city){ this.city=city; }
public void setState(String state){ this.state=state; }
public void setZip(String zip){ this.zip=zip; }
public void setPhone(String phone){ this.phone=phone; }
public void setEmail(String email){ this.email=email; }

// toString()
@Override
public String toString(){
return "Contact Details\n"+
"First Name : "+firstName+
"\nLast Name : "+lastName+
"\nAddress : "+address+
"\nCity : "+city+
"\nState : "+state+
"\nZip : "+zip+
"\nPhone : "+phone+
"\nEmail : "+email;
}
} {
    
}
