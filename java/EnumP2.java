package com.ust.examples;
  enum Direction {
	EAST,
	WEST,
	NORTH,
	SOUTH	
}
public class EnumP2 {
 Direction dir;
 public EnumP2(Direction dir) {
	 this.dir=dir;
}
	public void getMyDirection() {
	switch (dir) {
	case EAST:
		System.out.println("In East Direction");
	break;
	case WEST:
		System.out.println("In West Direction");
	break;
	case NORTH:
		System.out.println("In North Direction");
	break;
	default:
		System.out.println("In South Direction");		
}	
}
	
public static void main(String[] args) {
	EnumP2 obj1 = new EnumP2(Direction.EAST);
	obj1.getMyDirection();
	EnumP2 obj2 = new EnumP2(Direction.SOUTH);
	obj2.getMyDirection();
}
}
