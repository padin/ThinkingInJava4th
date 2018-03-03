package com.wyizd.chapter09.section09;
/**
 * @author padin
 * @Email 913329364@qq.com
 * @createtime 2018年1月23日 下午2:55:19
 * @Title 接口和工厂
 * @Discription 接口和工厂组合,代码更优雅,扩展性更好。。。
 */
interface Game{void play();}
interface GameFactory{Game getGame();}
class FPSGame implements Game{  public void play() {System.out.println("开枪：突突突突");	}}
class RPGGame implements Game{	public void play() {System.out.println("砍刀：乒乓乒乓");	}}
class FPSGameFactory implements GameFactory{
	public Game getGame() {
		return new FPSGame();
	}
}
class RPGGameFactory implements GameFactory{
	public Game getGame() {
		return new RPGGame();
	}
}
class Player {
	private Game game;
	public void buyGame(GameFactory gameFactory) {
		this.game = gameFactory.getGame();
	}
	public void playGame() {game.play();};
}
public class InterfaceWithFactory {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.buyGame(new FPSGameFactory());
		p1.playGame();
		p1.buyGame(new RPGGameFactory());
		p1.playGame();
	}
}
