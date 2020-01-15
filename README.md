
## IMPORTANT 
Currently, executing the gradle task **runScript** results in a **BUILD FAILURE**. So, please try running the **myscript.groovy** directly.


## Project Overview
A small gradle project to experiment with how GitHub handles symlinks

Although this is a gradle project and you can execute the task **runScript** inorder to see the symlink creation at work, you still have the option of running the **myscript.groovy** as plain groovy script and the symlink will be created for you.


This repo has has three branches : **master**, **valid_symlink** and **invalid_symlink**.

**master** branch contains starter project files.

**valid_symlink** branch contains valid symlink and corresponding code that generates it. 

**invalid_symlink** branch contains invalid symlink and corresponding code that generates it. 

The task **runScript** in turn executes the **myscript.groovy** and in the **master** branch the complete code of myscript.groovy is commented out as the script is just a starter file. You can either uncomment specific blocks and run the gradle task or simple checkout to **valid_symlink** or **invalid_symlink** branch and then try executing the task.

**NOTE** Always delete the symlink before executing the script **myscript.groovy** / running the **runScript** task. I have plans to incorporate the deletion logic, but only after the project becomes a bit stable.
