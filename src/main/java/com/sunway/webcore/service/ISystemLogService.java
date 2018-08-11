package com.sunway.webcore.service;

import java.util.Map;

import com.sunway.webcore.dto.CoreAccessRecordDto;
import com.sunway.webcore.exception.BaseException;

/**
 * 系统操作日志Service接口
 *
 * @author Ken
 * @since 2017/4/7.
 */
public interface ISystemLogService {

    String ACCESS_TYPE_LOGIN = "login";
    String ACCESS_TYPE_LOGOUT = "logout";

    
    void insertAccessRecord(String userID, String userName, String accessIP, String accessType) throws BaseException;
    /**
     * 查询指定用户ID、记录类型或日期范围的登入登出记录
     *
     * @param userID       用户ID
     * @param accessType   记录类型
     * @param startDateStr 记录起始日期
     * @param endDateStr   记录结束日期
     * @return 返回一个Map， 其中键值为 data 的值为所有符合条件的记录， 而键值为 total 的值为符合条件的记录总条数
     */
    Map<String, Object> selectAccessRecord(String userID, String accessType, String startDateStr, String endDateStr) throws BaseException;

    /**
     * 分页查询指定用户ID、记录类型或日期范围的登入登出记录
     *
     * @param userID       用户ID
     * @param accessType   记录类型
     * @param startDateStr 记录起始日期
     * @param endDateStr   记录结束日期
     * @param offset       分页偏移值
     * @param limit        分页大小
     * @return 返回一个Map， 其中键值为 data 的值为所有符合条件的记录， 而键值为 total 的值为符合条件的记录总条数
     */
    Map<String, Object> selectAccessRecord(String userID, String accessType, String startDateStr, String endDateStr, int offset, int limit) throws BaseException;

    /**
     * 插入用户操作记录
     *
     * @param userID          执行操作的用户ID
     * @param userName        执行操作的用户名
     * @param operationName   操作的名称
     * @param operationResult 操作的记过
     */
    void insertUserOperationRecord(String userID, String userName, String operationName, String operationResult) throws BaseException;

    /**
     * 查询指定用户ID或日期范围的用户操作记录
     *
     * @param userID       用户ID
     * @param startDateStr 记录的起始日期
     * @param endDateStr   记录的结束日期
     * @return 返回一个Map， 其中键值为 data 的值为所有符合条件的记录， 而键值为 total 的值为符合条件的记录总条数
     */
    Map<String, Object> selectUserOperationRecord(String userID, String startDateStr, String endDateStr) throws BaseException;

    /**
     * 分页查询指定用户ID或日期范围的用户操作记录
     *
     * @param userID       用户ID
     * @param startDateStr 记录的起始日期
     * @param endDateStr   记录的结束日期
     * @param offset       分页的偏移值
     * @param limit        分页的大小
     * @return 返回一个Map， 其中键值为 data 的值为所有符合条件的记录， 而键值为 total 的值为符合条件的记录总条数
     */
    Map<String, Object> selectUserOperationRecord(String userID, String startDateStr, String endDateStr, int offset, int limit) throws BaseException;

	void insertAccessRecord(CoreAccessRecordDto recordD) throws BaseException;
}
