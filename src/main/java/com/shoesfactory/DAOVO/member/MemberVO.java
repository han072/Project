package com.shoesfactory.DAOVO.member;

public class MemberVO {
	
	
		private String mem_id; //ȸ�� ���̵�
		private String mem_pw; //ȸ�� ��й�ȣ
		private String mem_name; //ȸ�� �̸�
		private String mem_yy; //ȸ�� ������� ��
		private String mem_mm; //ȸ�� ������� ��
		private String mem_dd; //ȸ�� ������� ��
		private String mem_sex; //ȸ�� ����
		private String mem_tel; //ȸ�� ��ȭ��ȣ
		private String mem_email; //ȸ�� �̸���
		private String mem_postnm; //ȸ�� �����ȣ
		private String mem_addr; //ȸ�� �ּ�
		private String mem_dtaddr; //ȸ�� ���ּ�
		private String mem_exaddr; //ȸ�� ����ּ�
		private String mem_point; //ȸ�� ����Ʈ
		private String mem_grade; //ȸ�� ���
		private String mem_interest; //ȸ�� ���ɻ���
		
		
		
		
		public MemberVO(String mem_id, String mem_pw, String mem_name, String mem_sex, String mem_tel, String mem_email, String mem_postnm, 
				String mem_addr, String mem_dtaddr, String mem_exaddr, String mem_yy, String mem_mm, String mem_dd, String mem_interest) {
			super();
			this.mem_id = mem_id;
			this.mem_pw = mem_pw;
			this.mem_tel= mem_tel;
			this.mem_email = mem_email;
			this.mem_addr = mem_addr;
			this.mem_name = mem_name;
			this.mem_interest = mem_interest;
			this.mem_postnm = mem_postnm;
			this.mem_dtaddr = mem_dtaddr;
			this.mem_exaddr = mem_exaddr;
			this.mem_sex = mem_sex;
			this.mem_yy=mem_yy;
			this.mem_mm=mem_mm;
			this.mem_dd=mem_dd;
			
		}
		
		

		public MemberVO(String mem_id, String mem_pw, String mem_name, String mem_tel, String mem_email,
				String mem_postnm, String mem_addr, String mem_dtaddr, String mem_exaddr, String mem_interest) {
			super();
			this.mem_id = mem_id;
			this.mem_pw = mem_pw;
			this.mem_name = mem_name;
			this.mem_tel = mem_tel;
			this.mem_email = mem_email;
			this.mem_postnm = mem_postnm;
			this.mem_addr = mem_addr;
			this.mem_dtaddr = mem_dtaddr;
			this.mem_exaddr = mem_exaddr;
			this.mem_interest = mem_interest;
		}



		public MemberVO()
		{}

		public String getMem_id() {
			return mem_id;
		}

		public void setMem_id(String mem_id) {
			this.mem_id = mem_id;
		}

		public String getMem_pw() {
			return mem_pw;
		}

		public void setMem_pw(String mem_pw) {
			this.mem_pw = mem_pw;
		
		}

		public String getMem_tel() {
			return mem_tel;
		}

		public void setMem_tel(String mem_tel) {
			this.mem_tel = mem_tel;
		}

		public String getMem_email() {
			return mem_email;
		}

		public void setMem_email(String mem_email) {
			this.mem_email = mem_email;
		}

		public String getMem_addr() {
			return mem_addr;
		}

		public void setMem_addr(String mem_addr) {
			this.mem_addr = mem_addr;
		}

		

		public String getMem_name() {
			return mem_name;
		}

		public void setMem_name(String mem_name) {
			this.mem_name = mem_name;
		}

		public String getMem_point() {
			return mem_point;
		}

		public void setMem_point(String mem_point) {
			this.mem_point = mem_point;
		}

		public String getMem_grade() {
			return mem_grade;
		}

		public void setMem_grade(String mem_grade) {
			this.mem_grade = mem_grade;
		}

		public String getMem_interest() {
			return mem_interest;
		}

		public void setMem_interest(String mem_interest) {
			this.mem_interest = mem_interest;
		}
		
		public String getMem_postnm() {
			return mem_postnm;
		}

		public void setMem_postnm(String mem_postnm) {
			this.mem_postnm = mem_postnm;
		}

		public String getMem_dtaddr() {
			return mem_dtaddr;
		}

		public void setMem_dtaddr(String mem_dtaddr) {
			this.mem_dtaddr = mem_dtaddr;
		}

		public String getMem_exaddr() {
			return mem_exaddr;
		}

		public void setMem_exaddr(String mem_exaddr) {
			this.mem_exaddr = mem_exaddr;
		}



		public String getMem_sex() {
			return mem_sex;
		}

		public void setMem_sex(String mem_sex) {
			this.mem_sex = mem_sex;
		}

		public String getMem_yy() {
			return mem_yy;
		}

		public void setMem_yy(String mem_yy) {
			this.mem_yy = mem_yy;
		}

		public String getMem_mm() {
			return mem_mm;
		}

		public void setMem_mm(String mem_mm) {
			this.mem_mm = mem_mm;
		}

		public String getMem_dd() {
			return mem_dd;
		}

		public void setMem_dd(String mem_dd) {
			this.mem_dd = mem_dd;
		}
		
		

		}


	

