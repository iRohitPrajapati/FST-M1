import pandas

#create a dictionary
data = {
    "Username": ["admin", "Charles", "Deku"],
    "Password": ["password", "Charl13", "AllMight"]
}

dataframe = pandas.DataFrame(data)

#print dataframe
print(dataframe)

#write into csv file
dataframe.to_csv("credentials.csv", index=False)