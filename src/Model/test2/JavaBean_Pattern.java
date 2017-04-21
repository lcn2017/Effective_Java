package Model.test2;
/*
    当创建对象时构造器中有多个参数，其中必选和可选各有很多时，如果采用单纯的重叠构造器(telescoping constructor)方法
即将每个参数逐层加入每个构造器，但是十分麻烦。所以我们有两种选择，现在是JavaBeen模式 
    这个模式是调用一个无参的构造器，然后通过setter方法对每个参数进行赋值
 */

public class JavaBean_Pattern {
	//各项属性
    private int servingSize=-1;
    private int servings=-1;
    private int calories=0;
    private int fat=0;
    private int sodium=0;
    private int carbohydrate=0;
    
    public JavaBean_Pattern() {
    	
	}

    public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}}
