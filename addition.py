import sys

def main():
    if len(sys.argv) != 3:
        print("Please enter two numbers")
        return

    a = int(sys.argv[1])
    b = int(sys.argv[2])
    sum = a + b
    print(f"{a} + {b} = {sum}")

if __name__ == "__main__":
    main()