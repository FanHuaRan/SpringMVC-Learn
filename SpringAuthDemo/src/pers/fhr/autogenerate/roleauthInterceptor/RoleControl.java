package pers.fhr.autogenerate.roleauthInterceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;


/**
 * 使用角色类型作为注解 也就是说我们的权限控制是横向控制
 * 如果使用权限作为注解，就是纵向，更为精细和灵活
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RoleControl {
	/**角色类型，以便具有相关权限**/
	String[] roles() default "user";
}
