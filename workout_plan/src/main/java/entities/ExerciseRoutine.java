package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExerciseRoutine {
    private String name;
    private List<Exercise> exerciseList = new ArrayList<>();
    private LocalDateTime date;
    private String description;

    public ExerciseRoutine(){}

    public ExerciseRoutine(String name, List<Exercise> exerciseList, LocalDateTime date, String description) {
        this.name = name;
        this.exerciseList = exerciseList;
        this.date = date;
        this.description = description;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //exercise list
    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void addExerciseList(Exercise exercise) {
        exerciseList.add(exercise);
    }

    //date
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    //description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Plan Name: " + getName() +
                "\nDate: " + getDate() +
                "\nDescription: " + getDescription() +
                "\nList of exercise: " + getExerciseList();
    }
}
