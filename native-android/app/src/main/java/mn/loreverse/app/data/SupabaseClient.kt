package mn.loreverse.app.data

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.postgrest.Postgrest

/**
 * Uses the same public Supabase project as the LOREVERSE website.
 * This publishable/anon key is client-side by design; RLS must protect every table.
 * Never place a service_role key in an Android app.
 */
object SupabaseClient {
    const val PROJECT_URL = "https://nfacspfctvunwbxtvvyi.supabase.co"
    private const val PUBLISHABLE_KEY = "sb_publishable_hZOakxcNBY47UDgsJ0E6Aw_wJgAdLw1"

    val instance = createSupabaseClient(
        supabaseUrl = PROJECT_URL,
        supabaseKey = PUBLISHABLE_KEY
    ) {
        install(Auth)
        install(Postgrest)
    }
}
