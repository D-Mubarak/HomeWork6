package com.company;

public class GameEntity {
    private int HeroHelath;
    private int HeroDamage;
    private int BossHealth;
    private int BossDamage;
    private int SkeletonHealth;
    private int SkeletonDamage;

    public int getSkeletonHealth() {
        return SkeletonHealth;
    }

    public void setSkeletonHealth(int skeletonHealth) {
        SkeletonHealth = skeletonHealth;
    }

    public int getSkeletonDamage() {
        return SkeletonDamage;
    }

    public void setSkeletonDamage(int skeletonDamage) {
        SkeletonDamage = skeletonDamage;
    }

    public int getHeroHelath() {
        return HeroHelath;
    }

    public void setHeroHelath(int heroHelath) {
        HeroHelath = heroHelath;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        HeroDamage = heroDamage;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.BossDamage = bossDamage;
    }
    public String info () {
        return "Boss health = " + BossHealth + " | " + "Boss damage = " + BossDamage + " | " ;
    }
}
