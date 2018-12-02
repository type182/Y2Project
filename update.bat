@echo off

git fetch origin master

git log -p master..origin/master

git merge origin/master

git pull origin master 

pause