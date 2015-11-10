package com.company;

public abstract class Position{
    private double degree;
    private Direction direction;

    public Position(double degree, Direction direction) {
        this.degree = degree;
        this.direction = direction;
    }

    public double getDegree(){
        return degree;
    };

    public Direction getDirection(){
        return direction;
    }

}


