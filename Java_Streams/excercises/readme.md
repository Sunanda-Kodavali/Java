
# Stream Exercises

## General
1. Write a Java program to convert a list of strings to uppercase using streams.

2. Write a Java program to calculate the sum of all even numbers in a list using streams.
> Hint: `reduce` method

3. Write a Java program to remove all duplicate elements from a list using streams.
> Hint: `distinct` method

4. Write a Java program to count the number of strings in a list that start with a specific letter using streams. For example all string that start with A
> Hint: `count` method

5. Write a Java program to sort a list of strings in descending alphabetical order using streams.

6. Write a Java program to find the maximum value in a list of integers using streams.

7. Write a Java program to find the second smallest element in a list of integers using streams.

8. Write a Java program to find the second largest element in a list of integers using streams.

9. Write a Java program to calculate the average of a list of integers using streams.
> Hint: `DoubleStream`

## Let’s create a book Index to organize our library:
The Book class has the following properties: `ISBN` , `Title`, `Author`, `Category`
* Create the Book class.
* Create a List with a few Books.
* Generate a List of letters that contains the first letter of the title of each Book
  * The letters should be in Uppercase
  * They should be in alphabetical order
  * There should be no duplication

```
[new Book(“a1”, “Lord Of the Rings “, “”, “”), new Book(“a2”, “Lord without Wings“, “”, “”), new Book(“a2”, “a comprehensive introduction to Functional Programming“, “”, “”)]

[“A”, “L”]
```
