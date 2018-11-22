package com.Mai.pojo.Mybatis;


public class User{
    private Integer id;  //用户id

    private String userName; //用户名

    private String userPwd;  //用户密码

    private String userPhone;  //用户手机
	   
    private String userEmail; //用户邮箱

    private Integer userDeliverGoodsId; //收获地址

    private String userHead;  //用户头像地址

    private Integer userIntegral;  //用户金币

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserDeliverGoodsId() {
        return userDeliverGoodsId;
    }

    public void setUserDeliverGoodsId(Integer userDeliverGoodsId) {
        this.userDeliverGoodsId = userDeliverGoodsId;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    public Integer getUserIntegral() {
        return userIntegral;
    }

    public void setUserIntegral(Integer userIntegral) {
        this.userIntegral = userIntegral;
    }
    /**
     * 
     * @param id  用户id
     * @param userName   用户名
     * @param userPwd   用户密码
     * @param userPhone  用户手机
     * @param userEmail  用户邮箱
     * @param userDeliverGoodsId  用户收获地址
     * @param userHead  用户头像
     * @param userIntegral  用户余额
     */
	public User(Integer id, String userName, String userPwd, String userPhone, String userEmail,
			Integer userDeliverGoodsId, String userHead, Integer userIntegral) {
		this.id = id;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userDeliverGoodsId = userDeliverGoodsId;
		this.userHead = userHead;
		this.userIntegral = userIntegral;
	}

	public User() {
	}
	
	
    
}