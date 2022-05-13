public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void DarkMoon(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Dark Moon (Damage - 40 , Mana Cost - 20)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Moongazing(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Moongazing (Damage - 45 , Mana Cost - 30)");
        int damagePoints = 45;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Moonlit(Character characterName) {
        System.out.println("Use Heal");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println(super.characterName + " Use Moonlit (Heal - 45)");
        int healPoints = 45;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }

    public void BloodMoon(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Blood Moon (Damage - 55 , Mana Cost - 15)");
        int damagePoints = 55;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);
    }
}