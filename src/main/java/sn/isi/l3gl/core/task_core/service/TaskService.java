package sn.isi.l3gl.core.task_core.service;

import sn.isi.l3gl.core.task_core.enums.TaskStatus;
import sn.isi.l3gl.core.task_core.repository.TaskRepository;
import sn.isi.l3gl.core.task_core.entity.Task;

public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Version 0.0.1-SNAPSHOT
    public Task createTask(Task task) {
        task.setStatus(TaskStatus.TODO);
        return taskRepository.save(task);
    }
}
