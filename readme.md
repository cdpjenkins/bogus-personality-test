# Bogus Personality Test

This application is intended to work out your DISA personality type. Unfortunately,
it is utterly unscientific and should not be relied up to give a correct or useful
answer.

# Usage

Run it as follows:

    ./gradlew run -q --console=plain 

It will show a sequence of traits in a random order. For each one,
answer y or n. It will then tell you how strongly you display each of the four DISA
personality types.

Example:

    $ ./gradlew run -q --console=plain
    Imaginative?
    n
    Easygoing?
    y
    Producer?
    n
    Reserved?
    y
    Lengthy?
    n
    Here are your scores:
    RED: 0.0
    YELLOW: 0.5
    GREEN: 0.0
    BLUE: 0.5

Again, this application should not be relied upon to give correct or useful results.
It's probably all a load of rubbish.
