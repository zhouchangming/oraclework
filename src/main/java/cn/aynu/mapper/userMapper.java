package cn.aynu.mapper;

import cn.aynu.po.userInfo;
import cn.aynu.vo.richesaddnumber;

public interface userMapper {
	
	public  void logincheck(userInfo info)throws Exception; 
	public  userInfo selectUser(String name)throws Exception; 
	public 	void insertUser(userInfo info)throws Exception; 
	public  void richesincrease(richesaddnumber ran)throws Exception; 
	public  void loglasttime( String name ) throws Exception; 
		
	
}
