package wusc.edu.web.user.base;

import wucs.edu.facade.user.entity.PmsUser;


public interface UserLoginedAware {

    /**
     * 取得登录的用户
     *
     * @return
     */
    public PmsUser getLoginedUser();
}
