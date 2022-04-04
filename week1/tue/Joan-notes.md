## Git

**Git** is a version control system used for tracking changes in computer files.
* Tracks changes in the source code
* The distributed version control tool is used for source code management
* Allows multiple developers to work together
* Supports non-linear development through thousands of parallel branches
* Features of Git
  * Tracks history
  * Free and open source
  * Supports non-linear development
  * Creates backups
  * Scalable
  * Supports collaboration
  * Branching is easier
  * Distributed development

### Branches

* In Git, a **branch** is a pointed to a specific commit.
* The branch pointer moves along with each commit you make, and only diverges if a commit is made on a common ancestor commit (usually "main").
* Developing code in branches allows one to work on different features in parallel and keeps the main branch free of questionable code.

### Commands

#### Pushing to GitHub Repository

* The `git status` command displays the state of the working directory and the staging area.
* It allows you to see what changes have been staged, which haven't, and which files are not being tracked by Git.
* `git add -A` stages a new file.
* `git commit -m <MESSAGE>` commits everything from the staging area and makes a permanent snapshot of the current state of your repository that is associated with a unique identifier.
* `git push origin <BRANCH NAME>` is used to upload local repository content (on your computer) to a remote repository (on GitHub).

#### Creating New Branches

* The "main" branch is the primary branch from which all other branches stem. Bao calls this **the sacred timeline**.
* `git branch` allows you to know what brance you are currently working in.
* `git checkout -b <BRANCH NAME>` creates a branch with the given name.
* `git checkout <EXISTING BRANCH NAME>` switches to the branch you name.