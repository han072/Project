package com.shoesfactory.service;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoesfactory.DAOVO.member.MemberDAO;
import com.shoesfactory.DAOVO.member.MemberVO;
import com.shoesfactory.DAOVO.member.NonMemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberdao;
	
	

	
	@Override
	public int loginCheck(MemberVO vo1, HttpSession session) { 
	return memberdao.loginCheck(vo1, session);
	}
	
	@Override
	public List<MemberVO> login(MemberVO vo1){ 
	List<MemberVO> list1 = memberdao.getInfo(vo1);
	return list1;
	}

	@Override
	public void logout(HttpSession session) { 
		memberdao.logout(session);
	}
	
	@Override
	public int nmloginCheck(NonMemberVO vo1, HttpSession session) { // ��ȸ�� �α��� üũ
	return memberdao.nmloginCheck(vo1, session);
	}
	
	@Override
	public List<NonMemberVO> nmlogin(NonMemberVO vo1){ // ��ȸ�� �α��� ���� �ҷ�����
	List<NonMemberVO> list1 = memberdao.nmgetInfo(vo1);
	return list1;
	}
	
	

	
	@Override
	public String IdCheck(String mem_id) { 
	return memberdao.IdCheck(mem_id);
	}
	
	@Override
	public String EmailCheck(String mem_email) { 
	return memberdao.EmailCheck(mem_email);
	}
	
	@Override
	public String TelCheck(String mem_tel) { 
	return memberdao.TelCheck(mem_tel);
	}
	
	@Override 
	public void signup(MemberVO vo1) throws Exception{ 
	memberdao.signup(vo1); 
	}
	
	@Override
	public String NonmemTelCheck(String nonmem_tel) { 
	return memberdao.NonmemTelCheck(nonmem_tel);	
	}
	
	@Override 
	public void nmsignup(NonMemberVO vo1) throws Exception{ 
	memberdao.nmsignup(vo1); 
	}
	
	@Override 
	public List<MemberVO> getMyInfo(MemberVO vo1){ 
	List<MemberVO> list1 = memberdao.getMyInfo(vo1);
	return list1;
	}
	
	@Override 
	public List<NonMemberVO> nmgetMyInfo(NonMemberVO vo1){ //ȸ��������ȸ
	List<NonMemberVO> list1 = memberdao.nmgetMyInfo(vo1);
	return list1;
	}
	
	@Override 
	public void deleteAccount(MemberVO vo1) { 
	memberdao.deleteAccount(vo1);
	}
	
	@Override 
	public void updateAccount(MemberVO vo1) { 
	int s = memberdao.updateAccount(vo1);
	System.out.println(s);
	}
	
	//4. ���̵�/��й�ȣ ã�� part
	
			@Override
			public String findID(String mem_tel) { // ���̵� ã��
			return memberdao.findID(mem_tel);
			}
			
			@Override
			public String findPW(MemberVO vo1) { // ��й�ȣ ã��
			return memberdao.findPW(vo1);
			}
	
	
	
	
	
	
 
   


	
	
}
