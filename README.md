# java_assignment_3_inheritance

This assignment comprises tasks related to Java object inheritance

Task 1: Refactor the Rectangle class in the shapes package as follows:

Extend the class from an abstract parent class Shapes
Migrate as many methods and fields as possible to Shapes.
Test by writing a main method in Rectangle in which you create a Rectangle object with the following attributes and as displayed in Figure 1:
dimensions 100 long x 50 high
color red.
position (50, 100).

Task 2: Develop a class Pentagon. Use Shapes as a superclass.

Task 3: Write a class TestPentagon to display a series of Pentagon objects.

Task 4: Change the inheritance hierarchy to the one shown below:

                  Shapes
                         
  Ellipse        Triangle      Rectangle
  
  Circle

Task 5: The purpose of this task is to calculate the maximum perimeter of a list of various geometric shapes set out in item (i) below, 
applying the approach developed in the labs using Java interfaces.

(i) Implement the interface in these classes:

Circle
Pentagon
Rectangle
Triangle
Ellipse

(ii) Then, as required, implement the interface method perimeter in the classes.

The method perimeter() calculates and returns the length of the perimeter of an object 
created by instantiation of one of the above classes.

(iii) The partially complete class MaximumPerimeter is provided.

Complete the main method so as to determine the maximum perimeter in the list of objects.

Task 6: 

(iv) Skeleton code is provided in Util to discover the maximum perimeter from an ArrayList of Measurable types containing references to objects of the above classes. 
Complete the code.

Task 7: Refactor the TestShapes class as follows:

Instantiate 4 Rectangle objects. 
Choose arguments so that the Rectangle objects display in a cascade style.


