import matplotlib.pyplot as plt
x =[1,2,3,4,5,6]
y = [3,5,7,1,2,4] 
plt.plot(x, y, color='green',linestyle='dashed', linewidth = 3, marker='o',markerfacecolor='blue', markersize=12)
plt.ylim(1,8) 
plt.xlim(1,8)
plt.xlabel('x - axis') 
plt.ylabel('y - axis')
plt.title('Plot 1')
plt.show()

activities = ['TCS', 'IVP', 'INFOSYS', 'BPU']
slices =[30, 72, 38, 67]
colors = ['r', 'y', 'g', 'b']
plt.pie(slices, labels = activities, colors=colors,
startangle=90, shadow = True, explode = (0, 0, 0.1, 0),
radius = 1.2, autopct = '%1.1f%%')
plt.legend()
plt.show()