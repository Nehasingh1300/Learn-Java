# Interface
An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.

## Similarities Between Interface and Class
Interface and Class are declared in similar way<br>
Variable reference of interface can be created as that of class<br>
It can contain inner class and inner interfaces<br>

## Dissimilarities between interface and Class
Interface can not implement itself, can only be implemented by class<br>
Methods in Interface are public<br>
Interface does not contain instance variable
Variables in interface are **public, static, final**, so they are constant<br>
Interface doesnot have constructor<br>
Interface can extend any number of interfaces<br>

## Rules for class to implement inteface
A non abstract class implementing interface must have proper defination all abstract class.<br>
@override annotation should be used in the defination in an interface method<br>
Mthod declared static and default with full defination<br>
The class implementing interface must contain exact signature<br>
Abstract class need not implement all abstract methods the interface implements

## Declaration Of Interface
```
AccessSpecifier interface InterfaceName
```

## Interface Modifier
It is generally **Public**

## Members Of Interface
Member Declared in the body of interface<br>
Member inherited from any super interface that it extends<br>
Methods declared in interface are implicitly public abstract member methods<br>
Field varibles in interface are public, static and final and so should be initialized<br>
Static and Default methods with full defination can slao be member of interface<br>

## Points To Ponder
class extending class and interface **Multiple Interfaces**<br>
```
class ClassName extends ClassTOBeExtended implements InterfaceName
```
class extending interface only<br>
```
class ClassName implementing InterfaceName
```
**Object Reference of Interface**<br>
```
interfaceName ReferenceName;
```
Constants in Interface <br>
Instance Variables are implicitly public and final <br>
[Constant usage of Interface : CHECK IT OUT](https://github.com/Nehasingh1300/Java/blob/master/ConstantINTERFACE.java)<br>

## Stub Methods
We have to  define all abstract methods of interface in its subclass, if we do not need defination of all the methods then we can make those methods as **STUB METHODS**.<br>
[Stub Methods](https://github.com/Nehasingh1300/Java/blob/master/StubMethods.java)<br>
```
	public double getlength(){    //STUB METHOD 
		return 0;
	}
	public void getWidth() {      //STUB METHOD
		
	}
```

## Nested Interfaces
An interface can be implemented as a member of another class or interface<br>
``
className.interfaceName // to access the nested interface
``
[Nested Interfaces](https://github.com/Nehasingh1300/Java/blob/master/NestedInterface.java)<br>

## Inheritance Of Interfaces
[Code][https://github.com/Nehasingh1300/Java/blob/master/Inheritance%20Of%20Interfaces.java)<br>

## Default Keyword
Default keyword at the beginning of the method signature, and they provide an implementation.<br>
Let's see a simple example:<br>
```
public interface MyInterface {
     
    // regular interface methods
     
    default void defaultMethod() {
        // default method implementation        DEFINATION OF METHID INSIDE INTERFACE
    }
}
```
[Defalut Method](https://github.com/Nehasingh1300/Java/blob/master/DefaultMethod.java)<br>

# CODE
[Using interface and class all together](https://github.com/Nehasingh1300/Java/blob/master/InterfacingCode.java)<br>
[Using Interfaces](https://github.com/Nehasingh1300/Java/blob/master/MYClass.java)<br>
[Constant usage of Interface](https://github.com/Nehasingh1300/Java/blob/master/ConstantINTERFACE.java)<br>
[Division Modulus Interface](https://github.com/Nehasingh1300/Java/blob/master/DivModInterface.java)
<br>[Stub Methods](https://github.com/Nehasingh1300/Java/blob/master/StubMethods.java)<br>
[Nested Interfaces](https://github.com/Nehasingh1300/Java/blob/master/NestedInterface.java)<br>
[Defalut Method](https://github.com/Nehasingh1300/Java/blob/master/DefaultMethod.java)<br>
