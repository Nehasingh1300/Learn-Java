#Annotations
Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to indicate some additional information which can be used by java compiler and JVM.<br>
<br>
##@Override
@Override annotation assures that the subclass method is overriding the parent class method. If it is not so, compile time error occurs.
Sometimes, we does the silly mistake such as spelling mistakes etc. So, it is better to mark @Override annotation that provides assurity that method is overridden.<br>[Code]()

##@SuppressWarnings
@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.<br>
**@SuppressWarnings("unchecked")** tells the compiler that the programmer believes the code to be safe and won't cause unexpected exceptions.<br>[Code](https://github.com/Nehasingh1300/Java/blob/master/SuppressWarningsUnchecked.java)<br><br>
**SuppressWarnings("serial")** annotation tells Java not to display a warning. Without a SuppressWarnings annotation, Java warns you about a missing serialVersionUID field.<br>[Code](https://github.com/Nehasingh1300/Java/blob/master/SuppressedWarningsSerial.java)<br><br>

##@Deprecated
@Deprecated annoation marks that this method is deprecated so compiler prints warning. It informs user that it may be removed in the future versions. So, it is better not to use such methods.<br>[Code]()
