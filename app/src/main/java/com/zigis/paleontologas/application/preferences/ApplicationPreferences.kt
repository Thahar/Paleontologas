package com.zigis.paleontologas.application.preferences

import android.content.SharedPreferences

class ApplicationPreferences constructor(
    private val preferences: SharedPreferences
) {
    var locale: String?
        get() {
            return preferences.getString(localeId, null)
        }
        set(value) {
            with(preferences.edit()) {
                putString(localeId, value)
                commit()
            }
        }

    var version: String?
        get() {
            return preferences.getString(versionId, null)
        }
        set(value) {
            with(preferences.edit()) {
                putString(versionId, value)
                commit()
            }
        }

    companion object {
        private const val localeId = "applicationLocale"
        private const val versionId = "applicationVersion"
    }
}