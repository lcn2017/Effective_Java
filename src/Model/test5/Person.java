package Model.test5;

import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
/*
        创建对象要考虑尽可能的重复利用，如果新建的都是功能一样的就没必要新建。比如下面的例子，如果像注释一样写
isBabyBommer()方法则每次调用都会创建一个新的Calendar对像，浪费内存和资源。

        本条还有另外一点看main方法
 */
public class Person {
	private final Date birthDay;
	public Person(Date birthDay) {
		this.birthDay=birthDay;
	}
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	
	static{
		Calendar gmtCal=Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY,1,0,0,0);
		BOOM_START=gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY,1,0,0,0);
		BOOM_END=gmtCal.getTime();
	}
	
	public boolean isBabyBoomer() {
		/* 
		 Calendar gmtCal=Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY,1,0,0,0);
		BOOM_START=gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY,1,0,0,0);
		BOOM_END=gmtCal.getTime();
		 */
		return birthDay.compareTo(BOOM_START)>=0&&birthDay.compareTo(BOOM_END)<0;
	}
	//因为sum被定义为LONG类型(long的装箱类型)就导致运算速度大幅下降，所以如果可以优先使用基本数据类型。
	public static void main(String[] args) {
		Long sum=0l;
		for(long i=0;i<Integer.MAX_VALUE;i++){
			sum+=i;
		}
	}
}
