package com.sunway.webcore.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunway.webcore.dto.CoreUserInfoDto;
import com.sunway.webcore.service.ISystemLogService;

/**
 * Shiro Session 监听器
 * 当Shiro 的 session 被创建、注销或过期的时候触发
 *
 * @author ken
 * @since 2017/7/22.
 */
public class SessionListener extends SessionListenerAdapter {

    @Autowired
    private ISystemLogService systemLogService;

    @Override
    public void onStart(Session session) {
        super.onStart(session);
    }

    @Override
    public void onStop(Session session) {
        super.onStop(session);
        sessionDestroyedLog(session);
    }

    @Override
    public void onExpiration(Session session) {
        super.onExpiration(session);
        sessionDestroyedLog(session);
    }

    /**
     * 当 Shiro Session 被销毁时， 对已登陆的用户记录访问日志
     *
     * @param session 被销毁的 Session
     */
    private void sessionDestroyedLog(Session session) {
        // 判断是否为已经登陆的用户, 判断依据是isAuthentication的值
        CoreUserInfoDto userInfo = (CoreUserInfoDto) session.getAttribute("userInfo");
        if (userInfo != null) {
            try {
                // 记录登出日志
                systemLogService.insertAccessRecord(userInfo.getUserID(), userInfo.getUserName(),
                        userInfo.getAccessIP(), ISystemLogService.ACCESS_TYPE_LOGOUT);
            } catch (Exception e) {
                // do log
            }
        }
    }
}
