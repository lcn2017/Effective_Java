package Model.test6;

import java.util.Arrays;
import java.util.EmptyStackException;
/*
        内存泄漏的问题常见的三个原因
        第一个原因是类自己管理内存，就需要注意内存泄漏的问题。
        第二个常见的原因就是缓存。
        第三个原因就是来源于监听器和其它回调。
 */
public class Stack {
	private Object[] elements;
	private int size=0;
	private static final int DEFAULT_INITIAL_CAPACITY=16;
	public Stack() {
		elements=new Object[DEFAULT_INITIAL_CAPACITY];
	}
	public void push(Object e) {
		ensureCapacity();
		elements[size++]=e;
	}
	/*
	 这样写pop方法会产生内存溢出的问题，过期的引用一直被保存
	public Object pop() {
		if (size==0) {
			throw new EmptyStackException();
		}
		return elements[--size];
	}*/
	//将过期引用消除就可以解决当前的问题。
	public Object pop() {
		if (size==0) {
			throw new EmptyStackException();
		}
		Object result=elements[--size];
		elements[size]=null;
		return result;
	}
	private void ensureCapacity() {
		if (elements.length==size) {
			elements=Arrays.copyOf(elements, 2*size+1);
		}
	}
}
