package sz.zxl.com.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import sz.zxl.com.dao.IUserDao;
import sz.zxl.com.pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

	public User Login(User user) {
		
		User u = super.getSqlSession().selectOne("sz.zxl.com.pojo.User.finduserbyname", user);
		//System.out.println("user:==>"+u.getLoginname()+"mima:"+u.getLoginpwd());
		return u;
		
	}

}
