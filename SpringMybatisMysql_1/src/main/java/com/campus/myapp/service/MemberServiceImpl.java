package com.campus.myapp.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.campus.myapp.dao.MemberDAO;
import com.campus.myapp.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject		// Dao�� ��ü �����Ѵ�. @AutoWired�� ��밡��
	MemberDAO dao;
	
	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.memberInsert(vo);
	}

	@Override
	public MemberVO loginCheck(MemberVO vo) {		
		return dao.loginCheck(vo);
	}

	@Override
	public MemberVO memberSelect(String userid) {
		return dao.memberSelect(userid);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return dao.memberUpdate(vo);
	}

	@Override
	public int idCheck(String userid) {
		return dao.idCheck(userid);
	}
	
	
	
}