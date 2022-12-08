# What is HTTP?
Hyper Text Transfer Protocol (http) is the most popular way of transferring information across the web in modern
times. It is a request/response system that guarantees a response for every request made. There are a few 
standard components of an HTTP request you should be familiar with:
- URI
    - This is the part of the request that tells the web server what information you want
- Body
    - Many http requests are going to contain a body: this is the information that is needed to complete
    whatever request you are making

You also should be familiar with the following components of an http response:
- Body
    - This contains whatever information you requested (or it could be an error message)
- Status code
    - This is a number that gives an immediate indication of how your request was handled
// https = hyper text transfer protocol secure