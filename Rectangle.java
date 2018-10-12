
public class Rectangle {
private int width;
private int breadth;
public Rectangle(){
	width=breadth=1;
}
public Rectangle(int width,int breadth){
	this.width= width;
	this.breadth=breadth;
}
public Rectangle(int size){
	this.width=size;
	this.breadth=size;
}
public  void CalculateArea()
{
	int area=width*breadth;
	ShowArea(area);
	
}
public void ShowArea(int area){
	System.out.println("The area of the rectangle is "+area);
}
public void CalculatePerimeter(){
	int perimeter=2*(width+breadth);
	ShowPerimeter( perimeter);
}
public void ShowPerimeter(int perimeter){
	System.out.println("The perimeter of the rectangle is"+perimeter);
}
}
