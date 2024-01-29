package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class StudentPlacementDetail {
 private String studentName;
@Id 
 private  int rollNo;
 private String companyName;
 private float cgpa;
 private boolean whetherPlaced;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public float getCgpa() {
	return cgpa;
}
@Override
public String toString() {
	return "StudentPlacementDetail [studentName=" + studentName + ", rollNo=" + rollNo + ", companyName=" + companyName
			+ ", cgpa=" + cgpa + ", whetherPlaced=" + whetherPlaced + "]";
}
public void setCgpa(float cgpa) {
	this.cgpa = cgpa;
}
public boolean isWhetherPlaced() {
	return whetherPlaced;
}
public void setWhetherPlaced(boolean whetherPlaced) {
	this.whetherPlaced = whetherPlaced;
}
}
