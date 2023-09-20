package com.ssm.entity;

public class Person {
  private User user;
  
  public Person() {
	super();
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Person(User user) {
	  this.user = user;
  }
  
  public void show() {
	  System.out.println(user.toString());
  }
  
  
}
