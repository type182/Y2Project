package com.pojo;


public class User{
    private Integer id;  //用户id

    private String user_name; //用户名

    private String user_pwd;  //用户密码

    private String user_phone;  //用户手机
	   
    private String user_email; //用户邮箱


    private String user_head;  //用户头像地址

    private Integer user_integral;  //用户金币

   
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_head() {
		return user_head;
	}

	public void setUser_head(String user_head) {
		this.user_head = user_head;
	}

	public Integer getUser_integral() {
		return user_integral;
	}

	public void setUser_integral(Integer user_integral) {
		this.user_integral = user_integral;
	}

	/**
     * 
     * @param id  用户id
     * @param userName   用户名
     * @param userPwd   用户密码
     * @param userPhone  用户手机
     * @param userEmail  用户邮箱
     * @param userHead  用户头像
     * @param userIntegral  用户余额
     */
	public User(Integer id, String userName, String userPwd, String userPhone, String userEmail, String userHead, Integer userIntegral) {
		this.id = id;
		this.user_name = userName;
		this.user_pwd = userPwd;
		this.user_phone = userPhone;
		this.user_email = userEmail;
		this.user_head = userHead;
		this.user_integral = userIntegral;
	}

	public User() {
	}
	
	
    
}