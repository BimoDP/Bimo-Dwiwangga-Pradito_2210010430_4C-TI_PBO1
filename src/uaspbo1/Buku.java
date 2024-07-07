package uaspbo1;

//class
public class Buku {
    //attribut dan encapsulation
    private String judulBuku;
    private String id;

    //constructor
    public Buku(String judulBuku, String id) {
        if (id.length() == 12 && id.startsWith("BK")) {
            this.judulBuku = judulBuku;
            this.id = id;
        } else {
           throw new IllegalArgumentException("ID harus terdiri dari 12 karakter dan dimulai dengan 'BK'.");
        }
    }

    //mutator (setter)
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setId(String id) {
        this.id = id;
    }

    //accessor (getter)
    public String getJudulBuku() {
        return judulBuku;
    }

    public String getId() {
        return id;
    }
    
    public String displayInfo(){
        return "Judul Buku: " +getJudulBuku()+ "\nID Buku: "+getId();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String hargaBuku){
        return displayInfo() + "\nHarga Buku: "+hargaBuku;
    }
}
