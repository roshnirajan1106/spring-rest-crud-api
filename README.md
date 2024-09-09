# spring-rest-crud-api
request - request line, header , message body
1. request = get/post/what method
2. header = general meta data = type of content -xml / json
3. message body = json data 

same for respose
 
<h2>java json data binding </h2>
1. process of converting json data to a java pojo
2. jackson, binds both db object and java object.
3. json data passed to rest contoller is converted into pojo and vice versa
4. jackson dependency is included in spring boot starter web

<h2>Path Variables</h2>
localhost:8081/api/students/{PathVaraible}
for example
    localhost:8081/api/students/0
    localhost:8081/api/students/1

<h2>Post Construct</h2>
this annotated method is called only once after the bean is created

<h2>Super(message) usage</h2>
1. this method is present in the customException class , used to call the contructor in parent
exception class , to set the message. 
2. We can then retreive the error with getMessage()

<h3>Exception handler</h3>
1. Exception handler annotation inside a contorller will work only for that class
2. 