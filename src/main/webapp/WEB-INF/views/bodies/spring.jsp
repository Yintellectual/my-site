<article>
	<header>
		<h1 class="w3-teal">Spring MVC Framework</h1>
	</header>

	<section class="w3-container">
	<h3 class="w3-orange">View Technologies</h3>
	
	<a href="http://docs.spring.io/autorepo/docs/spring/3.2.x/spring-framework-reference/html/mvc.html#mvc-viewresolver" target="_blank">View Resolver</a>
	<a href="http://docs.spring.io/autorepo/docs/spring/3.2.x/spring-framework-reference/html/view.html" target="_blank">View</a>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Tutorial</h3>
	
	<a href="

http://docs.spring.io/spring/docs/current/spring-framework-reference/html/index.html" target="_blank">Official Tutorial for Spring MVC 4.x.x</a>
	</section>
	
	<section class="w3-container">
	<h3 class="w3-orange">Notes</h3>
	
	<pre>
Dependency£º

	The original Spring comment component is less desirable. There are two ways to fix it. One way is to exclude the original one and inject the powerful SLF4J. The other way is to inject LOG4J. 



Spring MVC£º

	It follows the principle of "Open for extension, close for modification" which means to manage the most probably changable entities by abstraction. The abstraction can be an interface in java. The abstraction and the existing entities are close for modification, while you can add extensions as either subject or instance of the abstraction. 


Simple MVC Example:

0. Eclipse is the JDE. Maven is the dependency handler. 

1. Create a maven project -> webapp 1.0

2. Inject dependency for spring-webmvc into the dom 

3. add Controller 

	- @Controller to mark a class controller
	- @RequestMapping to mark a class/method handler of certain requests
		1. @RequestMapping("/home")
		2. @RequestMapping(method = RequestMethod.GET)
		3. @RequestMapping(value = "/helloworld", method = RequestMethod.GET)	
	- a handler method takes in a Model/ModelMap parameter. This parameter is abstraction of the attributes carried by the HTTP request. 
		1. model.addAttribute("greeting", "Hello world");
	- a handler method should return a String, which will be prefixed and suffixed in the view part


4. add JSP pages

	- JSPs are in WEB-INF/views/welcome.jsp

5. add %servletname%-servlet.xml

	- it is a xml file with root element of beans
	- ViewResolver and View
		1. All handler methods must return a view, either explicitly or implicitly.
		2. ViewResolver resolve the return value to the actual view
		3. The view technology in spring mvc can be vary from JSP+JSTL, Freemarkder to Thymeleaf
		4. Different view technology requires different ViewResolver and View class
		5. A typical configuration for JSP+JSTL is :
			<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
				<proterty name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
				<proterty name="prefix" value="/WEB-INF/jsps/"/>
				<proterty name="suffix" value=".jsp"/>
				<proterty name="order" value="2"/>
				<proterty name="viewNames" value="*jsp"/>
			</bean>

6. update web.xml
	- this file contains servlet and servlet mapping configuration. 
	- dispatcher DispatcherServlet is congfigured in this file
	- the spring-servlet.xml is configured as initial parameters of the dispatcher
	- certain url patterns are mapped to the dispatcher. 
<servlet>
    <servlet-name>Spring MVC Dispatcher Servlet</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/config/web-application-config.xml</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
</servlet>

7. show images in JSP using Spring MVC

Spring MVC dispatches all requests including images http://.../../...jpg. 

We don't want java to process images, so images should be treat as resoures and the requests should be mapped to the image file. 

a. in the jsp file, 

src="<%=request.getContextPath()%>/images/icons/css3.png"

b. in the springmvc-servlet.xml

	b.1 include mvc schema in the header:
		xmlns:mvc="http://www.springframework.org/schema/mvc"
		xsi:schemaLocation="
			http://www.springframework.org/schema/mvc
			http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd"

	b.2 configure mvc shema
		<mvc:default-servlet-handler />
		<mvc:annotation-driven />
		
	b.3 map requests for images
		<mvc:resources mapping="/images/**" location="/WEB-INF/images/" />
	</pre>
	</section>
</article>