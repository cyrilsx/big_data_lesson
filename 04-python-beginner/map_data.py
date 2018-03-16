import random
import sys
from random import randint


def print_line(file):
    randint(19)
    input = open(file, 'r')
    for line in input.readline():
        print(line)


def print_nb_word(file):
    input = open(file, 'r')
    words = input.read().split(" ")
    print("The file %s has %s word(s)." % (file, len(words)))


def map(file):
    input_file = open(file, 'r')
    count_for_ass = {}
    for line in input_file:
        data = line.split(";")
        if len(data) > 6:
            from_quarter = data[2]
            to_country = data[7]
            association = from_quarter + " -> " + to_country
            if association in count_for_ass:
                count_for_ass[association] = count_for_ass[association] + 1
            else:
                count_for_ass[association] = 1
    for key, value in count_for_ass.items():
        print(key + " " + str(value))




if __name__ == '__main__':
    map("./input/bevwegzjahraltergeschlechtzivfamstell.csv")
    if len(sys.argv) < 2:
        print("usage: python %s <path-input-file>" % sys.argv[0])
    else:
        print_line(sys.argv[1])