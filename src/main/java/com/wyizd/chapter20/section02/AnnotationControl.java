package com.wyizd.chapter20.section02;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wyizd.chapter20.section01.UseCase;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午8:45:22 
 * @Title 编写注解处理器
 * @Discription 
 * 注解定义好了,其实就是标记上,方便我们读取
 * 
 */
class PasswordUtil{
	@UseCase(id = 1,description="密码至少包含一个数字")
	public boolean validatePassword(String password) {
		return password.matches("\\W*\\d\\W*");
	}
}
public class AnnotationControl {
	public static void trackUseCases(List<Integer> useCases,Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc!=null) {
				System.out.println("找到用例："+uc.id()+" "+uc.description());
				useCases.remove(uc.id());
			}
		}
	}
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<>();
		Collections.addAll(useCases, 1,2,3,4);
		trackUseCases(useCases,PasswordUtil.class);
	}
}
