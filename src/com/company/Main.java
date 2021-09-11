package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(300);
        boss.setBossDamage(50);
        boss.weapon.setTitleWeapon("uidj");

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setSkeletonHealth(75);
        skeleton1.setSkeletonDamage(5);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setSkeletonHealth(100);
        skeleton2.setSkeletonDamage(10);
        // дописать второго скелетона

        boss.weapon.setTitleWeapon("Steel arms");
        boss.weapon.setTypeWeapon("Axe");

        skeleton1.setArrows(30);

        skeleton2.setArrows(50);

        System.out.println(boss.info());

        System.out.println(skeleton1.info());

        System.out.println(skeleton2.info());


    }
}
