# Collision Detection

Di dalam project ini terdapat beberapa class sebagai berikut :

### 1. Sprite Class
Kelas ini merupakan superclass dari spaceship, alien dan missile. Dimana fungsi-fungsi class ini akan diturunkan kepada 3 class tersebut. Berikut method-method yang terdapat pada class Sprite.
```
1. <Construstor> sprite
```
Digunakan untuk menginisialisasi posisi dari Space Ship, alien, dan missile.
```
2. getImageDimension
```
Method yang digunakan untuk mengatur dimensi ukuran gambar dari Space Ship, alien, dan missile.
```
3. loadImage
```
Berfungsi untuk mengambil dan memasukkan gambar.
```
4. getImage 
```
Method yang mengembalikkan nilai berupa gambar.
```
5. getX dan getY
```
Berfungsi untuk mengambil koordinat gambar.
```
6. setVisible
```
Berfungsi agar gambar dapat ditampilkan di layar.
```
7. isVisible 
```
Untuk mengetahui apakah gambar tersebut berada dalam mode visible atau tidak.
```	
8. getBound
```

### 2. SpaceShip Class
Kelas ini merupakan kelas yang diturunkan dari kelas Sprite. Kelas ini berfungsi untuk membuat dan mengatur object Space Ship yang akan kita kendalikan di dalam game. Objek yang terdapat di class ini antara lain.
```
1. Missiles
```
Peluru yang akan ditembakkan ke arah alien

Method yang dalam kelas ini.
```
1. <Constructor> SpaceShip
```
Berfungsi untuk menginisialisasi titik awal dari SpaceShip
```
2. initCraft
```
Method ini berfungsi untuk membuat daftar misil yang akan ditembakkan dalam bentuk array. Selain itu, method ini juga berfungsi untuk mengambil gambar SpaceShip.
```
3. getMissiles
```
```
4. keyPressed
```
Method yang berfungsi untuk memberikan aksi berupa gerakan ketika user menekan key yang telah diatur dalam method tersebut.
```
5. fire
```
Method yang digunakan untuk menambahkan satu misil ketika user memberikan perintah untuk menembak.
```
6. keyRealeased
```
Mengatur agar Space Ship tetap diam saat user tidak menekan key perintah Space Ship.

### 3. Alien Class
Kelas ini juga  merupakan kelas yang diturunkan dari kelas Sprite. Kelas ini merupakan kelas yang berfungsi membuat dan mengatur pergerakan objek alien. Berikut method-method yang terdapat pada class Alien.
```
1. <Constructor> Alien
```
Berfungsi untuk menginisialisasi titik awal dari Alien.
```
2. initAlien
```
Berfungsi untuk menampilkan gambar dari alien.
```
3. move
```
Berfungsi untuk mengatur gerakan setiap alien. Selain itu, befungsi juga agar alien dapat kembali ke sisi kanan layar saat alien melewati sisi kiri layar.

### 4. Missile Class
Kelas ini juga merupakan kelas yang diturunkan dari kelas Sprite. Kelas ini merupakan kelas yang berfungsi membuat dan mengatur ketentuan saat missile ditembakkan. Method-method yang terdapat dalam class ini antara lain.
```
1. <constructor> Missile
```
Berfungsi untuk menginisialisasi letak awal misil.
```
2. initMissile
```
Berfungsi untuk menampilkan gambar misil.
```
3. move
```
Berfungsi untuk mengatur kecepatan pergerakan dari misil yang ditembakkan.

### 5. Board Class
Kelas ini merupakan penurunan dari kelas JPanel. Selain itu, kelas ini juga mengimplementasi fungsi dari ActionListeners. Kelas ini berfungsi untuk mengatur dan menginisialisasi hal-hal yang ada pada tampilan permainan. Method-method yang ada pada class ini antara lain.
```
1. pos
```
Method ini berfungsi untuk mengatur posisi awal alien-alien.
```
2. Board dan initBoard
```
Fungsi yang digunakan untuk menampilkan penampilan awal permainan. seperti letak space ship dan sisa alien yang harus dikalahkan.
```
3. initAlien
```
Berfungsi untuk membuat objek alien. Objek Alien dibuat dalam bentuk array.
```
4. paintComponen
```
Melakukan implementasi antara menampilkan permainan atau menampilkan pesan "game over".
```
5. drawObject
```
Menampilkan gambar awal permainan seperti space shipnya.
```
6. drawGameOver
```
Berfungsi untuk menampilkan pesan "game over".
```
7. actionPerformed
```
Berfungsi untuk memperbarui letak dan tampilan setiap objek setelah adanya aksi.
```
8. inGame
```
```
9. updateShip
```
Befungsi memperbarui letak space ship setiap adanya perintah yang dilakukan oleh user.
```
10. updateMissile
```
Berfungsi untuk memperbarui letak dan tampilan misil, serta membuang misil yang sudah bertabrakan dengan alien.
```
11. updateAlien
```
Berfungsi untuk mengecek apakah terdapat alien yang tersisa dalam panel, jika iya maka perbarui letak dan tampilannya. jika alien telah habis, maka keluarkan pesan "game over".
```
12. checkCollsion
```
Berfungsi untuk mengecek apakah ada tabrakan antara alien dan Space Ship.

### 6. CollisionEx
Kelas ini merupakan kelas yang berfunsgi sebagai Main Class, Kelas yang digunakan untuk mengeksekusi jalannya program. Method-method yang terdapat pada class ini antara lain.
```
1. <Constructor> CollisionEx dan initUI
```
Berfungsi untuk membuat frame permainan, judul dan operasi pada frame permainan.
```
2. main()
```
Method yang berfungsi untuk mengeksekusi permainan.
