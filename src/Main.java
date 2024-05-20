public class Main {
    public static void main(String[] args) {


        Boss boss_1 = new Boss();
        boss_1.setHealth(700);
        boss_1.setDamage(50);
        boss_1.setWeaponBoss(new Weapon(WeaponType.OTHER_TYPE, "Laser"));
        System.out.println("boss_1: " + boss_1.info() + ", boss weapon: " +
                boss_1.getWeaponBoss().getWeaponName() + "-" + boss_1.getWeaponBoss().getWeaponTypes() + "\n");

        Skeleton skeleton_1 = new Skeleton();
        skeleton_1.setHealth(150);
        skeleton_1.setDamage(40);
        skeleton_1.setArrows(20);
        System.out.println("skeleton_1: " + skeleton_1.info() + "\n");

        Skeleton skeleton_2 = new Skeleton();
        skeleton_2.setHealth(130);
        skeleton_2.setDamage(30);
        skeleton_2.setArrows(10);
        System.out.println("skeleton_2: " + skeleton_2.info() + "\n");


    }
}