package pemasukan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import catatan.CatatanAddFormActivity
import com.example.iscollection.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Pemasukkan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pemasukan)
        val btnTambah: FloatingActionButton = findViewById(R.id.fabAdd)

        // Set listener untuk tombol tambah
        btnTambah.setOnClickListener {
            // Intent untuk membuka activity catatan_add.xml
            val intent = Intent(this, TambahData::class.java)
            startActivity(intent)
        }
    }
}