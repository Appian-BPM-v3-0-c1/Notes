# Introduction To Web Services

A web service is any piece of software that makes itself available over the internet and uses a standardized XML
messaging system. XML is used to encode all communications to a web service. For example, a client invokes a web service
by sending an XML message, then waits for a corresponding XML response.

Web services are XML-based information exchange systems that use the Internet for direct application-to-application
interaction.

A web service is a collection of open protocols and standards used for exchanging data between applications or systems.
Software applications written in various programming languages and running on various platforms can use web services to
exchange data. This interoperability (e.g., between Java and Python, or Windows and Linux applications) is due to the
use of open standards.

### What is XML

XML is a software- and hardware-independent tool for storing and transporting data.

- XML stands for Extensible Markup Language
- XML is a markup language much like HTML
- XML was designed to store and transport data
- XML was designed to be self-descriptive

### XML Usage

A short list of XML usage says it all −

- XML can work behind the scene to simplify the creation of HTML documents for large web sites.

- XML can be used to exchange the information between organizations and systems.

- XML can be used for offloading and reloading of databases.

- XML can be used to store and arrange the data, which can customize your data handling needs.

- XML can easily be merged with style sheets to create almost any desired output.

- Virtually, any type of data can be expressed as an XML document.

## To Summarize

a complete web service is, therefore, any service that −

- Is available over the Internet or private networks

- Uses a standardized XML messaging system

- Is not tied to any one operating system or programming language

- Is self-describing via a common XML grammar

## Different Types of Web Services

- XML-RPC is the most basic XML protocol to exchange data between a wide variety of devices on a network. It uses HTTP
  to quickly and easily transfer data and communication other information from client to server.

- UDDI (Universal Description, Discovery, and Integration) is an XML-based standard for detailing, publishing, and
  discovering web services. It’s basically an internet registry for businesses around the world. The goal is to
  streamline digital transactions and e-commerce among company systems.

- SOAP (Simple Object Access Protocol) is an XML-based Web service protocol to exchange data and documents over HTTP. It
  allows independent operations on different systems to communicate using XML.

- REST (Representational State Transfer) provides communication and connectivity between devices and the internet for
  API-based tasks. Most RESTful services use HTTP as the supporting protocol.

## HTTP Request/Response

HTTP defines a set of request methods to indicate the desired action to be performed for a given resource. Although they
can also be nouns, these request methods are sometimes referred to as HTTP verbs. Each of them implements a different
semantic, but some common features are shared by a group of them:

- **GET**: The GET method requests a representation of the specified resource. Requests using GET should only retrieve
  data.


- **HEAD**: The HEAD method asks for a response identical to a GET request, but without the response body.


- **POST** : The POST method submits an entity to the specified resource, often causing a change in state or side
  effects on the server.


- **PUT**: The PUT method replaces all current representations of the target resource with the request payload.


- **DELETE**: The DELETE method deletes the specified resource.


- **CONNECT**: The CONNECT method establishes a tunnel to the server identified by the target resource.


- **OPTIONS**: The OPTIONS method describes the communication options for the target resource.


- **TRACE**: The TRACE method performs a message loop-back test along the path to the target resource.


- **PATCH**: The PATCH method applies partial modifications to a resource.

## How Does a Web Service Work?

<img src="https://miro.medium.com/max/450/1*2zcwheQDq2ELXmekNZ7gEw.png">

