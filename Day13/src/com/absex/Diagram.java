package com.absex;

/*
 * 1. 추상 클래스
 * 		- 추상화라는 것은 구체적인 개념으로부터 공통된 부분들만 추려내어 
 * 			일반화 할 수 있도록 한다는 것이다.
 * 		- 일반적으로 사용할 수 있는 단계가 아닌 아직 미완성적 개념을 의미한다.
 * 
 * 		- 메소드를 정의하면 brace({})를 생략하여 메소드가 하는 일이 없이 
 * 			세미콜론으로 문장을 끝낸다.
 * 
 * 		추상화 작업
 * 		- 상속이 자손클래스 만드는데 조상클래스를 사용하는 것이라면,
 * 			추상화는 기존의 클래스의 공통부분을 뽑아내서 조상 클래스를 만드는 것을 의미한다.
 * 		- 추상화 : 클래스간의 공통점을 찾아내서 고통의 조상을 만드는 작업을 의미함
 * 		- 구체화 : 상속을 통해서 클래스를 구현하는 것을 의미한다.
 */

public abstract class Diagram {
 // 추상 클래스는 반드시 하나 이상의 추상메소드를 가지고 있어야 한다.
	
	abstract void draw(); // 추상 메소드는 몸체를 가질 수 없다.
	
}

/* private를 선언 할 수 없다.
 * 
 * 이유
 * 	- 자식이 오버라이딩 해야 하는데 못하게 됨
 * 	
 * static으로 선언 안됨
 * 		- 객체 없이도 호출되는 메소드이므로 반드시 몬체가 정의되어 호출 할 수 있기 때문
 */
