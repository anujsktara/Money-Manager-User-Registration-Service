package com.ce.ur.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class UserDetails {
private String First_Name; 
private String Last_Name;
@Id
private String UserName;
private String Password;
private String Address;
private String State;
private String Country;
private String CompanyName; 
}
