from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize

sentence = """
Sayyed Salman
NLTK is a leading platform for building Python programs to work with human language data. It provides easy-to-use interfaces to over 50 corpora and lexical resources such as WordNet, along with a suite of text processing libraries for classification, tokenization, stemming, tagging, parsing, and semantic reasoning, wrappers for industrial-strength NLP libraries, and an active discussion forum.
"""

stop_words = set(stopwords.words("english"))
word_tokens = word_tokenize(sentence)

filtered_sentence = [w for w in word_tokens if w not in stop_words]

print(word_tokens)
print(filtered_sentence)
print(stop_words)