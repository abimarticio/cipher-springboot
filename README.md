# Atbash and Caesar Cipher Spring Boot

## Overview

An implementation of Atbash and Caesar cipher algorithm as a Spring Boot application.

## Pre-requisites

This project has the following dependencies,

* Java JDK 11
* Spring Boot 2.3.4

## Usage

In this repository, we implement the Atbash and Caesar cipher algorithms. To use these algorithms, we have the following view functions:

* `/atbash/encrypt` for Atbash encryption. The request parameter for this function is `text`.
* `/atbash/decrypt` for Atbash decryption. The request parameter for this function is `text`.
* `/caesar/encrypt` for Caesar encryption. The request parameters for this function are `text` and `key`.
* `/caesar/decrypt` for Caesar decryption. The request parameters for this function are `text` and `key`.

We can call our API in Python through the following manner,

```python
>>> import requests
>>> r = requests.get("http://localhost:8080/encrypt?text=hello&key=2")
>>> r.status_code
200
>>> r.text
'JGNNQ'
```
We can call our API using `curl` command in the following manner,

```buildoutcfg
$ curl -s -X GET "localhost:8080/decrypt?text=jgnnq&key=2"
HELLO
```

## License

```
Atbash and Caesar cipher Spring Boot app
Copyright (C) 2020  Abigail Marticio

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
```