from sys import argv


def square(level):
    for l in range(0, level):
        for i in range(0, level):
            print("#", end='')
            if i == level-1:
                print()


def pyramid(level):
    for l in range(0, level):
        for i in range(0, level):
            if i < l:
                print(" ", end='')
            else:
                print("#", end='')
            if i == level-1:
                print()


if __name__ == '__main__':
    pyramid(5)
    square(5)
