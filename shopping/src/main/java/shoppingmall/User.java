
package shoppingmall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User
{

  private Integer u_id;
  private String u_name;
  private String u_email;
  private int u_phno;
  
public User()
{
	super();
}

public User(Integer u_id, String u_name, String u_email, int u_phno) 
{
	super();
	this.u_id = u_id;
	this.u_name = u_name;
	this.u_email = u_email;
	this.u_phno = u_phno;
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public Integer getU_id() {
	return u_id;
}
public void setU_id(Integer u_id) {
	this.u_id = u_id;
}
public String getU_name() {
	return u_name;
}
public void setU_name(String u_name) {
	this.u_name = u_name;
}
public String getU_email() {
	return u_email;
}
public void setU_email(String u_email) {
	this.u_email = u_email;
}
public int getU_phno() {
	return u_phno;
}
public void setU_phno(int u_phno) {
	this.u_phno = u_phno;
}
@Override
public String toString()
{
	return "User[User id:"+u_id+" Username:"+u_name+" Email :"+u_email+" Phoneno :"+u_phno+"]";
}
}
  

