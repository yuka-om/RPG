package bases;

import utils.Dice;

public abstract class Human extends Living{

	public Human(String name, String weapon) {
		super(name, weapon);
	}

	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int num = Dice.get(1, 10);
		int damage = getOffensive() * num ;
		// 相手のHPをダメージ値だけ減らす
		target.hp -= damage;
		// 自分の攻撃力を1だけ減らす
		this.offensive --;
		// コンソールにステータスを表示

		System.out.printf("\n「 %s 」が「 %s 」で攻撃！「 %s 」に %d のダメージを与えた。\n", this.name, this.weapon, target.name, damage);
		System.out.println("\nしかし自分の攻撃力も1減少した。");
	}
}
