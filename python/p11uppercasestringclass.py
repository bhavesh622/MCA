class StringClass:
    'Class containing get_string and print_string'
    def __init__(self, string =""):
        self.string = string
    def get_string(self):
        self.string = input("Enter String to convert: ")
    def print_string(self):
        print("String in upper case is :")
        print(self.string.upper())

s= StringClass()
s.get_string()
s.print_string()