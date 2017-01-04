-- 학사관리
DROP SCHEMA IF EXISTS mybatis_dev;

-- 학사관리
CREATE SCHEMA mybatis_dev;

-- 새 테이블
CREATE TABLE mybatis_dev.TABLE (
)
COMMENT '새 테이블';

-- 주소
CREATE TABLE mybatis_dev.addresses (
	addr_id INTEGER(11) NOT NULL COMMENT '번호', -- 번호
	street  VARCHAR(50) NOT NULL COMMENT '거리', -- 거리
	city    VARCHAR(50) NOT NULL COMMENT '시도', -- 시도
	state   VARCHAR(50) NOT NULL COMMENT '시군구', -- 시군구
	zip     CHAR(5)     NOT NULL COMMENT '우편번호', -- 우편번호
	country VARCHAR(20) NOT NULL COMMENT '동' -- 동
)
COMMENT '주소';

-- 주소
ALTER TABLE mybatis_dev.addresses
	ADD CONSTRAINT PK_addresses -- 주소 기본키
		PRIMARY KEY (
			addr_id -- 번호
		);

ALTER TABLE mybatis_dev.addresses
	MODIFY COLUMN addr_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '번호';

-- 학생
CREATE TABLE mybatis_dev.students (
	stud_id INTEGER(11) NOT NULL COMMENT '학번', -- 학번
	name    VARCHAR(50) NOT NULL COMMENT '성명', -- 성명
	email   VARCHAR(50) NOT NULL COMMENT '이메일', -- 이메일
	phone   VARCHAR(15) NULL     COMMENT '연락처', -- 연락처
	dob     DATE        NULL     COMMENT '생년월일', -- 생년월일
	bio     LONGTEXT    NULL     COMMENT '자기소개서', -- 자기소개서
	pic     BLOB        NULL     COMMENT '증명사진', -- 증명사진
	addr_id INTEGER(11) NULL     COMMENT '주소' -- 주소
)
COMMENT '학생';

-- 학생
ALTER TABLE mybatis_dev.students
	ADD CONSTRAINT PK_students -- 학생 기본키
		PRIMARY KEY (
			stud_id -- 학번
		);

ALTER TABLE mybatis_dev.students
	MODIFY COLUMN stud_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '학번';

-- 강사
CREATE TABLE mybatis_dev.tutors (
	tutor_id INTEGER(11) NOT NULL COMMENT '강사번호', -- 강사번호
	name     VARCHAR(50) NOT NULL COMMENT '성명', -- 성명
	email    VARCHAR(50) NOT NULL COMMENT '이메일', -- 이메일
	phone    VARCHAR(15) NULL     COMMENT '연락처', -- 연락처
	dob      DATE        NULL     COMMENT '생년월일', -- 생년월일
	bio      LONGTEXT    NULL     COMMENT '자기소개서', -- 자기소개서
	pic      BLOB        NULL     COMMENT '증명사진', -- 증명사진
	addr_id  INTEGER(11) NULL     COMMENT '주소' -- 주소
)
COMMENT '강사';

-- 강사
ALTER TABLE mybatis_dev.tutors
	ADD CONSTRAINT PK_tutors -- 강사 기본키
		PRIMARY KEY (
			tutor_id -- 강사번호
		);

ALTER TABLE mybatis_dev.tutors
	MODIFY COLUMN tutor_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '강사번호';

-- 강좌
CREATE TABLE mybatis_dev.courses (
	course_id   INTEGER(11)  NOT NULL COMMENT '강좌번호', -- 강좌번호
	name        VARCHAR(100) NOT NULL COMMENT '강좌명', -- 강좌명
	description VARCHAR(512) NULL     COMMENT '강좌내용', -- 강좌내용
	start_date  DATE         NULL     COMMENT '시작일', -- 시작일
	end_date    DATE         NULL     COMMENT '종료일', -- 종료일
	tutor_id    INTEGER(11)  NULL     COMMENT '담당강사' -- 담당강사
)
COMMENT '강좌';

-- 강좌
ALTER TABLE mybatis_dev.courses
	ADD CONSTRAINT PK_courses -- 강좌 기본키
		PRIMARY KEY (
			course_id -- 강좌번호
		);

ALTER TABLE mybatis_dev.courses
	MODIFY COLUMN course_id INTEGER(11) NOT NULL AUTO_INCREMENT COMMENT '강좌번호';

-- 수강
CREATE TABLE mybatis_dev.course_enrollment (
	course_id INTEGER(11) NOT NULL COMMENT '강좌', -- 강좌
	stud_id   INTEGER(11) NOT NULL COMMENT '학생' -- 학생
)
COMMENT '수강';

-- 수강
ALTER TABLE mybatis_dev.course_enrollment
	ADD CONSTRAINT PK_course_enrollment -- 수강 기본키
		PRIMARY KEY (
			course_id, -- 강좌
			stud_id    -- 학생
		);

-- 학생
ALTER TABLE mybatis_dev.students
	ADD CONSTRAINT FK_addresses_TO_students -- 주소 -> 학생
		FOREIGN KEY (
			addr_id -- 주소
		)
		REFERENCES mybatis_dev.addresses ( -- 주소
			addr_id -- 번호
		);

-- 강사
ALTER TABLE mybatis_dev.tutors
	ADD CONSTRAINT FK_addresses_TO_tutors -- 주소 -> 강사
		FOREIGN KEY (
			addr_id -- 주소
		)
		REFERENCES mybatis_dev.addresses ( -- 주소
			addr_id -- 번호
		);

-- 강좌
ALTER TABLE mybatis_dev.courses
	ADD CONSTRAINT FK_tutors_TO_courses -- 강사 -> 강좌
		FOREIGN KEY (
			tutor_id -- 담당강사
		)
		REFERENCES mybatis_dev.tutors ( -- 강사
			tutor_id -- 강사번호
		);

-- 수강
ALTER TABLE mybatis_dev.course_enrollment
	ADD CONSTRAINT FK_courses_TO_course_enrollment -- 강좌 -> 수강
		FOREIGN KEY (
			course_id -- 강좌
		)
		REFERENCES mybatis_dev.courses ( -- 강좌
			course_id -- 강좌번호
		);

-- 수강
ALTER TABLE mybatis_dev.course_enrollment
	ADD CONSTRAINT FK_students_TO_course_enrollment -- 학생 -> 수강
		FOREIGN KEY (
			stud_id -- 학생
		)
		REFERENCES mybatis_dev.students ( -- 학생
			stud_id -- 학번
		);
		
		use zipcode;
		SELECT zipcode,sido,sigungu,doro,building1,building2 from zipcode;