package org.example.lambdas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeHundredLambdas {

    static int buffMultiplier = 1;

    public static void main(String[] args) {
        //Zbliża się Armia Ciemności!
        ArmyOfDarkness armyOfDarkness = new ArmyOfDarkness();

        LambdaWizard hero1 = (warcry, army) -> castAoeSpell(warcry, army.undeadSoldiers);
        hero1.attackUndeadArmy("Deszcz meteorów!", armyOfDarkness);

        LambdaWarrior hero2 = overlord -> overlord.attackOverlord(meleeAttack());
        hero2.attackOverlord(armyOfDarkness);

        LambdaCleric hero3 = () -> buffUp();
        hero3.buffAllies();

        nextHero();

    }

    interface LambdaWizard{
        void attackUndeadArmy(String spellName, ArmyOfDarkness army);
    }

    interface LambdaWarrior{
        int attackOverlord(ArmyOfDarkness overlord);
    }

    interface LambdaCleric{
        void buffAllies();
    }

    static class ArmyOfDarkness{
        int lichOverlordHealth = 10000;
        Queue<UndeadSoldier> undeadSoldiers = new LinkedList<>();

        public ArmyOfDarkness() {
            for (int i = 0; i < 100000; i++) {
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
        return buffMultiplier * ThreadLocalRandom.current().nextInt(0, 100);
    }

    static void report(Target target, int damage){
        if (target.equals(Target.OVERLORD)) System.out.println(" -->Król Lich stracił " + damage + " punktów życia!");
        else System.out.println(" -->Armia ciemności straciła " + damage + " nieumarłych żołnierzy!");
    }

    static void castAoeSpell(String spellName, Queue<UndeadSoldier> army){
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

    static void nextHero(){
        int random = random();
        Hero hero = Hero.CZARODZIEJ;
        if (random > 50 && random < 90) hero = Hero.WOJOWNIK;
        else if (random >= 90) hero = Hero.KAPŁAN;
        System.out.println("--------------");
        System.out.println("Kolejny bohater: " + hero);
    }

    enum Target{OVERLORD, SOLDIER}

    enum Hero{CZARODZIEJ, WOJOWNIK, KAPŁAN}

}
