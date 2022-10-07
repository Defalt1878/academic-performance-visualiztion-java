package com.defalt.apv.report.scores;

import com.defalt.apv.report.course.Task;

public class TaskScores {
    private final Task task;
    private int score;

    public TaskScores(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int value) {
        if (value < 0)
            throw new IllegalArgumentException("Value cannot be less than zero!");
        if (value > task.getMaxScores())
            throw new IllegalArgumentException("Value cannot be greater than max!");

        this.score = value;
    }

    @Override
    public String toString() {
        return String.format("%s (Type: %s, Score: %s)", getTask().getName(), getTask().getType().name(), getScore());
    }
}
