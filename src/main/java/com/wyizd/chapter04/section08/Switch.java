package com.wyizd.chapter04.section08;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月22日 上午7:08:57
 * @Title switch
 * @Discription 
 * switch 常用来替换 多个 if else 语句
 * 语法
 * switch(参数值){
 * 	case 值: 路径一 ;break;
 * 	case 值: 路径二 ;break;
 * 	case 值: 路径三 ;break;
 * 	case 值: 路径四 ;break;
 * 	
 * 	default 默认路径;
 * }
 * 
 * 1.当参数值与 case 后的值相同时,会执行相应的路径.直到遇见break;
 * 2.break可以跳出switch语句。如果没有遇到break,匹配到之后经过的路径都会被执行;
 * 3.defalut 通常写到最后,如果没有break跳出，执行到default时，将会执行默认路径
 * 4.JDK1.7之后,参数值才可以使用字符串，之前只能使用整数类型
 * 
 */
public class Switch {
	
	public static void main(String[] args) {
		String string= "第三关";
		switch (string) {
		case "第四关":
			System.out.println("你通过了第四关");
		case "第三关":
			System.out.println("你通过了第三关");
		case "第二关":
			System.out.println("你通过了第二关");
		case "第一关":
			System.out.println("你通过了第一关");
			break;
		default:
			System.out.println("Game over");
			break;
		}
	}

}
