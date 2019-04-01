package dev.neymoura.android.featureflag.settings

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import dev.neymoura.android.featureflag.R

class SettingsActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        fragmentManager
            .beginTransaction()
            .replace(R.id.settingsHolder, SettingsFragment())
            .commit()
    }
}
