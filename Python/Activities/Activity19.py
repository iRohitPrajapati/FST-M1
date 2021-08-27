import pandas
from pandas import ExcelWriter

#create a dictionary
data = {
    "FirstName":["Satvik","Avinash","Lahri"],	
    "LastName":["Shah","Kati","Rath"],	
    "Email":["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber":["4528727830","5892184058","4537829158"]
}

#create dataframe
dataframe = pandas.DataFrame(data)
print(dataframe)

#ExcelWrite
writer = ExcelWriter('emprecord.xlsx')
dataframe.to_excel(writer,'Sheet1',index=False)

#save
writer.save()