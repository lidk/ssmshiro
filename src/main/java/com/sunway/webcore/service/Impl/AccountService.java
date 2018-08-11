package com.sunway.webcore.service.Impl;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunway.webcore.dto.CoreUserInfoDto;
import com.sunway.webcore.exception.BaseException;
import com.sunway.webcore.exception.data.ExceptionDataList;
import com.sunway.webcore.service.IAccountService;
import com.sunway.webcore.service.ICoreUserInfoService;
import com.sunway.webcore.utils.MD5Util;

import java.util.Map;

/**
 * 账户Service
 *
 * @author Ken
 * @since 2017-3-1
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    private ICoreUserInfoService coreUserInfoService;

    private static final String OLD_PASSWORD = "oldPassword";
    private static final String NEW_PASSWORD = "newPassword";
    private static final String REPEAT_PASSWORD = "rePassword";
    public static final String PASSWORD_ERROR = "passwordError";
    public static final String PASSWORD_UNMATCH = "passwordUnmatched";

    /**
     * 密码更改
     */
    @Override
    public void passwordModify(String userID, Map<String, Object> passwordInfo) throws BaseException {

        /*if (passwordInfo == null)
            throw new BaseException(ExceptionDataList.PASSWORD_ERROR);

        // 获取更改密码信息
        String rePassword = (String) passwordInfo.get(REPEAT_PASSWORD);
        String newPassword = (String) passwordInfo.get(NEW_PASSWORD);
        String oldPassword = (String) passwordInfo.get(OLD_PASSWORD);
        if (rePassword == null || newPassword == null || oldPassword == null)
            throw new BaseException(ExceptionDataList.PASSWORD_ERROR);

        try {
            // 获取用户的账户信息
        	CoreUserInfoDto user = coreUserInfoService.getUserInfo(userID);
            if (user == null) {
                throw new BaseException(ExceptionDataList.PASSWORD_ERROR);
            }

            // 新密码一致性验证
            if (!newPassword.equals(rePassword)) {
                throw new BaseException(ExceptionDataList.PASSWORD_UNMATCH);
            }

            // 原密码正确性验证
            String password;
            password = MD5Util.MD5(oldPassword + userID);
            if (!password.equals(user.getPassword()))
                throw new BaseException(ExceptionDataList.PASSWORD_ERROR);

            // 获得新的密码并加密
            password = MD5Util.MD5(newPassword + userID);

            // 验证成功后更新数据库
            user.setPassword(password);
            user.setFirstLogin(false);
            coreUserInfoService.updateUserInfo(user);

            // 更新密码修改信息(是否为初次修改密码)
            Subject currentSubject = SecurityUtils.getSubject();
            Session session = currentSubject.getSession();
            session.setAttribute("firstLogin", false);

        } catch (Exception e) {
            throw new BaseException(ExceptionDataList.PASSWORD_ERROR);
        }
*/
    }

}
