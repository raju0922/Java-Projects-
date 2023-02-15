package shoppingmall;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_service_Controller
{
@Autowired
private User_Service service;
@GetMapping("/userservice")
public java.util.List<User> list()
{
	return service.listAll();
}
@GetMapping("/userservice/{u_id}")
public ResponseEntity<User> get(@PathVariable Integer u_id)
{
	try
	{
		User u=service.get(u_id);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	catch (NoResultException e)
	{
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
}
@PostMapping("/userservice")
public void add(@RequestBody User u)
{
	service.save(u);
}
@PutMapping("/userservice/{u_id}")
public ResponseEntity<?> update(@RequestBody User u, @PathVariable Integer u_id)
{
	User existu=service.get(u_id);
	service.save(existu);
	return new ResponseEntity<>(HttpStatus.OK);
}
@DeleteMapping("/userservice/{u_id}")
public void delete(@PathVariable Integer u_id)
{
	service.delete(u_id);
}
}
