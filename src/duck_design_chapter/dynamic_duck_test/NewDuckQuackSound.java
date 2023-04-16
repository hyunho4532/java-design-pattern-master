package duck_design_chapter.dynamic_duck_test;

public class NewDuckQuackSound implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("새로운 꽥꽥 소리");
	}
}