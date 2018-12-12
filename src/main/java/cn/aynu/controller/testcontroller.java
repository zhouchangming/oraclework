package cn.aynu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.aynu.mapper.userMapper;
import cn.aynu.po.userInfo;
import cn.aynu.vo.richesaddnumber;

@Controller
public class testcontroller {

	@Autowired
	userMapper userDao;
	/*
	 * �����½����
	 */
	
	@RequestMapping("login.handler")
	public String userLogin(Model model, userInfo user,HttpSession session) throws Exception{
		
		userDao.logincheck(user);
		if(user.getState()==1) {
			session.setAttribute("username", user.getUsername());
			return "content.jsp";
		}else if(user.getState()==0){
			model.addAttribute("error", "�˺��������");
		}else {
			model.addAttribute("error", "���ݿ��쳣");
		}
		
		return "index.jsp";
	}
	/*
	 * ����ע������
	 */
	@RequestMapping("userRegister.handler")
	public String userRegister(Model model,userInfo user)throws Exception {
		System.out.println(user.getUsername()+user.getUserpassword());
		userDao.insertUser(user);
		
		return "index.jsp";
	}
	/*
	 * �����˳�����
	 */
	@RequestMapping("loginOut.handler")
	public String loginOut(HttpSession session) throws Exception{
		
		userDao.loglasttime((String)session.getAttribute("username"));
		session.invalidate();
		
		return "index.jsp";
	}
	/*
	 * �������ӻ�������
	 */
	@RequestMapping("addRiches.handler")
	public String addRiches(Model mode,richesaddnumber ran,HttpSession session) throws Exception{
		ran.setName((String)session.getAttribute("username"));
		userDao.richesincrease(ran);
		mode.addAttribute("sum",ran.getSum());	
		
		return "content.jsp";
	}
	/*
	 * ��ѯ������Ϣ����
	 */
	@RequestMapping("selectUserInfo.handler")
	public String selectUserInfo(Model model,HttpSession session) throws Exception{
		
		userInfo tem = userDao.selectUser((String)session.getAttribute("username"));
		model.addAttribute("userInfo", tem);
		return "content.jsp";
		
	}
	
	
/*	@RequestMapping("test.handler")
	public String test() throws Exception {
		userInfo user = new userInfo();
		user.setUsername("111");
		user.setUserpassword("111");
		user.setState(12);
		 test.logincheck(user);
		System.out.println(user.getState());
		
		richesaddnumber ran = new richesaddnumber();
		ran.setIndex(2);
		ran.setSum(0);
		test.richesincrease(ran);;
		System.out.println(ran.getSum());
		test.loglasttime("111");
		return "NewFile.jsp";
	}
*/
	
}
