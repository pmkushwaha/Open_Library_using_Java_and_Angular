package com.project.openlibrary.entity;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{

	private String authority;
	
	
	public Authority(String authority) {
		super();
		this.authority = authority;
	}

	@Override
	public String getAuthority() {		
		return this.authority;
	}

}
