package Model.test21;

import java.io.Serializable;
import java.util.Comparator;


/*
        Java中的函数对象主要是用来实现策略模式的我们需要声明一个接口来表示这个策略，并且为具体的每个策略实现该接口，当我
们使用时通常由两种方法，要么是匿名内部类直接实现要么就是实例化。当一个具体策略有可能被重用时它的类要要被实现为私有的
静态成员类，并通过共有的静态final域导出。
 */
public class Host {
	private static class StrLenCmp implements Comparator<String>,Serializable{

		@Override
		public int compare(String o1, String o2) {
			return o1.length()-o2.length();
		}
	}
	public static final Comparator<String> STRING_LENGTH_COMPARTOR=new StrLenCmp();
	
}
