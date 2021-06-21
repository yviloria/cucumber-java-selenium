# CucumberJava

https://www.federico-toledo.com/buenas-practicas-de-cucumber/


para ejecutar por consola


mvn clean install


mvn clean test

mvn test -Dcucumber.options="-p html:target/Htmlreports"

mvn test -Dcucumber.options="src/test/resources/featuresBackground/loginBackground.feature"

mvn test -Dcucumber.options="--tags @SmokeTest"

mvn test -Dcucumber.filter.tags="@SmokeTest or @RegressionTest"
