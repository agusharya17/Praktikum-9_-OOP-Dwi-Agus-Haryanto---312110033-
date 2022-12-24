# Praktikum-9_-OOP-Dwi-Agus-Haryanto---312110033-


TUGAS Pemrograman Berorientasi Objek Pertemuan ke-13 (Praktikum 9)

Nama : Dwi Agus Haryanto
NIM : 312110033
Kelas : TI.21.C2


---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------

Disini saya akan menunjukkan tutorial membuat Aplikasi Desktop dengan Java

A. Buat File dan Kode Java
1. Buat file dengan nama bebas seperti (Utama) dengan ekstensi file (.java)
2. Sebelum menulis method main, tulis kode java seperti berikut. Agar java bisa berjalan dengan benar

import javax.swing.*;

3. Lalu tulis kode java seperti berikut

public class Utama {
    public static void main(String[] args) {
    }
}


4. Didalam main() buat variable dengan nama bebas dengan class JFrame
5. Lalu tambahkan kode sebagai berikut

JFrame myFrame;

myFrame = new JFrame();
myFrame.setSize(500,400);
myFrame.setVisible(true);

6. Buat pesan yang muncul di layar dengan tulisan bebas

JOptionPane.showMessageDialog(myFrame. "Saya suka Java");

7. Buat Variabel nama bebas dengan input teks yang muncul di layar dengan tulisan bertanyakan nama anda

String name = JOptionPane.showInputDialog(myFrame, "Nama anda siapa: ");

8. Buat variabel tahun nama bebas dengan teks yang muncul di layar dengan tulisan bertanyakan tahun lahir anda

String yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir: ");

9. Hitung umur anda dengan cara kurangi sekarang dengan tahun lahir anda

int year = Integer.parseInt(yearStr);
int age = 2022 - year;

10. Cetak hasil dengan menggunakan method yang sama

JOptionPane.showMessageDialog(myFrame, "Hallo " + name + ", umur anda " + age + " tahun.");

11. Save file
12. Buka cmd (Command Prompt)
13. Pergi menuju folder yang sudah dibuat dengan menggunakan cd ...
14. Lalu eksekusi dengan mengetik javac lalu file yang akan dikompile yaitu Utama.java
15. Jika berhasil dan tidak ada error, ketik

java Utama

16. Tampilan nya akan seperti ini

