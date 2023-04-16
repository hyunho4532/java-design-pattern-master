package duck_design_chapter.design_puzzle;

public class BowAndArrowBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("화살을 쏘는 행동을 구현");		
	}
}