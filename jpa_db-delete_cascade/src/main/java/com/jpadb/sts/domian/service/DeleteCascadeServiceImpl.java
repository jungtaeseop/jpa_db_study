package com.jpadb.sts.domian.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jpadb.sts.domian.entity.Child;
import com.jpadb.sts.domian.entity.Person;
import com.jpadb.sts.domian.repository.DeleteCascadeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class DeleteCascadeServiceImpl implements DeleteCascadeService{

	private final DeleteCascadeRepository deleteCascadeRepository;
	
	@Transactional
	@Override
	public String savePerson(HashMap<String, String> condition) {
		
		Child child = Child.builder()
							.name("김")
							.build();
		
		List<Child> childs = new ArrayList<Child>();
		
		childs.add(child);
		
		if(StringUtils.hasText(condition.get("name")) ) {
			Person person = Person.builder()
					.name(condition.get("name"))
					.childs(childs)
					.build();					
			
			deleteCascadeRepository.save(person);
			
			return "성공";
		}
		
		return "값이 없습니다.";
		
	}

}
