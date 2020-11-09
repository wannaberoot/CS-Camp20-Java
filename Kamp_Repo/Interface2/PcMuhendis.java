package com.company;

public class PcMuhendis implements IMuhendis {

    private boolean askerlik;
    private boolean sicil;

    public PcMuhendis(boolean askerlik,boolean sicil){
        this.askerlik=askerlik;
        this.sicil=sicil;
    }

    public void askerlikDurumu(){

        if (askerlik){
            System.out.println("Askerliğimi yaptım.");
        }

        else{
            System.out.println("Askerliğimi yapmadım.");
        }

    }
    public String ortalama(double derece){

        return "Ortalamam: " + derece;

    }
    public void adliSicil(){

        if (sicil){
            System.out.println("Adli sicil kaydım var.");
        }

        else {
            System.out.println("Adli sicil kaydım yok.");
        }

    }
    public void isTecrubesi(String[] array){

        System.out.println("İş tecrübelerim aşağıda sıralanmıştır:");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

}
