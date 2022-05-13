public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Battle Begin!");
        System.out.println("Wizards and Warlocks");
        System.out.println("Both Fighter Have 200 HP and 200 Mana");
        System.out.println("~~~~~~~~~~~~~~~~~~");

        Wizard Lass = new Wizard("Lass");
        Warlock Bimbogami = new Warlock("Bimbogami");
        Lass.DeathScythe(Bimbogami);
        Lass.RagingSun(Bimbogami);
        Bimbogami.DarkMoon(Lass);
        Lass.SunHalo(Bimbogami);
        Bimbogami.Moongazing(Lass);
        Bimbogami.Moonlit(Bimbogami);
        Lass.TransparentWorld(Lass);
        Lass.FakeRainbow(Bimbogami);
        Bimbogami.BloodMoon(Lass);
        Lass.SolarRadiance(Bimbogami);

    }
}

