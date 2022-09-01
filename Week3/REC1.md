# PSET 1: Abstraction and Encapsulation
## Question 1
### a) Which line(s) voilate the `final` modifier of property x in class P
Line 14
-----

### b) Which line(s) voilate the `private` modifier of property x in class P
Both lines 14 and 21
The notion of an abstraction barrier is that there should be a separation between implementer and client
In this case, it means that clients should not have access to properties of the implementor,
instead they should call a method of the implementor
-----
Correct answer:
Only line 21 violates the private modifier of x.
Relating to the abstraction barrier which sits between the client and the implementer,
class P is the implementor while class Q is the client htat makes use of P.
The barrier is not broken when one object of type P accesses the instance variables of
another variable of type P, where P then is the sole implementor.

## Question 2
### a) Do the getX() and getY() methods violate the Tell-Don't-Ask Principle
They do not voilate the principle as they are private methods not callable by any client
-----
Correct answer:
The TDA principle relates to an external client asking an object for data and acting on that data,
instead of having tell the client what to do.
In this case, since both methods have private access, they are not callable by any clients
and so the principle is not violated.
The methods here are defined as helper methods that abstract out the implementation details of
retriving individual coordinate values.

### b) `new Vector2D(1.0, 1.0).add(newVector2D(2.0, 2.0))` is executed. Show the content of the stack and heap at line A
Stack: (main: empty as no assignment is made) -> (add: `v` which points to address B, `newVector` which points to address C)
Heap: (Vector2D@<addressA>), (Vector2D@<addressB>), (Vector2D@<addressC>)


### c) Suppose representation changed as shown
- i. `What changes do you need for the other parts of class Vector2D

You should change getX() and getY() as well as the constructor
- ii. Would statement 2b above be valid

No, the statement would still not be valid as getX() and getY() are private accessors
-----
Correct answer: The statement would still be valid as the implementation details of how coordinates are stored
and operated on in the client is encapsulated from other clients.

## Question 3: Implementation of a Book class
### Page class
```
class Page {
  private final String content;
  private final int pageNum;

  Page(String content, int pageNum) {
    this.content = content;
    this.pageNum = pageNum;
  }

  String getContent() {
    return this.content;
  }

  String getPageNum() {
    return this.pageNum;
  }
}
```

### Book class
```
class Book {
  private final List<Page> pages;
  private final String title;
  private final String description;
  private final int pageCount;
  private Page currentPage;

  Book(List<Page> pages, String title, String description, int currentPage = 1) {
    this.pages = pages;
    this.title = title;
    this.description = description;
    this.pageCount = this.pages.size();
  }

  void showPage() {
    return this.currentPage.getContent();
  }

  void nextPage() {
    if (this.currentPage.getpageNum() == pageCount) return;
    currentPage = pages[this.currentPage.getPageNum() + 1];
  }

  void prevPage() {
    if (this.currentPage.getPageNum() < 2) return;
    currentPage = pages[this.currentPage.getPageNum() - 1];
  }

  void gotoPage(int pageNumber) {
    if (pageNumber > currentPage || pageNumber < 1) return;
    currentPage = pages[pageNumber];
  }
  
}
-----
Correct answer:
- Observing principle of immuatability, all methods that modify book should return a new book(except getters/setters)
- Observing SLAP, gotoPage() can be reused inside prevPage() and nextPage();
- Include Getters and setters
- Include Overriden toString() method
