USE hr;
SELECT * FROM employees;

SELECT CONCAT(first_name, last_name)성명, 
CONCAT(email, '@kosa.com')이메일주소, 
TRUNCATE((salary*(1 +  IFNULL(commission_pct,0))*12)*1240, -3) 연봉, 
DATE_FORMAT(DATE_ADD(hire_date, INTERVAL 30 YEAR),'%d-%m-%Y') 입사30주년일자,
(hire_date) 입사일자
FROM employees WHERE department_id = 80
ORDER BY hire_date;

# optional 30주년기념식일자도 출력합니다. 기념식일자는 30주년이 지난 다음주 월요일입니다.

------------------------------------------------------------------------------------------
# 1
SELECT d.department_id, d.department_name, IFNULL(d.manager_id, '부서장없음')manager_id, e.first_name, e.last_name, e.hire_date
FROM departments d LEFT OUTER JOIN employees e ON d.manager_id = e.manager_id;
# 2
SELECT e.employee_id 사번, CONCAT(e.first_name, e.last_name)성명, e.hire_date 입사일자, m.hire_date 관리자입사일자 
FROM employees e, employees m WHERE e.manager_id = m.employee_id AND e.hire_date < m.hire_date;
#3
SELECT (e.employee_id)사번, CONCAT(e.first_name, e.last_name)성명, (e.hire_date)입사일자, (e.department_id)부서번호, (d.department_name)부서명 
FROM employees e, departments d WHERE e.department_id = d.department_id AND d.location_id = (SELECT l.location_id
																							 FROM locations l  
																							 WHERE l.city = 'Seattle');

------------------------------------------------------------------------------------------
#정답
# 1
SELECT d.department_id, d.department_name, IFNULL(e.employee_id, '부서장없음')manager_id, e.first_name, e.last_name, e.hire_date
 FROM employees e JOIN departments d ON e.employee_id = d.manager_id;
# 2 
SELECT e.employee_id, e.last_name, e.first_name, e.hire_date, m.last_name, m.hire_date 
FROM employees e JOIN employees m 
				  ON e.manager_id = m.employee_id WHERE e.hire_date < m.hire_date;
# 3
SELECT e.emplouee_id, e.last_name, e.hire_date, e.department_id, (SELECT department_name FROM departments 
WHERE department_id = e.department_id) dept_name FROM employees e 
WHERE department_id in (SELECT department_id FROM departments 
WHERE location_id in (SELECT location_id FROM locations WHERE city='Seattle'));










