package com.sunway.webcore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunway.webbase.BaseResult;
import com.sunway.webbase.provider.SuperController;
import com.sunway.webcore.dto.ValidationTestDto;
import com.sunway.webcore.entity.CorePermission;
import com.sunway.webcore.entity.CoreTest;
import com.sunway.webcore.entity.CoreUser;
import com.sunway.webcore.exception.BaseException;
import com.sunway.webcore.exception.CustomException;
import com.sunway.webcore.exception.data.ExceptionDataList;
import com.sunway.webcore.service.ICorePermissionService;
import com.sunway.webcore.service.ICoreTestService;
import com.sunway.webcore.service.ICoreUserInfoService;
import com.sunway.webcore.service.Impl.CorePermissionService;
import com.sunway.webcore.service.Impl.CoreTestService;
import com.sunway.webcore.service.Impl.CoreUserInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(path = "api/Account")
@Api(tags = "测试类")
public class AccountController extends SuperController {

	@Autowired
	private ICoreUserInfoService coreUserInfoService;

	@Autowired
	private ICoreTestService coreTestService;
	
	@Autowired
	private ICorePermissionService corePermissionService;

	@ApiOperation(value = "根据学生的name，获得单个学生的信息", notes = "根据学生的name，查询学生对象的信息。")
	@ApiImplicitParam(name = "name", value = "学生的名称", required = true, dataType = "String")
	@RequestMapping(value = "getStudentByName", method = RequestMethod.POST)
	public String getStudentByName(String name) {
		return "";
	}

	@ApiOperation(value = "根据学生的name，获得单个学生的信息", notes = "根据学生的name，查询学生对象的信息。")
	@ApiImplicitParam(name = "name", value = "学生的名称", required = true, dataType = "String")
	@RequestMapping(value = "getTest", method = RequestMethod.GET)
	public List<String> getTest(String name) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		return list;
	}

	@ApiOperation(value = "根据学生的name，获得单个学生的信息", notes = "根据学生的name，查询学生对象的信息。")
	@ApiImplicitParam(name = "name", value = "学生的名称", required = true, dataType = "String")
	@RequestMapping(value = "AddTest", method = RequestMethod.GET)
	public int AddTest() {
		try {
			CoreUser record = new CoreUser();
			CoreUser record1 = new CoreUser();
			CoreUser record2 = new CoreUser();
			List<CoreUser> listecord = new ArrayList<CoreUser>();

			record.setUsername("1111111");
			record1.setUsername("3333333");
			record2.setUsername("222222");
			listecord.add(record);
			listecord.add(record1);
			listecord.add(record2);
			// testService.Test();
			coreUserInfoService.insert(record, true);
			coreUserInfoService.insert(listecord);
			
			return 0;
		} catch (BaseException ex) {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		}
	}

	@RequestMapping(value = "TestAdd", method = RequestMethod.POST)
	public CoreTest TestAdd() {
		try {
			CoreTest recode = new CoreTest();
			recode.setCode("11111");
			coreTestService.insert(recode, true);
			return recode;
		} catch (BaseException ex) {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		}
	}

	@RequestMapping(value = "ExceptionTest", method = RequestMethod.POST)
	public int ExceptionTest() {
		try {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		} catch (BaseException ex) {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		}
	}

	@RequestMapping(value = "NameTest1", method = RequestMethod.GET)
	public String GetNameTest() {
		try {
			System.out.println(coreTestService.getClass());
			return coreTestService.ReturnClassName();
		} catch (BaseException ex) {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		}
	}

	@RequestMapping(value = "NameTest2", method = RequestMethod.GET)
	public String GetNameTest2(@Valid ValidationTestDto TestDto) {
		try {
			return coreTestService.ReturnClassName();
		} catch (BaseException ex) {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		}
	}

	@RequestMapping(value = "LogTest", method = RequestMethod.GET)
	public String LogTest() {
		try {
			for (int j = 0; j < 5; j++) {
				for (int i = 0; i < 3; i++) {
					Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
					logger.info("testOrigin");
				}
			}
			return coreTestService.ReturnClassName();
		} catch (BaseException ex) {
			throw new BaseException(ExceptionDataList.SERVER_ERROR);
		}
	}
	
	
	@RequestMapping("login")
	public String login(HttpServletRequest request)throws Exception{
		System.out.println("---login");
		//如果登陆失败从request中获取认证异常信息，shiroLoginFailure就是shiro异常类的全限定名
		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
		//根据shiro返回的异常类路径判断，抛出指定异常信息
		if(exceptionClassName!=null){
			if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
				//最终会抛给异常处理器
				throw new CustomException("账号不存在");
			} else if (IncorrectCredentialsException.class.getName().equals(
					exceptionClassName)) {
				throw new CustomException("用户名/密码错误");
			} else if("randomCodeError".equals(exceptionClassName)){
				throw new CustomException("验证码错误 ");
			}else {
//				throw new Exception();//最终在异常处理器生成未知错误
			}
		}
		//此方法不处理登陆成功（认证成功），shiro认证成功会自动跳转到上一个请求路径
		//登陆失败还到login页面
		return "login";
	}
	
	@RequestMapping("welcome")
	@RequiresPermissions("user.userManger")
	public String welcome(){
		System.out.println("'asdsadasdADADADS");
		return "welcome";	
	}
	
	@RequestMapping(value = "getAll", method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions("user.userManager")
	public BaseResult getAll(){
		System.out.println("1231312gerAll");
		BaseResult list =  coreUserInfoService.selectAll();
		return list;
	}
	
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	@ResponseBody
	@RequiresPermissions("user.add")
	public void  addUser(){
		System.err.println("addUser");
		List<CorePermission> per = corePermissionService.testSelect();
		
		for (CorePermission coreUser : per) {
			System.out.println("-----------------------------");
			System.out.println(coreUser);
			System.out.println("-----------------------------");
		}
		System.out.println("添加用户");
	}
	
	
	@RequestMapping("nimabi")
	public void test(){
		List<CorePermission> per = corePermissionService.getPermissionsByUserid("1");
		
		
		for (CorePermission coreUser : per) {
			System.out.println("-----------------------------");
			System.out.println(coreUser);
			System.out.println("-----------------------------");
		}
	}
}
