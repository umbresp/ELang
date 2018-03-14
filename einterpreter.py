def run(code):
    codes = code.split(' ')
    ret = ""
    for code in codes:
        length = len(code)
        char = chr(length)
        ret += char
    return ret