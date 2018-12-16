package sz.zxl.com.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sz.zxl.com.pojo.User;
import sz.zxl.com.service.IUserService;

@Repository
@RequestMapping("/uc")
public class UserContorlle {

	//��Ҫ����service����
	@Resource(name="userservice")
	public IUserService userservice;
	
	@SuppressWarnings("unused")
	@RequestMapping(value="cl",method=RequestMethod.POST)
	public String checkLogin(User user,Model model){
		User u = userservice.isLogin(user);
		/*System.out.println("user:=="+u.getLoginname()+"==mima:"+u.getLoginpwd());
		*/
		 if(u==null){
			 System.out.println("����ʧ��");
			 return "index";
		 }
		model.addAttribute("u", u);
		System.out.println("����ɹ�...");
		return "suc";
	}

	public IUserService getUserservice() {
		return userservice;
	}

	public void setUserservice(IUserService userservice) {
		this.userservice = userservice;
	}
	
}
