package com.bit.rest.model.entity;

import java.sql.Date;

import lombok.Data;

@Data   // lombok �� �̿���, Vo �۾�
public class EmpVo {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;
	private String etc;
	
}