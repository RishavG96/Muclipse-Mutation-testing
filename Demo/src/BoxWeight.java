public class BoxWeight extends Box {
int weight; // weight of box
int a;
public String display()
{
	return "testing box1";
}
// construct clone of an object
BoxWeight(BoxWeight ob) { // pass object to constructor
super(ob);
//a=4;
weight = ob.weight;
}
// constructor when all parameters are specified
BoxWeight(int w, int h, int d, int m) {
super(w, h, d); // call superclass constructor
//a=4;
weight = m;
}
// default constructor
BoxWeight() {
super();
//a=4;
weight = -1;
}
// constructor used when cube is created
BoxWeight(int len, int m) {
super(len);
//a=4;
weight = m;
}

int volume() {
	if(a==0)
		a=4;
	val_b();
	return width * height *depth *weight* super.b*a;
}
void val_b()
{
	super.val_b();
	b=10;
}
}

class Box {
public int a;
public int b;
int width;
int height;
int depth;
public String display()
{
	return "testing box";
}
// construct clone of an object
Box(Box ob) { // pass object to constructor
	a=1;
	width = ob.width;
height = ob.height;
depth = ob.depth;
val_b();
}
// constructor used when all dimensions specified
Box(int width, int height, int depth) {
	a=1;
this.width = width;
this.height = height;
this.depth = depth;
val_b();
}
// constructor used when no dimensions specified
Box() {
	a=1;
width = -1; // use -1 to indicate
height = -1; // an uninitialized
depth = -1; // box
val_b();
}
// constructor used when cube is created
Box(int len) {
	a=1;
width = height = depth = len;
val_b();
}

// compute and return volume
int volume() {
return width * height * depth*a;
}
void val_b()
{
	b=5;
}
}
// BoxWeight now fully implements all constructors.
