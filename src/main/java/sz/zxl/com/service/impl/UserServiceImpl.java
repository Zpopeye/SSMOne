package sz.zxl.com.service.impl;

import sz.zxl.com.dao.IUserDao;
import sz.zxl.com.pojo.User;
import sz.zxl.com.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userdao;
	
	public User isLogin(User user) {
		if(user==null||user.getLoginname()==null||user.getLoginname().equals("")||user.getLoginpwd()==null||user.getLoginpwd().equals("")){
			
			return null;
		}
		return userdao.Login(user);
	}

	public IUserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(IUserDao userdao) {
		this.userdao = userdao;
	}
	
	
	

}
