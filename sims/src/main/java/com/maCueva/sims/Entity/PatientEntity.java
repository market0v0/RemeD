package com.maCueva.sims.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_patient")
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique=true)
    private String username;
    private String password;
    private String firstname;
	private String middlename;
	private String lastname;
	private int weight;
	private int height;


	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PatientEntity(int id, String username, String password, String firstname, String middlename, String lastname,
			int weight, int height) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.weight = weight;
		this.height = height;
	}


    public int getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getMiddlename() {
		return middlename;
	}



	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}
	
}
