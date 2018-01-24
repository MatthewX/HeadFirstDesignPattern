package intro;

public class ModelDuck extends Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
