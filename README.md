# spring-redis-example
spring-boot-data redis example project

## Docker for redis
### Docker가 설치 된 상태에서 아래 커맨드를 이용하여 설치합니다.
```
$ docker pull redis
```

## Redis
### 시작하기
```
$ docker run --name some-redis -d -p 6379:6379 redis
```

## Properties
### application.properties 변경
```
spring.redis.host=127.0.0.1
```

## Stack
```
- JDK 8+
- SpringBoot2+
- Redis
```
