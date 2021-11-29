# java-dasar

## - Sejarah java

- Java adalah bahasa pemrograman yang dibuat oleh James Gosling saat bekerja di Sun Microsystem
- Java dirilis public di tahun 1995
- Java adalah bahasa pemrograman berorientasi objek dan mendukung pengelolaan memori secara otomatis
- Saat ini perusahaan Sun Microsystem telah dibeli oleh Oracle
- Java terkenal dengan Write One, Run Anywhere, karena binary program Java di generate secara independen dan bisa
  dijalankan di Java Virtual Machine yang terinstall di berbagai sistem operasi

## - Teknologi Java

- Java Standard Edition
- Java Enterprise Edition
- Java Micro Edition (dead)

## - Dimana Java Banyak Digunakan?

- Backend, banyak perusahaan besar saat ini menggunakan Java sebagai aplikasi backend nya seperti Twitter, Netflix,
  Spotify, Amazon, Alibaba, Blibli dan lain-lain
- Big Data, teknologi-teknologi big data yang saat ini populer, kebanyakan adalah teknologi Java, seperti Apache Hadoop,
  Elasticsearch, Apache Cassandra, Apache Spark, Apache Kafka dan lain-lain
- Android, di android bisa menggunakan Java dan Kotlin untuk membuat aplikasi nya

## - JRE VS JDK

- JRE singkatan dari Java Runtime Environment
- JDK singkatan dari Java Development Kit

## - Java Virtual Machine

- Java sendiri hanyalah bahasa pemrograman, otak dibalik Java sebenarnya sebuah teknologi yang disebut Java Virual
  Machine
- Java Virual Machine merupakan program yang digunakan untuk mengeksekusi binary file Java
- Karena JVM hanya mengerti binary file, sehingga akhirnya banyak bahasa pemrograman yang mengadopsi teknologi JVM,
  seperti Kotlin, Scala, Groovy dan lain-lain
- Dengan begitu, banyak bahasa pemrograman yang lebih canggih dari Java, namun mereka tetap jalan di JVM yang sudah
  terbukti stabil dan bagus

## - [Proses Devlopment Program Java](/src/main/resources/images/POzDJiGm38NtFeNL5IpA0LYWuGSMp8uRXDOmAOapSj8WReydhY8gLhNUz_NPEUJYfAmnm9JYEJ5nmU7LLOTFL2caSxmaHry6T1cN-UkVzxPoyP7mcQkNn1VVN2603ny8XsEQ2PjyzQB1pQBZjKawRLBZ3vwT_6pQ55pEvhst_AzvBzF9L-gDOgAp641FnN5EtppUjIruYuzwkSexPCKARJCiGfrjNGhrZKRsVnc0LZ-A_poLpi0-FUw77OZ.svg)

## - Menginstall JDK

- [OpenJDK adalah salah satu implementasi Java Devlopment Kit yang opensource dan gratis](https://openjdk.java.net/)

## Setting PATH

- [Windows](https://medium.com/programmer-zaman-now/setting-java-path-di-windows-4da2c65d8298)
- [Linux atau Mac](https://mkyong.com/Java/how-to-set-Java_home-environment-variable-on-mac-os-x/)

## Integrated Development Environment

- IDE adalah smart editor yang digunakan mengedit kode program
- IDE juga digunakan untuk melakukan otomatisasi proses kompilasi kode program dan otomatisasi proses menjalankan
  program
- [IDE unutk Java](https://www.jetbrains.com/idea/)

## - Program Hello World

```java 
   public class HelloWorld {

    public static void main(String[] args) {
        // CODE PROGRAM

        System.out.println("Hello World");
    }
```

- Di Java nama Class harus sama dengan nama File.java, dan nama class di Java tidak boleh mengandung spasi, harus juga
  diawali dengan Huruf besar ditiap katanya.
- Saat teman-teman bikin program Java, temen-temen wajib membuat main function.
- di Java itu case sensitive.

## Kompilasi Kode Java

```zsh
javac HelloWorld.java
java HelloWorld
Hello World
```

## Tipe Data Number

- Integer Number(Bilangan Bulat)
- Floating Point Number(Bilangan Pecahan)

## Integer Number

| Tipe Data | Min | Max | Size | Default |
|-----------|-----|-----|------|---------|
|byte | -128 |127 | 1 byte | 0 |
|short | -32,768 | 32,767 | 2 byte | 0 |
|int | -2,147,483,648 | 2,147,483,647 | 4 byte | 0 |
|long | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 | 8 byte | 0 |

## - Floating Point Number

| Tipe Data | Min | Max | Size | Default |
|-----------|-----|-----|------|---------|
| float | 3.4e-038 | 3.4e+038 | 4 byte | 0.0 |
| double | 1.7e-038 | 1.7e+038 | 8 byte | 0.0 |

## - Kode: Literals Number

```
int decimalInt=34;
int hexaDecimal=0xFFFFF;
int binaryDecimal=0B10101010;
```

## - Kode: Underscore

sejak Java Versi 8 teman-teman bisa nembahkan Underscore dianka(1_000_000) ini digunakan hanya untuk pemisah, jika angka
sudah semakin besar jumlahnya, agar mudah dibaca.

## - Konversi Tipe Data Number

- Widening Casting(Otomatis): byte -> short -> int -> long -> float -> double
- Narrowing Casting(Manual): double -> float -> long -> int -> char -> short -> byte
- hati-hati mengkonversi secara paksa(manual) jika nilai tampungnya lebih kecil dari nilai aslinya, makan java akan
  secara otomatis terkena NumberOverFlow adalah jadi misalahnya nanti ketika dikonversi nilai tampungnya sudah mencapai
  batas tampungnya dia akan balik lagi kebelakang (minus) sampai hasil aslinya.

## - Tipe Data Character

- Data Character(huruf) di Java direpresentasikan oleh tipe char.
- Untuk membuat data char di Java, teman-teman bisa menggunakan tanda ''(petik).

## - Tipe Data Boolean

- Tipe data boolean adalah tipe data yang memiliki 2 nilai, yaitu benar dan salah
- Tipe data boolean di Java direpresentasikan dengan kata kunci boolean
- Nilai benar direpresentasikan dengan kata kunci true.
- Nilai salah direpresentasikan dengan kata kunci false.
- Default value untuk boolean adalah false.

## - Tipe Data String

- Tipe Data String adalah tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.
- Di Java, tipe data String direpresentasikan dengan kata kunci String.
- Untuk membuat String di Java, teman-teman bisa menggunakan karakter " "(petik dua) sebelum dan setelah teks nya.
- Default value untuk String adalah null.
      
## - Variable
- Variable adalah tempat untuk menyimpan data.
- Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama, tidak bisa berubah-ubah tipe data seperti bahasa pemrograman PHP atau JavaScript.
- Untuk membuat variable di Java teman-teman bisa menggunakan nama tipe data lalu diikutin dengan nama variable nya.
- Nama variable tidak boleh mengandung whitespace(spasi, enter, tab) dan tidak boleh seluruhnya number.

## - Kata Kunci var
- Sejak versi Java 10, Java mendukung pembuatan dengan kata kunci var, sehinnga kita tidak perlu menyebutkan tipe datanya.
- Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value/nilai dari variable tersebut secara langsung.

## - Kata Kunci final
- Secara default, variable di Java bisa diubah-ubah nilainya.
- Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final.
- istilah variable seperti ini, banyak juga yang menyebutnya konstan.
 
## Tipe Data Bukan Primitif
- Sebenarnya Java itu adalah bahasa program yang berorientasi objek, nah idealnya saat kita menggunakan bahasa pemrograman yang berorientasi objek itu semua tipe data harusnya adalah Object.
- Tipe Data Primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
- Tipe data number, char, boolean, adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
- Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null.
- Tipe data bukan primitif bisa memiliki method/function.
- Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya.
- | Tipe Data Primitif | Tipe Data Bukan Primitif |
  |-----------|-----------------------------------|
  |byte | Byte|
  |short | Short|
  |int | Integer|
  |long | Long|
  |float | Float|
  |double | Double|
  |char | Character|
  |boolean | Boolean|

## 


# [Terima Kasihku(Guruku) A.K.A Orang Ganteng dan Intelek](https://www.udemy.com/user/eko-kurniawan/)
