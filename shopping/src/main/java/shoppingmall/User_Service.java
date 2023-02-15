package shoppingmall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class User_Service
{
	@Autowired
private User_Service_Repository repo;
	public List<User> listAll()
	{
		return repo.findAll();
	}
	public void save(User u)
	{
		repo.save(u);
	}
	public User get(Integer u_id) 
	{
		return repo.findById(u_id).get();
	}
	public void delete(Integer u_id)
	{
		repo.deleteById(u_id);
	}
	
	}

