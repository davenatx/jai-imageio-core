@echo off
set SCRIPT_DIR=%~dp0
java -Xmx512M -XX:MaxPermSize=256m -jar "%SCRIPT_DIR%sbt-launch.jar" %*