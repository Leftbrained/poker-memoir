package org.leftbrained.pokermemoir.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "sessions")
data class Session(
    @PrimaryKey val id: UUID,
    @ColumnInfo(name = "room_id") val roomId: UUID,
    val game: Enum<Game>
)
