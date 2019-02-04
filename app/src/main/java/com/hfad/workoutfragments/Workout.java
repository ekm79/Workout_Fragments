package com.hfad.workoutfragments;

public class Workout {
    private String title;
    private String description;

    public Workout(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-up\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettlebell swing\n21 x pull-ups")
    };

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return this.title;
    }
}
