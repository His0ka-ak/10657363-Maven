package com.dto;

public class Employee {
		private String empno;
		private String empname;
		private String empsal;
		
		
		public Employee(String empno, String empname, String empsal) {
			super();
			this.empno = empno;
			this.empname = empname;
			this.empsal = empsal;
		}


		public String getEmpno() {
			return empno;
		}


		public void setEmpno(String empno) {
			this.empno = empno;
		}


		public String getEmpname() {
			return empname;
		}


		public void setEmpname(String empname) {
			this.empname = empname;
		}


		public String getEmpsal() {
			return empsal;
		}


		public void setEmpsal(String empsal) {
			this.empsal = empsal;
		}
		
		

}
