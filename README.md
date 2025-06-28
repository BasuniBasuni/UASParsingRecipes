📱 Fitur Umum Aplikasi:
1.	Parsing JSON dari API
- 	Aplikasi kamu mengambil data resep melalui API (mungkin menggunakan endpoint seperti https://dummyjson.com/recipes).
2.	Tampilan Daftar Resep
- 	Menampilkan list resep dengan foto dan judul di layar utama—biasanya menggunakan komponen RecyclerView.
3.	Detail Setiap Resep
- 	Ketika pengguna memilih satu resep, muncul layar baru yang menunjukkan bahan-bahan dan cara memasak secara lengkap.
4.	Integrasi Jejaring RetroFit & Glide
- 	Retrofit dipakai untuk memanggil RESTful API dan mengubah JSON menjadi objek Java.
-   lide digunakan untuk memuat gambar thumbnail resep secara efisien ke dalam ImageView 
________________________________________
⚙️ Teknologi dan Struktur Umumnya:
•	Bahasa pemrograman: Java (Android Studio)
•	Library:
1. Retrofit + Gson Converter untuk API dan parsing data.
2. Glide untuk memuat dan menampilkan gambar dengan lancar .
3. RecyclerView, CardView untuk tampilan UI yang responsif
•	Arsitektur file tipikal:
1. MainActivity.java: menampilkan daftar resep.
2. DetailActivity.java: menampilkan resep terpilih secara rinci.
3. RecipeAdapter.java: adapter untuk RecyclerView.
4. DataRecipes.java: model data.
5. API3 Service.java, APIConfig.java: untuk konfigurasi dan panggilan API
________________________________________
🛠️ Cara Kerjanya:
Tahap	Penjelasan
1. Call API	Retrofit memanggil endpoint API dan menerima data JSON.
2. Parsing	Gson otomatis mengubah JSON menjadi objek Java (DataRecipes).
3. Tampilkan List	RecyclerView menampilkan daftar resep dengan foto & nama.
4. Buka Detail	Saat pengguna klik, DetailActivity tampilkan informasi lengkap.
5. Load Gambar	Glide mengurus load gambar dengan mode caching agar UI responsif.
________________________________________
🎓 Kesimpulan
Proyek Saya adalah aplikasi Android sederhana namun fungsional yang menggabungkan:
1. Pengambilan data lewat API
2. Parsing JSON dengan Retrofit + Gson
3. Tampilan responsif menggunakan RecyclerView & CardView
4. Pemrosesan gambar dengan Glide

