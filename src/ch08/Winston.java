package ch08;

public class Winston implements Attack, Movement {

	@Override
	public void left() {
		System.out.println("윈스톤이 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("윈스톤이 오른쪽으로 이동합니다.");
	}

	@Override
	public void forward() {
		System.out.println("윈스톤이 앞으로 이동합니다.");
	}

	@Override
	public void backward() {
		System.out.println("윈스톤이 후진합니다.");
	}

	@Override
	public void attack() {
		System.out.println("윈스톤이 테슬라 캐논으로 공격합니다.");
	}

	@Override
	public void skill() {
		System.out.println("윈스톤이 점프 팩을 사용합니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("윈스톤이 궁극기인 원시의 분노를 사용합니다.");
	}

}
