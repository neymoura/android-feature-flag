package dev.neymoura.android.featureflag.settings

import android.preference.PreferenceFragment
import android.os.Bundle
import dev.neymoura.android.featureflag.R

class SettingsFragment : PreferenceFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.settings_feature_flags)
    }
}
