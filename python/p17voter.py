from collections import Counter 
def winner(inp): 
    votes = Counter(inp)
    print(votes.items())
    dict1 = {}  	
    for value in votes.values():
        dict1[value] = []
    for (key,value) in votes.items():
        dict1[value].append(key)
    
    maxVote = sorted(dict1.keys(),reverse=True)[0]
    if len(dict1[maxVote])>1:
        print (sorted(dict1[maxVote])[0])
    else:
        print (dict1[maxVote][0]) 
 
if __name__ == "__main__": 
    inp =['Jobin','Phool','Monica','Shagun', 
 	 	 	'Jobin','Jobin','Shagun','Monica', 
 	 	 	'Jobin','Phool','Monica','Shagun', 
 	 	 	'Shagun']
    winner(inp) 
