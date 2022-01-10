리스트(List)
===

### List Collection

List는 Array와 유사한 `순차적인 자료구조`입니다.  
데이터 접근을 위해 인덱스를 사용해야 하는 점은 배열과 동일하지만 배열의 문제점을 모두 해결하고 있습니다.
데이터를 저장하게되면 자동으로 인덱스가 부여되고 부여된 인덱스를 통해 접근 가능합니다.

List Collection을 구현하는 대표적인 클래스로는 `ArrayList`, `Vector`, `LinkedList`가 있습니다.

### ArrayList

ArrayList는 List인터페이스를 구현한 구현체 클래스입니다. 설정된 용량보다 많은 데이터가 들어오면 자동으로 용량이 늘어납니다.

ArrayList를 생성하는 방법은 아래와 같습니다.
```java
List<E> list = new ArrayList<E>([초기 저장용량]); 
```

초기 저장용량을 생략하게 되면 기본적으로 10의 저장용량을 갖습니다.

### ArrayList의 주요 Method

+ **add(E e)** : e를 리스트 맨 끝에 추가합니다.
+ **add(int index, E e)** : index위치에 e를 리스트에 추가 합니다.
+ **addAll(Collection<? extends E> c)** : Collection인 c전체를 리스트 맨 끝에 추가합니다.
+ **addAll(int index, Collection<? extends E> c)** : index위치에 c전체를 추가합니다.
+ **clear()** : 리스트의 내용을 전부 삭제합니다.
+ **contains(Object o)** : 리스트에 o가 있다면 true, 없으면 false를 리턴합니다.
+ **get(int index)** : index위치의 값을 반환합니다.
+ **indexOf(Object o)** : 리스트에서 o값의 인덱스를 반환합니다.
+ **isEmpty()** : 비어있다면 true, 아니면 false를 리턴합니다.
+ **iterator()** : 현재 리스트의 iterator를 반환합니다.
+ **remove(int index)** : index위치의 값을 제거하고 제거한 값을 반환합니다.
+ **remove(Object o)** : 리스트에서 o값을 제거합니다.
+ **removeRange(int start, int end)** : start부터 end까지 위치의 값을 제거합니다.
+ **set(int index, E e)** : index위치의 값을 e로 대체합니다.
+ **size()** : 리스트의 크기를 반환합니다.
+ **toArray()** : 리스트를 배열로 바꿔 반환합니다.


### Vector

ArrayList와 동일한 구조를 갖지만 차이점은 자동 동기화를 보장하므로 멀티 스레드 환경에서 안정적으로 사용이 가능합니다.
하지만 단일 스레드 환경에서는 ArrayList가 성능이 더 좋다.

Vector를 생성하는 방법은 아래와 같습니다.
```java
List<E> list = new Vector<E>(초기용량, 증가용량);
```

초기용량과 증가용량을 생략하면 기본 값인 0으로 설정됩니다.

### Vector의 주요 Method

+ ArrayList와 동일



### LinkedList

List의 구현 클래스 이므로 ArrayList, Vector와 사용방법은 동일하지만 구조가 다르게 되어있습니다.
ArrayList, Vector는 index값으로 데이터를 관리하지만 LinkedList는 인접한 곳을 링크하여 체인처럼 관리합니다.
중간 데이터를 삭제할 때 인접한 곳의 링크만 변경하면 되기 때문에 중간 데이터를 추가/삭제하는 경우 처리 속도가 빠릅니다.

LinkedList를 생성하는 방법은 아래와 같습니다.
```java
List<E> list = new LinkedList<E>();
```

### LinkedList의 주요 Method

+ **add(E e)** : e를 리스트 맨 끝에 추가합니다.
+ **add(int index, E e)** : index위치에 e를 리스트에 추가 합니다.
+ **addAll(Collection<? extends E> c)** : Collection인 c전체를 리스트 맨 끝에 추가합니다.
+ **addAll(int index, Collection<? extends E> c)** : index위치에 c전체를 추가합니다.
+ **addFirst(E e)** : 리스트 시작부분에 e를 추가
+ **addLast(E e)** : 리스트 끝부분에 e를 추가
+ **clear()** : 리스트의 내용을 전부 삭제합니다.
+ **contains(Object o)** : 리스트에 o가 있다면 true, 없으면 false를 리턴합니다.
+ **descendingIterator()** : 역방향으로 순환하는 iterator를 반환
+ **get(int index)** : index위치의 값을 반환합니다.
+ **getFirst()** : 리스트 첫 요소를 반환
+ **getLast()** : 리스트 마지막 요소를 반환
+ **indexOf(Object o)** : 리스트에서 o값의 인덱스를 반환합니다.
+ **remove()** : 리스트 첫 요소를 반환 후 제거
+ **remove(int index)** : index위치의 값을 제거하고 제거한 값을 반환합니다.
+ **remove(Object o)** : 리스트에서 o값을 제거합니다.
+ **removeFirst()** : 리스트 첫 요소를 제거 후 반환
+ **removeLast()** : 리스트 마지막 요소를 제거 후 반환
+ **set(int index, E e)** : index위치의 값을 e로 대체합니다.
+ **size()** : 리스트의 크기를 반환합니다.
+ **toArray()** : 리스트를 배열로 바꿔 반환합니다.
