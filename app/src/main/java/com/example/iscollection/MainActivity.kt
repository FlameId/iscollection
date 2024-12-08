package com.example.iscollection

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda) // Pastikan file ini ada di res/layout

        // Menemukan tombol dengan ID btn_terakhir_baca dan mengatur OnClickListener
        val btnTerakhirBaca: Button = findViewById(R.id.btn_terakhir_baca)

        btnTerakhirBaca.setOnClickListener {
            // Membuka halaman CatatanAddActivity
            val intent = Intent(this, catatan.CatatanAddActivity::class.java)
            startActivity(intent)
        }

        val pemasukkan: Button = findViewById(R.id.btn_baca_quran)

        pemasukkan.setOnClickListener {
            // Membuka halaman CatatanAddActivity
            val intent = Intent(this, pemasukan.Pemasukkan::class.java)
            startActivity(intent)
        }

        val pengeluaran: Button = findViewById(R.id.A)

        pengeluaran.setOnClickListener {
            // Membuka halaman CatatanAddActivity
            val intent = Intent(this, pengeluaran.Pengeluaran::class.java)
            startActivity(intent)
        }
    }
}
