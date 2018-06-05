package koc.com.takemenote

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get user input when clicking on floating action button
        fab.setOnClickListener {
            Log.d(this::class.java.simpleName, "Floating action button clicked!")
        }
    }
}
