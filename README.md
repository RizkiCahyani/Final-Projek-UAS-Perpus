# Program Aplikasi Perpustakaan BookCamps
Menurut Wikipedia pemrograman berorientasi objek atau object-oriented programming yang biasa disingkat OOP merupakan paradigma pemrograman berdasarkan konsep "objek", yang dapat beris data, dalam bentuk field atau dikenal juga sebagai atribut; serta kode, dalam bentuk fungsi/prosedur atau dikenal juga sebagai method. Semua data dan fungsi di dalam paradigma ini dibungkus dalam kelas-kelas atau objek-objek. Bandingkan dengan logika pemrograman terstruktur. Setiap objek dapat menerima pesan, memproses data, dan mengirim pesan ke objek lainnya. Berikut cakupan dasar pemrograman berbasis objek:

Kelas dan Objek: 
• Definisi Kelas: Kelas adalah struktur dasar dalam OOP yang mendefinisikan atribut (variabel) dan metode (fungsi) yang dapat dimiliki oleh suatu objek. 
• Objek: Objek adalah instansi konkret dari suatu kelas. Setiap objek memiliki atribut yang unik dan dapat memanggil metode khususnya.
Inheritance (Pewarisan): 
• Konsep Pewarisan: Inheritance memungkinkan kelas baru ("subclass" atau "child class") mewarisi atribut dan metode dari kelas yang sudah ada ("superclass" atau "parent class").
• Keuntungan: Meningkatkan reusable code dan memfasilitasi pengelolaan hierarki kelas.
Polimorfisme: 
• Arti Polimorfisme: Polimorfisme memungkinkan suatu metode memiliki nama yang sama tetapi dapat melakukan tindakan yang berbeda tergantung pada objek yang memanggilnya. 
• Contoh Penggunaan: Metode overriding dan interface adalah implementasi polimorfisme dalam OOP.
Encapsulation (Enkapsulasi): 
• Prinsip Enkapsulasi: Enkapsulasi melibatkan pengemasan atribut dan metode ke dalam satu unit tunggal (kelas), dengan mengakses atribut menggunakan metode (getters dan setters). 
• Keuntungan: Menyediakan kontrol akses yang lebih baik dan membatasi akses langsung ke atribut.
Abstraksi: 
• Arti Abstraksi: Abstraksi melibatkan penyembunyian detail implementasi dan hanya mengekspos fungsionalitas penting suatu objek. 
• Implementasi di OOP: Interface dan kelas abstrak digunakan untuk menciptakan tingkat abstraksi.
Class Diagram: 
• Definisi Class Diagram: Class diagram adalah representasi visual dari struktur kelas, hubungan antar kelas, dan sifat atribut dan metode. 
• Manfaat: Memberikan pandangan visual yang jelas tentang hubungan antar objek dalam suatu sistem.
Persistence API: Sebuah antarmuka pemrograman aplikasi (API) yang menyediakan metode dan fungsi untuk melakukan operasi persistence, seperti menyimpan, mengambil, dan menghapus data.

## Tech
##### Perangkat Lunak
- JDK 8
- NetBeans IDE 15
- PostgreSQL 14

##### Liblary
- PostgreSQL JDBC Driver `NetBeans`
- Absolute Layout `NetBeans`
- EnclipseLink (JPA 2.1) `NetBeans`
- [Library lainnya](https://drive.google.com/drive/folders/12aqJtgMWrztnQLhqt8XpMU1gMrIvPGSz?usp=sharing)

## Preview
##### Menu Utama (Admin)
![](https://private-user-images.githubusercontent.com/149169082/288633030-d9b3e4dd-ff3d-48c5-b1fe-c5dc76ab03ac.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDMwLWQ5YjNlNGRkLWZmM2QtNDhjNS1iMWZlLWM1ZGM3NmFiMDNhYy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00NDE4MWIxNTljNGM1ZGUwMDI2NWIyMGNhNThiNjA0ODZmYzZjMGQxNjVjMjYwYmY3YjFiNzc3OTkwMzFkZGE2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.T88vaGnOTYiw5PrylrGvxqPRFY89NThNoFTV9vqFFEk)

##### Menu Anggota
###### Tampilan Awal
![](https://private-user-images.githubusercontent.com/149169082/288633036-1dbcbb79-3c18-4e5e-a574-56d59495ed7b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDM2LTFkYmNiYjc5LTNjMTgtNGU1ZS1hNTc0LTU2ZDU5NDk1ZWQ3Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00MDdiNzdiMWU3M2NkYjQ3Y2U0MjE4OTdkZGU4YzFlODI4ZWZlNDYxNWJjZTEzOTk2Yjk0YWYxYWEyZTk4YTFkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.U-Y637qrfvKcoXuQ4ZCO86xDanALOKjuJ4wv14AR7As)

###### Tampilan Input Data Anggota
![](https://https://private-user-images.githubusercontent.com/149169082/288633038-e8c646ac-5d3c-4cee-9bfd-a0c7f89802b0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDM4LWU4YzY0NmFjLTVkM2MtNGNlZS05YmZkLWEwYzdmODk4MDJiMC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05NTE4NTRkMjRlOTllZWU4ZTBlMTI0OTA3YmVkZWE5NjMwZTAwOTQxNzM3MzBjZWExMTUyYTlmZjRmN2YzMWFkJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.tUjsgqPxSxbZAD0aL9euNmYLKo_5_yIMVc_eI0sMptI)

##### Menu Buku
###### Tampilan Awal
![](https://private-user-images.githubusercontent.com/149169082/288633040-075d2f97-fc8a-4bb7-9bd0-b08ace73c204.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDQwLTA3NWQyZjk3LWZjOGEtNGJiNy05YmQwLWIwOGFjZTczYzIwNC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xMmY5MjhjYTFhMDgzZDE2OTRhYzg5M2Y5NjU3NGIwZjA2OGQwNzg3ZWMyMzlhMTEwZWI3YzE3ZGI4MWEzYzU1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.ZXbvgopfavr74ez74mBYaGRKargj4txGljz57niGAtM)

###### Tampilan Input Data Buku
![](https://private-user-images.githubusercontent.com/149169082/288633041-e282f482-5bc6-4620-b472-57db96423431.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDQxLWUyODJmNDgyLTViYzYtNDYyMC1iNDcyLTU3ZGI5NjQyMzQzMS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lZmY1Yzk2NGNhNTIzNmE4OTEyYzE1ZjY4N2RmMzc4N2FlMWUwMjYxZDE5OTA4MTU2MGViNGM4Y2MzYzVjZDExJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.vkjlRC4fkEOumbwuoOb4p3RUyBSs1OW12snDYYKZnB0)

##### Menu Skripsi
###### Tampilan Awal
![](https://private-user-images.githubusercontent.com/149169082/288633042-a5040a04-d1e1-40dc-aa9d-850089c99543.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDQyLWE1MDQwYTA0LWQxZTEtNDBkYy1hYTlkLTg1MDA4OWM5OTU0My5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNGY3MTNhNGQ0ZWYwYjVkMWU3MTY5OWM2YmUyMWFhNThhYjU2NmY3YjBkNGY4ODYwYmEyOGNiOWI5MzRiMzM1JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.OC8fMY8hp0b0nuU_fnYpwp7EoI6FbcU9c60dvX017aY)

###### Tampilan Input Data Skripsi
![](https://private-user-images.githubusercontent.com/149169082/288633007-74c437a8-57b9-4666-94c6-49763e531bb2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDA3LTc0YzQzN2E4LTU3YjktNDY2Ni05NGM2LTQ5NzYzZTUzMWJiMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1lNWU4MjU2ZTc4ZDVlM2ZmMTAzNWEzZjZkMmU1NWQ2NjVjZmI3OGQ2NjM4ZWZmYmIxZWI1N2ZhZjhlOGJlM2QzJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9._qvnbSmPDVI79GQe0r58m_zpf1HB1vNaGKCVvtf2O_4)

##### Menu Peminjaman
###### Tampilan Awal
![](https://private-user-images.githubusercontent.com/149169082/288633018-c1ecbafc-2756-4a5c-8a6b-0f01feb11156.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDE4LWMxZWNiYWZjLTI3NTYtNGE1Yy04YTZiLTBmMDFmZWIxMTE1Ni5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1mZTQxMGIyYzA2YTAzZmVmNmI5YTMzOGVkNWY2Y2UzOTJjMjcyMDI3YTNkYWY5ZWE4OTYwNGQzYzU1ZWZmMDkxJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.A6-50j1qV_x-FmbLPRFAITrjS6CtHyoAVs9DRu1y0xs)

###### Tampilan Input Data Peminjaman
![](https://private-user-images.githubusercontent.com/149169082/288633020-40370877-b22d-457d-b011-8151bdf674aa.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDIwLTQwMzcwODc3LWIyMmQtNDU3ZC1iMDExLTgxNTFiZGY2NzRhYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1hY2JhNTU2YjNhZjA1YjFmNDE5NGY5ZTQ3NjM3ZGUzOTQxN2JkNDU0MTVhYTE4OWYxMjdkYTlkNmMzMTc5ZGM3JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.XBkqyWz5xFsDhT-qlCnaOj8daNSUJieDMAOS0PCKV1Q)

##### Menu Petugas
###### Tampilan Awal
![](https://private-user-images.githubusercontent.com/149169082/288633024-77fa3143-92c7-4d88-972f-87477ed4726a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDI0LTc3ZmEzMTQzLTkyYzctNGQ4OC05NzJmLTg3NDc3ZWQ0NzI2YS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yOTE0ZWFhMTE4ZDIyYjBmZGVhMTgxYmY1OGE1MDU5NDU2ZjFlZDE0YTQ5ZWQyNzFmZThhZDFmOGFjYmRjZjVlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9._K76BzWUt9I87qa3cCKcAzl7Qnp_BzksHasDGwjQ6gs)

###### Tampilan Tambah Petugas
![](https://private-user-images.githubusercontent.com/149169082/288633028-0dd81344-ce33-4881-8bea-45daddbd7fd6.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDE5MjQ1MDcsIm5iZiI6MTcwMTkyNDIwNywicGF0aCI6Ii8xNDkxNjkwODIvMjg4NjMzMDI4LTBkZDgxMzQ0LWNlMzMtNDg4MS04YmVhLTQ1ZGFkZGJkN2ZkNi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBSVdOSllBWDRDU1ZFSDUzQSUyRjIwMjMxMjA3JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDIzMTIwN1QwNDQzMjdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03ZDc5ZmQ1NjVjYzc3ZWEzZDY4ZDkwZDY3M2NhMWMwMTA3MjgyNmJjNTFmZWU0Njk5NmU0YjVjNzk2YTdjY2ZmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.18zsbWoyu8WxVB-6ZSPDmDE1zZRyI1S4oiJGiBAAYyw)



# Membuat Database dengan nama “Db_perpustakaan”
Membuat Tabel: a) Create table Buku -- Table: public.buku
-- DROP TABLE IF EXISTS public.buku;

CREATE TABLE IF NOT EXISTS public.buku ( id_buku character(11) COLLATE pg_catalog."default" NOT NULL, judul character varying(50) COLLATE pg_catalog."default", subjudul character varying(50) COLLATE pg_catalog."default", isbn character(13) COLLATE pg_catalog."default", bahasa character varying(15) COLLATE pg_catalog."default", penerbit character varying(50) COLLATE pg_catalog."default", tahun_terbit character varying(4) COLLATE pg_catalog."default", jumlah_halaman integer, jumlah_buku integer, CONSTRAINT pk_buku PRIMARY KEY (id_buku) )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.buku OWNER to postgres; -- Index: buku_pk

-- DROP INDEX IF EXISTS public.buku_pk;

CREATE UNIQUE INDEX IF NOT EXISTS buku_pk ON public.buku USING btree (id_buku COLLATE pg_catalog."default" ASC NULLS LAST) TABLESPACE pg_default;

b) Create Table Peminjam -- Table: public.peminjam

-- DROP TABLE IF EXISTS public.peminjam;

CREATE TABLE IF NOT EXISTS public.peminjam ( id_peminjam character(5) COLLATE pg_catalog."default" NOT NULL, nama character varying(30) COLLATE pg_catalog."default", nim character varying(15) COLLATE pg_catalog."default", fakultas character varying(30) COLLATE pg_catalog."default", program_studi character varying(30) COLLATE pg_catalog."default", semester integer, alamat character varying(100) COLLATE pg_catalog."default", telephone character varying(13) COLLATE pg_catalog."default", email character varying(30) COLLATE pg_catalog."default", CONSTRAINT pk_peminjam PRIMARY KEY (id_peminjam) )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.peminjam OWNER to postgres; -- Index: peminjam_pk

-- DROP INDEX IF EXISTS public.peminjam_pk;

CREATE UNIQUE INDEX IF NOT EXISTS peminjam_pk ON public.peminjam USING btree (id_peminjam COLLATE pg_catalog."default" ASC NULLS LAST) TABLESPACE pg_default;

c) Create Table Skripsi -- Table: public.skripsi

-- DROP TABLE IF EXISTS public.skripsi;

CREATE TABLE IF NOT EXISTS public.skripsi ( id_skripsi character(11) COLLATE pg_catalog."default" NOT NULL, judul character varying(50) COLLATE pg_catalog."default", bahasa character varying(15) COLLATE pg_catalog."default", fakultas character varying(30) COLLATE pg_catalog."default", program_studi character varying(30) COLLATE pg_catalog."default", tahun character varying(4) COLLATE pg_catalog."default", penulis character varying(30) COLLATE pg_catalog."default", pembimbing character varying(30) COLLATE pg_catalog."default", jumlah_halaman integer, jumlah_salinan integer, CONSTRAINT pk_skripsi PRIMARY KEY (id_skripsi) )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.skripsi OWNER to postgres;

d) Create Table Peminjaman -- Table: public.peminjaman

-- DROP TABLE IF EXISTS public.peminjaman;

CREATE TABLE IF NOT EXISTS public.peminjaman ( id_petugas character(5) COLLATE pg_catalog."default" NOT NULL, id_peminjam character(5) COLLATE pg_catalog."default" NOT NULL, no_peminjaman character(10) COLLATE pg_catalog."default" NOT NULL, tanggal_pinjam date, tanggal_kembali date, keterangan character varying(100) COLLATE pg_catalog."default", status character varying(8) COLLATE pg_catalog."default", CONSTRAINT pk_peminjaman PRIMARY KEY (id_petugas, id_peminjam, no_peminjaman), CONSTRAINT fk_peminjam_melakukan_peminjam FOREIGN KEY (id_peminjam) REFERENCES public.peminjam (id_peminjam) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT, CONSTRAINT fk_peminjam_melakukan_petugas FOREIGN KEY (id_petugas) REFERENCES public.petugas (id_petugas) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.peminjaman OWNER to postgres;

e) Create Table Pengarang -- Table: public.pengarang

-- DROP TABLE IF EXISTS public.pengarang;

CREATE TABLE IF NOT EXISTS public.pengarang ( id_buku character(11) COLLATE pg_catalog."default", nama_pengarang character varying(30) COLLATE pg_catalog."default", CONSTRAINT fk_pengaran_memiliki_buku FOREIGN KEY (id_buku) REFERENCES public.buku (id_buku) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.pengarang OWNER to postgres;

f) Create Table Petugas -- Table: public.petugas

-- DROP TABLE IF EXISTS public.petugas;

CREATE TABLE IF NOT EXISTS public.petugas ( id_petugas character(5) COLLATE pg_catalog."default" NOT NULL, nama character varying(30) COLLATE pg_catalog."default", email character varying(30) COLLATE pg_catalog."default", alamat character varying(100) COLLATE pg_catalog."default", jenis_kelamin character(1) COLLATE pg_catalog."default", telephone character varying(13) COLLATE pg_catalog."default", username character varying(30) COLLATE pg_catalog."default", password character varying(100) COLLATE pg_catalog."default", CONSTRAINT pk_petugas PRIMARY KEY (id_petugas) )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.petugas OWNER to postgres;

g) Create Table Detail Buku -- Table: public.detail_buku

-- DROP TABLE IF EXISTS public.detail_buku;

CREATE TABLE IF NOT EXISTS public.detail_buku ( id_buku character(11) COLLATE pg_catalog."default" NOT NULL, id_petugas character(5) COLLATE pg_catalog."default" NOT NULL, id_peminjam character(5) COLLATE pg_catalog."default" NOT NULL, no_peminjaman character(10) COLLATE pg_catalog."default" NOT NULL, jumlah integer, CONSTRAINT pk_detail_buku PRIMARY KEY (id_buku, id_petugas, id_peminjam, no_peminjaman), CONSTRAINT fk_detail_b_memiliki7_peminjam FOREIGN KEY (id_peminjam, id_petugas, no_peminjaman) REFERENCES public.peminjaman (id_peminjam, id_petugas, no_peminjaman) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT, CONSTRAINT fk_detail_b_memiliki8_buku FOREIGN KEY (id_buku) REFERENCES public.buku (id_buku) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.detail_buku OWNER to postgres;

h) Create Table Detail Skripsi

-- DROP TABLE IF EXISTS public.detail_skripsi;

CREATE TABLE IF NOT EXISTS public.detail_skripsi ( id_skripsi character(11) COLLATE pg_catalog."default" NOT NULL, id_petugas character(5) COLLATE pg_catalog."default" NOT NULL, id_peminjam character(5) COLLATE pg_catalog."default" NOT NULL, no_peminjaman character(10) COLLATE pg_catalog."default" NOT NULL, jumlah integer, CONSTRAINT pk_detail_skripsi PRIMARY KEY (id_skripsi, id_petugas, id_peminjam, no_peminjaman), CONSTRAINT fk_detail_s_memiliki5_peminjam FOREIGN KEY (id_peminjam, id_petugas, no_peminjaman) REFERENCES public.peminjaman (id_peminjam, id_petugas, no_peminjaman) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT, CONSTRAINT fk_detail_s_memiliki6_skripsi FOREIGN KEY (id_skripsi) REFERENCES public.skripsi (id_skripsi) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.detail_skripsi OWNER to postgres; -- Index: detail_skripsi_pk

-- DROP INDEX IF EXISTS public.detail_skripsi_pk;

CREATE UNIQUE INDEX IF NOT EXISTS detail_skripsi_pk ON public.detail_skripsi USING btree (id_skripsi COLLATE pg_catalog."default" ASC NULLS LAST, id_petugas COLLATE pg_catalog."default" ASC NULLS LAST, id_peminjam COLLATE pg_catalog."default" ASC NULLS LAST, no_peminjaman COLLATE pg_catalog."default" ASC NULLS LAST) TABLESPACE pg_default; -- Index: memiliki5_fk

-- DROP INDEX IF EXISTS public.memiliki5_fk;

CREATE INDEX IF NOT EXISTS memiliki5_fk ON public.detail_skripsi USING btree (id_petugas COLLATE pg_catalog."default" ASC NULLS LAST, id_peminjam COLLATE pg_catalog."default" ASC NULLS LAST, no_peminjaman COLLATE pg_catalog."default" ASC NULLS LAST) TABLESPACE pg_default; -- Index: memiliki6_fk

-- DROP INDEX IF EXISTS public.memiliki6_fk;

CREATE INDEX IF NOT EXISTS memiliki6_fk ON public.detail_skripsi USING btree (id_skripsi COLLATE pg_catalog."default" ASC NULLS LAST) TABLESPACE pg_default;

i) Create Table Kategori Buku -- Table: public.kategori_buku

-- DROP TABLE IF EXISTS public.kategori_buku;

CREATE TABLE IF NOT EXISTS public.kategori_buku ( id_buku character(11) COLLATE pg_catalog."default", kategori character varying(20) COLLATE pg_catalog."default", CONSTRAINT fk_kategori_memiliki1_buku FOREIGN KEY (id_buku) REFERENCES public.buku (id_buku) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.kategori_buku OWNER to postgres;

j) Create Table Kategori Skripsi -- Table: public.kategori_skripsi

-- DROP TABLE IF EXISTS public.kategori_skripsi;

CREATE TABLE IF NOT EXISTS public.kategori_skripsi ( id_skripsi character(11) COLLATE pg_catalog."default", kategori character varying(20) COLLATE pg_catalog."default", CONSTRAINT fk_kategori_memiliki3_skripsi FOREIGN KEY (id_skripsi) REFERENCES public.skripsi (id_skripsi) MATCH SIMPLE ON UPDATE RESTRICT ON DELETE RESTRICT )

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.kategori_skripsi OWNER to postgres;

