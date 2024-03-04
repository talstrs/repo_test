package com.example.demo.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
		
		@Autowired
		CodeGroupService service;
//		CodeGroupService codeGroupService;
		
		@RequestMapping(value = "/codeGroupXdmList")
		// 모델 추가
		public String codeGroupXdmList(Model model) throws Exception{
			
			// 받아와서 클래스를 만들고
//			List<CodeGroupDto> codeGroupDtos = service.selectList();
			
			// model: 컨트롤러에서 받은 객체를 html로 넘겨주는 역할을 담당하며 하나의 객체, DB가 담기는 그릇
			// 만든 내용에 대해 넘기기
//			model.addAttribute("list", codeGroupDtos);
			
			
			// for문은 해당 데이터가 정상적으로 보여지는지 개발자가 확인하는 구문
//			for(CodeGroupDto a: codeGroupDtos) {
//				System.out.println(a.getName());
//			}
//			
			
			
			// 받아오자마자 바로 넘기는 방법
			model.addAttribute("list", service.selectList());
//			list = codeGroupDtos;
		
		return "codeGroupXdmList";
	}
		
	/* 링크 주소의 html 추가/ 데이터 받기 */
	/* dto로 데이터 정상적으로 넘어오는지 확인하기: codeGroupDto dto 설정 후 sysout으로 확인 */
	@RequestMapping(value = "/codeGroupView")
	public String codeGroupView(CodeGroupDto dto) throws Exception{
	
//		넘긴 데이터: 해당 링크 클릭시 콘솔 창에 해당 데이터 값 확인
//		but, dto 이름과 동일하게 설정해야 함
		System.out.println("dto.getSeq(): " + dto.getSeq());
		System.out.println("dto.getName(): " + dto.getName());
		
//		넘기지 않은 데이터: 해당 링크 클릭스 콘솔 창에 null 값으로 확인
		System.out.println("dto.getModDatetime(): " + dto.getModDatetime());
		
		return "codeGroupView";
	}

}
