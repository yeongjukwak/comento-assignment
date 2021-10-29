# 코멘토 직무부트캠프
IT 대기업 현업 개발자와 함께 하는 백엔드 개발 실무 (2021. 10. 26 ~ 2021. 11. 23)

## Week-01 (개발환경 Setting)

**환경 구축을 하면서 난 오류 종류**
1. web.xml <web-app> 태그 오류
2. root-context.xml <context:component-scan> 태그 오류
3. log4j.xml "log4j.dtd" 파일을 찾을 수 없는 오류
  
**오류 해결방안**   
1. <web-app> 태그의 xsi:schemaLocation의 주소 부분에 'java' 단어를 'JAVA'로 변경
2. <beans> 태그에 xmlns:context="http://www.springframework.org/schema/context" 추가 후, root-context.xml namespaces에서 context default version 설정
3. <!DOCTYPE> 부분의 "log4j.dtd" 부분을 "http://logging.apache.org/log4j/1.2/apidocs/org/apache/log4j/xml/doc-files/log4j.dtd"로 변경 후, 변경한 주소에서 'log4j.dtd' 파일을 다운 후, log4j.xml과 같은 위치에 복붙

## Week-02


## Week-03


## Week-04

