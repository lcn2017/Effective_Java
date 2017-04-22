package Model.test7;
/*
        我们不应该仅抱希望与与终结方法来结束对象或进程，因为终结方法在JVM中的调用时间，调用性能甚至于是否调用都有区别。
所以我们应该有一个显示的终止方法(利用try finally块来进行制作)提供给客户端让客户手动去关闭。
        但是终结方法并不是完全无用，第一他可以充当终止方法的安全网。第二可以充当本地对等体。所以当我们充当安全网或者想要
终止非关键的本地资源时可以使用终结方法。但如果想将终结方法和非final的公有对象连接起来时则需要下面这个例子-->终结方法守
卫者(finalizer guardian )
 
 */
public class Foo {
	//终结方法守卫者就是一个私有化的匿名内部类，这个匿名内部类继承了父类的终结方法，这样即使外围类没有继承或调用终结方法也无妨
	private final Object finalizerGuardian = new Object(){
		@Override
		protected void finalize() throws Throwable{
			super.finalize();
		}
	};
	//外围就可以不继承终结方法，而去关心其他的功能方法
}
