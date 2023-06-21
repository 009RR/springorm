package com.srping.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {

		@Id
		@Column(name="student_id")
		private int studentId;
		@Column(name="student_name")
		private String studentNAme;
		@Column(name="student_city")
		private String studentCity;
		
		
		
		
		
		
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentNAme=" + studentNAme + ", studentCity=" + studentCity
					+ "]";
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int studentId, String studentNAme, String studentCity) {
			super();
			this.studentId = studentId;
			this.studentNAme = studentNAme;
			this.studentCity = studentCity;
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentNAme() {
			return studentNAme;
		}
		public void setStudentNAme(String studentNAme) {
			this.studentNAme = studentNAme;
		}
		public String getStudentCity() {
			return studentCity;
		}
		public void setStudentCity(String studentCity) {
			this.studentCity = studentCity;
		}
		
		
		
		
		
}
