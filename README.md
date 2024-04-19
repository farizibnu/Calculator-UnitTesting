# Calculator App
## Deskripsi
Aplikasi Calculator Sederhana adalah sebuah program kalkulator sederhana yang dapat melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.

## Fitur
* Penjumlahan
* Pengurangan
* Perkalian
* Pembagian
  
## Cara Menggunakan
1. Unduh repository ini atau clone menggunakan perintah git clone.
2. Buka project calculator menggunakan Java IDE seperti IntelliJ IDEA atau Eclipse.
3. Jalankan program melalui IDE tersebut dengan klik kanan pada file src>main>java>CalculatorApp.java, lalu tekan Run Java
4. Ikuti petunjuk untuk memasukkan dua bilangan dan pilih operasi yang diinginkan.
5. Hasil akan ditampilkan di layar.

## Contoh Penggunaan
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/7b904b00-4b7f-485e-a712-a12a3f7e2886)


# Test Automation
## Deskripsi
Test automation adalah proses pengujian secara otomatis yang dilakukan pada perangkat lunak untuk memastikan bahwa fungsionalitasnya bekerja sesuai yang diharapkan. Dalam proyek ini, kita akan menggunakan Java Gradle untuk menjalankan test otomatis pada aplikasi kalkulator.

## Prerequisites
1. Pastikan JDK (Java Development Kit) sudah terinstal di komputer Anda.
2. Pastikan Gradle sudah terinstal di komputer Anda.

## Cara Menggunakan
1. Untuk keseluruhan project
Jalankan command berikut pada terminal
```
./gradlew clean test
```
2. Untuk method tertentu
Jalankan command berikut pada terminal
```
./gradlew test --tests namaclass.namamethod
```

## Contoh Penggunaan

## Test Report
Report dari test automation yang telah dijalankan terdapat pada `build/reports/index.html`
