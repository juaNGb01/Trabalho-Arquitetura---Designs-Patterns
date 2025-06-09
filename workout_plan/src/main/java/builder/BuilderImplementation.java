package builder;

import entities.Exercise;
import entities.ExerciseRoutine;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BuilderImplementation implements BuilderInterface{

    private String workOutName;
    private List<Exercise> exerciseList = new ArrayList<>();
    private LocalDateTime date;
    private String description;

    @Override
    public BuilderInterface workOutName(String workOutName) {
        this.workOutName = workOutName;
        return this;

    }

    @Override
    public BuilderInterface setDate(LocalDateTime date) {
        this.date = date;
        return this;

    }

    @Override
    public BuilderInterface addExercise(Exercise exercise){
        exerciseList.add(exercise);
        return this;
    }

    @Override
    public BuilderInterface addDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public ExerciseRoutine build(){
        return new ExerciseRoutine(workOutName, exerciseList, date, description);
    }

    @Override
    public void reset(){
        workOutName = null;
        exerciseList = new ArrayList<>();
        date = null;
        description = null;

    }


}
