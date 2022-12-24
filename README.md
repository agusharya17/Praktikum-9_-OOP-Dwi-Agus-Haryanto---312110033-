# Praktikum-9_-OOP-Dwi-Agus-Haryanto---312110033-


# TUGAS Pemrograman Berorientasi Objek Pertemuan ke-13 (Praktikum 9)

Nama : Dwi Agus Haryanto
NIM : 312110033
Kelas : TI.21.C2


---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------

Disini saya akan menunjukkan tutorial membuat Aplikasi Desktop dengan Java

# A. Buat File dan Kode Java
* Buat file dengan nama bebas seperti (Utama) dengan ekstensi file (.java)
* Sebelum menulis method main, tulis kode java seperti berikut. Agar java bisa berjalan dengan benar
#
    import javax.swing.*;
#
* Lalu tulis kode java seperti berikut

    public class Utama {
        public static void main(String[] args) {
    
        }

    }

* Didalam main() buat variable dengan nama bebas dengan class JFrame
* Lalu tambahkan kode sebagai berikut

    JFrame myFrame;

    myFrame = new JFrame();
    myFrame.setSize(500,400);
    myFrame.setVisible(true);

* Buat pesan yang muncul di layar dengan tulisan bebas

    JOptionPane.showMessageDialog(myFrame. "Saya suka Java");

* Buat Variabel nama bebas dengan input teks yang muncul di layar dengan tulisan bertanyakan nama anda

    String name = JOptionPane.showInputDialog(myFrame, "Nama anda siapa: ");

* Buat variabel tahun nama bebas dengan teks yang muncul di layar dengan tulisan bertanyakan tahun lahir anda

    String yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir: ");
    
* Hitung umur anda dengan cara kurangi sekarang dengan tahun lahir anda

    int year = Integer.parseInt(yearStr);
    int age = 2022 - year;

* Cetak hasil dengan menggunakan method yang sama

    JOptionPane.showMessageDialog(myFrame, "Hallo " + name + ", umur anda " + age + "   tahun.");

* Save file
* Buka cmd (Command Prompt)
* Pergi menuju folder yang sudah dibuat dengan menggunakan cd ...
* Lalu eksekusi dengan mengetik javac lalu file yang akan dikompile yaitu Utama.java
* Jika berhasil dan tidak ada error, ketik

    java Utama

* Tampilan nya akan seperti ini
