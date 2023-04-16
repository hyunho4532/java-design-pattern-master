package duck_design_chapter.duck_test;

public class MuteQuack implements QuackBehavior {
	
	@Override
	public void quack() {
		System.out.println("<< 조용~ >>");
	}
}