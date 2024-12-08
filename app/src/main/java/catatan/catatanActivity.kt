package catatan

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iscollection.R

class catatanActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda) // Ganti sesuai nama XML Anda

        // Referensi tombol
        val btnTerakhirBaca: Button = findViewById(R.id.btn_terakhir_baca)

        // Set onClickListener untuk tombol
        btnTerakhirBaca.setOnClickListener {
            val intent = Intent(this, CatatanAddActivity::class.java)
            startActivity(intent)
        }
    }
}
