from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize
import time

def remove_stopwords(sentence):
    stop_words = set(stopwords.words("english"))
    tokenize_sentence = word_tokenize(sentence)
    filtered_sentence = [w for w in tokenize_sentence if w not in stop_words]
    return filtered_sentence

print("--Filter stopwords--")
sentence = input("Enter data > ")
before_processing = sentence.split()
time.sleep(2)
res = remove_stopwords(sentence)
print(f"Removed Stopwords:\n{res}\nLength Before: {len(before_processing)}\nLength After: {len(res)}")