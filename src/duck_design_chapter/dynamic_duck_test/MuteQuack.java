package duck_design_chapter.dynamic_duck_test;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("<< 조용~ >>");
	}
}