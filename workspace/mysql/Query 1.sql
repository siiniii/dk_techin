USE hr;
SELECT * FROM employees;

ALTER TABLE job_history ADD PRIMARY KEY(employee_id, start_date);
# 성, 명, 급여, 입사일자, 부서번호를 출력하시오
SELECT last_name, first_name, salary, hire_date, department_id FROM employees;

# 부서명도 출력하시오 -> join , 이 때 연결고리 포린키를 찾아야 한다.

# 커미션을 받는 직원 조회 commission_pct
# commission_pct 컬럼이 null이 아닌 경우로 조회해야한다.
# IS NOT NULL 이라는 연산자를 사용해야한다.
SELECT * FROM employees WHERE commission_pct IS NOT NULL;

# 한번이라도 부서나 직무를 변경한 적이 있는 직원을 조회
# 한번이라도 주문한 적이 있는, 한번이라도 휴학한 적이 있는 학생을 조회
# EXISTS 연산자를 사용할 수 있다. 방법은 여러가지이나!

SELECT first_name, salary, hire_date FROM employees WHERE (department_id = 70 OR department_id = 80) AND last_name like 'k%' ORDER BY 1 DESC;

# 이메일주소 중 kosa.go.kr을 넣어서  =>  CONCAT
# 이메일주소 중 5자리만 출력 => SUBSTR

# 12345.678
SELECT 12345.678, ROUND(12345.678, 2), ROUND(12345.678, -2);

SELECT NOW(), SYSDATE();

# 오늘로부터 100일후
# 오늘로부터 1년후, 입사 후 30주년 일자계산
# 두 날짜 사이를 연산. 입사 후 근속년수,

SELECT NOW(), DATE_FORMAT(NOW(), '%Y-%m-%d');
SELECT last_name, hire_date, DATE_FORMAT(hire_date, '%Y-%m-%d') 입사일자 FROM employees;

# 연봉 출력, 단 커미션을 반영하여
SELECT salary, commission_pct, salary*(1 +  IFNULL(commission_pct,0))*12 커미션반영급여 ,
last_name 
FROM employees;

SELECT department_id, COUNT(*) FROM employees GROUP BY department_id;

# 부서별 인원수 출력. 1명 이하는 제외
# 급여 5000이상만 반영
SELECT department_id, COUNT(*) 
FROM employees 
-- WHERE COUNT(*) > 1 
GROUP BY department_id
HAVING COUNT(*) > 1;

SELECT last_name, salary,
	CASE WHEN salary < 5000 THEN 'D'
		 WHEN salary < 7000 THEN 'C'
         WHEN salary < 10000 THEN 'B'
         WHEN salary < 15000 THEN 'A'
         ELSE 'S'
    END sal_grade
FROM employees;
----------------------------------------------------------------------------
SELECT CASE WHEN salary < 5000 THEN 'D'
			WHEN salary < 7000 THEN 'C'
			WHEN salary < 10000 THEN 'B'
			WHEN salary < 15000 THEN 'A'
			ELSE 'S'
		END sal_grade,
		COUNT(*) cnt
FROM employees
GROUP BY (CASE WHEN salary < 5000 THEN 'D'
			   WHEN salary < 7000 THEN 'C'
			   WHEN salary < 10000 THEN 'B'
			   WHEN salary < 15000 THEN 'A'
			   ELSE 'S'
		  END), (CASE WHEN salary < 5000 THEN 5
			   WHEN salary < 7000 THEN 4
			   WHEN salary < 10000 THEN 3
			   WHEN salary < 15000 THEN 2
			   ELSE 1
		  END)
ORDER BY (CASE WHEN salary < 5000 THEN 5
			   WHEN salary < 7000 THEN 4
			   WHEN salary < 10000 THEN 3
			   WHEN salary < 15000 THEN 2
			   ELSE 1
		  END);
---------------------------------------------------------------------------------------
# 입사일자가 가장 빠른 직원 3사람을 출력, 급여가 가장 적은 3명 출력          
SELECT * FROM employees ORDER BY hire_date ASC LIMIT 3;

# 성, 입사일자, 급여, 부서명 출력
# 아직 부서에 배치되지 않아서 부서명을 출력할 수 없는 경우는 사라진다. => OUTER JOIN
SELECT e.last_name, hire_date, salary, d.department_name 
FROM employees e, departments d 
WHERE e.department_id = d.department_id;

# 아직 미배치 상태의 직원은 부서명없음 이라고 출력하시오
SELECT e.last_name, hire_date, salary, IFNULL(d.department_name, '부서명없음')department_name
FROM employees e LEFT OUTER JOIN departments d 
ON e.department_id = d.department_id;
---------------------------------------------------------------------------------------
# 관리자 이름도 출력
SELECT e.last_name, m.last_name FROM employees e JOIN employees m ON e.manager_id = m.employee_id;

# Stven, King이 근무하는 부서의 부서원 정보를 출력
SELECT department_id FROM employees WHERE last_name = 'King' and first_name = 'Steven';
SELECT * FROM employees WHERE department_id = 90;
# 서브쿼리로 정보 출력
SELECT * FROM employees WHERE department_id = (SELECT department_id 
											   FROM employees 
											   WHERE last_name = 'King' and first_name = 'Steven');

SELECT * FROM employees WHERE department_id in (SELECT department_id 
											   FROM employees 
											   WHERE last_name = 'King');
                                               
SELECT department_id FROM employees WHERE last_name = 'King';

#  부서별 최고급여를 받는 직원정보 조회
SELECT MAX(salary) FROM employees GROUP BY department_id;

SELECT last_name, salary, department_id 
FROM employees 
WHERE (salary, department_id) IN(SELECT MAX(salary), department_id 
								 FROM employees GROUP BY department_id)ORDER BY 3;

# 자기 부서의 평균급여보다 많은 급여를 받는 직원조회
SELECT * FROM employees e WHERE salary > (SELECT avg(salary) FROM employees WHERE department_id = e.department_id);

# 자기부서의 평균 급여도 출력
SELECT last_name, salary, department_id,
(SELECT avg(salary) FROM employees WHERE department_id = e.department_id) 부서평균급여
FROM employees e;

# from절에 서브쿼리
# 자신의 부서 평균급여보다 많이 급여받는 사원 조회
# 부서별 평균급여를 from절의 서브쿼리로 처리
SELECT * FROM employees e JOIN (SELECT department_id, avg(salary) avg_salary
								FROM employees 
                                GROUP BY department_id) da 
                                ON e.department_id = da.department_id 
                                WHERE e.salary > da.avg_salary;

---------------------------------------------------------------------------------------
SHOW INDEXES FROM employees;
# K로 시작되는 이름 사원 조회
SELECT * FROM employees WHERE last_name LIKE'K%';

CREATE index emp_last_name_idx ON employees(last_name);
DROP index emp_last_name_idx ON employees;





