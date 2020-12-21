# Collision Detection With Mouse

Program ini merupakan program yang sama seperti collision detection sebelumnya, hanya saja yang membedakan dengan sebelumnya adalah kontrol dari pesawatnya dimana pada Collision Detection sebelumnya menggunakan keyboard sebagai kontrol. Pada Collision Detection kali ini menggunakan mouse sebagai kontrol dari Spaceship. Berikut perubahan yang terjadi pada class yang ada di dalam Collision Detection.

### Kelas SpaceShip
#### 1. initCraft
Pada kelas initCraft, terdapat tambahan perintah untuk membatasi gerak Spaceship secara horizontal dan vertikal.
#### 2. mouseClick dan mouseDragged
Pada Collision Detection sebelumnya, kelas SpaceShip menggunakan method keyPressed dan keyReleased. Pada Collision Detection kali ini, kelas SpaceShip menggunakan method mouseClick dan mouseDragged untuk memanggil method fire() saat tombol mouse ditekan.
#### 3. mouseMoved
Method ini berfungsi untuk menghentikan Spaceship apabila telah mencapai batas kanan dan bawah tampilan.

### Kelas Sprite
#### 1. getWidht dan getHeight
Method ini digunakan untuk mengambil panjang dari gambar spaceship, missile, dan alien yang telah disisipkan pada project.

### Kelas Board
Pada class ini, dilakukan penyesuaian terhadap method TAdapter dimana jika sebelumnya terdapat method-method yang digunakan untuk melakukan event pada keyboard digantikan dengan method-method untuk melakukan event pada mouse dari method yang telah ditambahkan dari kelas SpaceShip.

### Rekaman Jalannya Program

