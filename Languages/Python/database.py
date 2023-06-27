import mysql.connector

dbcon = mysql.connector.connect(
    host="localhost",
    user="root",
    password="root",
)

# refer to the code from lpu live on 2-11-22

print(dbcon)