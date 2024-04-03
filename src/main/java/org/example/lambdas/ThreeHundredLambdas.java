package org.example.lambdas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class ThreeHundredLambdas {

    static int buffMultiplier = 1;
    final static int bossHP = 100000;
    final static int enemyArmySize = 200000;

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
        LambdaWarrior hero42 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero42);
        LambdaWarrior hero43 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero43);
        LambdaWarrior hero44 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero44);
        LambdaWizard hero45 = (spell, army) -> castAoeSpell(spell,army.undeadSoldiers);
            lambdaHeroes.add(hero45);
        LambdaWarrior hero46 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero46);
        LambdaWizard hero47 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero47);
        LambdaWizard hero48 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero48);
        LambdaWizard hero49 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero49);
        LambdaWarrior hero50 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero50);
        LambdaWizard hero51 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero51);
        LambdaCleric hero52 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero52);
        LambdaWizard hero53 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero53);
        LambdaWizard hero54 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero54);
        LambdaWizard hero55 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero55);
        LambdaWizard hero56 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero56);
        LambdaCleric hero57 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero57);
        LambdaCleric hero58 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero58);
        LambdaWizard hero59 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero59);
        LambdaWizard hero60 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero60);
        LambdaWizard hero61 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero61);
        LambdaWarrior hero62 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero62);
        LambdaWarrior hero63 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero63);
        LambdaWarrior hero64 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero64);
        LambdaWizard hero65 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero65);
        LambdaWizard hero66 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero66);
        LambdaWarrior hero67 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero67);
        LambdaWizard hero68 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero68);
        LambdaCleric hero69 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero69);
        LambdaWarrior hero70 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero70);
        LambdaWizard hero71 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero71);
        LambdaWizard hero72 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero72);
        LambdaWarrior hero73 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero73);
        LambdaWizard hero74 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero74);
        LambdaWarrior hero75 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero75);
        LambdaWarrior hero76 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero76);
        LambdaWizard hero77 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero77);
        LambdaWarrior hero78 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero78);
        LambdaCleric hero79 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero79);
        LambdaWarrior hero80 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero80);
        LambdaWarrior hero81 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero81);
        LambdaWizard hero82 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero82);
        LambdaWarrior hero83 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero83);
        LambdaWizard hero84 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero84);
        LambdaCleric hero85 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero85);
        LambdaWarrior hero86 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero86);
        LambdaWizard hero87 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero87);
        LambdaCleric hero88 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero88);
        LambdaWizard hero89 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero89);
        LambdaWizard hero90 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero90);
        LambdaWarrior hero91 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero91);
        LambdaWizard hero92 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero92);
        LambdaWarrior hero93 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero93);
        LambdaWarrior hero94 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero94);
        LambdaWizard hero95 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero95);
        LambdaWizard hero96 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero96);
        LambdaWizard hero97 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero97);
        LambdaWizard hero98 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero98);
        LambdaWizard hero99 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero99);
        LambdaWarrior hero100 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero100);
        LambdaWarrior hero101 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero101);
        LambdaCleric hero102 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero102);
        LambdaCleric hero103 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero103);
        LambdaWizard hero104 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero104);
        LambdaWizard hero105 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero105);
        LambdaWarrior hero106 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero106);
        LambdaWarrior hero107 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero107);
        LambdaWizard hero108 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero108);
        LambdaWizard hero109 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero109);
        LambdaWarrior hero110 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero110);
        LambdaWizard hero111 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero111);
        LambdaWizard hero112 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero112);
        LambdaWizard hero113 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero113);
        LambdaWizard hero114 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero114);
        LambdaCleric hero115 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero115);
        LambdaWizard hero116 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero116);
        LambdaWizard hero117 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero117);
        LambdaWarrior hero118 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero118);
        LambdaWizard hero119 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero119);
        LambdaWizard hero120 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero120);
        LambdaWizard hero121 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero121);
        LambdaWarrior hero122 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero122);
        LambdaWizard hero123 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero123);
        LambdaWarrior hero124 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero124);
        LambdaWarrior hero125 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero125);
        LambdaCleric hero126 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero126);
        LambdaWizard hero127 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero127);
        LambdaWarrior hero128 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero128);
        LambdaWarrior hero129 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero129);
        LambdaCleric hero130 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero130);
        LambdaCleric hero131 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero131);
        LambdaCleric hero132 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero132);
        LambdaWizard hero133 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero133);
        LambdaWizard hero134 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero134);
        LambdaWizard hero135 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero135);
        LambdaWizard hero136 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero136);
        LambdaCleric hero137 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero137);
        LambdaCleric hero138 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero138);
        LambdaCleric hero139 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero139);
        LambdaWizard hero140 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero140);
        LambdaWarrior hero141 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero141);
        LambdaCleric hero142 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero142);
        LambdaWizard hero143 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero143);
        LambdaWizard hero144 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero144);
        LambdaWizard hero145 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero145);
        LambdaWizard hero146 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero146);
        LambdaCleric hero147 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero147);
        LambdaCleric hero148 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero148);
        LambdaWizard hero149 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero149);
        LambdaWizard hero150 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero150);
        LambdaWarrior hero151 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero151);
        LambdaWizard hero152 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero152);
        LambdaCleric hero153 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero153);
        LambdaWarrior hero154 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero154);
        LambdaWarrior hero155 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero155);
        LambdaWizard hero156 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero156);
        LambdaWarrior hero157 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero157);
        LambdaWarrior hero158 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero158);
        LambdaWarrior hero159 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero159);
        LambdaCleric hero160 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero160);
        LambdaWarrior hero161 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero161);
        LambdaCleric hero162 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero162);
        LambdaCleric hero163 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero163);
        LambdaWarrior hero164 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero164);
        LambdaWizard hero165 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero165);
        LambdaCleric hero166 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero166);
        LambdaCleric hero167 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero167);
        LambdaWizard hero168 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero168);
        LambdaWarrior hero169 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero169);
        LambdaWizard hero170 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero170);
        LambdaCleric hero171 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero171);
        LambdaWizard hero172 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero172);
        LambdaWarrior hero173 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero173);
        LambdaWarrior hero174 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero174);
        LambdaCleric hero175 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero175);
        LambdaWarrior hero176 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero176);
        LambdaWizard hero177 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero177);
        LambdaWizard hero178 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero178);
        LambdaCleric hero179 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero179);
        LambdaWarrior hero180 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero180);
        LambdaWizard hero181 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero181);
        LambdaWarrior hero182 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero182);
        LambdaWizard hero183 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero183);
        LambdaWizard hero184 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero184);
        LambdaWarrior hero185 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero185);
        LambdaWizard hero186 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero186);
        LambdaWizard hero187 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero187);
        LambdaCleric hero188 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero188);
        LambdaWarrior hero189 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero189);
        LambdaWizard hero190 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero190);
        LambdaWizard hero191 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero191);
        LambdaWarrior hero192 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero192);
        LambdaCleric hero193 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero193);
        LambdaWarrior hero194 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero194);
        LambdaCleric hero195 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero195);
        LambdaWarrior hero196 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero196);
        LambdaCleric hero197 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero197);
        LambdaCleric hero198 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero198);
        LambdaWarrior hero199 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero199);
        LambdaWizard hero200 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero200);
        LambdaWarrior hero201 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero201);
        LambdaCleric hero202 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero202);
        LambdaWizard hero203 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero203);
        LambdaWizard hero204 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero204);
        LambdaWizard hero205 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero205);
        LambdaWarrior hero206 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero206);
        LambdaWizard hero207 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero207);
        LambdaWizard hero208 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero208);
        LambdaWizard hero209 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero209);
        LambdaWizard hero210 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero210);
        LambdaWarrior hero211 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero211);
        LambdaWarrior hero212 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero212);
        LambdaWizard hero213 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero213);
        LambdaWizard hero214 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero214);
        LambdaWizard hero215 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero215);
        LambdaWarrior hero216 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero216);
        LambdaWizard hero217 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero217);
        LambdaWizard hero218 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero218);
        LambdaWizard hero219 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero219);
        LambdaWizard hero220 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero220);
        LambdaWizard hero221 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero221);
        LambdaWizard hero222 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero222);
        LambdaWizard hero223 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero223);
        LambdaWizard hero224 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero224);
        LambdaCleric hero225 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero225);
        LambdaWizard hero226 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero226);
        LambdaWizard hero227 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero227);
        LambdaCleric hero228 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero228);
        LambdaWizard hero229 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero229);
        LambdaWarrior hero230 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero230);
        LambdaWarrior hero231 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero231);
        LambdaWarrior hero232 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero232);
        LambdaCleric hero233 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero233);
        LambdaWizard hero234 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero234);
        LambdaCleric hero235 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero235);
        LambdaWizard hero236 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero236);
        LambdaWizard hero237 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero237);
        LambdaWizard hero238 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero238);
        LambdaWarrior hero239 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero239);
        LambdaWizard hero240 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero240);
        LambdaWarrior hero241 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero241);
        LambdaWarrior hero242 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero242);
        LambdaCleric hero243 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero243);
        LambdaWizard hero244 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero244);
        LambdaWizard hero245 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero245);
        LambdaWizard hero246 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero246);
        LambdaWizard hero247 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero247);
        LambdaWarrior hero248 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero248);
        LambdaWizard hero249 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero249);
        LambdaWarrior hero250 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero250);
        LambdaWizard hero251 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero251);
        LambdaWizard hero252 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero252);
        LambdaCleric hero253 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero253);
        LambdaWizard hero254 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero254);
        LambdaCleric hero255 = ThreeHundredLambdas::buffUp;
            lambdaHeroes.add(hero255);
        LambdaWizard hero256 = (spell, army) -> castAoeSpell(spell, army.undeadSoldiers);
            lambdaHeroes.add(hero256);
        LambdaWarrior hero257 = overlord -> overlord.attackOverlord(meleeAttack());
            lambdaHeroes.add(hero257);




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
            else if (random >= 80 && random < 101) hero = Hero.KAPŁAN;
            System.out.println("Kolejny bohater: " + hero);
        }
    }

    enum Target{OVERLORD, SOLDIER}

    enum Hero{CZARODZIEJ, WOJOWNIK, KAPŁAN}

    enum Spell{Deszcz_meteorów, Kula_ognia, Maelstorm, Trzęsienie_ziemi, Wyładowanie_łańcuchowe, Eksplozja, Implozja, Piorun_kulisty, Śnieżyca, Wulkan, Gejzer, Ognista_chmura, Gradobicie}

}
