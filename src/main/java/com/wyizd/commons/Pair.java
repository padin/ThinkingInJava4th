package com.wyizd.commons;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月24日 下午6:23:23
 * @Title 
 * @Discription 
 */
public class Pair<K, V>
{
  public final K key;
  public final V value;
  
  public Pair(K k, V v)
  {
    this.key = k;
    this.value = v;
  }
}
