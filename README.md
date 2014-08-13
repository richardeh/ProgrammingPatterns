ProgrammingPatterns
===================

\Command\
  Files needed for the "Command" pattern. The Command interface provides an abstracted 
  view of commands, allowing them to be executed and undone. The MoveUnitCommand is an
  example of a command that inherits and overrides the functions of the interface.
  The Command pattern creates an object to encapsulate method calls and replace callbacks.

\Flyweight\
  The Flyweight pattern abstracts reusable common data from an object that is used in 
  multiple instances but with some modifications to each instance. The example here is a 
  tree- each tree will use the same image, but will be in different positions, have different
  amounts of foliage or be different sizes, have different colors, and so on. Instead of 
  taking up memory and sending the same image to the processor and GPU, send the image
  once and send the stack of modifications, which require much less processing.
