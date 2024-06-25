package su.afk.todocompose.ui.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import su.afk.todocompose.data.local.models.ToDoTask
import su.afk.todocompose.data.repositories.LocalToDoRepositories
import javax.inject.Inject

@HiltViewModel
class ShareViewModel @Inject constructor(
    private val repository: LocalToDoRepositories
): ViewModel() {

    private val _allTasks = MutableStateFlow<List<ToDoTask>>(emptyList())
    val allTasks = _allTasks.asStateFlow()

    fun getAllTasks() {
        viewModelScope.launch {
            repository.getAllTasks.collect{
                _allTasks.value = it
            }
        }
    }
}