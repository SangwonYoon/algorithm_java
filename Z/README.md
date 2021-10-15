## static 메소드인 main 메소드에서 non-static 메소드나 필드를 호출할 때 발생하는 오류 주의

static 메소드는 non-static 메소드보다 먼저 컴파일되기 때문에 컴파일되지 않은 non-static 메소드나 필드를 참조할 수 없다.
