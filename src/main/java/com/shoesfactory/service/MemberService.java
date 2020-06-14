package com.shoesfactory.service;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;

import com.shoesfactory.DAOVO.member.MemberVO;
import com.shoesfactory.DAOVO.member.NonMemberVO;



public interface MemberService {
	
//ï¿½Î±ï¿½ï¿½ï¿½ part
public int loginCheck(MemberVO vo1, HttpSession session); // ï¿½Î±ï¿½ï¿½ï¿½ Ã¼Å©
	
public List<MemberVO> login(MemberVO vo1); //ï¿½Î±ï¿½ï¿½ï¿½ È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ò·ï¿½ï¿½ï¿½ï¿½ï¿½

public void logout(HttpSession session); //ï¿½Î±ï¿½ ï¿½Æ¿ï¿½

public int nmloginCheck(NonMemberVO vo1, HttpSession session); //ºñÈ¸¿ø ·Î±×ÀÎ Ã¼Å©

public List<NonMemberVO> nmlogin(NonMemberVO vo1); //ºñÈ¸¿ø ·Î±×ÀÎ È¸¿øÁ¤º¸ ºÒ·¯¿À±â



//È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ part
	
public String IdCheck(String mem_id); //È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ìµï¿½ ï¿½ßºï¿½ Ã¼Å©
	
public String EmailCheck(String mem_email); //È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ì¸ï¿½ï¿½ï¿½ ï¿½ßºï¿½ Ã¼Å©
	
public String TelCheck(String mem_tel); //È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½È­ï¿½ï¿½È£ ï¿½ßºï¿½ Ã¼Å©
			
public void signup(MemberVO vo1) throws Exception; //È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
	
public void nmsignup(NonMemberVO vo1) throws Exception; //ï¿½ï¿½È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½

public String NonmemTelCheck(String nonmem_tel); //ï¿½ï¿½È¸ï¿½ï¿½ ï¿½ï¿½È­ï¿½ï¿½È£ ï¿½ßºï¿½Ã¼Å©

public List<MemberVO> getMyInfo(MemberVO vo1); // È¸ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Ò·ï¿½ï¿½ï¿½ï¿½ï¿½

public List<NonMemberVO> nmgetMyInfo(NonMemberVO vo1); // ºñÈ¸¿ø Á¤º¸ ºÒ·¯¿À±â

public void deleteAccount(MemberVO vo1); //È¸ï¿½ï¿½Å»ï¿½ï¿½

public void updateAccount(MemberVO vo1); //È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½

//4. ¾ÆÀÌµð/ºñ¹Ð¹øÈ£ Ã£±â part
public String findID(String mem_tel); //¾ÆÀÌµð Ã£±â

public String findPW(MemberVO vo1); //ºñ¹Ð¹øÈ£ Ã£±â
	

}
