package com.shoesfactory.DAOVO.member;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shoesfactory.DAOVO.member.MemberVO;

@Repository
public class MemberDAO{
	
	private static SqlSessionFactory sqlsessionfactory1;
		static {
			String myxml="Mybatis-config.xml";
			InputStream istream = null;
			try {
				istream = Resources.getResourceAsStream(myxml);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sqlsessionfactory1 = new SqlSessionFactoryBuilder().build(istream);
		}
		

		

		
		public int loginCheck(MemberVO vo1, HttpSession session){ 
			
			SqlSession session1 = sqlsessionfactory1.openSession();
			System.out.println("loginDAO"+vo1.getMem_id()+vo1.getMem_pw()+vo1.getMem_name());
			String pw = session1.selectOne("loginCheck",vo1);
			System.out.println(pw);
			
			if(vo1.getMem_pw().equals(pw)&&!vo1.getMem_id().equals("admin")) {
				session.setAttribute("slogin",vo1.getMem_id());
				session.setAttribute("slogin1",vo1.getMem_name());
				session.setAttribute("sloginNum",session1.selectOne("usernum",vo1));
				System.out.println(session1.selectOne("usernum",vo1));
				return 1;
			} else if(vo1.getMem_pw().equals(pw)&&vo1.getMem_id().equals("admin")) {
				session.setAttribute("slogin", vo1.getMem_id());
				return 1;
			}
			else 
				return 0;
			}
			
				
		public static List<MemberVO> getInfo(MemberVO vo1){
		
		return sqlsessionfactory1.openSession().selectList("getInfo",vo1);
			
		}
		
		
		
		
		public static void logout(HttpSession session) { 
			
			session.invalidate();
		}
		
public int nmloginCheck(NonMemberVO vo1, HttpSession session){ //��ȸ�� �α��� üũ
			
			SqlSession session1 = sqlsessionfactory1.openSession();
			System.out.println("loginDAO"+vo1.getNonmem_tel()+vo1.getNonmem_pw());
			String pw = session1.selectOne("nmloginCheck",vo1);
			System.out.println(pw);
			
			if(vo1.getNonmem_pw().equals(pw)) {
				session.setAttribute("slogin",vo1.getNonmem_tel());
				
				return 1;
			} 
			else 
				return 0;
			}
		
		public static List<NonMemberVO> nmgetInfo(NonMemberVO vo1){ //��ȸ�� �α��� ���� �ҷ�����
			
			return sqlsessionfactory1.openSession().selectList("nmgetInfo",vo1);
				
			}
		
		public static List<NonMemberVO> nmgetMyInfo(NonMemberVO vo1){ //��ȸ��������ȸ
			return sqlsessionfactory1.openSession().selectList("nmgetInfo",vo1);
				
		}
		
		
		




		
		public String IdCheck(String mem_id){ 
			
			SqlSession session1 = sqlsessionfactory1.openSession();
			String id = session1.selectOne("IdCheck",mem_id);
			return id;
			}
		
		public String EmailCheck(String mem_email){
			
			SqlSession session1 = sqlsessionfactory1.openSession();
			String email = session1.selectOne("EmailCheck",mem_email);
			return email;
			}
		
		public String TelCheck(String mem_tel){ 
			
			SqlSession session1 = sqlsessionfactory1.openSession();
			String tel = session1.selectOne("TelCheck",mem_tel);
			return tel;
			}
		
		
		public static int signup(MemberVO vo1) { 
			SqlSession session = sqlsessionfactory1.openSession();
			int r = session.insert("signup",vo1);
			session.commit();		
			return r;
		}
		
		public String NonmemTelCheck(String nonmem_tel){ 
			
			SqlSession session1 = sqlsessionfactory1.openSession();
			String tel = session1.selectOne("NonmemTelCheck",nonmem_tel);
			return tel;
			}
		
		
		
		public static int nmsignup(NonMemberVO vo1) { 
			SqlSession session = sqlsessionfactory1.openSession();
			int r = session.insert("nmsignup",vo1);
			session.commit();		
			return r;
		}
		
		public static List<MemberVO> getMyInfo(MemberVO vo1){
			return sqlsessionfactory1.openSession().selectList("getInfo",vo1);
				
		}
		
		public static int deleteAccount(MemberVO vo1) { 
			SqlSession session = sqlsessionfactory1.openSession();
			int r = session.delete("deleteAccount",vo1);
			session.commit();		
			return r;
		}
		
		public static int updateAccount(MemberVO vo1) { 
			SqlSession session = sqlsessionfactory1.openSession();
			int r = session.update("updateAccount",vo1);
			session.commit();
			return r;
		}
		
		//4. ���̵�/��й�ȣ ã��	part
		
				public String findID(String mem_tel){ //���̵� ã��
							
							SqlSession session1 = sqlsessionfactory1.openSession();
							String id = session1.selectOne("findID",mem_tel);
							return id;
							}
						
						public String findPW(MemberVO vo1){ //��й�ȣ ã��
							
							SqlSession session1 = sqlsessionfactory1.openSession();
							String pw = session1.selectOne("findPW",vo1);
							
							return pw;
							}
		
		
		
		
		
}
