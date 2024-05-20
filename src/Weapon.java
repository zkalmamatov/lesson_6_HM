public class Weapon {

    private WeaponType weaponTypes;
    private String weaponName;

    public Weapon(WeaponType weaponTypes, String weaponName) {
        this.weaponTypes = weaponTypes;
        this.weaponName = weaponName;

    }


    public WeaponType getWeaponTypes() {
        return weaponTypes;
    }

    public void setWeaponTypes(WeaponType weaponTypes) {
        this.weaponTypes = weaponTypes;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }


}
