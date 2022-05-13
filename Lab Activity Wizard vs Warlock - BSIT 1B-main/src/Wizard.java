public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void DeathScythe(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Death Scythe (Damage - 45 , Mana Cost - 10)");
        int damagePoints = 45;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void RagingSun(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Raging Sun (Damage - 55 , Mana Cost - 10)");
        int damagePoints = 55;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 10;
        manaTarget(enemyCharacter, manaPoints);

    }


    public void TransparentWorld(Character characterName) {
        System.out.println(super.characterName + " Use Transparent World (Heal - 75)");
        int healPoints = 75;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void FakeRainbow(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Fake Rainbow (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void SolarRadiance(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Solar Radiance (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

    public void SunHalo(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Sun Halo (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

    }

}