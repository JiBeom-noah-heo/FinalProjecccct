package com.shopping.KM;

import java.sql.Date;

import lombok.Data;

@Data
public class Customer {
	private String c_id;
	private String c_password;
	private String c_name;
	private String c_gender;
	private String c_address;
	private String c_zip;
	private String c_grade;
	private String c_email;
	private String c_tel;
	private Date   c_regdate;
	private String c_del;
}
