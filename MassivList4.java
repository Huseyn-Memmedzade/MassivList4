package arraylist;

import java.util.ArrayList;

public class MassivList4 {


    public static void main(String[] args) {


        ArrayList<String> nomreler = new ArrayList<>();
        nomreler.add("050-111-22-33");
        nomreler.add("055-444-55-66");
        nomreler.add("070-777-88-99");

        nomreler.set(1, "055-123-45-67");
        System.out.println("Sira Nomresi 1 olan 2-ci nomre yanlis yazdiligi ucun deyisdirildi");
        System.out.println("Butun Duzgun Nomrelerin Siyahisi : " + nomreler);


    }


}
