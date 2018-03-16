

def palindrome(value):
    b = 0
    e = len(value)-1
    while b != e:
        if value[b] != value[e]:
            return False
        else:
            e -= 1
            b += 1
    return True


if __name__ == '__main__':
    print("%s is palindrome? %s" % ("kayak", palindrome("kayak")))
    print("%s is palindrome? %s" % ("test", palindrome("test")))
    print("%s is palindrome? %s" % ("b", palindrome("b")))
