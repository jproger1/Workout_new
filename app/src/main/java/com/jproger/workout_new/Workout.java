package com.jproger.workout_new;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
        new Workout("The Limb Loosener","5 Handstand push-ups \n 10 1-legged squats \n 15 Pull-ups"),
        new Workout("Core Agony","100 Pull-ups \n 100 Push-ups \n 100 Sit-ups \n 100 Squats"),
        new Workout("The Wimp Special","5 Pull-ups \n 10 Push-ups\n 15 Squats"),
        new Workout("Strength and Length","500 meter run \n 21 x 1.5 pood kettleball swing \n 21 x pull-ups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}