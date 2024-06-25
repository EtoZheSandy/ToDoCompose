package su.afk.todocompose.data.repositories

import kotlinx.coroutines.flow.Flow
import su.afk.todocompose.data.local.ToDoDao
import su.afk.todocompose.data.local.models.ToDoTask
import javax.inject.Inject

class LocalToDoRepositories @Inject constructor(
    private val toDoDao: ToDoDao
) {

    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTask()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }

    suspend fun addTask(toDoTask: ToDoTask) {
        toDoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask) {
        toDoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask) {
        toDoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTask() {
        toDoDao.deleteAllTask()
    }

    fun searchTask(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }
}