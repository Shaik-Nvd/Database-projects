Prison Management System Uses Specified Database Saved in the respective folder
user has to import the database "testdb.sql" in the computer
there are two ways to import the database.
1.from phpmyadmin
	open localhost/phpmyadmin
	>>press import 
	>>choose "testdb.sql"
	>>press go
2. using cmd line arguments using xampp
	open xamp
	>>start MySql
	>>goto shell
	>>mysql -u localhost -p lttf >"path to testdb.sql"
	>>password: "" (without quotes)
	>>press Enter
