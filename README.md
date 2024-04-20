# Calculator App
## Anggota Tim
1. Fariz Muhamad Ibnu Hisyam | 211524010
2. Salma Edyna Putri | 211524025
3. Tabitha Salsabila Permana | 211524028
   
## Deskripsi Aplikasi
Aplikasi Calculator Sederhana adalah sebuah program kalkulator sederhana yang dapat melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.

## Fitur
* Penjumlahan
* Pengurangan
* Perkalian
* Pembagian
  
## Cara Menggunakan
1. Unduh repository ini atau clone repository dengan perintah git clone
    ```
   git clone git clone https://github.com/farizibnu/Calculator-UnitTesting.git
   ```
3. Buka project calculator menggunakan Java IDE seperti IntelliJ IDEA atau Eclipse.
4. Jalankan program melalui IDE tersebut dengan klik kanan pada file `src>main>java>CalculatorApp.java`, lalu tekan Run Java
5. Ikuti petunjuk untuk memasukkan dua bilangan dan pilih operasi yang diinginkan.
6. Hasil akan ditampilkan di layar.

## Contoh Penggunaan
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/7b904b00-4b7f-485e-a712-a12a3f7e2886)


# Test Automation
## Deskripsi
Test automation adalah proses pengujian secara otomatis yang dilakukan pada perangkat lunak untuk memastikan bahwa fungsionalitasnya bekerja sesuai yang diharapkan. Dalam proyek ini, kita akan menggunakan Java Gradle untuk menjalankan test otomatis pada aplikasi kalkulator.

## Prerequisites
1. Pastikan JDK (Java Development Kit) sudah terinstal di komputer Anda.
2. Pastikan Gradle sudah terinstal di komputer Anda.

## Run Automation Test
Terdapat 2 cara untuk mrnjalankan automation test
1. Automation Testing Keseluruhan Project <br>
   Jalankan command berikut pada terminal
    ```
     ./gradlew clean test
     ```
2. Untuk suatu method tertentu <br>
   Jalankan command berikut pada terminal
    ```
     ./gradlew test --tests namaclass.namamethod
     ```
    
## Test Report
Untuk melihat hasil report dari test automation yang telah dijalankan terdapat pada `build>reports>tests>test>index.html`
