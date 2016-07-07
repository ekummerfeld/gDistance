@ECHO OFF
:: Tetred-CLI JAR file
SET JAR=causal-cmd-5.3.0-SNAPSHOT-jar-with-dependencies.jar

java -jar %JAR% --algorithm fgs %*

