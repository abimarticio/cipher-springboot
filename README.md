# Atbash and Caesar Cipher Spring Boot

## Overview

An implementation of Atbash and Caesar cipher algorithm as a Spring Boot application.

## Pre-requisites

This project has the following dependencies,

* Java JDK 11
* Spring Boot 2.3.4

## Usage

Currently, we have two functions: (1) `encrypt` and (2) `decrypt`.

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