package catatan

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.iscollection.R

class CatatanAddFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.catatan_add)

        val btnBack = findViewById<ImageButton>(R.id.btnkembali)

        // Menambahkan OnClickListener untuk tombol kembali
        btnBack.setOnClickListener {
            onBackPressed()
        }

    }
}
