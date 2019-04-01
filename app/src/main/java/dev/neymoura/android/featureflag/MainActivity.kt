package dev.neymoura.android.featureflag

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager
import dev.neymoura.android.featureflag.settings.SettingsActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindSettings()
    }

    private fun bindSettings() {
        settingsButton.setOnClickListener {
            startActivity<SettingsActivity>()
        }
    }

    override fun onResume() {
        super.onResume()
        bindGreeting()
    }

    private fun bindGreeting() {

        val greetInPtBr = PreferenceManager.getDefaultSharedPreferences(this).getBoolean("greet_in_pt_br", false)

        val greetingResource = if (greetInPtBr) {
            R.string.greeting_pt_br
        } else {
            R.string.greeting_en_us
        }

        greetingMessage.text = getString(greetingResource)

    }
}
