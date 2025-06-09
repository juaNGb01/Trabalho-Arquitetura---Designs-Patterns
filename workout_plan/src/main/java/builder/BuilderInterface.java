package builder;

import entities.Exercise;
import entities.ExerciseRoutine;

import java.time.LocalDateTime;

public interface BuilderInterface {

    BuilderInterface workOutName(String exerciseName);

    BuilderInterface addExercise(Exercise exercise);

    BuilderInterface setDate(LocalDateTime date);

    BuilderInterface addDescription(String description);

    ExerciseRoutine build();
    void  reset();
}
