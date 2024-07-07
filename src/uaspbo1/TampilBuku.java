package uaspbo1;

import java.util.Scanner;

public class TampilBuku {
    public static void main(String[] args) {
        //objek
        Buku book1 = new Buku("Si Kancil", "BK22GP200002");
        
        System.out.println(book1.displayInfo());
        System.out.println("");
        System.out.println(book1.displayInfo("45000"));

        //error handling
        try{
        //IO Sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        KodeBuku[] book = new KodeBuku[2];
        
        //perulangan
        for(int i=0; i<book.length; i++){
            System.out.print("\nMasukkan Judul Buku " +(i+1)+": ");
            String judulBuku = scanner.nextLine();
            System.out.print("Masukkan ID Buku " +(i+1)+": ");
            String id = scanner.nextLine();

            //objek
            book[i] = new KodeBuku (judulBuku, id);
        }
        
        //perulangan
        for(KodeBuku data: book){
            System.out.println("");
            System.out.println("Data Buku: ");
            System.out.println(data.displayInfo());
        }
        
        } catch (Exception e){
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }   
}
