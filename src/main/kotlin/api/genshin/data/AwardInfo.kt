package org.laolittle.plugin.genshin.api.genshin.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AwardInfo(
    @SerialName("month") val month: Int,
    @SerialName("awards") val awards: List<AwardItem>
){
    @Serializable
    data class AwardItem(
        @SerialName("icon") val icon: String,
        @SerialName("name") val name: String,
        @SerialName("cnt") val count: Int
    )
}