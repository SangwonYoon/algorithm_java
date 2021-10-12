### scanner.next() / scanner.nextLine

scanner.next()는 공백을 기준으로 하나의 입력만 받아온다.
scanner.nextLine()은 개행문자를 기준으로 한줄의 입력을 받아온다.

### scanner.nextInt() 이후의 scanner.nextLine()

scanner.nextInt() 이후에는 "\n"이 입력 버퍼에 남아있기 때문에 다음에 실행하는 scanner.nextLine()에 \n을 받아오게 된다.

**해결법 1.** scanner.nextInt() 이후 scanner.nextLine()을 한번 더 추가해 \n을 지워준다.

**해결법 2.** scanner.nextInt() 대신 Integer.parseInt(scanner.nextLine())으로 정수를 받는다.

_scanner.nextInt() 대신 scanner.next()도 같은 문제가 나타난다._
