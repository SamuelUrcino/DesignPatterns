package Dungeon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryTests {
	
	
	//start HeroFactory test
	@Test
	public void getHero_doesntThrowException()
	{
		
		AttackFactory attackFactory = new AttackFactory();
		HeroFactory hero = new HeroFactory(attackFactory);
	
		String heroName = "thief";
		
		hero.createHero(heroName);
	}
	
	@Test
	public void getHero_doesntThrowExceptionEmptyString()
	{
		
		AttackFactory attackFactory = new AttackFactory();
		HeroFactory hero = new HeroFactory(attackFactory);
	
		String heroName = " ";
		
		hero.createHero(heroName);
	}
	//end HeroFactory
	
	
	
	//Start MonsterFactory test
	@Test
	public void testCreateMonster()
	{
		AttackFactory attackFactory = new AttackFactory();
		MonsterFactory monster = new MonsterFactory(attackFactory);
		
		monster.createMonster();
	}
	//end MonsterFactory
	
	
	
}
