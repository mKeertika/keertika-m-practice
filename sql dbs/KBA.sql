SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

SELECT 
    d.name AS department, COUNT(c.id) AS 'number of courses'
FROM
    department d
        INNER JOIN
    course c ON d.id = c.deptId
GROUP BY d.name
ORDER BY 2 DESC;

SELECT 
    c.name, COUNT(sc.studentId)
FROM
    student s
        INNER JOIN
    studentCourse sc ON s.id = sc.studentId
        INNER JOIN
    course c ON sc.courseId = c.id
GROUP BY c.id
ORDER BY 2 DESC , 1 ASC;
SELECT 
    c.name
FROM
    course c
        LEFT JOIN
    facultyCourse fc ON c.id = fc.courseId
GROUP BY c.name
HAVING COUNT(fc.facultyId) = 0
ORDER BY 1;

SELECT 
    c.name, COUNT(sc.studentId), fc.facultyId
FROM
    studentCourse sc
        INNER JOIN
    course c ON c.id = sc.courseId
        LEFT JOIN
    facultyCourse fc ON fc.courseId = c.id
WHERE
    fc.facultyId IS NULL
GROUP BY c.name
ORDER BY 2 DESC , 1 ASC;

SELECT 
    COUNT(s.id) AS Students, YEAR(sc.startDate) AS Year
FROM
    studentCourse sc
        INNER JOIN
    student s ON sc.studentId = s.id
GROUP BY 2
ORDER BY 2 ASC , 1 DESC;

SELECT 
    COUNT(DISTINCT s.id) AS 'Students',
    YEAR(sc.startDate) AS 'Year'
FROM
    studentCourse sc
        INNER JOIN
    student s ON sc.studentId = s.id
GROUP BY 2
ORDER BY 2 , 1 DESC;

SELECT 
    (sc.startDate) AS 'Start Date',
    COUNT(DISTINCT s.id) AS 'Total number of Students'
FROM
    studentCourse sc
        INNER JOIN
    student s ON sc.studentId = s.id
WHERE
    MONTHNAME(sc.startDate) = 'August'
GROUP BY 1
ORDER BY 1 , 2 DESC;


select s.firstname, s.lastname, round(avg(sc.progress),1)
from student s
inner join studentCourse sc
on sc.studentid=s.id
where (avg(sc.progress)<(max(sc.progress))/2)
ORDER BY 3 desc, 1 asc, 2 asc;

select s.firstname, s.lastname, round(avg(sc.progress),1)
from student s
inner join studentCourse sc
on sc.studentid=s.id
group by s.id
having avg(sc.progress)<0.5
ORDER BY 3 desc, 1 asc, 2 asc;

select s.firstname, s.lastname, round(sc.progress,1)
from student s
inner join studentCourse sc on sc.studentid=s.id
where sc.progress<(sc.progress/2)
group by s.id
ORDER BY 3 desc, 1 asc, 2 asc;

select c.name, round(avg(sc.progress),1)
from studentCourse sc
inner join course c ON c.id=sc.courseid
inner join department d on d.id= c.deptid
inner join faculty f on f.deptId=d.id
group by c.name
order by 2 desc, 1 asc;

select c.name, round(avg(sc.progress),1)
from studentCourse sc
inner join course c ON c.id=sc.courseid
GROUP BY c.id
order by 2 DESC
limit 1;

select courseid, max(progress) from studentcourse
group by courseid;

select f.firstname, f.lastname, round(avg(sc.progress),1) as 'Average Progress'
from faculty f
join facultyCourse fc on fc.facultyId=f.id
join course c on fc.courseid=c.id
join studentCourse sc on c.id=sc.courseid
group by f.id
order by 3 desc, 1 asc, 2 ASC
;

select s.firstname, s.lastname, min(sc.progress) as low, max(Progress)
from student s
inner join studentcourse sc on sc.studentid=s.id
where
CASE 
 WHEN sc.progress<40 THEN 'F'
 WHEN sc.progress<50 THEN 'D'
 WHEN sc.progress<60 THEN 'C'
 WHEN sc.progress<70 THEN 'B'
 ELSE 'A'
 END AS grade 
GROUP BY s.id
order by 3 DESC, 4 desc, 1 asc, 2 asc;

SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT 
    s.firstname, 
    s.lastname, 
    COUNT(DISTINCT CASE WHEN c.deptid = m.id THEN c.id END) 
FROM student s
JOIN studentcourse sc ON s.id = sc.studentid
JOIN course c ON sc.courseid = c.id
JOIN department m ON s.majorid = m.id
GROUP BY s.id, s.firstname, s.lastname
HAVING COUNT(DISTINCT CASE WHEN c.deptid = m.id THEN c.id END) >= 2
ORDER BY 3 DESC, 1 ASC, 2 ASC;