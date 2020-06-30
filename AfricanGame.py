import csv
import random
question = {}
non_repeat_catcher = []
score = 0
# with open('C:\\xampp\\htdocs\\scraper\\beautifulsoup.csv', mode='r') as infile:
with open('C:\\Users\\Win8\\Desktop\\propenster\\java\\dev\\countries.csv', mode='r') as infile:
	reader = csv.reader(infile)
	for row in reader:
		country = row[0]
		capital = row[1]
		question[country] = capital
	#Random Game Logic Here....
	for i in range(5):
		num = random.randint(1,10)
		if num not in non_repeat_catcher: 
			non_repeat_catcher.append(num)
			# for k in question.keys():
			# 	print("What is the Capital of ", k)
				# print(num, " - " , question[num])
			print(random.choice(list(question.keys())))
		i+=1


