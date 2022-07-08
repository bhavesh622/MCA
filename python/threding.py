import threading
def print_cube(num):
    print('Cube=',num*num*num)
    # for i in range(0,20):
    #     print("cube ",i)
def print_square(num):
    print('Square=',num*num)
    # for i in range (0,10):
    #     print("square ",i)

if __name__=="__main__":
    t1= threading.Thread(target=print_square, args=(10,))
    t2= threading.Thread(target= print_cube, args=(10,))
    t2.start()
    t1.start()
    t1.join()
    t2.join()
    print("Done")
