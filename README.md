# Family_for_polymorphism

#### 다형성을 통해 구현한 가족

- 부모 객체를 상속, 메소드를 오버라이딩
- List<> 에 다형성을 이용하여 저장, 오버라이딩된 메소드를 출력
- 상속을 통한 다형성, 오버라이딩 이해

> 부모 클래스

```java
public class Father {
	// 가족들의 공통 속성 & 자식이 물려받음을 속성
	private String name;
	private int age;

	public void goWork(){
		System.out.println("ÀÏÇÏ·¯ °©´Ï´Ù");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
```

> 아들 클래스

```java
public class Son extends Father {
  // 아들클래스의 속성
  public void goSchool(){
  	System.out.println("학교에 갑니다");
  }

  // 공통속성
	@Override
	public void goWork(){
		super.goWork();
		System.out.println("학교에 갑니다");
	}

	// 공통속성
	@Override
	public void setName(String name){
		super.setName("s"+name);
	}
}
```

> 다형성 구현

```java
  //컬렉션 배열에 제네릭으로 부모 객체 타입을 넣어준다. 이렇게 함으로써 배열에 모든 자식 객체를 넣어줄 수 있고,
  //get을 통해 같은 메소드를 호출하더라도 다른 결과를 출력할 수 있다
  ArrayList<Father> list = new ArrayList<>();
  
  Father father = new Father(); //부모 객체
  Father son = new Son();  //아들 객체를 부모 타입으로 형 변환
  Father daughter = new Daughter();  //딸 객체를 부모 타입으로 형 변환
  list.add(father);
  list.add(son);
  list.add(daughter);

  for(int i=0; i<list.size(); i++){
  	list.get(i).goWork();
  }
```
