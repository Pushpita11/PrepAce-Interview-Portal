package com.pushpita.prepace.config;

import com.pushpita.prepace.model.Question;
import com.pushpita.prepace.service.QuestionService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class QuestionLoader {

    private final QuestionService questionService;

    public QuestionLoader(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostConstruct
    public void loadQuestions() {

        questionService.addQuestion(
                new Question(
                        1,
                        "What is Java?",
                        "Programming Language",
                        "Database",
                        "Browser",
                        "Operating System",
                        "Programming Language",
                        "Java"
                )
        );

        questionService.addQuestion(
                new Question(
                        2,
                        "Which collection does not allow duplicates?",
                        "List",
                        "ArrayList",
                        "Set",
                        "Vector",
                        "Set",
                        "Java"
                )
        );

        questionService.addQuestion(
                new Question(
                        3,
                        "What does DBMS stand for?",
                        "Database Management System",
                        "Data Binary Management System",
                        "Database Machine System",
                        "None",
                        "Database Management System",
                        "DBMS"
                )
        );

        questionService.addQuestion(
                new Question(
                        4,
                        "Which data structure uses FIFO?",
                        "Stack",
                        "Queue",
                        "Tree",
                        "Graph",
                        "Queue",
                        "DSA"
                )
        );

        questionService.addQuestion(
                new Question(
                        5,
                        "What is the brain of the computer?",
                        "RAM",
                        "CPU",
                        "ROM",
                        "Monitor",
                        "CPU",
                        "Operating Systems"
                )
        );
        questionService.addQuestion(new Question(
                6,
                "Which keyword is used for inheritance in Java?",
                "implements",
                "extends",
                "inherits",
                "super",
                "extends",
                "Java"
        ));

        questionService.addQuestion(new Question(
                7,
                "Which collection allows duplicate elements?",
                "Set",
                "HashSet",
                "List",
                "TreeSet",
                "List",
                "Java"
        ));

        questionService.addQuestion(new Question(
                8,
                "Which method is the entry point of Java?",
                "run()",
                "start()",
                "main()",
                "init()",
                "main()",
                "Java"
        ));

        questionService.addQuestion(new Question(
                9,
                "Which concept allows one interface with many implementations?",
                "Inheritance",
                "Polymorphism",
                "Encapsulation",
                "Abstraction",
                "Polymorphism",
                "Java"
        ));

        questionService.addQuestion(new Question(
                10,
                "Which access modifier is visible everywhere?",
                "private",
                "protected",
                "default",
                "public",
                "public",
                "Java"
        ));
        questionService.addQuestion(new Question(
                11,
                "Which data structure uses LIFO?",
                "Queue",
                "Stack",
                "Tree",
                "Graph",
                "Stack",
                "DSA"
        ));

        questionService.addQuestion(new Question(
                12,
                "What is the time complexity of Binary Search?",
                "O(n)",
                "O(log n)",
                "O(n log n)",
                "O(1)",
                "O(log n)",
                "DSA"
        ));

        questionService.addQuestion(new Question(
                13,
                "Which traversal uses Root Left Right?",
                "Inorder",
                "Postorder",
                "Preorder",
                "Level Order",
                "Preorder",
                "DSA"
        ));

        questionService.addQuestion(new Question(
                14,
                "Which sorting algorithm is fastest on average?",
                "Bubble Sort",
                "Selection Sort",
                "Quick Sort",
                "Insertion Sort",
                "Quick Sort",
                "DSA"
        ));

        questionService.addQuestion(new Question(
                15,
                "Which data structure is used in BFS?",
                "Stack",
                "Queue",
                "Array",
                "Heap",
                "Queue",
                "DSA"
        ));
        questionService.addQuestion(new Question(
                16,
                "What does SQL stand for?",
                "Structured Query Language",
                "Simple Query Language",
                "System Query Language",
                "None",
                "Structured Query Language",
                "DBMS"
        ));

        questionService.addQuestion(new Question(
                17,
                "Which key uniquely identifies a row?",
                "Foreign Key",
                "Primary Key",
                "Candidate Key",
                "Alternate Key",
                "Primary Key",
                "DBMS"
        ));

        questionService.addQuestion(new Question(
                18,
                "Which normal form removes partial dependency?",
                "1NF",
                "2NF",
                "3NF",
                "BCNF",
                "2NF",
                "DBMS"
        ));

        questionService.addQuestion(new Question(
                19,
                "Which SQL command retrieves data?",
                "INSERT",
                "UPDATE",
                "DELETE",
                "SELECT",
                "SELECT",
                "DBMS"
        ));

        questionService.addQuestion(new Question(
                20,
                "Which join returns matching rows only?",
                "LEFT JOIN",
                "RIGHT JOIN",
                "INNER JOIN",
                "FULL JOIN",
                "INNER JOIN",
                "DBMS"
        ));
        questionService.addQuestion(new Question(
                21,
                "What is 20% of 250?",
                "40",
                "50",
                "60",
                "70",
                "50",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                22,
                "A train travels 60 km in 1 hour. What is its speed?",
                "50 km/h",
                "60 km/h",
                "70 km/h",
                "80 km/h",
                "60 km/h",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                23,
                "What is the average of 10, 20, 30?",
                "15",
                "20",
                "25",
                "30",
                "20",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                24,
                "If CP = ₹100 and SP = ₹120, profit is?",
                "10%",
                "15%",
                "20%",
                "25%",
                "20%",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                25,
                "What is 25% of 400?",
                "50",
                "75",
                "100",
                "125",
                "100",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                26,
                "A can do a work in 10 days. Work done in 1 day?",
                "1/5",
                "1/10",
                "1/15",
                "1/20",
                "1/10",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                27,
                "What is the ratio of 20:40?",
                "1:2",
                "2:1",
                "1:3",
                "3:1",
                "1:2",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                28,
                "Simple Interest on ₹1000 at 10% for 2 years?",
                "₹100",
                "₹150",
                "₹200",
                "₹250",
                "₹200",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                29,
                "What is 15% of 200?",
                "20",
                "25",
                "30",
                "35",
                "30",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                30,
                "A man walks 5 km in 1 hour. Distance in 3 hours?",
                "10 km",
                "12 km",
                "15 km",
                "18 km",
                "15 km",
                "Aptitude"
        ));
        questionService.addQuestion(new Question(
                31,
                "What is 30% of 500?",
                "100",
                "120",
                "150",
                "180",
                "150",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                32,
                "Average of 5,10,15,20?",
                "10",
                "12.5",
                "15",
                "17.5",
                "12.5",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                33,
                "If SP=150 and CP=120, Profit?",
                "20%",
                "25%",
                "30%",
                "35%",
                "25%",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                34,
                "1/4 of 200 = ?",
                "25",
                "40",
                "50",
                "60",
                "50",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                35,
                "Ratio of 12:18?",
                "2:3",
                "3:2",
                "4:5",
                "5:6",
                "2:3",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                36,
                "Compound Interest is calculated on?",
                "Principal only",
                "Interest only",
                "Principal + Interest",
                "None",
                "Principal + Interest",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                37,
                "Probability of getting Head in a coin toss?",
                "0",
                "1/4",
                "1/2",
                "1",
                "1/2",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                38,
                "What is 50% of 80?",
                "20",
                "30",
                "40",
                "50",
                "40",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                39,
                "A train covers 120 km in 2 hours. Speed?",
                "50 km/h",
                "55 km/h",
                "60 km/h",
                "65 km/h",
                "60 km/h",
                "Aptitude"
        ));

        questionService.addQuestion(new Question(
                40,
                "What is 10% of 900?",
                "80",
                "90",
                "100",
                "110",
                "90",
                "Aptitude"
        ));
        questionService.addQuestion(new Question(
                41,
                "What is the brain of the computer?",
                "RAM",
                "CPU",
                "ROM",
                "Monitor",
                "CPU",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                42,
                "Which scheduling algorithm follows First Come First Serve?",
                "FCFS",
                "SJF",
                "Round Robin",
                "Priority",
                "FCFS",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                43,
                "What is a deadlock?",
                "CPU failure",
                "Memory leak",
                "Processes waiting forever",
                "Disk crash",
                "Processes waiting forever",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                44,
                "Which memory is volatile?",
                "ROM",
                "Hard Disk",
                "RAM",
                "SSD",
                "RAM",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                45,
                "What does OS stand for?",
                "Operating System",
                "Open Software",
                "Output System",
                "Operating Service",
                "Operating System",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                46,
                "Which scheduling gives equal CPU time?",
                "FCFS",
                "SJF",
                "Round Robin",
                "Priority",
                "Round Robin",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                47,
                "What is paging?",
                "Memory management technique",
                "CPU scheduling",
                "Disk scheduling",
                "File management",
                "Memory management technique",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                48,
                "Which memory is non-volatile?",
                "RAM",
                "Cache",
                "ROM",
                "Register",
                "ROM",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                49,
                "What is thrashing?",
                "High paging activity",
                "CPU overheating",
                "Disk failure",
                "Memory corruption",
                "High paging activity",
                "Operating Systems"
        ));

        questionService.addQuestion(new Question(
                50,
                "Which component manages hardware resources?",
                "Compiler",
                "OS",
                "Database",
                "Browser",
                "OS",
                "Operating Systems"
        ));
        questionService.addQuestion(new Question(
                51,
                "What does IP stand for?",
                "Internet Protocol",
                "Internal Process",
                "Internet Process",
                "Internal Protocol",
                "Internet Protocol",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                52,
                "Which device connects different networks?",
                "Hub",
                "Switch",
                "Router",
                "Repeater",
                "Router",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                53,
                "Which layer handles routing?",
                "Transport",
                "Network",
                "Session",
                "Physical",
                "Network",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                54,
                "What is the full form of LAN?",
                "Local Area Network",
                "Large Area Network",
                "Local Access Network",
                "None",
                "Local Area Network",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                55,
                "Which protocol is used for web browsing?",
                "FTP",
                "HTTP",
                "SMTP",
                "TCP",
                "HTTP",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                56,
                "What is the default port of HTTP?",
                "21",
                "25",
                "80",
                "443",
                "80",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                57,
                "What does DNS do?",
                "Stores files",
                "Converts names to IP",
                "Routes packets",
                "Encrypts data",
                "Converts names to IP",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                58,
                "Which topology uses a central hub?",
                "Ring",
                "Bus",
                "Star",
                "Mesh",
                "Star",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                59,
                "Which protocol is connection-oriented?",
                "UDP",
                "TCP",
                "IP",
                "ARP",
                "TCP",
                "Computer Networks"
        ));

        questionService.addQuestion(new Question(
                60,
                "What is the full form of WAN?",
                "Wide Area Network",
                "Wireless Area Network",
                "Web Area Network",
                "World Area Network",
                "Wide Area Network",
                "Computer Networks"
        ));
        questionService.addQuestion(new Question(
                61,
                "Tell me about yourself.",
                "A self introduction",
                "A project",
                "A hobby",
                "A skill",
                "A self introduction",
                "HR"
        ));

        questionService.addQuestion(new Question(
                62,
                "What is your greatest strength?",
                "Positive quality",
                "Weakness",
                "Project",
                "Degree",
                "Positive quality",
                "HR"
        ));

        questionService.addQuestion(new Question(
                63,
                "Why do you want to join our company?",
                "Salary",
                "Career growth",
                "Holiday",
                "Location",
                "Career growth",
                "HR"
        ));

        questionService.addQuestion(new Question(
                64,
                "Where do you see yourself in 5 years?",
                "Career goal",
                "Vacation",
                "Retirement",
                "None",
                "Career goal",
                "HR"
        ));

        questionService.addQuestion(new Question(
                65,
                "What is your greatest weakness?",
                "Area of improvement",
                "Strength",
                "Project",
                "Achievement",
                "Area of improvement",
                "HR"
        ));

        questionService.addQuestion(new Question(
                66,
                "Why should we hire you?",
                "Skills and value",
                "Luck",
                "Degree only",
                "None",
                "Skills and value",
                "HR"
        ));

        questionService.addQuestion(new Question(
                67,
                "How do you handle pressure?",
                "Stay calm and prioritize",
                "Quit work",
                "Ignore tasks",
                "Complain",
                "Stay calm and prioritize",
                "HR"
        ));

        questionService.addQuestion(new Question(
                68,
                "Are you a team player?",
                "Yes, collaborate effectively",
                "No",
                "Sometimes",
                "Never",
                "Yes, collaborate effectively",
                "HR"
        ));

        questionService.addQuestion(new Question(
                69,
                "What motivates you?",
                "Learning and growth",
                "Nothing",
                "Sleep",
                "TV",
                "Learning and growth",
                "HR"
        ));

        questionService.addQuestion(new Question(
                70,
                "Why did you choose engineering?",
                "Interest in technology",
                "Friends",
                "Random",
                "None",
                "Interest in technology",
                "HR"
        ));

        questionService.addQuestion(new Question(
                71,
                "Can you relocate?",
                "Yes",
                "No",
                "Maybe",
                "Never",
                "Yes",
                "HR"
        ));

        questionService.addQuestion(new Question(
                72,
                "What are your career goals?",
                "Professional growth",
                "Vacation",
                "Shopping",
                "None",
                "Professional growth",
                "HR"
        ));

        questionService.addQuestion(new Question(
                73,
                "How do you manage time?",
                "Planning and prioritization",
                "Ignore deadlines",
                "Guesswork",
                "None",
                "Planning and prioritization",
                "HR"
        ));

        questionService.addQuestion(new Question(
                74,
                "Describe a leadership experience.",
                "Leading a team/project",
                "Watching TV",
                "Playing games",
                "None",
                "Leading a team/project",
                "HR"
        ));

        questionService.addQuestion(new Question(
                75,
                "What is success for you?",
                "Achieving goals",
                "Money only",
                "Luck",
                "None",
                "Achieving goals",
                "HR"
        ));

        questionService.addQuestion(new Question(
                76,
                "What is failure for you?",
                "Learning opportunity",
                "End of career",
                "Bad luck",
                "None",
                "Learning opportunity",
                "HR"
        ));

        questionService.addQuestion(new Question(
                77,
                "How do you resolve conflicts?",
                "Communication",
                "Argument",
                "Ignoring",
                "Complaints",
                "Communication",
                "HR"
        ));

        questionService.addQuestion(new Question(
                78,
                "Do you prefer team or individual work?",
                "Both depending on task",
                "Only team",
                "Only individual",
                "None",
                "Both depending on task",
                "HR"
        ));

        questionService.addQuestion(new Question(
                79,
                "What are your hobbies?",
                "Personal interests",
                "Projects",
                "Degree",
                "None",
                "Personal interests",
                "HR"
        ));

        questionService.addQuestion(new Question(
                80,
                "Why are you looking for this opportunity?",
                "Growth and learning",
                "Vacation",
                "Location",
                "None",
                "Growth and learning",
                "HR"
        ));
        questionService.addQuestion(new Question(
                81,
                "What does SQL stand for?",
                "Structured Query Language",
                "Simple Query Language",
                "System Query Language",
                "None",
                "Structured Query Language",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                82,
                "Which command retrieves data?",
                "INSERT",
                "DELETE",
                "SELECT",
                "UPDATE",
                "SELECT",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                83,
                "Which command adds new records?",
                "INSERT",
                "SELECT",
                "DELETE",
                "ALTER",
                "INSERT",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                84,
                "Which clause filters rows?",
                "ORDER BY",
                "WHERE",
                "GROUP BY",
                "HAVING",
                "WHERE",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                85,
                "Which command modifies data?",
                "UPDATE",
                "SELECT",
                "DROP",
                "TRUNCATE",
                "UPDATE",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                86,
                "What does COUNT() do?",
                "Counts rows",
                "Deletes rows",
                "Updates rows",
                "Sorts rows",
                "Counts rows",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                87,
                "Which join returns matching records?",
                "LEFT JOIN",
                "RIGHT JOIN",
                "INNER JOIN",
                "FULL JOIN",
                "INNER JOIN",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                88,
                "What is a Primary Key?",
                "Unique identifier",
                "Duplicate field",
                "Foreign field",
                "None",
                "Unique identifier",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                89,
                "What is a Foreign Key?",
                "Links tables",
                "Deletes tables",
                "Creates tables",
                "None",
                "Links tables",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                90,
                "Which clause sorts data?",
                "GROUP BY",
                "ORDER BY",
                "WHERE",
                "HAVING",
                "ORDER BY",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                91,
                "What does DISTINCT do?",
                "Removes duplicates",
                "Deletes rows",
                "Updates rows",
                "Adds rows",
                "Removes duplicates",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                92,
                "Which function returns maximum value?",
                "MIN()",
                "AVG()",
                "MAX()",
                "COUNT()",
                "MAX()",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                93,
                "Which command removes a table?",
                "DROP",
                "DELETE",
                "UPDATE",
                "SELECT",
                "DROP",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                94,
                "What does AVG() calculate?",
                "Average",
                "Maximum",
                "Minimum",
                "Count",
                "Average",
                "SQL"
        ));

        questionService.addQuestion(new Question(
                95,
                "What does GROUP BY do?",
                "Groups rows",
                "Deletes rows",
                "Sorts rows",
                "Updates rows",
                "Groups rows",
                "SQL"
        ));


    }
}