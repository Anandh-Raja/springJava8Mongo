package com.wipro.smjeight.model;



import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Data")
public class Data {
@Id
private UUID id=UUID.randomUUID();
private String findSpecialCharacter;
private List<Integer> findHighest;
private String validNumber;
public UUID getId() {
	return id;
}
public void setId(UUID id) {
	this.id = id;
}
public String getFindSpecialCharacter() {
	return findSpecialCharacter;
}
public void setFindSpecialCharacter(String findSpecialCharacter) {
	this.findSpecialCharacter = findSpecialCharacter;
}

public Data(UUID id, String findSpecialCharacter, List<Integer> findHighest, String validNumber) {
	super();
	this.id = id;
	this.findSpecialCharacter = findSpecialCharacter;
	this.findHighest = findHighest;
	this.validNumber = validNumber;
}
@Override
public String toString() {
	return "Data [id=" + id + ", findSpecialCharacter=" + findSpecialCharacter + ", findHighest=" + findHighest
			+ ", validNumber=" + validNumber + "]";
}
public List<Integer> getFindHighest() {
	return findHighest;
}
public void setFindHighest(List<Integer> findHighest) {
	this.findHighest = findHighest;
}
public String getValidNumber() {
	return validNumber;
}
public void setValidNumber(String validNumber) {
	this.validNumber = validNumber;
}
public Data() {
	super();
}
}
