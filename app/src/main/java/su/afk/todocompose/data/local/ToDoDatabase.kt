package su.afk.todocompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import su.afk.todocompose.data.local.models.ToDoTask

@Database(
    entities = [ToDoTask::class],
    version = 1,
    exportSchema = false
)
abstract class ToDoDatabase: RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}