package com.wyizd.chapter17.section03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author padin 
 * @Email 913329364@qq.com
 * @createtime 2018年3月14日 下午2:27:40 
 * @Title	Collection的功能方法 
 * @Discription 
 */
public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		/*
		 *    	@param e element whose presence in this collection is to be ensured
		 * 		@return <tt>true</tt> if this collection changed as a result of the
		 */
		coll.add("hello");
		/*
		 * @param c collection containing elements to be added to this collection
	     * @return <tt>true</tt> if this collection changed as a result of the call
	     */
		coll.addAll(new ArrayList<>());
		 /**
	     * Removes all of the elements from this collection (optional operation).
	     * The collection will be empty after this method returns.
	     */
		coll.clear();
		
		/*
		 *  @param o element whose presence in this collection is to be tested
	     * @return <tt>true</tt> if this collection contains the specified
	     *         element 如果集合包含这个参数,则返回true
	     */
		coll.contains("hello");
		/*
	 	* @param  c collection to be checked for containment in this collection
	 	* @return <tt>true</tt> if this collection contains all of the elements
	 	*         in the specified collection 如果集合包含所有的参数,则返回true
		 */
		coll.containsAll(new ArrayList<>());
		//   @return <tt>true</tt> if this collection contains no elements
		// 如果这个集合没有元素，则返回true
		coll.isEmpty();
		// @return an <tt>Iterator</tt> over the elements in this collection
		//	返回一个迭代器来遍历这个集合的元素
		coll.iterator();
		/*
		   * @param o element to be removed from this collection, if present
		   * 从集合中删除这个元素，如果准确的话
		   * @return <tt>true</tt> if an element was removed as a result of this call
		   * 返回是否已经删除
		   * 
		 */
		coll.remove("hello");
		/*
		 * @param c collection containing elements to be removed from this collection
		 * 删除参数的元素
		 * @return <tt>true</tt> if this collection changed as a result of the call
		 * 如果集合元素改变，则返回true
		 */
		coll.removeAll(new ArrayList());
		/*
		 * @param c collection containing elements to be retained in this collection
		 * 保留参数中的元素
		 * @return <tt>true</tt> if this collection changed as a result of the call
		 * 如果集合元素改变，则返回true
		 */
		coll.retainAll(new ArrayList());
		//  * @return the number of elements in this collection
		//	返回元素的数量
		coll.size();
		// @return an array containing all of the elements in this collection
		//	返回一个数组包含集合所有元素
		coll.toArray();

	}
}
