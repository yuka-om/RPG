package bases;

import utils.Dice;

public abstract class Monster extends Living{

	public Monster(String name, String weapon) {
		super(name,weapon);
	}

	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int num = Dice.get(1, 10);
		int damage = getOffensive() * num ;
		// 相手のHPをダメージ値だけ減らす
		target.hp -= damage;

		// コンソールにステータスを表示
		System.out.printf("\n「 %s 」が「 %s 」で攻撃！「 %s 」に %d のダメージを与えた。\n",name, weapon, target.name, damage);
	}
}
