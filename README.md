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
- Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama,
  tidak bisa berubah-ubah tipe data seperti bahasa pemrograman PHP atau JavaScript.
- Untuk membuat variable di Java teman-teman bisa menggunakan nama tipe data lalu diikutin dengan nama variable nya.
- Nama variable tidak boleh mengandung whitespace(spasi, enter, tab) dan tidak boleh seluruhnya number.

## - Kata Kunci var

- Sejak versi Java 10, Java mendukung pembuatan dengan kata kunci var, sehinnga kita tidak perlu menyebutkan tipe
  datanya.
- Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita harus menginisiasi value/nilai
  dari variable tersebut secara langsung.

## - Kata Kunci final

- Secara default, variable di Java bisa diubah-ubah nilainya.
- Jika kita ingin membuat sebuah variable yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa
  menggunakan kata kunci final.
- istilah variable seperti ini, banyak juga yang menyebutnya konstan.

## Tipe Data Bukan Primitif

- Sebenarnya Java itu adalah bahasa program yang berorientasi objek, nah idealnya saat kita menggunakan bahasa
  pemrograman yang berorientasi objek itu semua tipe data harusnya adalah Object.
- Tipe Data Primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi.
- Tipe data number, char, boolean, adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
- Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai
  null.
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

## - Tipe Data Array

- Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama.
- jumlah data di Array tidak bisa berubah setelah pertama kali dibuat.
- [Cara Keja Array](src/main/resources/images/Screenshot_2021-11-29_22-33-56.png)
- Jadi nanti ketika kita pertama declarasi Array kita harus tentukan panjang Array nya, perlu diingat tipe data Array
  harus sama tipe data yang di tampungnya, misalkan kita bikin tipe Array Integer maka nilai yang bisa ditampungnya
  adalah 1,2,3,4,5 dan seterusnya sesuai dengan panjang Array nya.
- identitas tiap nilainya menggunakan Index dimulai dari 0.

## - Operasi di Array

| Operasi Array | Keterangan |
|---|------|
|array[index] | Mengambil data di array |
|array[index] = value | Mengubah data di array |
|array.lengt | Mengambil panjang array |

## - Operasi Matematika

| Operator | Keterangan |
|---|------|
|+ | Penjumlahan |
|- | Pengurangan |
|* | Perkalian |
|/ | Pembagian |
|% | Sisa Pembagian |

## - Augmented Assignments

| Operator Matematika | Augmented Assignments |
|---|------|
|a = a + 10 | a+=10 |
|a = a - 10 | a-= 10 |
|a = a * 10 | a*= 10 |
|a = a / 10 | a/= 10 |
|a = a % 10 | a%=10 |

## - Unary Operator

| Operator | Keterangan |
|---|------|
|++ | a=a+1 |
|-- | a=a-1 |
|- | Negative |
|+ | Positive |
|! | Boolean kebalikan |

## - Operasi Perbandingan

- Operasi perbandingan adalah operasi untuk membandingkan dua buah data.
- Operasi perbandingan adalah operasi yang menghasilkan nilai boolean(benar atau salah)
- Jika hasil operasi adalah benar, maka nilai nya adalah true.
- Jika hasilnya adalah salah, maka nilainya adalah false.

| Operator | Keterangan |
|---|------|
| *>* | Lebih Dari |
| < | Kurang Dari |
|> = | Lebih Dari Sama Dengan |
|<= | Kurang Dari Sama Dengan |
|== | Sama Dengan |
|!= | Tidak Sama Dengan |

## - Operasi Boolean(Operasi yang digunakan untuk 2 data boolean)

| Operator | Keterangan |
|---|------|
|&& | Dan |
|II | Atau |
|! | Kebalikan |

- Operasi &&

| Nila 1 | Operator | Nilai 2 | Hasil |
|---|------|------|------|
|true | && | true | true |
|true | && | false | false |
|false | && | true | false |
|false | && | false | false |

Operator dan itu nilai kiri dan kanan nya harus sama-sama bernilai true, jika hasilnya ingin true (hanya akan true kalau
dua nilainya true).

- Operasi ||

| Nila 1 | Operator | Nilai 2 | Hasil |
|---|------|------|------|
|true | II | true | true |
|true | II | false | true |
|false | II | true | true |
|false | II | false | false |

Operasi atau akan bernilai true jika nila kiri dan kanannya ada yang bernilai true.

- Operasi !

| Operator | Nilai 1 | Hasil |
|------|------|------|
|! | true | false |
|! | false | true |

ini adalah operasi kebalikan.

## - Expression, Statement & Block

- Expresion adalah konstruksi dari variable, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single
  value.
- Expression adalah core component dari statement.
- Statement bisa dibilang adalah kalimat lengkap dalam bahasa.
- Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma.
- ada beberapa jenis statement:
    - Assignment expression
    - Penggunaan ++ dan --
    - Method invocation.
    - Object creation expression.

## Block

- Block adalah kumpulan statment yang terdiri dari nol atau lebih statement.
- Block diawali dan diakhiri dengan kurung kurawal {}

## If Statement

- Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan.
- Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi.
- Hampir di semua bahasa pemrograman mendukung if expression.

## Else Statement

- Block if akan dieksekusi ketika kondisi if bernilai true.
- Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false.
- Hal ini bisa dilakukan menggunakan else expression.

## Else if Statement

- Terkadang dalam if, kita butuh membuat beberapa kondisi.
- Kasus seperti ini, di Java kita bisa menggunakan Else If expression.
- Else if di Java bisa lebih dari satu.

## Switch Statement

- Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
- Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya.
- Kondisi di switch statement hanya untuk perbandingan ==

## Switch Lambda

- Di Java vesri 14, diperkenalkan switch expression dengan lambda.
- ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break.

## Kata Kunci yield

- Di Java 14, ada kata kunci baru ya itu yield, dimana kita bisa menggunakan kata kunci yield untuk mengembalikan nilai
  pada switch statement.
- ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement.

## Ternary Operator

- Ternary operator adalah operator sederhana dari if statement.
- Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false,
  maka nilai kedua diambil.

## For Loop

- For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan.
- Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi.

## Sintak Perulangan For

```java
  for(init statement;kondisi;post statement){
    // blok perulangan
  }

```
- Init statement akan dieksekusi hanya sekali di awal sebelum perulangan.
- Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti.
- Post statement akan dieksekusi setiap kali diakhiri perulangan.
- Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true.

## While Loop
- While loop adalah versi perulangan yang lebih sederhana dibandingkan dengan for loop.
- Di While loop, hanya terdapat kondisi perulangan tanpa ada init statement dan post statement.

## Do While Loop
- Do While loop adalah perulangan yang mirip dengan while.
- Perbedaannya hanya pada pengecekan kondisi.
- Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop dilakukan setelah perulangan dilakukan.
- Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kodisinya tidak bernilai true.

## Break & Continue
- Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch.
- Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
- Namun berbeda dengan continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.

## For Each
- Kadang kita biasa mengakses data array menggunakan perulangan.
- Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat.
- Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis.

## Method
- Method adalah blok kode program yang akan berjalan saat kita panggil.
- Sebelumnya kita sudah menggunakan method print() untuk menampilkan tulisan di console.
- Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan blok.
- Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung () .
- Di bahasa pemrograman lain. method juga disebut dengan Function.

## 

# [Terima Kasihku(Guruku) A.K.A Orang Ganteng dan Intelek](https://www.udemy.com/user/eko-kurniawan/)
