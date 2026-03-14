package dam_a51864.hellodeviceinfo

import android.os.Bundle
import android.os.Build
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val infoTextView = findViewById<TextView>(R.id.systemInfoTextMultiline)

        //Write system information
        val infoText = getString(
            R.string.system_info,
            Build.MANUFACTURER,
            Build.MODEL,
            Build.BRAND,
            Build.TYPE,
            Build.USER,
            Build.VERSION.SDK_INT_FULL,
            Build.VERSION.INCREMENTAL,
            Build.VERSION.SDK_INT,
            Build.VERSION.RELEASE,
            Build.DISPLAY
        )

        infoTextView.text = infoText

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}