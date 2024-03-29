# Git

## Version Control

- Git is a distributed version control system.
- Project --> Create folder and add files -> Version 1 --> Add more files, modify existing files --> Version 2
- Now if we want to go back from Version 2 to Version 1, because of some bug we need a tool called Version Control System - one of them is 'Git'.
- Version Control System can be of following types:
  - Local Version Control System:
    - Collaboration with multiple people working on the same project is not possible.
    - Once our system gets corrupted, entire data will be lost.
  - Centralized Version Control System (CVCS):
    - In this case we will have a central remote repository in which is going to maintain all our project versions.
    - Here collaboration with multiple people working on the same project is possible.
    - But again if the server in the remote repository gets corrupted all the data will be lost.
    - In this case we may have a local version of the project but all the Version history saved in the cloud will be lost.
  - Distributed Version Control System (DVCS):
    - This works similar to Centralized Version Control System, so we will have a local copy as well as a remote copy of the project.
    - And on top here we will have a local version of the project along with the entire version history.

## History of Git

- Open source project contribution took in the order of:
  - Archive files / Sending Patches (1991-2002) -> Bitkeeper (2002) -> Git (2005)
- Git is created by Linus Torvalds.
- Git is:
  - Simple to use
  - Fast
  - Uses branching
  - Fully distributed

## Git Setup

- Verify whether Git is installed on your system by checking the installed Git version:  
  `$ git --version`
- List the current global configurations in Git:  
  `$ git config --global --list`
- Set up your own global configurations in Git:  
  `$ git config --global user.name "Deepjyoti Barman"`  
  `$ git config --global user.email "x@y.com"`

## Git Init

- The working directory refers to the top-level directory of your Git repository where you are currently making changes to your files. It's the directory where you can see and modify your project's files before staging them for a commit.
- Staging area in the place where you can put the files that you want git to track out of all the files.
- Show the current status of your working directory:  
  `$ git status`
- Initialize git on the current working directory (it will create an empty .git folder in the working directory, this is where it is tracking everything including commit history):  
  `$ git init`
- Initialize git on the current working directory with a branch name 'main' instead of 'master':  
  `$ git init -b "main"`
- Remove git from tracking any changes in the working directory:  
  `$ rm -rf .git`

## Git Commit

- Add file from working directory to staging area:  
  `$ git add <filename>`
- Adding all the file changes from working directory to the staging area:  
  `$ git add .`
- Committing change to local repository:  
  `$ git commit -m <message>`
- Show all the git commit history:  
  `$ git log`

- Show all the commit history, one on each line:  
  `git log --pretty=oneline`  
  `git log --oneline`

- Git maintain integrity of the file changes by the use of checksum via SHA-1 algorithm (which work like a fingerprint for every commit). The checksum is of 40 characters but for us only the first 7 characters are important.

## Git Skip the Staging Area

- Commit change without moving the file to the staging area:  
  `$ git commit -am <message>`  
  `$ git commit -a -m <message>`

## Git Diff

- Show the differences between the last commit and the changes that you have made in the working directory:  
  `$ git diff`
- Show the differences between the last commit and the changes that you have pushed into the staging area:  
  `$ git diff --staged`

## Git Remove File

- Remove a file which has already been committed to local repository:  
  `$ git add Readme.md credentials.txt`  
  `$ git commit -m "Added two new files in the project"`  
  `$ git rm --cached credentials.txt` (Remove the file credentials.txt from git history -> Then delete the file)  
  `$ git commit -m "Removed the file credentials.txt from tracking"` (Commit the file deletion)

## GitHub Repository

- Clone a repository from github to you local system:  
  `$ git clone <repo-url>`

- Advantage of SSH over HTTPS method to push code changes to GitHub is with SSH keys you don't need to enter the credentials again and again
- In order to push changes from you local repository to GitHub follow the steps:
  - `$ git init`
  - `$ git add .` (Add / modify / remove changes on your local repository and commit those change)
  - `$ git commit -m <commit-message`
  - `$ git remote add origin <ssh-url/https-url>` (origin = A label that you assign to the remote repository, we can also think of this as an alias name for the https/ssh url)
  - `$ git push -u origin main` (-u = upstream)

### SSH: Connect to Your GitHub Account via SSH Keys

- Create an SSH key using any of the following algorithms:
  - OpenSSH format:
    - -o (OpenSSH format) introduces some additional features and security enhancements over traditional key formats, such as better protection against quantum computing threats, it doesn't change the underlying cryptographic algorithm.
    - `$ ssh-keygen -o`
  - Ed25519 algorithm:
    - The Ed25519 algorithm is specifically designed to provide high security. Ed25519 keys offer strong security with shorter key lengths compared to RSA keys, making them less susceptible to certain types of attacks. Ed25519 keys also offer faster key generation and signing speeds compared to RSA keys.
    - `$ ssh-keygen -t ed25519`
- Choose the default file location and choose any passphrase ('Enter' if you don't want to use any passphrase)
- Copy key that got generated on your system:
  - `$ cat .ssh/id_ed25519.pub`
- Click on your profile icon in 'GitHub' -> Click on 'Settings'
- Choose 'SSH and GPG keys' from the left hand side navigation menu
- Click on 'New SSH Key'
- Provide a 'Title', select 'Key type' as 'Authentication Key', and paste the key
- Click on 'Add SSH Key'

### HTTPS: Connect to Your GitHub Account via Personal Access Token

- Click on your profile icon in 'GitHub' -> Click on 'Settings'
- Choose 'Developer Settings' from the left hand side navigation menu
- Click on the dropdown 'Personal access token' and select 'Tokens (classic)'
- Click on the dropdown 'Generate new token' and select 'Generate new token (classic)'
- Provide a 'Note', set 'Expiration' and define 'Scope' (Provide all the access under 'repo')
- Click on 'Generate token'
- Copy the generated token
- Now after cloning the repository when you push changes to your GitHub account, provide the following:
  - Username: YOUR_USERNAME
  - Password: YOUR_PERSONAL_ACCESS_TOKEN

## Git Tag

- Display the remote repositories associated with your local Git repository, along with their corresponding URLs:  
  `$ git remote -v` (v = verbose)
- When we are working on a project and have done several commits in it, and now if we think we are all set to release our next version we can give a tag to it.
- Check all the tags associated with the current repository:  
  `$ git tag`
- Tags can of two types:
  - Annotated tag: An annotated tag includes a message along with the tag, providing more context or information about the tag
  - Lightweight tag: A lightweight tag is just a pointer to a specific commit without any additional metadata
- To add an annotated tag:  
  `$ git tag -a <tag-name> -m <tag-message>`  
  `$ git tag -a v1.0 -m "First release"`
- To add a lightweight tag:  
  `$ git tag <tag-name>`  
  `$ git tag v1.0`
- Show information about the given tag:  
  `$ git show <tag-name>`  
  `$ git show v1.0`
- By default, tags are not automatically pushed to the remote repository. To ush the tag changes to remote repository:
  `$ git push origin <tag-name>`  
  `$ git push origin v1.0`
- Push all local tags to remote repository:  
  `git push origin --tags`

## Git Branching

- We create branches for experimental features, and merge it to main when everything seems work fine. This way we can keep the main branch unaffected or isolated from most of the issues.
- Create a new branch:  
  `$ git branch <branch-name>`
- Switch to the new branch:  
  `$ git checkout <branch-name>`  
  `$ git switch <branch-name>`
- Create and switch to the new branch:  
  `$ git checkout -b <branch-name>`  
  `$ git switch -c <branch-name>`
- Notes on `git switch`:
  - Introduced in Git 2.23
  - Specifically designed for branch switching, which makes its purpose clearer and more straightforward.
  - Can create a branch the -c or --create option.
  - Unlike `git checkout`, this command doesn't allow you to directly switch to specific commits or tags. This means we're less likely to accidentally end up in a detached HEAD state.
- Notes on `git checkout`:
  - Traditional command for branch switching.
  - This command server multiple other purposes.
  - Can create a branch the -b or --branch option.
  - Allows you to directly switch to specific commits or tags. However, this can sometimes lead to a detached HEAD state if we're not careful.
- Display all the local and remote branches:  
  `$ git branch --all`
- Switch to previous branch:  
  `$ git switch -`
- Switch to previous branch:  
  `$ git branch -d <branch-name>`  
  `$ git branch --delete <branch-name>`
- Pushing a new branch into remote repository:  
  `$ git push origin <new-branch-name>`
- Show graphical representation of all Git branches:
  - Command: `git log --graph`
  - VSCode extension: Git Graph

## Git Merge

- Merge 'feature' branch into 'main' branch:  
  `$ git switch main`  
  `$ git pull`  
  `$ git merge feature`

## Git Rebase

- Rebase 'feature' branch into 'main' branch:
  `$ git switch main`  
  `$ git pull`  
  `$ git rebase feature`
- When we merge two branches with `git merge`, it creates a new commit for the merge. This way it does not keep the entire history of the branch getting merged.
- On the other hand, when we merge two branches with `git rebase` it maintains the entire history of the branch getting merged and thus keeps a simple and clean track of all the commit history for both the branches.
- If we want to maintain a clear tree `git rebase` is the way to go. But, if we want to know what changes happened in each 'feature' branch and when it got merged to 'main' we can use `git merge`.

## Git Merge Conflict

- Merge conflict takes place when we make changes in the same line of the same file in two different branches and try to merge or rebase one with the other.
- How to solve the conflicts:  
  `$ git pull origin main`  
  `$ git merge feature` (Created conflict)  
  `$ git diff`  
  Solve the conflicts in a text editor / ide, save the files  
  `git add .`  
  `git commit -m "Conflicts resolved"`Commit the change
- Pull configurations:
  - `git config pull.rebase false` (Safe option)
    - When pull.rebase is set to false, it means that git pull will not automatically rebase local changes on top of the incoming changes from the remote repository. Instead, it will default to using merge commits to integrate changes.
    - This option is suitable if you prefer to use merge commits when integrating changes from a remote repository.
    - Merge commits explicitly show the point at which branches were merged, providing clear visibility into the project's history.
  - `git config pull.rebase true`
    - When pull.rebase is set to true, it means that git pull will automatically rebase local changes on top of the incoming changes from the remote repository. This can result in a cleaner history without unnecessary merge commits.
    - This option is suitable if you prefer a linear history without unnecessary merge commits.
    - Rebasing (pull.rebase true) can be problematic if you're working on a shared branch with other collaborators, as it rewrites commit history and can lead to conflicts.
  - `git config pull.ff only`
    - When pull.ff is set to only, it means that git pull will only perform fast-forward merges if possible. If a fast-forward merge is not possible (e.g., due to diverging branches), git pull will fail instead of creating a merge commit.
    - This option is suitable if you want to ensure that git pull always performs fast-forward merges, which preserve the linear history of your branch.
    - Fast-forward merges occur when the branch you're pulling into can be updated by simply moving its pointer forward to the latest commit on the remote branch. This maintains a straightforward history without additional merge commits.

## Git Time Travel

- Create a new branch from a previous commit:  
  `$ git checkout <commit-id>`  
  `$ git checkout -b <branch-name>`

## Git Stash

- Situations may come when we want to save your code somewhere without committing and want to switch to another branch for some hotfix - in such cases `git stash` can be used to help us out.
- Stash uncommitted changes in the working directory:  
  `$ git stash`  
  `$ git stash push`  
  `$ git stash save`
- List all the stashes:  
  `$ git stash list`
- Show the changes in the most recent stash:  
  `$ git stash show`
- Apply the most recent stash to the working directory without removing from the stash list:  
  `$ git stash apply`
- Apply the most recent stash to the working directory and remove it from the stash list:  
  `$ git stash pop`
- Apply a specific stash to the working directory without removing from the stash list:  
  `$ git stash apply stash@{n}`
- Remove all stashes from the stash list:  
  `$ git stash clear`
- Remove the most recent stash from the stash list:  
  `$ git stash drop`
- Remove a specific stash from the stash list:  
  `$ git stash drop stash@{n}`

## Git Fork

- In Git, a fork is a copy of a repository that allows us to freely experiment with changes without affecting the original repository. The primary use of Git fork is for collaborative development workflows, particularly in open-source projects or team collaborations.
- Forking a project will create a clone of the repository in your own GitHub account so that you can experiment and push changes freely.

## Git Pull Request

- A Git pull request (PR) is a way of proposing changes to a repository hosted on a platform like GitHub, GitLab, or Bitbucket. Pull requests facilitate code review, collaboration, and integration of changes into the main branch of a repository.
- Git Pull Requests are used for:
  - Code review
  - Collaboration
  - Quality assurance
  - Integration and workflow management
  - Risk mitigation
  - Knowledge sharing and learning
