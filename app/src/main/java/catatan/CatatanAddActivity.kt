package catatan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.iscollection.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CatatanAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.catatan) // Ganti dengan layout yang sesuai

        // Temukan tombol tambah dengan ID btnTambah
        val btnTambah: FloatingActionButton= findViewById(R.id.fabAddNote)

        // Set listener untuk tombol tambah
        btnTambah.setOnClickListener {
            // Intent untuk membuka activity catatan_add.xml
            val intent = Intent(this, CatatanAddFormActivity::class.java)
            startActivity(intent)
        }

        val btnBack = findViewById<ImageButton>(R.id.btnBack)

        // Menambahkan OnClickListener untuk tombol kembali
        btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}
