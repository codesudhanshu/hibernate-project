package com.hibernateproject;

import java.util.Random;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="usertodolist")
public class usertodolist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private  String name;
  private  String content;
  private  String date;
  private String  problem;


public String getProblem() {
	return problem;
}

public void setProblem(String problem) {
	this.problem = problem;
}

public usertodolist( String name, String content, String date, String problem) {
	super();
	this.id = new Random().nextInt(100000000);
	this.name = name;
	this.content = content;
	this.date = date;
	this.problem = problem;
}

@Override
public String toString() {
	return "usertodolist [id=" + id + ", name=" + name + ", content=" + content + ", date=" + date + ", problem=" + problem
			+ "]";
}
public usertodolist() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
}
