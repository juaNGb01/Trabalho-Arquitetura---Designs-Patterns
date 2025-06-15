package entities;

import entities.enums.MuscleGroup;

public class Exercise {

    private String exerciseName;
    private Integer workSet;
    private Double weigth;
    private MuscleGroup muscleGroup;

    public Exercise(){}

    public Exercise(String exerciseName, Integer workSet, Double weigth, MuscleGroup muscleGroup) {
        this.exerciseName = exerciseName;
        this.workSet = workSet;
        this.weigth = weigth;
        this.muscleGroup = muscleGroup;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Integer getWorkSet() {
        return workSet;
    }

    public void setWorkSet(Integer workSet) {
        this.workSet = workSet;
    }

    public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(MuscleGroup muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    @Override
    public String toString() {
        return String.format(
                "\n➤ %s" +
                        "   \nSéries       : %d\n" +
                        "Peso         : %.1f kg\n" +
                        "Grupo Muscular: %s\n",
                exerciseName,
                workSet,
                weigth,
                muscleGroup
        );
    }

}
