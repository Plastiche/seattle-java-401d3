# Class 12: Spring and RESTful Routing

## Announcements

TA Jessica is out Thursday!

Career Coaching Workshop Friday!  Location?  Here!  Turing!
- No lab due that day, but still a Code Challenge.

Code Challenges will be individual from now on
- Time box!

How's project week prep?
- Prep assignments moved to Sunday at midnight
- But I want to hear ideas by Friday!

Remember that you must finish resubmits before project week starts!  All resubmits are due Sunday before project week, at midnight.

## Code Review

* Spring apps
* Stacks using two queues

## Warmup Question

Fill in this table of RESTful routes for a `BlogPost` resource. The first row is done for you.

|Name of function | English description | HTTP method | Path | C/R/U/D?|
|-----------------|---------------------|-------------|------|---------|
|index            | get all blog posts  | GET         | `/blogposts` | R|
|getBlogPost      | get one blog post   |  GET | /blogpost/{id} | R |
|createBlogPost                 | add a new blog post | POST | /blogpost | C |
|updateBlogPost                 | update a blog post  | PUT | /blogpost/{id} | U |
|deleteBlogPost                 | delete a blog post  | DELETE | /blogpost/{id} | D |

## Lecture

SO MUCH ***MAGIC*** TODAY

More Spring
- POSTing data
- Thymeleaf forms
- Dependency Injection - @Autowired
- @RestController and JSON

Adding a database
- Configuration - Gradle, application.properties
- Modeling, annotations, querying
- Heroku considerations

"Integration testing" Part 1

## Lab

Lab: Spring RESTful Routing

Code Challenge: First-in, First out Animal Shelter.