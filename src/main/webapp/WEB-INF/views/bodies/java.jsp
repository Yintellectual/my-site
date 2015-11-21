<article>
	<header>
		<h1 class="w3-teal">Java 8 Core and Java GUI</h1>
	</header>

	<section class="w3-container">
	<h3 class="w3-orange">AWT and SWING</h3>
	
	<a href="http://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html" target="_blank">Java GUI Programming From NTU(Singapore)</a>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Eclipse or NetBeans graphic debugger</h3>
	
	<p>I've tried GUI programming with eclipse. There are some bugs, but fine.</p>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Java 2D Tutorial</h3>
	
	<a href="http://docs.oracle.com/javase/tutorial/2d/index.html" target="_blank">Tutorial from Oracle</a>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Lambda and EventListenerAdapters</h3>
	
	<p>I read about java lambda, but never had used it. I used to study the programming language "scheme" which is all about lambda functions. Lambda is good for recursing and concurrent programming.</p>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Notes for AWT and SWING</h3>
	
	<pre>
Introduction

	Java provide higher level abstraction for GUI programming. 

	Oracle provides AWT in java 1.0 and Swing in java 1.2, 

		AWT component classes are now obsoleted by Swing's counterparts.

	Eclips provides SWT package which is used in Eclips.

	Google provides GWT package which is used for Android.

	for 3D Graphics, 
	
		JOGL is OpenGL for java

		and Java3D

AWT

	Most of the components in AWT can be subclassed to allow modification. The working subclass may implement EventListener interfaces to react to the events fired by the component. The component who fires events should register its event listeners. 

	All the components should be added to a container. The container itself is also a component. This is the principle of composite design pattern. 

	Components may have Constants to help alignment. The alignment can be done with setAlignment(), or with setLayout().

	Two different components communicate with each other through their common container/super container. The container should be listener of one component and read/write data of the other component. 

	The root container which is usually a Frame need to call setVisible(true) in its constructor.



AWT Event-Handling

	AWT Event-Handling is done by implementing event listeners and registering the listener object to a source object to receive events. 

Observer Design Pattern

	Observer Design Pattern in java is based on java.util.EventObject (super class for Events), java.util.EventListener (super interface for Listeners). 

	Through listener registration, the source object holds a list of its listeners whom will be called to handle the event one by one if needed. 

Nested Classes

Advanced Nested Classes

	There are 4 kinds of nested classes.

	non-static inner class is used to access private members

	anonymous local inner class do the same with non-static inner class

	static nested class is just a class that requires its outer class's name to get access

	local inner class is defined inside a method to access variables in that method


Event Listener's Adapter Classes

	Event listener's adapter classes are designed to allow getting listener with overriding only one method. 

	java 8 lambda should be useful here!

Layout Managers and Panel

Composite Design Pattern

Swing

	Swing components are pure Java and is so called lightweight while AWT components are heavyweight. Swing enables drap-and-put design tool, like WindowBuilder in Eclips.

	One thing is that Swing and AWT components should not be used together, since the heavyweight components are always on the top of the lightweight ones. 

Visual GUI Builder
	<pre>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Swing Tutorial</h3>
	
	<a href="http://docs.oracle.com/javase/tutorial/uiswing/" target="_blank">Tutorial from Oracle</a>
	</section>
</article>