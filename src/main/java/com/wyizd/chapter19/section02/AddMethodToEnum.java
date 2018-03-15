package com.wyizd.chapter19.section02;
/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月15日 下午5:00:48 
 * @Title 向enum中添加新方法
 * @Discription 
 */
public enum AddMethodToEnum {
	S("无敌了"),
	A("很好"),
	B("还不错"),
	C("逊爆了");
	private String desc;
	private AddMethodToEnum(String desc) {
		this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	
	public static void main(String[] args) {
		for (AddMethodToEnum s : AddMethodToEnum.values()) {
			System.out.println(s.getDesc());
		}
		System.out.println(AddMethodToEnum.A.getDesc());
		
	}
	
	
	
}
