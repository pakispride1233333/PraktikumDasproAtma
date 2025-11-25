# Adiatma Wahyudi  
Matkul: Praktikum Dasar Pemrograman  
Absen: 01  
Kelas: TI 1C  

---

# README – Laporan Percobaan Perulangan

## Percobaan 2.1

### 1.
Perulangan akan tetap berjalan. Jika input scanner adalah 5, maka perulangan berjalan dari 0 sampai 5 sehingga total iterasi berjumlah 6 kali. Output berupa ******.

### 2.
Perulangan berhenti jika i sama dengan value n. Output mencetak * sebanyak 4 karena perulangan berjalan ketika i < n, sehingga ketika i == n kondisi menjadi false.

### 3.
Tidak menghasilkan output karena kondisi tidak terpenuhi. Jika value n adalah 0 maka perulangan berjalan terus (infinite loop) karena i tidak pernah kurang dari n.

### 4.
Perulangan berjalan terus (infinite loop) karena kondisi i < n selalu terpenuhi.

### 5.
Output mencetak bintang sebanyak 3 kali. Karena setiap iterasi i bertambah 2, yaitu:  
Iterasi 0 → i = 1  
Iterasi 1 → i = 3  
Iterasi 2 → i = 5  
Iterasi 3 → berhenti.

---

## Percobaan 2.2

### 1.
Output menghasilkan jumlah baris sebanyak n + 1 karena iterasi dimulai dari 0.

### 2.
Output mencetak bintang sebanyak n + 1 karena perulangan berjalan dari i = 0 sampai i = n.

### 3.
Perulangan luar menentukan jumlah baris, sedangkan perulangan dalam menentukan banyaknya bintang tiap baris.

### 4.
`System.out.println()` digunakan untuk membuat baris baru setelah satu baris bintang selesai dicetak.

---

## Percobaan 2.3

### 1.
Kode belum sesuai karena struktur perulangan dan baris baru belum tepat.

### 2.
Perlu menambahkan `System.out.println();` agar setiap baris bintang tampil pada baris baru.

### 3.
Variabel i digunakan untuk menghitung jumlah baris, sedangkan j untuk jumlah bintang. Jika j tidak di-reset, maka bintang hanya tercetak satu kali setiap barisnya.

---

## Percobaan 2.4

### 1.
Variabel `totalNilai` digunakan untuk menyimpan total nilai setiap anggota dalam satu kelompok. Variabel ini diinisialisasi di dalam outer loop agar setiap kelompok memiliki total nilai yang dihitung ulang dari awal.
