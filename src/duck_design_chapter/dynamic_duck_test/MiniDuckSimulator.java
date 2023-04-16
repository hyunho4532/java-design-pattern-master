package duck_design_chapter.dynamic_duck_test;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setQuackBehavior(new NewDuckQuackSound());
		model.performFly();
	}
}
