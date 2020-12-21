# Collision Detection With Mouse

Program ini merupakan program yang sama seperti collision detection sebelumnya, hanya saja yang membedakan dengan sebelumnya adalah kontrol dari pesawatnya dimana pada Collision Detection sebelumnya menggunakan keyboard sebagai kontrol. Pada Collision Detection kali ini menggunakan mouse sebagai kontrol dari Spaceship. Berikut perubahan yang terjadi pada class yang ada di dalam Collision Detection

### Kelas SpaceShip
##### 1. initCraft
Pada kelas initCraft, terdapat tambahan perintah untuk membatasi gerak Spaceship secara horizontal dan vertikal.
##### 2. mouseClick dan mouseDragged
Pada Collision Detection sebelumnya, kelas SpaceShip menggunakan method keyPressed dan keyReleased. Pada Collision Detection kali ini, kelas SpaceShip menggunakan method mouseClick dan mouseDragged untuk memanggil method fire() saat tombol mouse ditekan
##### 3. mouseMoved

