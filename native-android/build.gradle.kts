plugins {
    id("com.android.application") version "8.10.1" apply false
    // Supabase BOM 3.2.6 resolves kotlinx-serialization 1.9.x,
    // whose Kotlin metadata requires Kotlin 2.2.0 or newer.
    id("org.jetbrains.kotlin.android") version "2.2.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.2.0" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.0" apply false
}
