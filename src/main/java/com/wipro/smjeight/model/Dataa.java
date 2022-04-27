package com.wipro.smjeight.model;

import java.util.Optional;

public class Dataa {
private String specialCharacters;
private Optional<Integer> HighestNumber;
private boolean isValidNumber;
public Dataa() {
	super();
	// TODO Auto-generated constructor stub
}
public Dataa(String specialCharacters, Optional<Integer> highestNumber, boolean isValidNumber) {
	super();
	this.specialCharacters = specialCharacters;
	HighestNumber = highestNumber;
	this.isValidNumber = isValidNumber;
}
@Override
public String toString() {
	return "Dataa [specialCharacters=" + specialCharacters + ", HighestNumber=" + HighestNumber + ", isValidNumber="
			+ isValidNumber + "]";
}
public String getSpecialCharacters() {
	return specialCharacters;
}
public void setSpecialCharacters(String specialCharacters) {
	this.specialCharacters = specialCharacters;
}
public Optional<Integer> getHighestNumber() {
	return HighestNumber;
}
public void setHighestNumber(Optional<Integer> highestNumber) {
	HighestNumber = highestNumber;
}
public boolean isValidNumber() {
	return isValidNumber;
}
public void setValidNumber(boolean isValidNumber) {
	this.isValidNumber = isValidNumber;
}


}
