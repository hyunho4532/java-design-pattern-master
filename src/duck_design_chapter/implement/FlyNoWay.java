package duck_design_chapter.implement;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("아무것도 하지 않음");	
	}
}