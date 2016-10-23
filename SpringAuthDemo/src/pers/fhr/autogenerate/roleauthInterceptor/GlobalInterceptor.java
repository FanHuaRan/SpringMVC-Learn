package pers.fhr.autogenerate.roleauthInterceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import pers.fhr.autogenerate.entity.Person;
/***
 * 使用拦截器进行权限控制
 * @author Administrator
 */
public class GlobalInterceptor extends HandlerInterceptorAdapter{
//	private static Logger logger =LoggerFactory.getLogger(LoginInterceptor.class);
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
		return roleControl(request, response, handler);
	}
	/**角色权限控制访问**/
	/*三个参数依次代表请求，回复，以及指向所请求的Controller的委托*/
	private boolean roleControl(HttpServletRequest request,HttpServletResponse response,Object handler){
		HttpSession session=request.getSession();
		System.out.print(handler.getClass().getName());
		if(handler instanceof HandlerMethod){
			HandlerMethod handlerMethodmethod=(HandlerMethod)handler;
			Class<?> classzz=handlerMethodmethod.getBeanType();
			Method method=handlerMethodmethod.getMethod();
	        if (classzz!=null && method != null ){
	                    boolean isClzAnnotation= classzz.isAnnotationPresent(RoleControl.class);
	                    boolean isMethondAnnotation=method.isAnnotationPresent(RoleControl.class);
	                    RoleControl rc=null;
	                    //如果方法和类声明中同时存在这个注解，那么方法中的会覆盖类中的设定。
	                    if(isMethondAnnotation){
	                        rc=method.getAnnotation(RoleControl.class);
	                    }else if(isClzAnnotation){
	                        rc=classzz.getAnnotation(RoleControl.class);
	                    }
	                    //带有注解则要进行权限判断
	                    if(rc!=null)
	                    {
		                  //判断是否具有权限
		                    boolean isAccess=true;
		                    Person person=(Person)session.getAttribute("user");
		                    if(person==null){
		                    	isAccess=false;
		                    }
		                    else {
		                    	isAccess=isHaveAutu(rc,person);
							}
		                    if(!isAccess){
			                    //401未授权访问
		                        response.setStatus(401);
		                        return false;
		                    }
	                    }
	                }
		}
		return true;
	}
	private boolean isHaveAutu(RoleControl roleControl,Person user){
		boolean isAccess=false;
		String personType=user.getPersontype().getPersonTypeName();
		for (String role : roleControl.roles()) {
			if(role.equals(personType)){
				isAccess=true;
			}
		}
		return isAccess;
	}
	
}
