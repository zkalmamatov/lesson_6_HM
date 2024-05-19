public class Boss extends GameEntity {
    private Weapon weaponBoss;


    public Boss() {
        super();

    }

    public Weapon getWeaponBoss() {
        return weaponBoss;
    }

    public void setWeaponBoss(Weapon weaponBoss) {
        this.weaponBoss = weaponBoss;
    }

    public String info() {
        return " HP-" + getHealth() + ", damage-" + getDamage();
    }
}
