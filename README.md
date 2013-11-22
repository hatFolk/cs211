All Text, PDFs, and Code Samples were written by Dr. Kinga Dobolyi or her TAs.
These files are made to make studying easier.

Read the CheatSheet and study it via the Flash Cards made by Usmar Tahir
http://quizlet.com/30991170/cs-211-rules-flash-cards/

Either clone the repo or download it as a zip.

Class Website: http://www.cs.gmu.edu/~kdobolyi/cs211/
The Final is on Monday, 12/16 at 1:30-4:15.

Other Topics of Study:
 
Imagine we have a linked list and an array each storing 100 Strings. The
array is at maximum capacity. Assume efficient implementations (and document
them)

1. Which one would use more memory, when not being accessed/modified?

2. Which one would use more memory during the operation of adding a new
element?

3. Which one would need more instructions to add a new element (both are
unsorted)?

Answers:
1. Linked List; need more memory for links

2. Array; need to double memory for copying when creating new array

3. Array; needs all instructions for copy. For linked list we can just keep a pointer to the end and add it there.
