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
Pada sumber referensi tombol spasi berfungsi untuk menerbangkan burung, namun tidak dapat digunakan untuk memulai Game kembali setelah GameOver. Maka dari itu disini kita menambahkan fungsi spasi sebagai tombol untuk memulai Game kembali.
### 3. Ground Class
Disini kami menjadikan kelas Ground inheritance terhadap kelas GameObject.
### 4. GameOver
Sebelumnya, permainan akan berakhir atau GameOver hanya jika objek burung menabrak salah satu tube. Namun disini kita menambahkan fungsi dimana ketika objek burung jatuh ke tanah/Ground maka permainan akan berakhir atau GameOver.
### 5. Posisi objek Burung
Pada sumber referensi, ketika permainan dimulai kembali setelah GameOver, posisi Burung berada pada koordinat yang sama dengan posisi Burung saat GameOver. Hal tersebut mengakibatkan objek Burung sulit untuk diterbangkan ketika posisi GameOvernya tepat berada di tanah/Ground. Maka dari itu disini kami menempatkan posisi Burung saat memulai permainan kembali sama seperti posisi awal permainan baru dimulai.
### 6. Level permainan
Dan yang terakhir kami juga menambahkan sistem level pada permainan. Dimana semakin besar skor yang didapat, maka akan semakin cepat kecepatan permainan tersebut.

## Penjelasan tiap Class
### 1. GameObject
Kelas ini merupakan abstract class dan superclass dari kelas Bird,Ground, dan Tube. Dimana terdapat atribut sebagai berikut.
```
protected int x;
protected int y;
protected int width;
protected int height;
protected float velX;
protected float velY;
```
x,y,width,height berfungsi untuk menyimpan nilai posisi dan ukuran objek. Sementara velX dan velY untuk menyimpan nilai kecepatan pada sumbu x dan y.
```
import java.awt.Rectangle;
import java.awt.Graphics;
```
Pada kelas ini juga menggunakan kelas Rectangle yang berguna untuk mengcreate Objek. Juga terdapat kelas Graphics untuk menampilkan bentuk dan gambar di layar.

Dalam class ini terdapat beberapa method yaitu:
```
public abstract void tick();
```
merupakan method action yang akan dilakukan oleh kelas turunannya.
```
public abstract void render(final Graphics p0);
```
merupakan method yang berfungsi untuk mengeksekusi Graphic.
### 2. Animation
Merupakan kelas yang berfungsi mengoperasikan Image object dalam bentuk animasi. Berikut isi dari kelas Animation
```
public Animation(final GameObject target, final long delay, final boolean loop, final BufferedImage[] images) 
public Animation(final GameObject target, final int x, final int y, final long delay, final boolean loop, final BufferedImage[] images)
public Animation(final int x, final int y, final long delay, final boolean loop, final BufferedImage[] images)
```
Masing-masing dari constructor memiliki parameter images yang disimpan dalam tipe array.
```
public void render(final Graphics g)
```
kemudian terdapat method render yang berfungsi untuk menampilkan image pada layar.
### 3. Bird
Kelas Bird merupakan kelas turunan dari GameObject. Kelas ini adalah objek utama atau karakter yang akan dikontrol dalam permainan. isi dari kelas Bird adalah sebagai berikut.
```
public Bird(final int x, final int y, final int width, final int height)
```
Merupakan constructor dari kelas Bird.
```
for (int i = 0; i < images.length; ++i) {
            images[i] = GraphicsLoader.loadGraphics("bird" + i + ".png");
        }
        (this.animation = new Animation((GameObject)this, 100L, true, images)).start();
        ObjectHandler.addObject((GameObject)this);
```
Terdapat operasi looping yang berguna untuk memunculkan image Bird dalam bentuk animasi.
```
public void tick()
```
Merupakan method action. Pada class Bird ini method tick berfungsi sebagai movement object dan kondisi ketika GameOver.
### 4. Ground
Ground merupakan kelas turunan dari GameObject. Kelas ini Berfungsi untuk mengatur tanah atau dataran pada permainan Flappy Bird. Isi dari kelas Ground adalah sebagai berikut.
```
public Ground(final int x, final int y, final int width, final int height)
```
Merupakan constructor dari kelas Ground.
```
public void tick()
```
Merupakan method action. Pada method ini, kecepatan tanah atau dataran bergerak diatur.
```
public void render(final Graphics g)
```
Merupakan method yang berfungsi untuk menggambar object tanah setiap kali terjadi perubahan tiap waktunya.
### 5. ObjectHandler
ObjectHandler merupakan kelas yang berfungsi untuk menangani benda-benda yang bergerak dalam game Flappy Bird. Pada kelas ini, terdapat linkedlist yang dimana saat object bergerak telah keluar dari area layar maka akan diremove.
### 6. Button
Kelas button merupakan kelas yang berfungsi untuk mengatur 
### 7. Window
Kelas ini merupakan kelas yang diturunkan dari kelas JFrame. Kelas ini mengatur Seperti apa panel yang akan dimunculkan di layar. Selain itu kelas ini juga memanggil kelas game yang dimana program akan tereksekusi.
### 8. Game
Kelas Game merupakan kelas main. Kelas ini digunakan untuk mengeksekusi jalannya program.
### 9. Tube
Kelas Tube merupakan kelas yang menampilkan grafik pipa yang akan dilewati oleh burung nya.
### 10. TubeType
TubeType merupakan sebuah enum yang digunakan untuk mengatur letak pipa, apakah pipa terletak diatas atau dibawah berdasarkan parameter
```
 BOTTOM("BOTTOM", 0), 
	    TOP("TOP", 1);
```
### 11. TubeHandler
Kelas ini merupakan kelas yang mengatur ukuran dari pipa nya. Dimulai dari tinggi pipa dari bawah, tinggi pipa dari atas dan spasi antara dua pipa atas-bawah. Fungsi
```
 public static void spawnTube() {
        int heightTop;
        for (heightTop = TubeHandler.random.nextInt(TubeHandler.maxSize) + 1; heightTop < TubeHandler.minSize; 
        heightTop = TubeHandler.random.nextInt(TubeHandler.maxSize) + 1) {}
        final int heightBottom = TubeHandler.area - TubeHandler.spacing - heightTop;
        final Tube tubeTop = new Tube(500, 0, 78, heightTop, TubeType.TOP);
        final Tube tubeBottom = new Tube(500, heightTop + TubeHandler.spacing, 78, heightBottom, TubeType.BOTTOM);
        ObjectHandler.addObject(tubeTop);
        ObjectHandler.addObject(tubeBottom);
    }
```
spawnTube() merupakan fungsi yang akan menampilkan pipa selanjutnya jika kita melewati pipa sebelumnya.
### 12. KeyHandler
Kelas ini merupakan kelas yang akan memberikan aksi ketika key pada keyboad ditekan.
### 13. MouseHandler
Kelas MouseHandler ini merupakan kelas yang akan memberikan aksi ketika mouse diklik.
## Diagram Kelas Secara Umum (Belum termasuk fitur tambahan)
![](https://github.com/ALuthfiH/Final-Project-PBO/blob/main/Final%20Project/FlappyBird_FP.png)
