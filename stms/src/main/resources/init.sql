SHOW DATABASES;

USE student_tutor_db;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    cwid VARCHAR(10) UNIQUE,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15),
    major VARCHAR(50),
    class_standing ENUM('Freshman', 'Sophomore', 'Junior', 'Senior', 'Graduate')
);

-- Sample Data
INSERT INTO students VALUES 
(1, 'CW123456', 'Alice Johnson', 'alice.j@example.edu', '1234567890', 'Computer Science', 'Junior'),
(2, 'CW123457', 'Bob Smith', 'bob.s@example.edu', '1234567891', 'Mathematics', 'Senior');

CREATE TABLE User_Login (
    CWID VARCHAR(10) PRIMARY KEY,
    Password VARCHAR(255) NOT NULL,
    EmailID VARCHAR(100) NOT NULL,
    PhoneNumber VARCHAR(15),
    Type ENUM('Student', 'Tutor', 'Admin') NOT NULL
);

INSERT INTO User_Login (CWID, Password, EmailID, PhoneNumber, Type) VALUES
('50380111', 'pass@123', 'john.doe@university.edu', '123-456-7890', 'Student'),
('50380112', 'tutor#456', 'emma.tutor@university.edu', '234-567-8901', 'Tutor'),
('50380113', 'admin$789', 'admin.office@university.edu', '345-678-9012', 'Admin'),
('50380114', 'pwd321', 'alex.student@university.edu', '456-789-0123', 'Student'),
('50380115', 'qwerty@007', 'sophia.tutor@university.edu', '567-890-1234', 'Tutor');
	