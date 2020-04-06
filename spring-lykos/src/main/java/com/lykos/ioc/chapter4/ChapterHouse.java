package com.lykos.ioc.chapter4;

import com.lykos.ioc.pojo.Person;
import com.lykos.ioc.pojo.Television;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.util.Optional;

@Data
public class ChapterHouse {
	private Person person;

	private Television television;

//	@Autowired(required = false)
//	public ChapterHouse(Person person){
//		this.person = person;
//	}
//
//	@Autowired(required = false)
//	public ChapterHouse(){
//		System.out.println();
//	}
//
//
//	@Autowired(required = false)
//	public ChapterHouse(Person person,Television television){
//		this.person = person;
//		this.television = television;
//	}

	@Autowired
	private void setPerson(Optional<Person> personOptional){
		if(personOptional.isPresent()){
			this.person = personOptional.get();
		}
	}

	@Autowired
	private void setTelevision(@Nullable Television television){
		this.television = television;
	}
}
