# Calculator App
   
## Deskripsi Aplikasi
Aplikasi Calculator Sederhana adalah sebuah program kalkulator sederhana yang dapat melakukan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian (+, -, *, /) dari duah buah inputan angka. Program ini memiliki proses validasi yang terdiri dari : 
1. nilai yang dihitung harus angka, tidak boleh karakter
2. angka yang dihitung berada pada range-32,768 hingga 32,767
3. operator yang boleh diinputkan adalah +,-, * (kali) dan / (bagi)
4. Operasi pembagian, pembagi tidak boleh bernilai nol
5. Validasi dilakukan secara berurutan, jika ada salah satu validasi yang tidak sesuai, maka proses berhenti menghitung dan menampilkan pesan error
6. Jika semua validasi benar, maka proses dilanjutkan menuju perhitungan kalkulator sesuai dengan operator yang dipilih

## Fitur Utama Program
Melakukan operasi aritmatika :
* Penjumlahan (+)
* Pengurangan (-)
* Perkalian (*)
* Pembagian (/)

## Project Tree
```
Calculator-UnitTesting
├─ .gradle
├─ .idea
├─ .vscode
├─ build
│  ├─ generated
│  ├─ reports
│  │  └─ tests
│  │     └─ test
│  │        ├─ classes
│  │        ├─ css
│  │        ├─ index.html
│  │        ├─ js
│  │        └─ packages
│  ├─ test-results
│  └─ tmp
├─ build.gradle
├─ gradle
├─ src
│  ├─ main
│  │  └─ java
│  │     ├─ Calculator.java
│  │     ├─ CalculatorApp.java
│  │     └─ InputValidator.java
│  └─ test
│     └─ java
│        ├─ CalculatorAppTest.java
│        ├─ CalculatorTest.java
│        └─ InputValidatorTest.java
├─ gradlew
├─ gradlew.bat
├─ README.md
└─ settings.gradle
```

### Struktur Direktori `src`
```
├─ src
│  ├─ main
│  │  └─ java
│  │     ├─ Calculator.java
│  │     ├─ CalculatorApp.java
│  │     └─ InputValidator.java
│  └─ test
│     └─ java
│        ├─ CalculatorAppTest.java
│        ├─ CalculatorTest.java
│        └─ InputValidatorTest.java
```

* `src>main>java>` <br/>
  Direktori ini digunakan untuk menyimpan file `.java` atau program java yang akan dibangun dan dijalankan, yang terdiri dari 3 file program yaitu :<br/>
  1. Calculator.java <br/>
     File ini berisikan class Calculator yang memuat method kalkulasi dari project Calculator.
  2. CalculatorApp.java <br/>
     File ini berisikan class CalculatorApp, main program dari project Calculator.
  3. InputValidator.java <br/>
     File ini berisikan class Input Validator yang memuat method-method proses validasi sesuai requirement aplikasi.
* `src>test>java>` <br/>
  Direktori ini digunakan untuk menyimpan file test `.java` atau program test java yang akan dijalankan, yang terdiri dari 3 file test program yaitu :<br/>
  1. CalculatorTest.java <br/>
     File ini berisikan class Calculator Test yang memuat script testing program `Calculator.java`.
  2. CalculatorAppTest.java <br/>
     File ini berisikan class Calculator App Test yang memuat script testing main program, `CalculatorApp.java`.
  3. InputValidatorTest.java <br/>
     File ini berisikan class Input Validator yang memuat script testing program `InputValidator.java`.

## How to Run Program
### Run tanpa terminal
1. Unduh repository ini atau clone repository dengan perintah git clone
    ```
   git clone https://github.com/farizibnu/Calculator-UnitTesting.git
   ```
3. Buka project calculator menggunakan Java IDE seperti IntelliJ IDEA atau Eclipse.
4. Jalankan program melalui IDE tersebut dengan klik kanan pada file `src>main>java>CalculatorApp.java`, lalu tekan Run Java
5. Ikuti petunjuk untuk memasukkan dua bilangan dan pilih operasi yang diinginkan.
6. Hasil akan ditampilkan di layar.

#### Contoh Hasil Running Program tanpa Terminal
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/7b904b00-4b7f-485e-a712-a12a3f7e2886)

### Run melalui terminal
1. Unduh repository ini atau clone repository dengan perintah git clone
    ```
   git clone https://github.com/farizibnu/Calculator-UnitTesting.git
   ```
3. Buka project calculator menggunakan Java IDE seperti IntelliJ IDEA atau Eclipse.
4. Tekan `Ctrl > Shift > P` untuk menampilkan terminal
5. Buka directory `src>main>java` dengan mengetik command dibawah  pada terminal
   ```
   cd src\main\java
   ```
6. Ketik perintah dibawah pada terminal
   ```
   javac CalculatorApp.java
   ```
   kemudian
   ```
   java CalculatorApp
   ```
8. Program siap digunakan.

### Contoh Hasil Running Program melalui Terminal
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95133669/4db1006a-5fe7-4a1b-a3c9-e0fba618cc7d)

# Test Automation
## Deskripsi
Test automation adalah proses pengujian secara otomatis yang dilakukan pada perangkat lunak untuk memastikan bahwa fungsionalitasnya bekerja sesuai yang diharapkan. Dalam proyek ini, kita akan menggunakan Java Gradle untuk menjalankan test otomatis pada aplikasi kalkulator.

## Testing Tools
* IDE: Visual Studio Code
* Alat build otomatis : Gradle
* Tools runing : Terminal
* Sistem operasi : Window
* Unit testing : Java (Junit)
* Bahasa pemrograman : Java

## Pre-requisites
1. Pastikan JDK (Java Development Kit) sudah terinstal di komputer Anda.
2. Pastikan Gradle sudah terinstal di komputer Anda.


## Run Automation Test
Terdapat 2 cara untuk menjalankan automation test
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
Test report adalah laporan yang dihasilkan setelah menjalankan serangkaian pengujian pada suatu perangkat lunak. Test report memberikan ringkasan tentang hasil pengujian yang dilakukan. Ini mencakup informasi tentang tes mana yang berhasil, tes mana yang gagal, serta hasilnya dalam berbagai format yang dapat membantu pengembang dalam menganalisis kinerja dan keandalan perangkat lunak mereka.

Untuk melihat hasil report dari test automation yang telah dijalankan akan tersimpan pada direktori berikut:
```
├─ build
│  ├─ generated
│  ├─ reports
│  │  └─ tests
│  │     └─ test
│  │        ├─ classes
│  │        ├─ css
│  │        ├─ index.html
```

### Contoh Hasil Test Report
![Screenshot 2024-04-21 201427](https://github.com/farizibnu/Calculator-UnitTesting/assets/95133669/368de6be-d1fa-4945-9f00-e490d381cb6c)

**Penjelasan**
- Pada Test Summary, terdapat jumlah tests, failures, ignored, duration, dan persentase keberhasilan test yang dilakukan pada project.
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/1d940ab9-d5cc-4a79-adef-b84ff4dea537)

- Dibawahnya terdapat rincian mengenai test case yang dilakukan pada packages dan classes tertentu
   - Packages
   ![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/9dd82a9e-938f-4689-9a15-b43421d64d3f)
   - Classes
   ![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/13aaa5cf-187e-4d54-b863-44ac356c0b21)

- Pada setiap classes, terdapat nama, duration, dan status pengujian dari setiap test cases
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/069395b1-82f4-4b1e-9de8-095b5b912a02)

Berikut ini rincian hasil pengujian untuk seluruh test cases pada setiap classes:
- Class CalculatorAppTest<br>
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/4f9c72be-062f-41bb-b749-31a844c144a2)
- Class CalculatorTest<br>
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/5388903e-e60e-4d64-9cdb-6bee117691c9)
- Class InputValidatorTest<br>
![image](https://github.com/farizibnu/Calculator-UnitTesting/assets/95272531/2775f01e-1645-409a-848c-da6e71511d89)

## Author
1. 211524010 | Fariz Muhamad Ibnu Hisyam | [@farizibnu](https://github.com/farizibnu)
2. 211524025 | Salma Edyna Putri | [@salmaep](https://github.com/salmaep)
3. 211524028 | Tabitha Salsabila Permana | [@Tabitha2912](https://github.com/Tabitha2912)

## Referensi
https://docs.gradle.org/current/userguide/java_testing.html 
