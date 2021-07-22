//Constructor function for Person objects
function Person  (first,last,age,eye) {
	this.firstName=first;
	this.lastName=last;
	this.age=age;
	this.eyeClor=eye;
}
//Create a Person object
const myFather = new Person ("john","Doe",50,"blue");
//Display age
document.getElementByld("demo").innerHTML="My father is" + myFather.age+".";0