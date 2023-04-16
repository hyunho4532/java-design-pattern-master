package duck_design_chapter.dynamic_duck_test;

public class FlyWithWings implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("날고 있어요!!");
	}
}