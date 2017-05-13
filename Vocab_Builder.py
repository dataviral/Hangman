import json
import random
import os

class Vocab:

    def __init__(self, filename):
        self.filename = filename
        self.file_handler = open(filename, "r+")
        try:
            self.data = json.load(self.file_handler)
        except:
            self.file_handler.write("{}")
            self.data = {}
            self.file_handler.seek(0)

        if "_count" not in self.data:
            self.data = {
                "_count": 0
            }
            self.write_data()

    def write_data(self):
        self.file_handler.seek(0)
        json.dump(self.data, self.file_handler, indent=4)
        self.file_handler.seek(0)

    def add_word(self, word, meaning):
        w = word.lower()
        if w not in self.data:
            self.data["_count"] += 1
            self.data[w] = {"_count" : 1}
            self.data[w]["0"] = meaning.capitalize()
        else :
            self.data[w][ self.data[w]["_count"] ] = meaning.capitalize()
            self.data[w]["_count"] += 1

        self.write_data()

    def learn(self):
        while(1):
            ip  = input("\n\n1. Add Word\n2. Revise\nEnter choice: ").strip()
            if ip == "1":
                w = input("Enter Word To Add :").strip()
                m = input("Enter Its Meaning :").strip()
                self.add_word(w,m)
            elif ip == "2":
                print("\n\tGuess the word \n\n")
                cnt = 1
                while(1):
                    w_key , m_key = "", ""
                    while(1):
                        w_key = random.choice(list(self.data.keys()))
                        if w_key != "_count" and w_key != "":
                            m_key = random.choice(list(self.data[w_key].keys()))
                        if m_key != "_count" and m_key != "":
                            break
                    print("\t\t", cnt, ": ", self.data[w_key][m_key] )
                    ans = input().strip()
                    if ans.lower() == w_key:
                        print("\t\t\tYou Got It !!")
                    elif ans == "q":
                        break
                    else:
                        print("\t\t\tWrong Answer,\n\t\t\t\tThe Word is :", w_key)
                    cnt += 1

v1 = Vocab("vocab.json")
v2 = Vocab("vocab2.json")

v1.learn()
