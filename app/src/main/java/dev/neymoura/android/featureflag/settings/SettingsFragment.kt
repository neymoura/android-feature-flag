package dev.neymoura.android.featureflag.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import dev.neymoura.android.featureflag.R

class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings_feature_flags, rootKey)
    }
}
