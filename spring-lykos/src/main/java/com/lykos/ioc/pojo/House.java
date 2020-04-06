package com.lykos.ioc.pojo;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Data
public class House {
	private Person person;
}
