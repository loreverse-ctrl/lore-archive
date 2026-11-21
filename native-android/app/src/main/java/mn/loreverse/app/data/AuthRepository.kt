package mn.loreverse.app.data

import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.Email

/**
 * Email/password authentication for the native app.
 * Supabase email-confirmation settings determine whether sign-up immediately creates a session.
 */
class AuthRepository {
    suspend fun signIn(email: String, password: String): Result<Unit> = runCatching {
        require(email.isNotBlank()) { "Имэйлээ оруулна уу." }
        require(password.isNotBlank()) { "Нууц үгээ оруулна уу." }
        SupabaseClient.instance.auth.signInWith(Email) {
            this.email = email.trim()
            this.password = password
        }
    }

    suspend fun signUp(email: String, password: String): Result<Unit> = runCatching {
        require(email.isNotBlank()) { "Имэйлээ оруулна уу." }
        require(password.length >= 8) { "Нууц үг хамгийн багадаа 8 тэмдэгт байна." }
        SupabaseClient.instance.auth.signUpWith(Email) {
            this.email = email.trim()
            this.password = password
        }
    }

    suspend fun signOut(): Result<Unit> = runCatching {
        SupabaseClient.instance.auth.signOut()
    }

    fun hasActiveSession(): Boolean =
        SupabaseClient.instance.auth.currentSessionOrNull() != null
}
