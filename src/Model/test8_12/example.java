package Model.test8_12;
/*
        8-当我们设计类的时候要注意对equals方法的覆盖。equals方法主要的任务是判断逻辑相等的问题。他有四个基本原则：自反
性、对称性、传递性、一致性当不满足上述原则时那么此对象的实例则变成了不可预估的。当实在无法满足时复合有限与集成。
        9-关于覆盖hashcode方法。一个好的hashcode更倾向于为不相等的对象分配不想等的散列码。(详细的方法见书P41)
        10-toString方法更倾向于返回一个简单易读且信息丰富的一个表达形式。关于是否指定格式则因人而异且需要具体分析。
        11-当对象的属性只有基本数据类型和不可变对象引用时看clone1，当情况稍微复杂时看clone2，当更复杂时看clone3同样具体事
具体分析。clone框架与final变量是冲突的。
 */
public class example {
	private int ex;
	@Override
	public boolean equals(Object obj) {
		//首先判断非空性
		if (obj==null) {
			return false;
		}
		//然后判断是否属于此类
		if (!(obj instanceof example)){
			return false;
		}
		//是此类则先转化再判断
		example e=(example)obj;
		//最后判断各个关键域是否相等。
		return e.ex==ex;
	}
}
