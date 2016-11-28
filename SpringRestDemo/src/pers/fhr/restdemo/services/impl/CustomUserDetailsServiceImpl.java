package pers.fhr.restdemo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.GrantedAuthority;

import pers.fhr.restdemo.entity.Person;
import pers.fhr.restdemo.services.IPersonService;
/**
 * Spring Security用户服务类 获取用户信息和权限
 * @author FHR
 * @time 2016/11/28 10:08
 * 
 */
public class CustomUserDetailsServiceImpl implements UserDetailsService{
	private IPersonService personService;
	@Autowired
	public void setPersonService(IPersonService personService){
		this.personService=personService;
	}
	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException {
		Person user= personService.findById(new Integer(arg0));
        System.out.println("User : "+user);  
        if(user==null){  
            System.out.println("User not found");  
            throw new UsernameNotFoundException("Username not found");  
        }  
        return new org.springframework.security.core.userdetails.User(user.getPersonId().toString(), user.getPassword(),   
                true, true, true, true, getGrantedAuthorities(user));  
	}
	//权限在Spring Security中是以我们平常认为的角色来体现的
    private List<GrantedAuthority> getGrantedAuthorities(Person user){ 
        //实例化权限集合
    	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();  
        //获取角色到集合中 一个人可能由多种角色 不太支持 
       authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getPersontype().getPersonTypeName()));  
        System.out.print("authorities :"+authorities);  
        return authorities;  
    }  
}
