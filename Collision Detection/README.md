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
