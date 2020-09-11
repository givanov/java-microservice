# java-microservice

## Get users

In a browser visit: 
```
http://localhost:8080/get-users
```
Response should be:
```
<List>
<item id="1">
<name>Georgi</name>
<profession>Software Developer</profession>
</item>
<item id="1">
<name>broken</name>
<profession><SCRIPT>alert("I hack you!")</SCRIPT></profession>
</item>
<item id="1">
<name>broken2</name>
<profession><SCRIPT>alert("I hack you!")</SCRIPT></profession>
</item>
</List>
```

## Add user

In postman send a post request to 
```
http://localhost:8080/add-user
```
with payload:
```
<item id="1">
<name>broken</name>
<profession>&lt;SCRIPT&gt;alert("I hack you!")&lt;/SCRIPT&gt;</profession>
</item>
```

## Delete user

In postman send a delete request to 
```
http://localhost:8080/delete-user
```

## Render html for user
In a browser visit:
```
http://localhost:8080/html?name=broken
```
Where broken is the name of the user you want to display
## Postman collection
https://www.getpostman.com/collections/fb2b34c7992d038c4a32