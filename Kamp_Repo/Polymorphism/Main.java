package com.company;

public class Main {

    public static void main(String[] args) {
	// Çok biçimlilik. Bir nesnenin birden farklı nesne gibi davranabilmesi.
        //Ana class
        //Alt classlar

        Hayvan hayvan1=new Hayvan("Sokak Köpeği");
        Hayvan hayvan2=new Kedi("Tekir");
        Hayvan hayvan3=new Kopek("Karabaş");
        Hayvan hayvan4=new At("Şahbatur");

        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
        System.out.println(hayvan4.konus());

        //instanceof
        if (hayvan3 instanceof Kedi){
            System.out.println("Bu nesne Kedi sınıfından.");
        }
        else if(hayvan3 instanceof Kopek){
            System.out.println("Bu nesne Köpek sınıfından.");
        }
        else
            System.out.println("Bu nesne başka bir sınıftan.");


    }

}

class Hayvan{
    private String isim;

    public Hayvan(String isim){
        this.setIsim(isim);
    }
    public String konus(){
        return "Hayvan konuşuyor.";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    public String konus() {
        return this.getIsim() + " havlıyor.";
    }
}

    class Kedi extends Hayvan{
        public Kedi(String isim){
            super(isim);
        }

        public String konus(){
            return this.getIsim()+" miyavlıyor.";
        }


}

    class At extends Hayvan {
        public At(String isim) {
            super(isim);
        }

        public String konus() {
            return this.getIsim() + " kişniyor.";
        }
    }