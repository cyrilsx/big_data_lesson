import sys


def print_line(file):
    input = open(file, 'r')
    for line in input.readline():
        print(line)


def print_nb_word(file):
    input = open(file, 'r')
    words = input.read().split(" ")
    print("The file %s has %s word(s)." % (file, len(words)))


def map(file):
    input = open(file, 'r')


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print("usage: python %s <path-input-file>" % sys.argv[0])
    else:
        print_line(sys.argv[1])