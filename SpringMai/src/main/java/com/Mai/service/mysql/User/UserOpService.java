package com.Mai.service.mysql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mai.HTML.UserHTML;
import com.Mai.dao.Mybatis.UserMapper;
import com.Mai.pojo.Mybatis.User;
import com.Mai.pojo.Mybatis.Masg.UserMsg;

@Service
@Transactional
public class UserOpService {
	
	@Autowired
	UserMapper mapper ;
	
	
	
	public User Loder(String name,String pawss) throws Exception {
		User user = mapper.UserLoder(name, pawss);
		return user;
	}



	public boolean UserRegister(User getUser) throws Exception {
		// TODO Auto-generated method stub
		
		if (getUser==null || getUser instanceof UserMsg) {
			return false;
		}
		if(getUser.getUser_email()!=null) {
			//邮箱注册
			//------  这里写验证码的处理类
		}else if(getUser.getUser_phone()!=null){
			//手机注册
			//------  这里写手机的处理类
		}
		
		if(getUser.getUser_name()==null || getUser.getUser_pwd()==null) {
			//最后一次非空过滤
			return false;
		}
		
		mapper.UserInsert(getUser);
		
		
		
		return true;
	}
	
	
	
	
	
	
	
	
}
