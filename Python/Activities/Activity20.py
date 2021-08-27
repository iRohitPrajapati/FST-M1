import pandas

#read excel into dataframe
dataframe = pandas.read_excel('emprecord.xlsx')

#print entire file content
print("File content:")
print(dataframe)

#print number of rows and columns
print("--------------------------------")
print("Total rows and columns in excel")
print(dataframe.shape)

#print emails only
print("-----------------------------------")
print("Data available at Email column")
print(dataframe['Email'])

#print excel data based on name
print("--------------------------------")
print("Sorted on FirstName")
print(dataframe.sort_values('FirstName'))