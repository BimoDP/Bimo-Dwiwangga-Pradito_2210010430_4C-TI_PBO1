# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana program pengolahan data buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa judul buku dan ID buku, dan memberikan output berupa informasi detail dari ID tersebut seperti tahun terbit, penerbit, genre, dan nomor buku.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `KodeBuku`, dan `TampilBuku` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class KodeBuku extends Buku {
    ...
}

public class TampilBuku {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `book[i] = new KodeBuku (judulBuku, id);` adalah contoh pembuatan object.

```bash
book[i] = new KodeBuku (judulBuku, id);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judulBuku` dan `id` adalah contoh atribut.

```bash
String judulBuku;
String id;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku` dan `KodeBuku` dengan tambahan seleksi if untuk memastikan `id` yang dimasukkan berjumlah 12 digit dan diawali dengan kode `BK`.

```bash
public Buku(String judulBuku, String id) {
        if (id.length() == 12 && id.startsWith("BK")) {
            this.judulBuku = judulBuku;
            this.id = id;
        } else {
           throw new IllegalArgumentException("ID harus terdiri dari 12 karakter dan dimulai dengan 'BK'.");
        }
}

public KodeBuku(String judulBuku, String id) {
        super(judulBuku, id);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudulBuku` dan `setId` adalah contoh method mutator.

```bash
public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
}

    public void setId(String id) {
        this.id = id;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudulBuku`, `getId`, `getTahunTerbit`, `getPenerbit`, `getGenre`, dan `getNoBuku` adalah contoh method accessor.

```bash
public String getJudulBuku() {
        return judulBuku;
}

    public String getId() {
        return id;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judulBuku` dan `id` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String judulBuku;
private String id;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KodeBuku` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class KodeBuku extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Buku` merupakan overloading method `displayInfo` dan `displayInfo` di `KodeBuku` merupakan override dari method `displayInfo` di `Buku`.

```bash
public String displayInfo(String hargaBuku){
     return displayInfo() + "\nHarga Buku: "+hargaBuku;
}

@Override
    public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPenerbit` dan seleksi `switch` dalam method `getGenre`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<book.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("\nMasukkan Judul Buku " +(i+1)+": ");
String judulBuku = scanner.nextLine();
System.out.print("Masukkan ID Buku " +(i+1)+": ");
String id = scanner.nextLine();

System.out.println("");
System.out.println("Data Buku: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KodeBuku[] book = new KodeBuku[2];` adalah contoh penggunaan array.

```bash
KodeBuku[] book = new KodeBuku[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e){
        System.out.println("Kesalahan Umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Bimo Dwiwangga Pradito
NPM: 2210010430
Kelas: 4C TI Reg BJB
