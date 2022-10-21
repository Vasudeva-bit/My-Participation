import re


def validate_pan_numbers(numbers):
    pattern = re.compile('^[A-Z]{5}\d{4}[A-Z]$')

    for number in numbers:
        print('YES' if pattern.match(number) else 'NO')


if __name__ == '__main__':
    number_count = int(input())
    numbers = (input() for _ in range(number_count))
    validate_pan_numbers(numbers)