package duck_design_chapter.implement;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("나는 방법을 구현");
	}

}
