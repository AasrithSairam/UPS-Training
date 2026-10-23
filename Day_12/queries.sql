DROP TABLE IF EXISTS salary_audit;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;

CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    age INT CHECK (age >= 18),
    salary DECIMAL(10, 2) DEFAULT 30000.00,
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);

INSERT INTO department (dept_id, dept_name) VALUES
(1, 'Engineering'),
(2, 'Human Resources'),
(3, 'Finance'),
(4, 'Marketing');

INSERT INTO employee (id, name, email, age, salary, dept_id) VALUES
(101, 'Aasrith Sairam', 'aasrith@gmail.com', 21, 55000.00, 1),
(102, 'Rohith Kumar', 'rohith@gmail.com', 22, 42000.00, 1),
(103, 'Senthil Nathan', 'senthil@gmail.com', 24, 38000.00, 2),
(104, 'Vijay Anand', 'vijay@gmail.com', 25, 48000.00, 3),
(105, 'Pooja Sri', 'pooja@gmail.com', 20, 32000.00, 2),
(106, 'Sneha Reddy', 'sneha@gmail.com', 23, 36000.00, 1);

INSERT INTO employee (id, name, email, age, dept_id) VALUES
(107, 'Karan Sharma', 'karan@gmail.com', 19, 4);

INSERT INTO employee (id, name, email, age, salary, dept_id) VALUES
(108, 'Aditi Rao', 'aditi@gmail.com', 26, 29000.00, NULL);

SELECT * FROM employee WHERE age > 21;

SELECT * FROM employee ORDER BY name ASC;

SELECT DISTINCT dept_id FROM employee;

SELECT * FROM employee LIMIT 3;

SELECT dept_id, COUNT(*) AS emp_count
FROM employee
WHERE dept_id IS NOT NULL
GROUP BY dept_id
HAVING COUNT(*) > 1;

SELECT 
    MIN(salary) AS minimum_salary,
    MAX(salary) AS maximum_salary,
    AVG(salary) AS average_salary,
    SUM(salary) AS total_payroll,
    COUNT(*) AS total_employees
FROM employee;

SELECT * FROM employee WHERE name LIKE 'A%';

SELECT * FROM employee WHERE email LIKE '%gmail%';

SELECT * FROM employee WHERE dept_id IS NULL;

SELECT * FROM employee WHERE dept_id IS NOT NULL;

CREATE TABLE salary_audit (
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    emp_id INT,
    old_salary DECIMAL(10, 2),
    new_salary DECIMAL(10, 2),
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //
CREATE TRIGGER trg_salary_update_audit
BEFORE UPDATE ON employee
FOR EACH ROW
BEGIN
    IF OLD.salary <> NEW.salary THEN
        INSERT INTO salary_audit (emp_id, old_salary, new_salary)
        VALUES (OLD.id, OLD.salary, NEW.salary);
    END IF;
END //
DELIMITER ;

SELECT id, name, email, age, salary, dept_id
FROM employee
WHERE salary > 35000.00;

SELECT id, name, email, age, salary, dept_id
FROM employee
ORDER BY salary DESC;

SELECT dept_id, COUNT(*) AS number_of_employees
FROM employee
WHERE dept_id IS NOT NULL
GROUP BY dept_id;

SELECT d.dept_name, COUNT(e.id) AS number_of_employees
FROM department d
LEFT JOIN employee e ON d.dept_id = e.dept_id
GROUP BY d.dept_id, d.dept_name;
