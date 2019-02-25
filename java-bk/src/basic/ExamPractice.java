package basic;

public class ExamPractice {
	/*
	 * 운영체제 기초활용하기
	 * 
	 * 1.1 응용 소프트웨어를 개발하기 위하여 다양한 운영체제의 특징을 설명할 수 있다.
	 * 윈도우:GUI 기반과 멀티태스킹 가능,플러그앤플레이기능
	 * 리눅스:무료,다중사용자,안전성,확장성,이식성
	 * 
	 * 1.2 CLI(Command Line Interface) 및 GUI(Graphic User Interface) 환경에서 운영체제의
	 * 기본명령어를 활용할 수 있다.
	 * Ctrl+R 또는 실행 cmd
	 * cd 디렉토리명 : 그 디렉토리로 이동한다.
	 * cd.. : 상위 디렉토리로 이동한다.
	 * fsutil file createnew 1.txt 5 : 5바이트의 1.txt 텍스트파일 생성
	 *                               : 공백으로 5칸 들어간다.
	 * mkdir 디렉토리명 : 디렉토리명으로 폴더생성
	 * rmdir 디렉토리명 : 디렉토리명의 폴더삭제
	 * javac 자바파일명 : 자바 컴파일
	 * java 파일명 : 자바수행
	 * 
	 * 1.3 운영체제에서 제공하는 작업 우선순위 설정방법을 이용하여 애플리케이션의 작업우선순위를 조정할 수 있다.
	 * Ctrl+R -> taskmgr -> 프로세스 -> 원하는 프로세스 우클릭 우선순위 설정
	 * 또는 Ctrl+Shift+esc 또는 Ctrl+Alt+del-> 작업관리자
	 * 

	 * 데이터베이스 기초활용하기
	 * 
	 * 2.1 데이터베이스의 종류를 구분하고 응용 소프트웨어 개발에 필요한 데이터베이스를 선정할 수 있다.
	 * 많이쓰는 관계형 DBMS(R-DBMS)
	 * Oracle / MySQL / MariaDB / MS-SQL
	 * 
	 * NoSQL
	 * MongoDB / DynamoDB / Redis
	 * 
	 * 2.2 주어진 E-R 다이어그램을 이용하여 관계형 데이터베이스의 테이블을 정의할 수 있다.
	 * Google에 ERMASTER 검색 -> ERMaster update site -> Zip 파일 다운로드
	 * 추후 압축파일 풀어서 압축파일 내에있는 Plugin파일 eclips-plugins 파일안에 옮기기
	 * eclipse 재실행 또는 실행 후 src 우클릭 -> New -> Other -> ER-Master-NHIT 후
	 * 자신이 원하는 테이블 생성후 내보내기 DDL 하면 됨
	 * 
	 * 2.3 데이터베이스의 기본연산을 CRUD(Create, Read, Update, Delete)로 구분하여 설명할 수 있다.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 네트워크 기초활용하기
	 * 
	 * 3.1 네트워크 계층구조에서 각 층의 역할을 설명할 수 있다.
	 * OSI 7계층
	 * 1계층 : 물리
	 * 2계층 : 데이터링크
	 * 3계층 : 네트워크
	 * 4계층 : 전송
	 * 5계층 : 세션
	 * 6계층 : 표현
	 * 7계층 : 응용
	 * 
	 * 3.2 응용의 특성에 따라 TCP와 UDP를 구별하여 적용할 수 있다.
	 * TCP : 신뢰성이 있지만 UDP 보다 느림
	 * UDP : 빠르지만 신뢰성이 좋지 않음
	 * 
	 * 3.3 패킷 스위칭 시스템을 이해하고, 다양한 라우팅 알고리즘과 IP 프로토콜을 설명할 수 있다.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 기본개발환경 구축하기
	 * 
	 * 4.1 응용개발을 위하여 선정된 운영체제를 설치하고 운용할 수 있다.
	 * 
	 * 4.2 응용개발에 필요한 개발도구를 설치하고 운용할 수 있다.
	 * JDK 설치(Oracle 홈페이지 Java SE Development Kit 8u201/x64)
	 * 환경변수 선언 하는 법
	 * 내컴퓨터-속성-고급시스템설정-고급-환경변수-자신계정 PATH에
	 * ; 하고 jdk1.8\bin 경로 설정해주면 됨
	 * 
	 * eclipse 설치(eclipse 홈페이지 Downloads - Downloads Package)
	 * Eclipse IDE for Enterprise Java Developers 설치하면 64비트 다운
	 * 
	 * tomcat8 버전 설치(apache tomcat 홈페이지 Download-tomcat8)
	 * core - windows64bit 다운
	 * -----------------------------------------------------------
	 * elipse에 tomcat 설치
	 * Window - Show view - Servers 아래 영역 콘솔창 Servers
	 * 클릭하고 tomcat8버전 설치된 경로 지정하면 됨
	 * http 기본포트는 80
	 * -----------------------------------------------------------
	 * Oracle 홈페이지
	 * Oracle Database 11g Release 2 Express Edition for Windows 64 설치
	 * QueryBox 3.3.1.1 설치
	 * 
	 * 4.3 웹서버, DB서버 등 응용개발에 필요한 기반 서버를 설치하고 운용할 수 있다.
	 */
}
