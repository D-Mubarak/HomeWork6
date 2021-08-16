package com.company;

public class Weapon {
    private String typeWeapon;
    private String titleWeapon;

    public Weapon(){

    }

    public Weapon(String typeWeapon, String titleWeapon) {
        this.typeWeapon = typeWeapon;
        this.titleWeapon = titleWeapon;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getTitleWeapon() {
        return titleWeapon;
    }

    public void setTitleWeapon(String titleWeapon) {
        this.titleWeapon = titleWeapon;
    }
}
