import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float r, pi=3.14f, a, daireDilimininAlani;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = scanner.nextFloat();

        System.out.print("Merkez açıyı giriniz: ");
        a = scanner.nextFloat();

        daireDilimininAlani = (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı: "+ daireDilimininAlani);
    }
}