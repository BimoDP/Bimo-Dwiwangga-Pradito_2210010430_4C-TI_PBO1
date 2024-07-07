package uaspbo1;

//inheritance
public class KodeBuku extends Buku {
    //overriding
    public KodeBuku(String judulBuku, String id) {
        super(judulBuku, id);
    }
    
    public int getTahunTerbit(){
        return Integer.parseInt(getId().substring(2, 4)) +2000;
    }
    
    public String getPenerbit(){
        String kodePen = getId().substring(4, 6);
        //seleksi if
        if(kodePen.equals("PJ")){
            return "Pustaka Jaya";
        } 
        if(kodePen.equals("BP")){
            return "Bentang Pustaka";
        } 
        if(kodePen.equals("GP")){
            return "Gramedia Pustaka Utama";
        } 
        if(kodePen.equals("ER")){
            return "Erlangga";
        } 
        if(kodePen.equals("RP")){
            return "Republika Penerbit";
        } else {
            return "Penerbit Tidak Diketahui";
        }
    }
    
    public String getGenre(){
        String kodeGenre = getId().substring(6, 8); 
        //seleksi switch
        switch(kodeGenre){
            case "01":
                return "Petualangan";
            case "02":
                return "Romantis";
            case "03":
                return "Fantasi";
            case "04":
                return "Horror";
            case "05":
                return "Misteri";
            case "06":
                return "Sejarah";
            case "07":
                return "Drama";
            case "08":
                return "Cerpen";
            case "09":
                return "Ilmiah";
            case "10":
                return "Pendidikan";
            default:
                return "Genre Tidak Diketahui";
        }
    }
    
    public int getNoBuku(){
        return Integer.parseInt(getId().substring(8));
    }
    
    //polymorphism (ovverriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+ 
                "\nTahun Terbit: " +getTahunTerbit()+
                "\nPenerbit: " +getPenerbit()+
                "\nGenre Buku: " +getGenre()+
                "\nNo Buku: " +getNoBuku();
    } 
}
