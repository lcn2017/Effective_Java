package Model.test3;
/*
        实现单例模式的最佳方式就是单元素的枚举类型。(Singleton)
另外两种是将共有成员设置成static final，第二种是将公有对象设置成静态工厂方法。 
 */
public enum Elvis {
	INSTANCE;
	public void leaveTheBuilding() {
		
	}
}
class Elvis1{
	public static final Elvis1 INSTANCE = new Elvis1();
	private Elvis1(){
		
	}
	public void leaveTheBuilding() {
		
	}
}
class Elvis2{
	private static final Elvis2 INSTANCE=new Elvis2();
	private Elvis2(){
		
	}
	public void leaveTheBuilding() {
		
	}
	public Elvis2 getInstance() {
		return INSTANCE;
	}
}