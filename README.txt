Backaccount Services
---------------------

# Modules
**account-management**

**backaccount-changelog** - Database versioning script

**management** - management JPA and REST services

**service** - main Spring Boot runner. 

**security-core** - configure OAuth2 and implement stateless session. In future releases Authorization server will be moved to separate service.     

## Security 
At this moment we hardcode `Roles` and `Permissions`. To add new one check ``co.easyms.backoffice.management.service.RoleRepository``

JWT token is used to provide stateless authorization. 
`co.easyms.backoffice.security.core.EMSUserAuthenticationConverter` convert  converting a user authentication to and from a Map.

# Preparing environment
## IDE Setup 
We use IntelliJ IDEA 17 Community Edition as standard and supported IDE 

## Install plugins for IDE 

- Maven Helper
- Lombok 
- .gitignore
- Docker 



