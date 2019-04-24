# Class 7: Interfaces and Variables (and other relationships between classes)

## Annoucements

First labs will start locking on Friday!

## Code Review

* More Linked Lists
* Restaurants and reviews

## Lecture

Interfaces

Generics

## Lab Intro

Code Challenge: Even More Linked Lists!

Lab: More Restaurants and reviews!

## Warmup Questions
1. What's the difference between an interface and a parent class?
2. What are some different relationships that can exist between different classes?
3. What's a `toString` method?
4. What's the output of this code? (predictions, don't run it)
    ```java
    int a = 5;
    int b = a;
    a = 6;
    System.out.println(b);
    ```
5. What's the output of this code? (predictions, don't run it)
    ```java
    int[] nums = new int[]{1,2,3,4};
    int[] moreNums = nums;
    nums[0] = 7;
    System.out.println(moreNums[0]);
    ```

6. What's the output of this code? (predictions, don't run it)
    ```java
    int[] nums = new int[]{1,2,3,4};
    int[] moreNums = nums;
    nums = new int[]{6,7,8,9};
    System.out.println(moreNums[0]);
    ```
7. Why does that make any sense?

### Lists vs. ArrayLists vs. LinkedLists

Which should you use? Why?

# Overview of Interfaces Demo

## Interfaces and Abstracts

* Critter - Abstract - gives us a name
* Dancer - Interface - getDance()
* NoiseMaker - Interface - makeNoise()

## "Concrete" Classes

* Cat Extends Critter Implements NoiseMaker
* Robot Extends Critter Implements NoiseMaker, Dancer

Cats and Robots can be referred to by any of the interfaces or classes they implement/extend.

Cat cat = new Cat();
Critter cat = new Cat();
NoiseMkaer cat = new Cat();

Robot robot = new Robot();
Critter robot = new Robot();
NoiseMkaer robot = new Robot();
Dancer robot = new Robot();

## The NoiseMaker Service

NoiseMakerOutputService - Class
- new(Logger log)
- output(NoiseMaker)
    - log.log(noisemaker.makeNoise())

Logger - Interface
- log(String msg);

ConsoleLogger implements Logger
- log() // sout

TestLogger implements Logger
- log() // stores in an List
