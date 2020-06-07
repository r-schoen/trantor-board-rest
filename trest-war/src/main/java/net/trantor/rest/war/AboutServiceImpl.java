package net.trantor.rest.war;

import org.springframework.stereotype.Service;

import net.trantor.rest.AboutService;

@Service
public class AboutServiceImpl implements AboutService {
	
	public String about() {
		return "Hello, World!";
	}

}
