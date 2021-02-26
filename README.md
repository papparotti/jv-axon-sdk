# jv-axon-sdk

## What the heck is this
This project is the ill-guided attempt to create a collection of java objects to talk to an Informatica Axon REST API interface

This is for educational purposes only, do not use this in any other capacity.


## The Axon ReST API

### Authentication
Users are authenticated to make API calls using a BearerToken.

This token can be obtained by either providing a username / password or a refresh token.

The response to the bearerToken request does return the token itself and the refresh token.

