package Model.test2;
/*
        Builder模式是在类的内部维护一个静态内部类成员作为一个代理类，用户首先创建一个Builder对象时只含有必要参数的
然后使用setter方法给Builder对象赋值，最后调用Build方法将Builder对象传入就完成了对原来对象的赋值，并且在这个过程中
是线程安全的且原类对象时不可变的。
 */
public class Builder_pattern {
	//各项属性
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;    
    public static class builder {
		//必选参数
        private int servingSize;
        private int servings;
        
        //可选参数
        private int calories=0;
        private int fat=0;
        private int sodium=0;
        private int carbohydrate=0;
        public builder(int servingSize,int servings) {
        	this.servings=servings;
        	this.servingSize=servingSize;
		}
        public builder calories(int values) {
			calories=values;
			return this;
		}
        public builder fat(int values) {
        	fat=values;
			return this;
		}
        public builder sodium(int values) {
        	sodium=values;
			return this;
		}
        public builder carbohydrate(int values) {
        	carbohydrate=values;
			return this;
		}
        public Builder_pattern build() {
			return new Builder_pattern(this);
		}
	}
    private Builder_pattern(builder b) {
    	servingSize=b.servingSize;
    	servings=b.servings;
    	fat=b.fat;
    	calories=b.calories;
    	carbohydrate=b.carbohydrate;
    	sodium=b.sodium;
	}
    public static void main(String[] args) {
    	//通过这个类似setter方法返回builder对象的方式将属性全部链接在了一起，保证了线程安全，最后在调用build方法统一赋值。
		Builder_pattern bp=new Builder_pattern.builder(120, 5).calories(6).carbohydrate(1).fat(4).sodium(12).build();
	}
}
