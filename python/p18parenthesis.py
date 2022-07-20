def eqbrackets(expression):
    brackets = ['()', '{}', '[]']
    while any(x in expression for x in brackets):
        for br in brackets:
            expression = expression.replace(br, '')
    return not expression
input_string = "([]{}())"
input_string2 = "([]{}()(())"
if eqbrackets(input_string):
    print(input_string,"is Balanced")
else:
    print(input_string," is Not balanced")

if eqbrackets(input_string2):
    print(input_string2,"is Balanced")
else:
    print(input_string2,"Not balanced")
