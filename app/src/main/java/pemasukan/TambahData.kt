package pemasukan

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.iscollection.R

class TambahData : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tambah_data)

        val btnBack = findViewById<ImageButton>(R.id.btnkembali)

        // Menambahkan OnClickListener untuk tombol kembali
        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}