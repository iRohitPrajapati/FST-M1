fruit_dict = {
    "pear": 120,
    "pomegranate": 90,
    "banana": 40,
    "apple": 120
}

key = input("What are you looking for? ").lower()

if(key in fruit_dict):
    print("Yes, this is available")
else:
    print("No, this is not available")
