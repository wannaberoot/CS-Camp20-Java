package com.company;

public class MakineMuhendisi implements IMuhendis,ICalisma {

    private boolean askerlik;
    private boolean sicil;

    public MakineMuhendisi(boolean askerlik, boolean sicil) {
        this.askerlik = askerlik;
        this.sicil = sicil;
    }

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi İşe Alındı.");
    }

    @Override
    public void askerlikDurumu() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        } else {
            System.out.println("Askerliğimi yapmadım.");
        }

    }

    @Override
    public String ortalama(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adliSicil() {
        if (sicil) {
            System.out.println("Adli sicil kaydım var.");
        } else {
            System.out.println("Adli sicil kaydım yok.");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {

        if (array.length == 0) {
            System.out.println("İş tecrübem bulunmuyor.");
        } else {
            System.out.println("İş tecrübelerim aşağıda sıralanmıştır:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        }
    }

    public void referansGetir(String[] array){
        if (array.length == 0) {
            System.out.println("Referansım bulunmuyor.");
        } else {
            System.out.println("Referanslarım aşağıda sıralanmıştır:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

        }

    }
}
