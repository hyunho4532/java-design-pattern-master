package duck_design_chapter.design_puzzle;

public class SwordBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("검을 휘두르는 행동");
	}
}