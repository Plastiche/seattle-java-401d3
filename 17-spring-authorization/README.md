# Class 17: Authorizing Users to View Secured Content

## Announcements

Resubmits are due before project week starts! 

## Project week

[Project Week Daily Schedule](https://github.com/codefellows/seattle-java-401d3/blob/master/MidtermSchedule.md)

* Wireframes
* User Stories
* Estimate stories
* Team agreement
* Iteration planning

## Code review

Code Fellowship!

## Lecture

Authorization
- Getting the logged in user
- Auto login after signup
- Adding roles to a user account

Password Security/Encryption/Hashing

## Lab

More CodeFellowship!

## Learning Objectives

* Students will be able to allows users to log in to their accounts, authenticated with Spring Auth.
* Students will be able to use Spring Auth to authorize or restrict users from seeing other users's private data.
* Students will be able to draw a distinction between a user being authenticated (logged in) and being authorized (allowed to see/access) some content.

* Define the four components of what type of resources need to be protected with Auth:
  * Routes - unauthorized users shouldn't be able to access some pages at all.
  * UI - unauthorized users shouldn't see UI like an edit button they don't have permissions to touch unless they were an administrator or owner.
  * Actions - unauthorized users shouldn't be able to perform actions on API endpoints.
  * Server Logic - our application should be able to programmatically determine if a user has authorization to perform certain actions, and execute accordingly.
