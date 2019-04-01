package dev.neymoura.android.featureflag.settings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.neymoura.android.featureflag.R

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.settingsHolder, SettingsFragment())
            .commit()
    }
}
