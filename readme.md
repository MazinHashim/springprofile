# Spring boot application with profiles feature
#### 
## Profiles

This project leverages Spring Boot profiles to support different environments. Two profiles are available:
- **dev**: Configuration for the development environment.
- **prod**: Configuration for the production environment.


Using profiles helps manage configuration differences between development and production environments, allowing for smoother deployment and testing.

# Usage
- This project uses mysql database connection driver
- Make sure you installed java 17 in your computer
- Create two databases 
  - one for development named **dev_db**
  - another for production named **prod_db**
  - both of them has same user credentials
- Development running in localhost with **8081** port
- Production running in localhost with **8081** port
- Run insert queries inside **data.sql** in **src/main/resources/** 
  - development queries prefixed by **dev** in password column
  - production queries prefixed by **prod** in password column