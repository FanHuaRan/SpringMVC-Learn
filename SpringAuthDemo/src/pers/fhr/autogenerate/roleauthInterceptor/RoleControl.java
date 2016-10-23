package pers.fhr.autogenerate.roleauthInterceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Order(Ordered.HIGHEST_PRECEDENCE)
public @interface RoleControl {
	/**角色类型，以便具有相关权限**/
	String[] roles() default "user";
}
