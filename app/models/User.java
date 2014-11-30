package models;

import play.db.ebean.Model;

public class User extends Model	{
	
	public Long id;
	public String name;
	public String lastname;
	public String email;
	
	public static Finder<Long, User> finder = new Finder<Long,User>(Long.class,User.class);
	
	public static User findById(Long id){
		User user = finder.where().eq("id", id).findUnique();
		return user;
	}
	
	public User (Long id){
		this.id = id;
	}
	
	@Override
	//Nos ayuda a saber si dos objetos son iguales 
	public boolean equals(Object obj)	{
		if(obj == this)	{
			return true;
		}
		if(!(obj instanceof User))	{
			return false;
		}
		
		User u = (User)obj;
		
		return (u.id == this.id);
	}
}
