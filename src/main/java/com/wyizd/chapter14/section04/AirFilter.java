package com.wyizd.chapter14.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午6:51:16
 * @Title 
 * @Discription 
 */
public class AirFilter extends Filter {
	public static class Fac implements Factory<AirFilter> {
		@Override
		public AirFilter create() {
			return new AirFilter(); 
		}
		
	}
}
