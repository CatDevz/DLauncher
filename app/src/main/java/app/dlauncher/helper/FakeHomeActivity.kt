package app.dlauncher.helper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.dlauncher.R

class FakeHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fake_home)
    }
}