

def fibonacci(n, a, b):
    if n > 0:
        return fibonacci(n - 1, b, a + b)
    else:
        return a