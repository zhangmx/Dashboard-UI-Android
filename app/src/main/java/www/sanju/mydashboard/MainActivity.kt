package www.sanju.mydashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_1.setOnClickListener {
            val data = "Hello"
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("data", data)
            startActivity(intent)
        }
    }
}
