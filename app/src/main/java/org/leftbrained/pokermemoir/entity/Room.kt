package org.leftbrained.pokermemoir.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "rooms")
data class Room(
    @PrimaryKey val id: UUID,
    val name: String,
)
