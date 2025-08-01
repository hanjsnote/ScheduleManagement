# ScheduleManagement
# API 명세서
| 기능       | method | url                      | 설명              | 응답 코드       | Request                                                                                       | Response                                                                              |
|----------|-----|--------------------------|-----------------|-------------|-----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| 일정 등록    | POST | /schedules/new           | 새로운 일정 등록       | 201 Created | {<br/>"name":"JS"<br/>"password":"1234"<br/>"contents":"내용"<br/>"date":"2025-07-31"<br/>} | {<br/>"id":1<br/>"name":"JS"<br/>"contents":"내용"<br/>"date":"2025-07-31"<br/>}            |
| 일정 조회    | GET | /schedules/{name}   | 특정 쟉성자 글 전부 조회  | 200 OK |                                                                                               | {<br/>"id":1<br/>"name":"JS"<br/>"contents":"내용"<br/>"date":"2025-07-31"<br/>}            |
| 일정 수정    | PUT | /schedules/{id}          | 특정 id 일정 수정     | 200 OK | {<br/>"name":"JS"<br/>"password":"1234"<br/>"contents":"내용"<br/>"date":"2025-07-31"<br/>}     | {<br/>"message":"수정 성공"<br/>"name":"JS"<br/>"contents":"내용"<br/>"date":"2025-07-31"<br/>} |
| 일정 삭제    | DELETE | /schedules/{id}          | 특정 id 일정 삭제     | 200 OK |                                                                                               | {<br/>"message":"삭제 성공"<br/>}                                                         |
| 댓글 생성    | POST | /schedules/{id}/comments | 특정 id 일정의 댓글 생성 | 201 Created | {<br/>"name":"JS"<br/>"password":"1234"<br/>"comments":"내용"<br/>"date":"2025-07-31"<br/>} | {<br/>"id":1<br/>"name":"JS"<br/>"comments":"내용"<br/>"date":"2025-07-31"<br/>}        |

# ERD
![img.png](img.png)