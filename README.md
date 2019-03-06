nginxroutingtest

An Apache based HTTP client to test SNI vs non-SNI client requests to an nginx server


How to?

1. Extract files inside a JAR file?
Ans:   jar -xf <jar-filename>

2. View files inside a JAR archive without extracting them?
Ans:   jar -tvf <jar-filename>

3. Setup the right classpath and mainClass tags in MANIFEST.MF for a normal(thin) JAR?
Ans: Use maven-jar-plugin with the config as defined in pom.xml

4. Setup the right classpath and mainClass tags in MANIFEST.MF for a fat JAR?
Ans: Use maven-assembly-plugin with the appropriate config as defined in pom.xml

5. Run the main program inside a JAR file?
Ans: java -jar <path-to-jar-file> 
