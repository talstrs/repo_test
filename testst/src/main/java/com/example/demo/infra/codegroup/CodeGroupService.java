package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {

//	dao를 쓸 수 있게 해 주는 어노테이션
	@Autowired
//	CodeGroupDao CodeGroupDao;
	CodeGroupDao dao;
//	@Autowired 와 CodeGroupDao dao;의 이미는 아래와 같다
//	CodeGroupDao dao = new CodeGroupDao();

//	패턴 1
//	public List<CodeGroupDto> selectList(){
//		
//		List<CodeGroupDto> list = dao.selectList();
//		
//		return list;
//	}

//	패턴 2
	public List<CodeGroupDto> selectList() {
		return dao.selectList();
	}

}
