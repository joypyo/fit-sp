package com.fitpro.www.dto;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class Member {

	private int memberId;
	
	private String password;
	
	private String name;
	
	private String phone;
	
	@Nullable
	private String address;
	
	@Nullable
	private String email;
	
	@Nullable
	private String age;
	
	@Nullable
	private String gender;
	
	@Nullable
	private String exercise;
	
	@Nullable
	private String answer;
	
	@Nullable
	private String question;

}
