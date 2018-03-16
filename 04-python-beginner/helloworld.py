from sys import argv


def helloworld():
    if len(argv) < 2:
        print("usage: python %s <your-name>" % argv[0])
        exit(0)

    print("Hello %s " % argv[1])


if __name__ == '__main__':
    helloworld()