import sys

def run(code):
    codes = code.split(' ')
    ret = ""
    for code in codes:
        length = len(code)
        char = chr(length)
        ret += char
    return ret

if __name__ == "__main__":
    if len(sys.argv) > 1:
        if sys.argv[1].endswith(".e"):
            file = sys.argv[1]
            try:
                with open(file, 'r') as f:
                    code = file.read()
                ran = run(code)
                print(ran)
            except:
                print("Invalid file.")
                sys.exit(1)
        else:
            print("Invalid file.")
            sys.exit(1)
    else:
        print("No file specified.")
