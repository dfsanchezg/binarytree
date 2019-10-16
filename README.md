# Binary Tree

Binary tree Implementation for Masivian senior engineering hiring process

## Getting Started

This application is build in spring boot 2 y Java version 13 

### Prerequisites

Download the git hub repository

### Installing

```
maven clean install
```

## Endpoints

The application has a swagger configuration : http://localhost:8080/swagger-ui.html

* /binarytree : creates and finds the ancestor given a list of nodes and coupe of numbers 

## Example request
```
{
    "values":[67,39,28,29,44,76,74,85,87,83],
    "firstValue":44,
    "secondValue":85
}
```
* values : list  of values
* first value : first number to compare
* second value  : second number to compare

## Example response
```
{
    "ancestor": 67,
    "binaryTree": "28,29,39,44,67,74,76,83,85,87"
}
```
* ancestor : the ancestor between the first value and the second value
* binary tree : the binary tree in inorden traversal 

## Authors

* **Diego Sánchez**

