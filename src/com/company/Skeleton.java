package com.company;

public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String info() {
        return "Skeleton Health = " + getSkeletonHealth() + " Skeleton Damage = " + getSkeletonDamage() + " | arrows " + arrows;
    }
}
