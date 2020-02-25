package com.bit.rest.model.entity;

import java.sql.Date;

import lombok.Data;

@Data   // lombok 을 이용해, Vo 작업
public class EmpVo {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;
	private String etc;
	
}