package com.Mai.pojo.Mybatis;
/**
 * @author 管理员表
 */
public class Admin {
	// 管理员的id
    private Integer id;
    // 管理员的名字
    private String name;
    //管理员的 密码
    private String pwd;
    // 管理员的头像地址
    private String headPortrait;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }
    /**
     * 
     * @param name 管理员的名字
     * @param pwd 管理员的 密码
     * @param headPortrait  管理员的头像地址可以选择不上传 有默认值在
     */
	public Admin(String name, String pwd, String headPortrait) {
		this.id = null;
		this.name = name;
		this.pwd = pwd;
		this.headPortrait = headPortrait;
	}
    public Admin() {
	}
    
    
    
}