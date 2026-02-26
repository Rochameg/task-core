package sn.isi.l3gl.core.task_core.service;

import sn.isi.l3gl.core.task_core.enums.TaskStatus;
import sn.isi.l3gl.core.task_core.repository.TaskRepository;
import sn.isi.l3gl.core.task_core.entity.Task;


import java.util.List;

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

    // Version 0.1.0-SNAPSHOT
    public List<Task> listTasks() {
        return taskRepository.findAll();
    }

    // Version 0.2.0-SNAPSHOT
    public Task updateStatus(Long id, TaskStatus newStatus) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found: " + id));
        task.setStatus(newStatus);
        return taskRepository.save(task);
    }

}
