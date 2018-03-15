from sys import argv

if __name__ == '__main__':
    if len(argv) < 2:
        print("usage: python %s <your-name>" % argv[0])
        exit(0)
        
    print("Hello %s " % argv[1])