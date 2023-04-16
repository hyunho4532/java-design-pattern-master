package duck_design_chapter.dynamic_duck_test;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("꽥");	
	}
}