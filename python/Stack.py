class Stack:
    def __init__(self) -> None:
        self.stack = []
    def push(self,item):
        self.stack.append(item)
    def pop(self):
        print(self.stack.pop())
    def display(self):
        for i in self.stack[::-1]:
            print(i)
st = Stack()
for i in range(1,10):
    st.push(i)
st.pop()
st.display()

