package su.afk.todocompose.data.local.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import su.afk.todocompose.data.local.models.ToDoTask.Companion.TABLE_TODO

@Entity(tableName = TABLE_TODO)
data class ToDoTask (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
) {
    companion object {
        const val TABLE_TODO = "todo_table"
    }
}