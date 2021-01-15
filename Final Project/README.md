# Flappy Bird (Games)

Flappy Bird merupakan permainan dibuat oleh seorang pengembang dari Hanoi, Vietnam bernama Nguyen Ha Dong dan diluncurkan pada bulan Mei 2013. Cara bermainnya yakni dengan jari ke layar ponsel pintar untuk membuat si burung terbang, melewati setiap pipa berwarna. Setiap pipa yang dilewati akan memberikan poin sebanyak satu. Apabila timing saat mengetukkan tidak tepat maka kemungkinan burung akan menabrak pipa, game berakhir dan pemainnya harus mengulang dari awal. Pada Flappy Bird yang akan kamu buat ada beberapa perbedaan. Berikut fitur yang akan ditambahkan pada game Flappy Bird.

## Fitur-fitur 
### 1. Sistem Scoring
Terdapat sistem scoring yang dimana skornya akan terus bertambah setiap kali burung melewati celah di antara tube dan akan ditampilkan pada layar.
### 2. Level yang berubah
Selain itu, terdapat sistem tingkat kesulitan yang dimana akan terus meningkat seiring dengan bertambahnya skor. Semakin besar skor yang didapat, maka akan semakin cepat kecepatan permainan tersebut.
## Perubahan yang dilakukan dari sumber referensi
### 1. Mouse Handler
Jika sebelumnya pada sumber referensi mousehandler hanya berfungsi ketika mengklik tombol mulai, maka disini kita menambahkan fungsi Mouseclicked pada mousehandler dimana akan berfungsi untuk mengontrol movement burung. Objek burung akan terbang setiap kali mengklik mouse.
### 2. Key Handler
Pada sumber referensi tombol spasi berfungsi untuk menerbangkan burung, namun tidak dapat digunakan untuk memulai Game kembali setelah GameOver. Maka dari itu disini ketika menambahkan fungsi spasi sebagai tombol untuk memulai Game kembali.
### 3. GameOver
Sebelumnya, permainan akan berakhir atau GameOver hanya jika objek burung menabrak salah satu tube. Namun disini kita menambahkan fungsi dimana ketika objek burung jatuh ke tanah/Ground maka permainan akan berakhir atau GameOver.
### 4. Level permainan
Dan yang terakhir kami juga menambahkan sistem level pada permainan. Dimana semakin besar skor yang didapat, maka akan semakin cepat kecepatan permainan tersebut.
## Diagram Kelas Secara Umum (Belum termasuk fitur tambahan)
![](https://github.com/ALuthfiH/Final-Project-PBO/blob/main/Final%20Project/FlappyBird_FP.png)
