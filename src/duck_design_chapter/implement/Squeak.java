package duck_design_chapter.implement;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("고무 오리의 삑삑");	
	}
}