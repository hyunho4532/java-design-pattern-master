package duck_design_chapter.implement;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("아무것도 하지 않음");
	}
}