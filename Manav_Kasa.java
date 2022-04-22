import java.util.Scanner;
public class Manav_Kasa {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double armut, elma, domates, muz, patlican;
        double perarmut =2.14, perelma =3.67, perdomates=1.11, permuz=0.95, perpatlican=5.00;
        double toplam;
        System.out.print("Armut kac kilo: ");
        armut=inp.nextDouble();
        System.out.print("Elma kac kilo: ");
        elma=inp.nextDouble();
        System.out.print("Domates kac kilo: ");
        domates=inp.nextDouble();
        System.out.print("Muz kac kilo: ");
        muz=inp.nextDouble();
        System.out.print("Patlican kac kilo: ");
        patlican=inp.nextDouble();

        toplam=(armut * perarmut) + (elma* perelma) + (domates * perdomates) + (muz * permuz) + (patlican * perpatlican);
        System.out.print("Toplam Tutar: " + toplam);


    }
}
