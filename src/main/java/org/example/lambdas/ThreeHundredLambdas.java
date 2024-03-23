package org.example.lambdas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeHundredLambdas {

    static int buffMultiplier = 1;
    final static int bossHP = 30000;
    final static int enemyArmySize = 100000;

    public static void main(String[] args) {
        //Zbliża się Armia Ciemności!
        ArmyOfDarkness armyOfDarkness = new ArmyOfDarkness();

        //Naprzeciw armii ciemności staje 300 niezłomnych bohaterów Lambda!
        List<LambdaHero> lambdaHeroes = new ArrayList<>();

        LambdaWizard hero1 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero1);
        LambdaWarrior hero2 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero2);
        LambdaCleric hero3 = () -> buffUp();
            lambdaHeroes.add(hero3);
        LambdaWarrior hero4 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero4);
        LambdaWizard hero5 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero5);
        LambdaWizard hero6 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero6);
        LambdaWizard hero7 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero7);
        LambdaWarrior hero8 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero8);
        LambdaCleric hero9 = () -> buffUp();
            lambdaHeroes.add(hero9);
        LambdaWizard hero10 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero10);
        LambdaWizard hero11 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero11);
        LambdaCleric hero12 = () -> buffUp();
            lambdaHeroes.add(hero12);
        LambdaWarrior hero13 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero13);
        LambdaWizard hero14 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero14);
        LambdaWarrior hero15 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero15);
        LambdaWarrior hero16 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero16);
        LambdaWizard hero17 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero17);
        LambdaWizard hero18 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero18);
        LambdaWarrior hero19 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero19);
        LambdaWizard hero20 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero20);
        LambdaWarrior hero21 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero21);
        LambdaCleric hero22 = () -> buffUp();
            lambdaHeroes.add(hero22);
        LambdaWizard hero23 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero23);
        LambdaWizard hero24 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero24);
        LambdaWizard hero25 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero25);
        LambdaWarrior hero26 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero26);
        LambdaWizard hero27 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero27);
        LambdaWizard hero28 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero28);
        LambdaWarrior hero29 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero29);
        LambdaWizard hero30 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero30);
        LambdaWizard hero31 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero31);
        LambdaWarrior hero32 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero32);
        LambdaWarrior hero33 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero33);
        LambdaWizard hero34 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero34);
        LambdaCleric hero35 = () -> buffUp();
            lambdaHeroes.add(hero35);
        LambdaWarrior hero36 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero36);
        LambdaWarrior hero37 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero37);
        LambdaWizard hero38 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero38);
        LambdaWizard hero39 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero39);
        LambdaWizard hero40 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero40);
        LambdaWarrior hero41 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero41);



        standYourGround(lambdaHeroes, armyOfDarkness);
        finalReport(armyOfDarkness, lambdaHeroes);
        nextHeroes();
    }

    private static void standYourGround(List<LambdaHero> lambdaHeroes, ArmyOfDarkness armyOfDarkness) {
        for (LambdaHero lambdaHero : lambdaHeroes) {
            if (lambdaHero instanceof LambdaWizard){
                LambdaWizard wizard = (LambdaWizard) lambdaHero;
                wizard.attackUndeadArmy(randomSpell(), armyOfDarkness);
            }
            else if (lambdaHero instanceof LambdaWarrior){
                LambdaWarrior warrior = (LambdaWarrior) lambdaHero;
                warrior.attackOverlord(armyOfDarkness);
            }
            else{
                LambdaCleric cleric = (LambdaCleric) lambdaHero;
                cleric.buffAllies();
            }
        }
    }


    interface LambdaWizard extends LambdaHero{
        void attackUndeadArmy(Spell spell, ArmyOfDarkness army);
    }

    interface LambdaWarrior extends LambdaHero{
        int attackOverlord(ArmyOfDarkness overlord);
    }

    interface LambdaCleric extends LambdaHero{
        void buffAllies();
    }

    interface LambdaHero{}

    static class ArmyOfDarkness{
        int lichOverlordHealth = bossHP;
        Queue<UndeadSoldier> undeadSoldiers = new LinkedList<>();

        public ArmyOfDarkness() {
            for (int i = 0; i < enemyArmySize; i++) {
                undeadSoldiers.add(new UndeadSoldier());
            }
            System.out.println("Król Lich: Nikt nie pokona mojej armii ciemności!");
        }

        int attackOverlord(int damage){
            lichOverlordHealth -= damage;
            report(Target.OVERLORD, damage);
            if (lichOverlordHealth <= 0) System.out.println("Cooo!? To niemożliwe! Nikt nie może mnie pokonać!");
            return damage;
        }
    }
    static class UndeadSoldier{}

    static int random(){
        return buffMultiplier * ThreadLocalRandom.current().nextInt(1, 100);
    }

    static void report(Target target, int damage){
        if (target.equals(Target.OVERLORD)) System.out.println(" -->Król Lich stracił " + damage + " punktów życia!");
        else System.out.println(" -->Siły ciemności straciły " + damage + " nieumarłych żołnierzy!");
    }

    static void finalReport(ArmyOfDarkness army, List<LambdaHero> heroes){
        System.out.println();
        int fallenUndead = enemyArmySize - army.undeadSoldiers.size();
        System.out.println("Walka dobiegła końca. Armia ciemności straciła " + fallenUndead + " nieumarłych żołnierzy.");
        int bossHpLeft = army.lichOverlordHealth;
        System.out.println("Królowi Lich zostało " + bossHpLeft + " punktów życia i musiał uciekać, a jego armia popadła w rozsypkę.");
        int fallenHeroes = heroes.size();
        System.out.println(fallenHeroes + " dzielnych bohaterów walczyło i oddało życie za naszą wolność. Niech ich pamięć trwa na wieki!");
    }

    static void castAoeSpell(Spell spellName, Queue<UndeadSoldier> army){
        int aoe = random();
        System.out.print("Jeden z czarodziejów rzuca czar: " + spellName);
        for (int i = 0; i < aoe; i++) {
            army.poll();
        }
        report(Target.SOLDIER, aoe);
    }

    static int meleeAttack(){
        System.out.print("Jeden z wojowników atakuje nieumarłego króla!");
        return random();
    }

    static void buffUp(){
        System.out.println("Jeden z kapłanów nakłada błogosławieństwo na naszych bohaterów!");
        buffMultiplier++;
    }

    static Spell randomSpell(){
        int random = ThreadLocalRandom.current().nextInt(0, Spell.values().length);
        return Spell.values()[random];
    }

    static void nextHeroes(){
        System.out.println("--------------");
        for (int i = 0; i < 5; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, 100);;
            Hero hero = Hero.CZARODZIEJ;
            if (random > 50 && random < 80) hero = Hero.WOJOWNIK;
            else if (random >= 80 && random < 94) hero = Hero.KAPŁAN;
            else if (random >= 94) hero = Hero.ŁOTRZYK;
            System.out.println("Kolejny bohater: " + hero);
        }
    }

    enum Target{OVERLORD, SOLDIER}

    enum Hero{CZARODZIEJ, WOJOWNIK, KAPŁAN, ŁOTRZYK}

    enum Spell{Deszcz_meteorów, Kula_ognia, Maelstorm, Trzęsienie_ziemi, Wyładowanie_łańcuchowe, Eksplozja, Implozja, Piorun_kulisty, Śnieżyca, Wulkan, Gejzer, Ognista_chmura, Gradobicie}

}
