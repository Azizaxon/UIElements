package uz.aziza.uielementlari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_image_view.setOnClickListener {
            Toast.makeText(this, "bosildi", Toast.LENGTH_SHORT).show()
        }
    }
}