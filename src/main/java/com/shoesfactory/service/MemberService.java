package com.shoesfactory.service;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Configuration;

import com.shoesfactory.DAOVO.member.MemberVO;
import com.shoesfactory.DAOVO.member.NonMemberVO;



public interface MemberService {
	
//�α��� part
public int loginCheck(MemberVO vo1, HttpSession session); // �α��� üũ
	
public List<MemberVO> login(MemberVO vo1); //�α��� ȸ������ �ҷ�����

public void logout(HttpSession session); //�α� �ƿ�

public int nmloginCheck(NonMemberVO vo1, HttpSession session); //��ȸ�� �α��� üũ

public List<NonMemberVO> nmlogin(NonMemberVO vo1); //��ȸ�� �α��� ȸ������ �ҷ�����



//ȸ������ part
	
public String IdCheck(String mem_id); //ȸ������ ���̵� �ߺ� üũ
	
public String EmailCheck(String mem_email); //ȸ������ �̸��� �ߺ� üũ
	
public String TelCheck(String mem_tel); //ȸ������ ��ȭ��ȣ �ߺ� üũ
			
public void signup(MemberVO vo1) throws Exception; //ȸ������
	
public void nmsignup(NonMemberVO vo1) throws Exception; //��ȸ������

public String NonmemTelCheck(String nonmem_tel); //��ȸ�� ��ȭ��ȣ �ߺ�üũ

public List<MemberVO> getMyInfo(MemberVO vo1); // ȸ�� ���� �ҷ�����

public List<NonMemberVO> nmgetMyInfo(NonMemberVO vo1); // ��ȸ�� ���� �ҷ�����

public void deleteAccount(MemberVO vo1); //ȸ��Ż��

public void updateAccount(MemberVO vo1); //ȸ������ ����

//4. ���̵�/��й�ȣ ã�� part
public String findID(String mem_tel); //���̵� ã��

public String findPW(MemberVO vo1); //��й�ȣ ã��
	

}
