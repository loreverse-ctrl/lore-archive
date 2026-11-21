package mn.loreverse.app.data

import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.query.Columns
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PublishedFranchise(
    val id: String,
    val name: String,
    val category: String,
    val description: String = "",
    @SerialName("cover_image_url") val coverImageUrl: String? = null
)

class ArchiveRepository {
    suspend fun getPublishedFranchises(category: String? = null): Result<List<PublishedFranchise>> = runCatching {
        SupabaseClient.instance
            .from("archive_franchises")
            .select(Columns.list("id", "name", "category", "description", "cover_image_url")) {
                filter {
                    eq("status", "published")
                    if (!category.isNullOrBlank()) eq("category", category)
                }
            }
            .decodeList<PublishedFranchise>()
    }
}
