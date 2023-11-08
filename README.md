# JebsLang
JebsLang is a Java-based programing language that is made by calling functions/methods from the JebsLang template! You can use an already made Logger for debugging and easily create windows and elements using WindowManager!

### IMPORTANT!
Before you begin coding in JebsLang, you need to do these things:
- If you want to, delete the com.example.exampleprogram package and the class within it
- If you did, make a new package and make a java class inside.
- Inside that java class (or the example one if you didn't delete it) make sure there are these four lines above anything:
    <code>package (_the name of the package you created_)</code> (if you didn't make a new one this line would be <code>com.example.exampleprogram</code>)<br>
    <code>import jebslang.main.\*;</code><br>
    <code>import jebslang.util.\*;</code><br>
    <code>import jebslang.window.\*</code>
- After those lines, type <code>public class</code> _what you called your class_ <code>extends Main {</code>
- Now inside the curly brackets of the class, we need to type this: <code>public static void main(String[] args) {</code>
- Now finally inside those curly brackets, we can start writing our JebsLang!

**NOTE:** Make sure your class extends <code>Main</code> or else you will have to do stuff like <code>Main.print("message");</code> or <code>Main.input();</code> instead, if we extend Main, we can just write <code>print("message");</code> or <code>input();</code>.<br>

### GETTING STARTED IN JEBSLANG
#### Console output
To start coding in JebsLang, you need to learn the basics. The most basic is <code>print</code>. The structure is <code>print("MESSAGE");</code>. Remember in JebsLang, you can always use any Java knowledge since JebsLang is Java-based. You can also use the <code>println</code> (short for print-line) which does the same thing but starts a new line after it. If you want just blank space you could use either <code>println();</code>, <code>println("");</code>, or <code>br();</code>.

### MORE BASICS
#### Console input
Some more basics include getting input from the user in the JebsLang console. To get input, go to whatever line you want to have input on then type <code>input();</code>. After this you can get the user's input by getting the variable <code>input</code> from the Main JebsLang class. Here is an example:
<code>
println("what is your name?");
input();
println("your name is " + input);
</code>

**NOTE:** the _input_ variable refered to in line 3 is from the Main class of JebsLang (jebslang.main.Main) so to access it, you must type <code>import jebslang.main.*;</code> under the package decleration (in the example program this is <code>package com.example.exampleprogram;</code>.

### COLOR
#### How to print colored text
if you want to add color to you program, you can use <code>jebslang.util.Color</code> (make sure you read the important section at the top and imported <code>jebslang.util.\*</code>). To do so, you must first start to print some text like explained in the _GETTING STARTED IN JEBSLANG_ section: <code>println("text");</code>. Now, let's print some colors! You can write something like this: <code>println(Color.RED + "JebsLang is awesome!" + Color.RESET);</code> and it would print <span style="color:red"><em>JebsLang is awesome!</em></span> in red (sadly Github apparently doesn't support HTML color in their MD files otherwise that would be red)<br>
The current colors available for JebsLang are:

- green
- yellow
- red
- black
- blue
- purple
- cyan
- white

**NOTE:** after every single time you print a message in a color, you have to write <code> + COLOR.RESET</code> otherwise it will stay that color until you change it again. Example:<br>
<code>println(Color.BLUE + "This text is blue");
println("This text is also blue since I didn't add Color.RESET after!" + Color.RESET)
println("This is normal again since I added Color.RESET!");</code><br><br>
You could also add _Color.RESET_ in front of something that would normally be colored an it would also be fine. You can even add another color after the _Color.RESET_ like so: <code>println(Color.RESET + Color.RED + "this is red and it reset the other one though, it would be fine just to set it to be red because that just sets it to red!" + Color.RESET);</code>

### LOGGING
#### What is logging?
Logging is commonly used in programs to debug. Debugging is trying to find anything wrong with your program and fixing it. Logging basically means printing something that is going on in your program. Logging in JebsLang is very simple. There are 5 logging levels. They are INFO, WARN, ERROR, SEVERE, and FATAL. The logging format is: <code>_LEVEL_: [_IDENTIFIER_] (_LOCAL TIME_): _MESSAGE_</code>.<br>
#### More about logging levels
- Info: prints in green. Used for keeping track of things going on in your program.
- Warn: prints in yellow. Used for things that don't have a huge impact on your program but might still cause some part to not work properly
- Error: prints in red. Used when a big part of your program fails to load or something similar
- Severe: prints in red. Used when something completely fails to load or just doesn't work
- Fatal: prints in red. Used for an error that might break your whole program

#### How to log
To use the logger and log some messages, you can use this example:
<code>Logger.log.info("JebsLang", "JebsLang is awesome");</code>
It would print:
<code>INFO: [JebsLang] (16:46:17): JebsLang is awesome</code>

**NOTE:** it would most-likely not print _16:46:17_ for you, because you might be doing this at a different time.
**NOTE:** as you may have already noticed, the time in the logger is formatted HH:MM:SS

### DESKTOPMANAGER
#### Opening a file
The only usage for desktopmanager right now (version 1.0.0) is to open files. To open a file using desktopmanager, the first thing you need to do is import a new class. Under the package declaration (example: <code>package com.example.exampleprogram</code>) type <code>import java.io.File;</code>. After you have done that, go back to inside the brackets of the main method (<code>public static void main(String[] args) {</code>) and write this: <code>DesktopManager.openFile(new File("_FILE PATH HERE!_"));</code>. Of course, you would replace _FILE PATH HERE!_ with the actual file path.

**TIP:** if you want to open a file, it's a good idea to put it somewere in your files so you can access it using code. If you don't put the files there, the JebsLang Logger will log an error message saying "File path does not exist". The reason for this is it might exist on your computer but think about your user's computer. They don't have the file so you have to put it somewhere in your files so they can also access it.

### WINDOWMANAGER
#### Opening a window
Most of this has only been about the console. To make real programs, you need to have an actual window pop-up and have some sort of UI (**U**ser **I**nterface) to make it work. Opening a window is very simple in JebsLang. To do this, you just have to type <code>WindowManager.newWindow(_IDENTIFIER_, _WIDTH_, _HEIGHT_);</code>. Height and width are in pixels (for an avarage program, I would recommend width 1000 and height 500). The identifier is the thing showing at the top of the window. Open almost any program on your computer and in the top-left corner it says the name of the app. That's the identifier.

#### Creating text
Now that you have an awesome window open, it's time to add something to make it more than just a blank screen. So, let's make some text! The structure for text is <code>WindowManager.createText(_TEXT_, _FONT_, _SIZE_, _ISBOLD_);</code>. For example <code>WindowManager.createText("JebsLang", "Verdana", 18, false);</code>. This displays some text on the screen saying "JebsLang" in the font "Verdana" with the size 18 (in pixels) and it is not bold.

#### Creating buttons
This is the last thing you can do in JebsLang version 1.0.0. Make buttons. To do this, type <code>WindowManager.createButton("_TEXT_");</code>. I haven't added action listeners (pieces of code that run when you click the button) yet so I guess I'll have to make that for a different version of JebsLang. An example for a button is <code>WindowManager.createButton("JebsLang!");</code>. This adds a button that just says "JebsLang!" on it.

### NON-COMMENT VERSION
If you've used JebsLang a lot, you're probably really annoyed that every single time you download a new JebsLang template, you have to delete a trillion comments explaining things going on. If you already know how things work and you don't need comments, you can get a comment-free version on my seperate JebsLang Github at https://github.com/JebsDeveloper/JebsLang-Comment-Free.
