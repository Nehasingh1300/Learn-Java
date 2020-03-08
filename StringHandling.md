# Strings in Java
Strings are immutable: Whenever a change to a String is made, an entirely new String is created.
<br>
## Creating a String
**String literal**
String s = “GeeksforGeeks”<br>
**Using new keyword**
String s = new String (“GeeksforGeeks”)<br>
## StringBuffer
StringBuffer represents growable and writable character sequences<br>
## StringBuffer Constructors
**StringBuffer( ):** It reserves room for 16 characters without reallocation.<br>
StringBuffer s=new StringBuffer()<br>
***StringBuffer( int size):*** It accepts an integer argument that explicitly sets the size of the buffer.<br>
StringBuffer s=new StringBuffer(20)<br>
**StringBuffer(String str):** It accepts a String argument that sets the initial contents of the StringBuffer object and reserves room for 16 more characters without reallocation.<br>
StringBuffer s=new StringBuffer("GeeksforGeeks")<br>

## Methods
**length( ) and capacity( ):** The length of a StringBuffer can be found by the length( ) method, while the total allocated capacity can be found by the capacity( ) method.<br>

**append( ):** It is used to add text at the end of the existence text. Here are a few of its forms:
StringBuffer append(String str)<br>
StringBuffer append(int num)<br>

**insert( ):** It is used to insert text at the specified index position. These are a few of its forms:
StringBuffer insert(int index, String str)<br>
StringBuffer insert(int index, char ch)<br>

**reverse( ):** It can reverse the characters within a StringBuffer object using reverse( ).This method returns the reversed object on which it was called. <br>

**delete( ) and deleteCharAt( ):** It can delete characters within a StringBuffer by using the methods delete( ) and deleteCharAt( ).The delete( ) method deletes a sequence of characters from the invoking object. Here, start Index specifies the index of the first character to remove, and end Index specifies an index one past the last character to remove. Thus, the substring deleted runs from start Index to endIndex–1. The resulting StringBuffer object is returned. The   deleteCharAt( ) method deletes the character at the index specified by loc. It returns the resulting StringBuffer object.These methods are shown here:<br>
StringBuffer delete(int startIndex, int endIndex)<br>
StringBuffer deleteCharAt(int loc)<br>

**replace( ):** It can replace one set of characters with another set inside a StringBuffer object by calling replace( ). The substring being replaced is specified by the indexes start Index and endIndex. Thus, the substring at start Index through endIndex–1 is replaced. The replacement string is passed in str.The resulting StringBuffer object is returned.Its signature is shown here:
StringBuffer replace(int startIndex, int endIndex, String str)<br>

[Code](https://github.com/Nehasingh1300/Java/blob/master/StringHandling.java)
[Case Console](https://github.com/Nehasingh1300/Java/blob/master/CaseConsole.java)
[First and last occurence](https://github.com/Nehasingh1300/Java/blob/master/FirstAndLastOccurence.java)
[small to capital letters](https://github.com/Nehasingh1300/Java/blob/master/SmallToCapital.java)

