package org.example;

public class Developer {

    private String techStack;
    private int leetCodeScore;

    @Override
    public String toString() {
        return "Developer{" +
                "techStack='" + techStack + '\'' +
                ", leetCodeScore=" + leetCodeScore +
                '}';
    }

    public Developer(String techStack, int leetCodeScore) {
        this.techStack = techStack;
        this.leetCodeScore = leetCodeScore;
    }
}
