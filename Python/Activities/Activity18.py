import pandas

#read csv as pandas DataFrame
dataframe = pandas.read_csv("credentials.csv")

#print complete file content
print("File content:")
print(dataframe)

#print only Usernames
print("-----------------------")
print("Usernames")
print(dataframe["Username"])

#print Username & Passwords of second row
print("-----------------------------------")
print("Username & Passwords of second row")
print("Username: "+dataframe["Username"][1]+", Password: "+dataframe["Password"][1])

#Sort Username in asc
print("-----------------------")
print("Sorted Username in Asc")
print(dataframe.sort_values("Username"))

#Sort Password in desc
print("-----------------------")
print("Sorted Password in Desc")
print(dataframe.sort_values("Password", ascending=False))