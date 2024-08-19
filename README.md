# spring boot

코틀린

## 프로젝트 생성

https://start.spring.io

## jenv 설정

```sh
brew install jenv
```

```sh
echo 'export PATH="$HOME/.jenv/bin:$PATH"' >> ~/.zshrc
echo 'eval "$(jenv init -)"' >> ~/.zshrc
```

```
sudo ln -sfn /opt/homebrew/opt/openjdk@21/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-21.jdk
jenv add /Library/Java/JavaVirtualMachines/openjdk-21.jdk/Contents/Home/
```

```
jevn
```

```
jevn global 21.0
```

https://velog.io/@geun/Setting-jenv로-여러-Java-버전-사용관리하기-For-Mac-g20bsd7e

## 스프링부트 실행

./gradlew build
./gradlew bootRun


$ curl localhost:8080/ping
$ pong   




https://shinsunyoung.tistory.com/88
https://hippolab.tistory.com/69