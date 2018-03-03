package com.wyizd.chapter14.section04;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午6:51:16
 * @Title 
 * @Discription 
 */
public class OilFilter extends Filter {
	public static class Fac implements Factory<OilFilter> {
		@Override
		public OilFilter create() {
			return new OilFilter(); 
		}
		
	}
}
