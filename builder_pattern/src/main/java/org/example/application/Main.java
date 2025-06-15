package org.example.application;

import builder.BuilderImplementation;
import entities.Exercise;
import entities.ExerciseRoutine;
import entities.enums.MuscleGroup;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        //criação builder
        BuilderImplementation builder = new BuilderImplementation();

        //criação exercicios
        Exercise ex = new Exercise();
        ex.setExerciseName("Supino");
        ex.setWorkSet(5);
        ex.setWeigth(25.0);
        ex.setMuscleGroup(MuscleGroup.CHEST);

        Exercise ex2 = new Exercise();
        ex2.setExerciseName("Triceps Frances");
        ex2.setWorkSet(3);
        ex2.setWeigth(20.0);
        ex2.setMuscleGroup(MuscleGroup.TRICEPS);

        //criação plano de treino 1
        ExerciseRoutine exerciseRoutine = builder.workOutName("Triceps and chest")
                .addExercise(ex)
                .addExercise(ex2)
                .addDescription("New PR")
                .setDate(LocalDateTime.now())
                .build();

        System.out.println(exerciseRoutine.toString());


        builder.reset();


        //criação exercicios 2
        Exercise ex3 = new Exercise();
        ex3.setExerciseName("Pulley frente");
        ex3.setWorkSet(5);
        ex3.setWeigth(25.0);
        ex3.setMuscleGroup(MuscleGroup.BACK);

        Exercise ex4 = new Exercise();
        ex4.setExerciseName("remada curvada");
        ex4.setWorkSet(3);
        ex4.setWeigth(20.0);
        ex4.setMuscleGroup(MuscleGroup.BACK);

        //criação plano de treino 2
        exerciseRoutine = builder.workOutName("Back Routine")
                .addExercise(ex3)
                .addExercise(ex4)
                .build();

        System.out.println(exerciseRoutine.toString());
    }
}