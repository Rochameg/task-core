package sn.isi.l3gl.core.task_core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.l3gl.core.task_core.entity.Task;
import sn.isi.l3gl.core.task_core.enums.TaskStatus;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
