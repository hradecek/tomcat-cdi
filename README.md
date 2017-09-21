# Tomcat with CDI
Sample maven project using Tomcat with CDI support ([Weld implementation](http://weld.cdi-spec.org/)).

## Build
In order to build the whole project run:
```
$ mvn clean package
```

This command creates *deployable* `tomcat-cdi.war` file in your `target/` folder.

## Deploy
First ensure your Tomcat instance is running and deploy `tomcat-cdi.war`, either via `GUI` or by copying to `webapps` folder.

After successful deploy, you should see a similar message in log:
```
dd-M-YYYY HH:MM:sS. INFO [localhost-startStop-1] org.jboss.weld.environment.tomcat.TomcatContainer.initialize WELD-ENV-001100:
Tomcat 7+ detected, CDI injection will be available in Servlets, Filters and Listeners.
```
which means Weld has found injection points along with their respective CDI beans.

## Test it!
Open your web-browser and access [localhost:8080/tomcat-cdi/hello-cdi](http://localhost:8080/tomcat-cdi/hello-cdi) (by default).

You should see:
```
Hello CDI
```
printed on your screen.

---
Deeper explanation can be found at [hradecek.github.io/cdi-intomcat](https://hradecek.github.io/posts/cdi-in-tomcat).
