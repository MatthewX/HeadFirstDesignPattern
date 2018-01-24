package intro;

public class MallardDuck extends Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
