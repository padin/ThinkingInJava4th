package com.wyizd.chapter20.section01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午8:30:06 
 * @Title 基本语法
 * @Discription
 * 	内置注解：
 * 	@Override	复写
 * 	@Deprecated  过时(d是小写的，但是如果我小写，就代表这个类过时了^.^)
 * 	@SuppressWarnings	压制警告
 * 	定义注解的注解叫做元注解
 * 		@Target	表示该注解可以运用于什么地方
 * 			CONTRUCTOR:构造器
 * 			FIELD:字段
 * 			LOCAL_VARIABLE:局部变量
 * 			METHOD：方法
 * 			PACKAGE:包
 * 			PARAMETER:参数
 * 			TYPE:类
 * 			
 * 		@Retention	保存级别
 * 			SOURCE:编译丢失
 * 			CLASS:VM丢失
 * 			RUNTIME:运行时也保留(可反射)
 * 		@Documented	包含到JAVADOC
 * 		@Inherited	允许子类继承该注解
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase{
	public int id();
	public String description() default "no description";
}

