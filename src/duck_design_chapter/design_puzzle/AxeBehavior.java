package duck_design_chapter.design_puzzle;

public class AxeBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("도끼로 찍는 행동");		
	}
}